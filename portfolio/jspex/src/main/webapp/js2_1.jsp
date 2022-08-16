<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js2.jsp - 쿠키 생성</title>
</head>
<body>
<% 
	String user = "홍길동";
	String email = "hong@nate.com";

	Cookie ck = new Cookie("person",user); //쿠키값 생성
	response.addCookie(ck); //생성한 쿠키값을 서버에 전송
	Cookie ck2 = new Cookie("email", email);
	response.addCookie(ck2);
%>
</body>
</html>