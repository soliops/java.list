<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>쇼핑몰 환경설정</title>
    <link rel="stylesheet" type="text/css" href="./css/basic.css">
    <link rel="stylesheet" type="text/css" href="./css/login.css?v=1">
    <link rel="stylesheet" type="text/css" href="./css/main.css">
    <link rel="stylesheet" type="text/css" href="./css/notice.css?v=3">
    <link rel="icon" href="./img/logo.png" sizes="128x128">
    <link rel="icon" href="./img/logo.png" sizes="64x64">
    <link rel="icon" href="./img/logo.png" sizes="32x32">
    <link rel="icon" href="./img/logo.png" sizes="16x16">
    <script src="./js/jquery.js"></script>
    <script src="./js/notice_list.js"></script>
</head>
<%		request.setCharacterEncoding("UTF-8");
		session.setMaxInactiveInterval(30*60);
		String admin_main_id = (String)session.getAttribute("admin_id");		
		String admin_main_nm = (String)session.getAttribute("admin_nm");
		if(admin_main_id==null){
			out.print("<script>location.href='./index.html';</script>");
		}

		%>
<body>
<header class="headercss">
<%@ include file="./admin_header.html" %>
</header>
<nav class="navcss">
<%@ include file="./admin_menu.html" %>
</nav>
<main class="maincss">
<section style="height: auto;">
<form name="f" id="f" method="post" enctype="application/x-www-form-urlencoded">
      <%@ include file="./notice_list.jsp" %>
</form>
</section>
</main>
<footer class="main_copyright" style="margin-top:250px;">
<%@ include file="./admin_footer.html" %>
</footer>
</body>
</html>