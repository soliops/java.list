<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="f" id="f" method="post" action="http://192.168.100.210:8080/test3/check_page.do" enctype="application/x-www-form-urlencoded">
<input type="password" name="security"> <br>
<input type="submit" value="전송">
</form>
<br>
<form name="f1" id="f1" method="post" action="http://192.168.100.209:8080/test3/check_page.do" enctype="application/x-www-form-urlencoded">
<input type="password" name="security"> <br>
<input type="submit" value="외부전송">
</form>
<br>

<form name="fa" id="fa" method="get" action="dataload.do">
<input type="text" name="users">
<input type="submit" value = "내부전송">
</form>
</body>
</html>