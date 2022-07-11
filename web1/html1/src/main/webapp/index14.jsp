<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 데이터 확인</title>
</head>
<body>
<%
/*데이터를 보낼때 get으로 보낼지 post로 보낼지 backend가 잘 판단해야함.
이메일의 경우 get으로 보내면 url에 이메일 정보가 다 나타나기 때문에 무조건 post로 해야함
보안이 중요하면 post 아니면 get*/
	request.setCharacterEncoding("utf-8");
	String mail1= request.getParameter("user_email1");
	String mail2= request.getParameter("user_email2");
	String pass = request.getParameter("user_pw");
%>
<%=mail1%>@<%=mail2%> <br>
<%=pass%>
</body>
</html>