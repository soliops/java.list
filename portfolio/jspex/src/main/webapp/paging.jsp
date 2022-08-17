<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<sql:setDataSource var="dbs"
	url="jdbc:mysql://umj7-009.cafe24.com/opete95"
	driver="com.mysql.jdbc.Driver" user="opete95" password="soli5857!@"></sql:setDataSource>
<%
	String startpage = null; //최초 시작되는 페이지값
	String pageno ="5"; //한 페이지당 5개씩
	String getpage = (String)request.getParameter("p");
	if(getpage==null||getpage.equals("")||getpage.equals("1")){
		startpage="0";
	}
	else{
		int s = Integer.parseInt(pageno); //한페이지에 보여줄 데이터 갯수
		int g = Integer.parseInt(getpage); //페이징 번호값
		int t = (g-1) * s; //(페이지번호-1) * 한페이지당 보여줄 갯수
		startpage=String.valueOf(t);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - 전체 리스트 및 pageing 사용법</title>
</head>
<body>
<!-- 전체갯수 -->
<sql:query var="num" dataSource="${dbs}">
select * from poll order by pidx desc;
</sql:query>
<jh:out value="${num.rowCount}"></jh:out>
<!-- 한 페이지 당 출력 파트  -->
<sql:query var="datas" dataSource="${dbs}">
select * from poll order by pidx desc limit <%=startpage %>,<%=pageno%>;

</sql:query>
<table border="1">
<tr>
<td>NO</td>
<td>아이디</td>
<td>고객명</td>
<td>전화번호</td>
<td>입력일자</td>
</tr>
<jh:set var="spage" value="<%=startpage %>"></jh:set>
<jh:forEach var="data" items="${datas.rows}" varStatus="ct">
<!-- varStatus : 순번을 체크함 { count (1~) , index (0~) } -->
<tr>
<td><jh:out value="${(num.rowCount-spage)-ct.index}"></jh:out></td>
<td><jh:out value="${data['puserid'] }"></jh:out></td>
<td><jh:out value="${data['pname'] }"></jh:out></td>
<td><jh:out value="${data['ptel'] }"></jh:out></td>
<jh:set var="indate" value="${data['pindate'] }"></jh:set>
<td><jh:out value="${fn:substring(indate,0,10)}"></jh:out></td>
</tr>
</jh:forEach>
</table>
<table border="1">
<tr>
<jh:set var="pageno" value="<%=pageno %>"></jh:set>
<jh:set var ="pagenum" value="${num.rowCount/pageno+((1-num.rowCount/pageno%1))%1}"></jh:set>
<jh:forEach var="ns" begin="1" end="${pagenum}">
<td onclick="pagego(${ns });">${ns}</td>
</jh:forEach>
</tr>
</table>
<script>
function pagego(p){
	location.href="./paging.jsp?p="+p;
}
</script>
</body>
</html>