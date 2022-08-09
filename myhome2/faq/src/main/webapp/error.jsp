<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage="true" %>
<!--   
isErrorPage : false(기본) : 일반페이지 
isErrorPage : true => 자신의 페이지는 error 발생시 사용되는 페이지로 인식
-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일차 error Page</title>
</head>
<body>
<% out.print("code error"); %>
</body>
</html>