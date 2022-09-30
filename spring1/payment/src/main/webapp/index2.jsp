<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//KG 이니시스 개발 가이드 참고할것
//https://manual.inicis.com/pay/demo/pcDemo.php

//setAttribute, getAttribute 같이 사용금지
String m1="mid";
String m2= "mname";
String m3 = "mtel";
String m4 = "memail";
Object mid1 = session.getAttribute(m1);
Object mname2 = session.getAttribute(m2);
Object mtel3 = session.getAttribute(m3);
Object memail4 = session.getAttribute(m4);
/*
Object mid1 = session.getAttribute(m1);
Object mname2 = session.getAttribute(m2);
*/


String pd_code = request.getParameter("product_code");
String pd_name = request.getParameter("product_name");
String pd_money = request.getParameter("product_money");
int m = Integer.parseInt(pd_money);
DecimalFormat dc = new DecimalFormat("###,###");
String money = dc.format(m);
String pd_ea = request.getParameter("product_ea");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제자 정보 확인및 배송 정보 확인 페이지</title>
</head>
<body>
<form name="frm" id="frm" enctype="application/x-www-form-urlencoded">
<!-- PG사에 제동되는 hidden값들 -->
<input type="hidden" name="version" value="1.0">
<input type="hidden" name="mid" value="">
<input type="hidden" name="oid" value="">
<!--결제 금액 -->
<input type="hidden" name="price" value="<%=pd_money%>">
<input type="hidden" name="timestamp" value="">
<input type="hidden" name="currency" value="WON">
<!-- 상품명 -->
<input type="hidden" name="goodname" value="<%=pd_name%>">
<input type="hidden" name="buyername" value="<%=mname2%>">
<input type="hidden" name="buyertel" value="<%=mtel3%>">
<input type="hidden" name="buyeremail" value="<%=memail4%>">
<input type="hidden" name="buyerid" value="<%=mid1 %>">
<input type="hidden" name="goodcode" value="<%=pd_code%>">
<input type="hidden" name="goodea" value="<%=pd_ea%>">

상품코드 : <%=pd_code %><br>
상품명 : <%=pd_name %><br>
상품수량 : <%=pd_ea %> EA<br>
결제금액 : <span id="m"></span> 원<br>
<br> <br>
<p>------------------배송 정보 입력 및 최종 결제 금액 확정------------------</p>
수령인 : <input type="text" name="rec_name" value="<%=mname2 %>"> <br>
수령인 연락처 : <input type="text" name="rec_tel" value="<%=mtel3%>"> <br>
배송지 주소 : <input type="text" name="rec_addr" value=""> <br>
적립금 사용 : <input type="text" name="point" value=""> <br>
최종결제 금액 : <span id="total"></span>원 <br>
<p>------------------------결제 파트--------------------------</p>
<input type="radio" name="gopaymethod" value="CARD" checked> 신용카드
<input type="radio" name="gopaymethod" value="Directbank"> 계좌이체
<input type="radio" name="gopaymethod" value="vbank"> 가상계좌 <br>
<input type="button" value="결제하기" id="payment">
</form>
</body>
<script type="module">
var money = <%=pd_money%>; //상품 고유금액
import {gopayment} from "./js/index.js?v=4";
document.getElementById("m").innerText = money.toLocaleString();
document.getElementById("total").innerText = money.toLocaleString();

document.querySelector("#payment").addEventListener("click",function(){
	gopayment(money);
}
);
</script>
</html>