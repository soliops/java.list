<%@page import="reserve_info.info_select"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
ArrayList<info_select> al = (ArrayList<info_select>)request.getAttribute("al");
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
    <script src="./js/reserve_info.js?v=2"></script>
    <link rel="stylesheet" href="./js/jquery-ui.css?v=1">
</head>
<body>
<form name="f" id="f">
    <header class="header_css">
      <div class="title">
        [더조은 펜션 예약시스템]
      </div>
    </header>
    <nav class="nav_css">
        <ul class="ul_css">
            <li onclick="re()">예약현황</li>
            <li onclick="res()">예약하기</li>
            <li onclick="ck()" class="li_btn">예약확인</li>
        </ul>
    </nav>
    <section class="section_css">
       <div class="reserve_info">
        <p>예약 정보 확인</p>
        <ul>
            <li>예약번호</li>
            <li><%=al.get(0).getRnumber() %><input type="hidden" name="rnumber" id="rnumber" value="<%=al.get(0).getRnumber() %>"></li>
        </ul>
        <ul>
            <li>예약일자</li>
            <li><%=al.get(0).getRdate() %></li>
        </ul>
        <ul>
            <li>객실명</li>
            <li><%=al.get(0).getRname() %></li>
        </ul>
        <ul>
            <li>예약자</li>
            <li><%=al.get(0).getRuser() %></li>
        </ul>
        <ul>
            <li>연락처</li>
            <li><%=al.get(0).getRtel() %></li>
        </ul>
        <ul>
            <li>이메일</li>
            <li><%=al.get(0).getRemail() %></li>
        </ul>
        <ul>
            <li>인원수</li>
            <li> <%=al.get(0).getRperson() %>명</li>
        </ul>
        <ul>
            <li>도착예정시간</li>
            <li><%=al.get(0).getRarrival().substring(0,19) %></li>
        </ul>
       </div>
       <div class="reserve_btn">
        <input type="button" value="예약수정" class="btn1" onclick = "np()">
       </div>
    </section>
    <footer class="footer_css">
        <div>Copyright ⓒ 사이트 주소 2022 All Rights reserved.</div>
    </footer>
</form>
</body>
</html>