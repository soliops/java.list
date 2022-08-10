<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex17과 연계</title>
</head>
<body>
<%--
<%
	String name= "홍길동님 반갑습니다.";
	out.print(name);
%>
 --%>
<%=(new Date().toLocaleString()) %>
</body>
</html>