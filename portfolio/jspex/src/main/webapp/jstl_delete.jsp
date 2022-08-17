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
<title>JSP 7일차 - SQL 데이터 삭제</title>
</head>
<body>
<sql:update dataSource="${dbs }" var="result">
delete from poll where puserid=?
<sql:param value="Lee"></sql:param>
</sql:update>
<!-- param : 물음표 사용 가능 -->
<jh:if test="${result==1}"> 삭제 완료</jh:if>
<jh:if test="${result==0}"> 삭제 오류</jh:if>
</body>
</html>