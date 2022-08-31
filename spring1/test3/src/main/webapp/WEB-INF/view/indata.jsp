<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 사용하기 - t1 (controller)</title>
</head>
<body>
<%@ include file="./menus.jsp" %>
<p>아이디 찾기</p>
<form name="f" id="f" method="post" action="loginok.do">
<input type="text" name="usernm"> <br>
<input type="text" name="useremail"> <br>
<input type="submit" value="아이디찾기">  <br>
</form>
</body>
</html>