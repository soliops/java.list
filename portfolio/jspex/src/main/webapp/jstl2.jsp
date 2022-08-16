<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core" %>  
<%
request.setCharacterEncoding("UTF-8");
	String nb = request.getParameter("number");
%>
<jh:set var="n" value="<%=nb%>"></jh:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - jstl2.html 연동</title>
</head>
<body>
<!-- 
choose : 다중 처리 조건문을 사용함
if : 조건문을 처리함
 -->
<%-- 
<jh:choose>
when : choose 태그와 함께 사용하는 태그명 : 참일 경우
otherwise : 거짓일 경우 
<jh:when test="${n%2==0}">
<jh:out value="${n}"></jh:out>은 짝수 입니다.
</jh:when>
<jh:when test="${n%2!=0}">
<jh:out value="${n}"></jh:out>은 홀수 입니다.
</jh:when>
</jh:choose>
--%>
<jh:if test="${n eq '홍길동'}">
	가입 고객 입니다.
</jh:if>
</body>
</html>