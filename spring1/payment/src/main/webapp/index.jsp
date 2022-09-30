<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//setAttribute, getAttribute 같이 사용금지
String mid, mname,memail,mtel;
mid = "hong";
mname="홍길동";
memail = "opete95@naver.com";
mtel = "01012345678";

session.setAttribute("mid",mid);
session.setAttribute("mname",mname);
session.setAttribute("memail",memail);
session.setAttribute("mtel",mtel);
/*
session.removeAttribute(mid);
session.removeAttribute(mname);
*/

/*상품코드 6자리 난수코드를 생성*/
Random rd = new Random();
int number;
String nb ="";
for(int w=0;w<6;w++){
	number=rd.nextInt(9);
	nb+=number;		
}
%>
<%
// String m1="mid";
// String m2= "mname";
// session.getAttribute(m1);
// session.getAttribute(m2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 선택 부분</title>
</head>
<body>
<!-- 
결제시스템에는 상품코드는 최소 6자리 ~ 최대 12자리 
상품 수량 : 무조건 숫자만 입력
결제 금액 : 무조건 숫자만 입력 : 25,000(X) 25000(O)
결제 금액 : 최소 1000 부터 시작
상품명 : 불필요한 단어는 주의 (마약, 담배, 술....)

-->
<form name="frm" id="frm" enctype="application/x-www-form-urlencoded">
상품코드 : <input type="text" name="product_code" value="<%=nb%>" readonly="readonly"> <br>
상품명 : <input type="text" name="product_name" value=""> <br>
결제금액 : <input type="text" name="product_money" value=""> <br>
상품수량 : <input type="text" name="product_ea" value=""> <br>
<input type="button" value="상품구매확정" id="btn" name="btn">
</form>
<!--  ECMA 형태의 script -->
<script type="module">
	import {gopage} from "./js/index.js";
	document.querySelector("#btn").addEventListener("click",gopage);
</script>
</body>
</html>