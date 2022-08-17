<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- setDataSource : DB 연결 태그 -->
<sql:setDataSource var="dbs"
	url="jdbc:mysql://umj7-009.cafe24.com/opete95"
	driver="com.mysql.jdbc.Driver" user="opete95" password="soli5857!@"></sql:setDataSource>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - SQL 데이터 수정</title>
</head>
<body>
<sql:update var="result" dataSource="${dbs }">
update poll set ptel=? where pidx=?
<sql:param value="01012341234"></sql:param>
<sql:param value="4"></sql:param>
</sql:update>
<jh:if test="${result==1}">수정완료</jh:if>
<jh:if test="${result==0}">수정실패</jh:if>

</body>
</html>