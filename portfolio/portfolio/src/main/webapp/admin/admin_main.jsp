<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 등록 페이지</title>
    <link rel="stylesheet" type="text/css" href="./css/basic.css">
    <link rel="stylesheet" type="text/css" href="./css/login.css?v=1">
    <link rel="stylesheet" type="text/css" href="./css/main.css">
    <link rel="icon" href="./img/logo.png" sizes="128x128">
    <link rel="icon" href="./img/logo.png" sizes="64x64">
    <link rel="icon" href="./img/logo.png" sizes="32x32">
    <link rel="icon" href="./img/logo.png" sizes="16x16">
    <script src="./js/jquery.js"></script>
    <script src="./js/admin_list.js"></script>
<%		
		request.setCharacterEncoding("UTF-8");
		session.setMaxInactiveInterval(30*60);
		String admin_main_id = (String)session.getAttribute("admin_id");		
		String admin_main_nm = (String)session.getAttribute("admin_nm");
		if(admin_main_id==null){
			out.print("<script>alert('로그인하셔야만 접근이 가능합니다.');location.href='./index.html';</script>");
		}
		%>
</head>
<body>
<header class="headercss">
<%@ include file="./admin_header.html" %>
</header>
<nav class="navcss">
<%@ include file="./admin_menu.html" %>
</nav>
<main class="maincss">
<section><%@ include file="./admin_list.jsp" %></section>
<section></section>
<section></section>
</main>
<footer class="main_copyright">
<%@ include file="./admin_footer.html" %>
</footer>
</body>
</html>