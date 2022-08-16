<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js2.jsp - 쿠키 확인</title>
</head>
<body>
<%
	Cookie[] ck = request.getCookies();
	out.print(ck[0].getName()+"<br>"); //사이트 접속정보
	out.print(ck[1].getName()+"<br>"); //쿠키이름
	out.print(ck[2].getName()+"<br>"); //쿠키이름
	out.print(ck[1].getValue()+"<br>"); //쿠키값
	out.print(ck[2].getValue()+"<br>"); //쿠키값

	
%>
</body>
</html>