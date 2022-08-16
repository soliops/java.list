<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Js1_1 - session 삭제</title>
</head>
<body>
<%
	//특정 session을 삭제할 때 사용
// 	session.removeAttribute("mid");
// 	session.removeAttribute("mail");
// 	session.removeAttribute("lv");

	//모든 session 삭제
	session.invalidate();
%>
</body>
</html>