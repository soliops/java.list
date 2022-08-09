<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일차 - SPA 만들기</title>
<!--
FORM 전송 MPA + SPA
AJAX 전송 SPA + JS or JQ or ECMA

MPA : Multi Page Application -> 백엔드가 프론트엔드 역할까지 해야함

SPA : Single Page Application -> 백엔드와 프론트엔드가 명확하게 코드가 나누어짐
SPA가 안되는 경우 : Servlet 안됨
 -->
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String mid = request.getParameter("userid");
	if(mid!=null){		
	out.print(mid);
	}else{%>
<form name="frm" id="frm" method="POST" action="./ex8.jsp">
<input type="text" name="userid">
<input type="submit" value="전송">
</form>
<%}%>
</body>
</html>