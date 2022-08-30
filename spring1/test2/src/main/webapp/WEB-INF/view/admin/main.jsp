<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<input type="button" value="고객센터" onclick="go1();"><br>
<input type="button" value="Q&A" onclick="go2();"><br>
<input type="button" value="MYINFO" onclick="go3();"><br>
<a href="http://localhost:8080/contact/contact.do">고객센터</a> | <a href="http://localhost:8080/qa/qalist.do">Q&A</a> | <a href="http://localhost:8080/qa/qalist.do">MYINFO</a>
</body>
<script>
function go1(){
	location.href="http://localhost:8080/contact/contact.do";
}
function go2(){
	location.href="http://localhost:8080/qa/qalist.do";
}
function go3(){
	location.href="http://localhost:8080/qa/qalist.do";
}
</script>
</html>
