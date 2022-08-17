<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>  
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - JSTL 문자열</title>
<!-- 
	JSTL에는 Math 없음(cell, round, floor)
 -->
</head>
<body>
<%
String msg="테스트";
%>
<jh:set var="msg" value=" 홍길동님 반갑습니다. "></jh:set>
${fn:length(msg)} <br> <!-- 문자열 갯수 -->
${fn:substring(msg,0,3) } <br> <!-- 문자열 자를 경우 -->
${fn:replace(msg,"홍길동","이순신") } <br> <!-- 문자열 단어 변경 -->
${fn:indexOf(msg,"길동") } <br> <!-- 문자열 단어 검색 -->
${fn:trim(msg)} <br> <!-- 앞과 뒤에만 공백 없앰 -->
<jh:out value="<%=msg %>"></jh:out> <br>
<jh:out value="${fn:trim(msg)}"></jh:out> <br>

</body>
</html>