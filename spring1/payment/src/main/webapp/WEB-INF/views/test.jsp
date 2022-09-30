<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String mid1 = (String)session.getAttribute("mid");
String mname2 = (String)session.getAttribute("mname");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test.java에 있는 session값을 로드</title>
</head>
<body>
${mid}
${mname }
<br>
<%=mid1 %>
<%=mname2 %>
</body>
</html>