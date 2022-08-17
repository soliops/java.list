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
<title>JSP 7일차 - SQL 데이터 입력</title>
</head>
<body>
	<!-- update : insert, update, delete 세가지만 사용 합니다. -->
	<sql:query var="sresult" dataSource="${dbs}">
select count(*) from poll where puserid='Lee2';
</sql:query>
<!-- 	해당 값에 대한 SQL에 저장 여부를 확인 하는 작업 -->
<%-- 	<jh:out value="${sresult.rowCount}"></jh:out> --%>
	<!-- count(*)를 사용하지 않은 *을 사용한 값을 가져옴 -->
	<br>
<%-- 	<jh:out value="${sresult.rowsByIndex[0][0]}"></jh:out> --%>
	<br>
	<!-- count(*) 값을 가져옴  -->
	<br>
	<jh:if test="${sresult.rowsByIndex[0][0]==0}">	
	
	<sql:update var="result" dataSource="${dbs}">
	insert into poll values ('0','이순수','Leesoonsu','01044452667','3','2022-08-17 15:05:05');
	</sql:update>
	<jh:if test="${result==0}">입력 오류</jh:if>
	<jh:if test="${result==1}">입력 성공</jh:if>
	</jh:if>
</body>
</html>