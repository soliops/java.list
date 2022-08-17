<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>  
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@	taglib prefix="userinfo" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - tagdir 사용법</title>
</head>
<body>
<jh:set var="username" value="홍길동"></jh:set>
태그 파일을 로드 할 대 사용 할 사용방식 prefix 이름:파일명
<userinfo:test>$username</userinfo:test>
<br>
<userinfo:test2>${username}</userinfo:test2>
<br>
<userinfo:test3>${username }</userinfo:test3>
<br>

<br>
<userinfo:test3><%out.print("test"); %></userinfo:test3>
<br>
</body>
</html>