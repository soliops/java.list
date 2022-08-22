<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String test="환영합니다.";
%>
</head>
<body>
<input type="button" value="확인" onclick="abc();">
</body>
<script>
function abc(){
	var a = "<%=test%>";
	alert(a);
}
</script>
</html>