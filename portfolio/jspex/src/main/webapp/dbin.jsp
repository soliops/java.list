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
<title>Insert title here</title>
</head>
<body>
<sql:update var="result" dataSource="${dbs}">
insert into poll values('0','김수빈','kimsubin','01022221111','5','2022-08-17 10:13:22');
insert into poll values('0','김정민','kimj_min','01021561122','4','2022-08-17 11:23:22');
insert into poll values('0','김정현','hyunkim','01022123111','3','2022-08-17 12:33:22');
insert into poll values('0','김진수','kimjinsu','01022221111','1','2022-08-17 13:44:22');
insert into poll values('0','김창순','kimchangsoon','01021267111','2','2022-08-17 15:53:22');
</sql:update>
</body>
</html>