<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="z" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<z:forEach items="${list}" var="test">
고객명 : ${test.mnm}<br>
연락처 : ${test.mtel} <br>
나이 : ${test.mage}<br>
</z:forEach>
</body>
</html>