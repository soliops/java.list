<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- MVC의 View 파트 -->
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<title>로그인 완료</title>
<script>
	function logout(){
		if(confirm("로그아웃 하시겠습니까?")){
			location.href="./logout.jsp";
		}
	}
</script>
</head>
<body>
<%
if(session.getAttribute("pnm")==null){
	//jsp 에는 별도의 import 사항이 없는 상황 입니다.
	
	PrintWriter pr = response.getWriter();
	pr.print("<script>alert('접근이 잘못 되었습니다.'); history.go(-1);</script>");
}
%>


<%=session.getAttribute("pnm") %> 님 환영합니다.
[아이디] <%=session.getAttribute("pid") %>

<input type="button" value="로그아웃" onclick="logout();">
</body>
</html>