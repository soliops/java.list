<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./config.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일차 - 환경설정 파일 로드</title>
</head>
<body>
<%
out.print(request.getParameter("usernm"));
%>
<form name="frm" id="frm" method="POST" action="./ex12.jsp">
<input type="text" name="usernm">
<input type="submit" value="전송">
</form>
</body>
</html>