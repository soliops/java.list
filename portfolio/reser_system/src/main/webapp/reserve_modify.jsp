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
    <script src="./js/reserve_modify.js?v=1"></script>
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
            <li onclick="re()">예약현황</li>
            <li onclick="res()" class="li_btn">예약하기</li>
            <li onclick="ck()">예약확인</li>
        </ul>
    </nav>
    <section class="section_css">
    <form name="f" >
    
       <div class="reserve_info">
        <p>예약 입력정보 수정</p>
        <ul>
            <li>예약일자</li>
            <li name = "rdate" id = "rdate">
            <input type = "text" name="rdate" value="<%=al.get(0).getRdate().substring(0,10) %>" readonly>
            </li>
        </ul>
        <ul>
            <li>객실명</li>
            <li>
            <input type = "text" name="rname" value="<%=al.get(0).getRname() %>" readonly>
            </li>
        </ul>
        <ul>
            <li>예약자</li>
            <li>
            <input type = "text" name="ruser" value="<%=al.get(0).getRuser() %>" readonly>
            </li>
        </ul>
        <ul>
            <li>연락처</li>
            <li><input type="number" id="reser_date" name="rtel" class="input2" value="<%=al.get(0).getRtel() %>"></li>
        </ul>
        <ul>
            <li>이메일</li>
            <li><input type="email" id="reser_date" name="remail" class="input2" value="<%=al.get(0).getRemail() %>"></li>
        </ul>
        <ul>
            <li>인원수</li>
            <li><input type="text" id="reser_date" name="rpeople" class="input3" value="<%=al.get(0).getRperson() %>"> 명</li>
        </ul>
        <ul>
            <li>도착예정시간</li>
            <li><input type="time" id="reser_date" name="rarrival" class="input2" value="<%=al.get(0).getRarrival().substring(11,16) %>"></li>
	
        </ul>
        
        <input type = "hidden" value = "<%=al.get(0).getRnumber() %>" name="rnumber">
       </div>
       <div class="reserve_btn">
        <input type="button" value="수정취소" class="btn2" onclick="rp()">
        <input type="button" value="수정완료" class="btn1" onclick="np1()">
       </div>
       
       </form>
    </section>
    <footer class="footer_css">
        <div>Copyright ⓒ 사이트 주소 2022 All Rights reserved.</div>
    </footer>
</body>
</html>