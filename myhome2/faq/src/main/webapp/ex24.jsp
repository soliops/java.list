<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 상품검색 응용파트</title>
<script>
</script>
</head>
<body>

<%
	request.setCharacterEncoding("UTF-8");
	String fruit = request.getParameter("search").intern();
	if(fruit!=""||fruit!=null){
	String msg = null;
	String product =null;
	int price = 0;
	String coupon = null;
	if(fruit=="딸기"){
		msg="해당 상품은 판매 종료된 상품입니다.";	
	}
	else if(fruit.indexOf("포도")>-1){
		product = "청포도 2kg";		
		price = 35000;
		coupon = "10%";
	}
	else{
		msg="상품명을 다시 한번 확인해주세요.";
	}
%>
<p>출력 파트</p>
<%if(fruit=="딸기"||fruit.indexOf("포도")>-1){ %>
[<%=fruit %>] <br>
<%} %>
<%if(fruit.indexOf("포도")<-1){ %>
[<%=msg %>] <br>
<%} %>
<%if(fruit.indexOf("포도")>-1){ %>
상품명 : <%=product %>  <br>
가격 : <%=price %> <br>
할인가 : <%=coupon %> <br>
<%} %>
<%
}else{
 %>
<% }%> 
<form name="frm" id="frm" method="post" action="./ex24.jsp">
<input type="text" name="search" id="search">
<input type="submit" value="검색">
</form>
	
</body>
</html>