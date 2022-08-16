<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>  
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- setDataSource : DB 연결 태그 -->
<sql:setDataSource var="dbs" url="jdbc:mysql://umj7-009.cafe24.com/opete95" driver="com.mysql.jdbc.Driver" user="opete95" password="soli5857!@"></sql:setDataSource>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - SQL 연결</title>
</head>
<body>
<!-- dataSource = Connect
query : db쿼리문(select)
udate : db쿼리무(insert,update,delete)
var로 query문을 실행하게 됨.
 -->
<sql:query var="select" dataSource="${dbs}">
select * from poll order by pidx desc;
</sql:query>
<!-- columnNames : SQL 필드명을 가져올때 사용 -->
<jh:forEach var="poll" items="${select.columnNames}">
<span>
<jh:out value="${poll}"> </jh:out> <!-- 컬럼명 -->
 </span>
</jh:forEach>
<br> <br> <br>
<!-- rows : 필드에 있는 값 -->
<jh:forEach var="data" items="${select.rows }">
<span>
<!-- ${data['필드명']} -->
<jh:out value="${data['pname']}"></jh:out>
</span>
<span>
<jh:out value="${data['puserid']}"></jh:out>
</span>
<span>
<input type="button" value="삭제" onclick="abc(${data['pidx']});">
</span>

</jh:forEach>
</body>
<script>
function abc(z){
	alert(z);
}
</script>
</html>