<%@page import="reservation.tools"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	tools t = new tools();
	String time = t.time().substring(0,10);
	
	String a = request.getParameter("rtime");
	if(a == null || a.equals("")){
	
	}
	else{
		time = a;
	}
	request.setAttribute("time", time);
	
	
%>
<script type="text/javascript">
window.onload = function name1() {
	location.href = "./index.html";
}
</script>
</body>
</html>