<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<% 
request.setCharacterEncoding("UTF-8");
String id = "hong";
String pass= "hong1234";
// request.setAttribute("mid",request.getParameter("mid"));
String mid = request.getParameter("mid").intern();
String mpass = request.getParameter("mpass").intern();
if(id==mid && pass==mpass){
	out.print("<script>location.href='./index.jsp';</script>");	
}
else{
	out.print("<script>alert('회원정보를 다시 확인해주세요.'); location.href='./member_login.jsp';</script>");
}
%>	

</body>
</html>