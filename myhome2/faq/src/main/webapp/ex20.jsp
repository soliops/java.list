<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - forward 전송</title>
</head>
<body>
<!-- Module 역할 -->
<%!

%>

<!-- Controll 역할 -->
<!-- param : 매개변수를 생성해서 값을 전달 할 때 사용(forward, include)-->
<p>EX20 값 전달</p>
<%request.setCharacterEncoding("UTF-8");%>
<jsp:forward page="./ex20_1.jsp">
	<jsp:param value="hong" name="mid"/>
	<jsp:param value="홍길동" name="mname"/>
</jsp:forward>
</body>
</html>