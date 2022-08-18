<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./db.jsp" %>
<%
	int pageview = 5; //한페이지당 보여지는 데이터 갯수
	int startpage = 0; //시작 페이지 값
	double pagenumber = 1; //페이징 갯수
	
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	
	String pt = request.getParameter("search");
	String pgno = request.getParameter("page");
// 	int pgno = Integer.parseInt(request.getParameter("page")); //페이징 번호
	String andsql= ""; //검색할 때 사용
	if(pt==null){
		andsql=" "; //sql문법상 띄워쓰기가 적용되도록 하기 위함
	}
	else{
		andsql=" where puserid='"+pt+"' "; //sql 문법추가시에도 띄워쓰기 확인
	}
	
	String ct = "select count(*) as ct from poll"+andsql+";"; //데이터 총 갯수
	PreparedStatement psct = null;
	PreparedStatement ps = null;
	List<Map<String,Object>> data = null;
	int total =0;
	try{
		psct = con.prepareStatement(ct);
		ResultSet rsct = psct.executeQuery();
		while(rsct.next()){
			total = rsct.getInt("ct");
		}
		
// 		if(pgno ==0|| pgno==1){
// 			startpage=0;
// 		}
// 		else{ //페이지 2번부터 적용되는 사항;
// 			startpage=(pgno-1)*pageview;
// 		}
		
		if(pgno ==null|| pgno==""){
			startpage=0;
		}
		else{ //페이지 2번부터 적용되는 사항;
			startpage=((Integer.parseInt(pgno))-1)*pageview;
		}
		
		//페이징총 갯수 파악
		if(total%pageview ==0){
			pagenumber = total/pageview;
		}
		else{ 
			pagenumber= (total/pageview)+1;
		}
		
		String sql = "select * from poll"+andsql+"order by pidx desc limit "+startpage+",?;"; //데이터 리스트
		ps=con.prepareStatement(sql);	
		ps.setInt(1,pageview); //sql에서 limit 걸때 ?로 처리했을 때
		ResultSet rs = ps.executeQuery();
		data = new ArrayList<>();
		while(rs.next()){
			Map<String,Object> mp  = new HashMap<>();
			mp.put("idx",rs.getString("pidx"));
			mp.put("usernm",rs.getString("pname"));
			mp.put("userid",rs.getString("puserid"));
			mp.put("usertel",rs.getString("ptel"));
			mp.put("indate",rs.getString("pindate"));
			data.add(mp);
		}
		
	}
	catch(Exception e){
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP - 8일차 페이지 번호 및 검색 기능</title>
<style>
ul,ol {list-style: none; margin:0; padding:0; width:1000px; height:30px;
font-size:13px;}
li{float:left; background-color:#ccc; height:30px; line-height:30px;text-align:center;}
.bgcolor{background-color:#fff;}
.t_ul>li:nth-of-type(1){
width:100px;
}
.t_ul>li:nth-of-type(2){
width:300px;
}
.t_ul>li:nth-of-type(3){
width:200px;
}
.t_ul>li:nth-of-type(4){
width:200px;
}
.t_ul>li:nth-of-type(5){
width:200px;
}
</style>
</head>
<body>
<ul class="t_ul">
<li>번호</li>
<li>고객명</li>
<li>고객아이디</li>
<li>전화번호</li>
<li>입력일자</li>
</ul>
<em style="clear:both;"></em>
<% 
int w=0;
int no = 0;
do{ 
	no= total-startpage-w;
%>
<ul class="t_ul" style="clear:both;">
<li class="bgcolor"><%=no%></li>
<li class="bgcolor"><%=data.get(w).get("usernm") %></li>
<li class="bgcolor"><%=data.get(w).get("userid") %></li>
<li class="bgcolor"><%=data.get(w).get("usertel") %></li>
<li class="bgcolor"><%=data.get(w).get("indate") %></li>
</ul>
<%
w++;
}
while(w<data.size());
%>
<div style="width:1000px; height:30px; margin-top:20px;">
<ol style="display:inline;">
<%
int p=1;
do{
%>
<li onclick="pagego(<%=p%>);" style="width:30px; border-radius:5px; display:inline-block; cursor:pointer;"><%=p %></li>
<% 
p++;
}while(p<=pagenumber);%>

</ol>
</div>
<div style="width:1000px; height:30px; margin-top:20px;">
<!-- select로 고객 아이디 번호 넣어서 검색 가능하게 -->
<form name="f" id="f" method="get" action="./pageing2.jsp" enctype="application/x-www-form-urlencoded">
<input type="text" name="search">
<input type="submit" value="검색">
<input type="button" value="전체리스트" onclick="abc();">
</form>
</div>
</body>
<script>
	function abc(){
		location.href ="./pageing2.jsp";
	}
	function pagego(pgno){
		location.href="./pageing2.jsp?page="+pgno;
	}
</script>
<%con.close(); %>
</html>