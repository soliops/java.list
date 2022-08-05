<%@page import="configure.dataload"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰 리스트 출력 파트</title>
<script type="text/javascript">
	function del_data(idx){
		if(confirm("해당 데이터 삭제시 복구 되지 않습니다.")){			
		location.href = "review_del.do?ridx="+idx;
		}
	}
	function gopage(){
		location.href = "./review_write.html";		
	}
</script>
</head>
<body>
 
<%-- JSP 주석 <% JSP OPEN )%> JSP CLOSE) (<%= DATA출력) --%>
<%
	ArrayList<dataload> list = (ArrayList<dataload>)request.getAttribute("list");
%>
<table border="1" cellpadding="0" cellspacing="0">
<tr>
<td>고객명</td>
<td>상품명</td>
<td>상품평가</td>
<td>수정/삭제</td>
<td>내용</td>
<td>작성날짜</td>
<!-- <td>이미지</td> -->
</tr>
<% 
for(dataload aa : list){	
	int num = Integer.parseInt(aa.getrscore());
	String star =null;
	switch(num){
	case 1:
		star = "★☆☆☆☆";
		break;
	case 2:
		star = "★★☆☆☆";
		break;
	case 3:
		star = "★★★☆☆";
		break;
	case 4:
		star = "★★★★☆";
		break;
	case 5:
		star = "★★★★★";
		break;
	}
%>
<tr>
<%-- 고유값 : <%=aa.getridx()%>  --%>
<td><%=aa.getrname()%> </td>
<td><%=aa.getrproduct()%> </td>
<td><%=star%></td>
<td><input type="button" value="수정"><input type="button" value="삭제" onclick="del_data(<%=aa.getridx()%>);"></td>
<td><%=aa.getr_text()%></td>
<td><%=aa.getr_date()%></td>
<%-- <td><%=aa.getimgs()%></td> --%>
</tr>		

<%
	}
%>
</table>
<br> <br>
<input type="button" value="리뷰 등록하기" onclick="gopage();">
</body>
</html>