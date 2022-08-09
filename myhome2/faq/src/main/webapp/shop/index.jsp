<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-compatible" content="IE=Edge,chrome=1">
<meta name="viewport" content="width=device, initial-scale=1.0"> 
<title>쿠팡 쇼핑몰 리뉴얼</title>
<link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<!--Regular 400-->
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&family=Noto+Sans+KR:wght@100;300;400;900&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./index.css?v=7">
<link rel="stylesheet" type="text/css" href="./top.css?v=6">
<link rel="stylesheet" type="text/css" href="./menu.css?v=6">
<link rel="stylesheet" type="text/css" href="./banner.css?v=3">
<link rel="stylesheet" type="text/css" href="./product.css?v=4">
<link rel="stylesheet" type="text/css" href="./bottom.css?v=2">
<script src="../jq/jquery.js"></script>
</head>
<body>
<!-- 이벤트 배너 -->
<header class="header_css"><%@ include file="./top.html" %></header>
<!-- 로그인 & 대메뉴 -->
<nav class="nav_css"><%@ include file="./menu.html" %></nav>
<!-- 메인 배너 -->
<section class="banner_css"><%@ include file="./banner.html" %></section>
<!-- 상품출력 -->
<article class="article_css"><%@ include file="./product.html" %></article>
<!-- 카피라이터 -->
<footer class="footer_css"><%@ include file="./bottom.html" %></footer>
</body>
</html>