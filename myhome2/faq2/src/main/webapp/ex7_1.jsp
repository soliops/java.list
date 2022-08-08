<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 값 받기 (FORM)</title>
</head>
<body>
<%
//POST로 전송시에는 해당 문법을 사용해야함
request.setCharacterEncoding("UTF-8"); 
//GET 전송시는 server.xml 63번 줄에 URIEncoding="UTF-8";을 입력하면 한글로 출력됨
%>
<%=request.getParameter("mid")%>
</body>
</html>