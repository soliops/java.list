<%@page import="reservation.tools"%>
<%@page import="java.util.Map"%>
<%@page import="reserve_index.index_select"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String list[] = (String[])request.getAttribute("yn");
Map<Integer, ArrayList<index_select>> m = (Map<Integer, ArrayList<index_select>>)request.getAttribute("m");
String time= (String)request.getAttribute("time");
%>

<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>팬션 예약시스템</title>
    <link rel="stylesheet" href="./css/default.css?v=3">
    <script src="./js/jquery.js"></script>
    <script src="./js/jquery-ui.js"></script>
    <script src="./js/index.js?v=1"></script>
    <link rel="stylesheet" href="./js/jquery-ui.css?v=1">
</head>
<body>
    <header class="header_css">
      <div class="title">
        [더조은 펜션 예약시스템]
      </div>
    </header>
    <nav class="nav_css">
        <ul class="ul_css">
            <li class="li_btn" onclick="re()">예약현황</li>
            <li onclick="res()">예약하기</li>
            <li onclick="ck()">예약확인</li>
        </ul>
    </nav>
    <section class="section_css">
        <div class="reser_list">
            <ul>
                <li>일자확인</li>
                <li><input type="text" id="reser_date" class="reser_date" name="rdate"  value="<%=time%>"></li>
                <li><input type="button" value="검색" class="reser_btn" id = "btn" onclick="np()"></li>
            </ul>
        </div>
        <div class="reser_room">
            <ul class="reser_list">
                <li>객실이미지</li>
                <li>객실명</li>
                <li>예약상태</li>
            </ul>
            <ul class="reser_listimg">
                <li><img src="./img/01.jpg"></li>
                <li>그린하우스 봄날</li>
                <li><%=list[0] %></li>
            </ul>
            <ul class="reser_listimg">
                <li><img src="./img/02.jpg"></li>
                <li>스칼렛하우스 여름</li>
                <li><%=list[1] %></li>
            </ul>
            <ul class="reser_listimg">
                <li><img src="./img/03.jpg"></li>
                <li>국화하우스 가을</li>
                <li><%=list[2] %></li>
            </ul>
            <ul class="reser_listimg">
                <li><img src="./img/04.jpg"></li>
                <li>블루베리하우스 겨울</li>
                <li><%=list[3] %></li>
            </ul>
        </div>
    </section>
    <footer class="footer_css">
        <div>Copyright ⓒ 사이트 주소 2022 All Rights reserved.</div>
    </footer>
</body>
</html>