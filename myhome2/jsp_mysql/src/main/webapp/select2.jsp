<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - sql연동(select2) + HTML 연동</title>
</head>
<body>
<%@ include file = "dbconnect.jsp" %>
<%
	String sql = "select * from poll order by pidx desc"; 
	ArrayList<Map<String,Object>> al = null;
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		al = new ArrayList<>();
		while(rs.next()){ 
			Map<String,Object> mp = new HashMap<String,Object>();
			mp.put("pidx",rs.getString("pidx"));
			mp.put("pname",rs.getString("pname"));
			mp.put("puserid",rs.getString("puserid"));
			mp.put("ptel",rs.getString("ptel"));
			mp.put("ptext",rs.getString("ptext"));
			mp.put("pindate",rs.getString("pindate").substring(0, 19));
			al.add(mp);
		}
	}
	catch(Exception e){
		out.print("DB 연결 실패 및 테이블 오류!!");
	}
	finally{ 
		if(con!=null){
			con.close();
		}
	}
%>
<% 
	int w=0;
	while(w<al.size()){
	//jsp 태그 사용 이유는 설문조사 0~4 내용이 확인이 안됨
	//switch.jsp에서 사용자가 어떤 내용에 대한 설문조사를 응하였는지
	//확인하는 사항입니다.
// <!-- 설문조사내용을 숫자로 만들었을 경우 -->
%>
<jsp:include page="./switch.jsp">
<jsp:param value='<%=al.get(w).get("ptext")%>' name="cate"/>
</jsp:include>
<%	
//setAttribute로 생성된 가변수명을 getAttribute로 받아서
//처리 또는 ${msg} 액션태그로 바로 출력 가능합니다.
	String msg =(String)request.getAttribute("msg");
%>
<ul>
	<li>고유번호 : <%=al.get(w).get("pidx") %></li>
	<li>고객명 : <%=al.get(w).get("pname") %></li>
	<li>고객아이디 : <%=al.get(w).get("puserid") %></li>	
	<li>연락처 : <%=al.get(w).get("ptel") %></li>
	<li>설문조사내용 : <%=msg%></li>
	<li>참여일자 : <%=al.get(w).get("pindate") %></li>	
</ul>
<%
	w++;
	} %>
</body>
</html>