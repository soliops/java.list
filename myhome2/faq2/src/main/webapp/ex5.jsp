<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 - 선택문</title>
</head>
<body>
<%
	String level="";
	String msg="";

	switch(level){
	case "1":
		msg="일반회원";
		break;
	case "2":
		msg="실버회원";
		break;
	case "3":
		msg="골드회원";
		break;
	default:
		msg="비회원";
		break;
	}
%>
<input type="text" value="<%=msg%>"> <br> <br>

<!-- 반복문 + switch선택문 -->
<%
	String msgs="";
	String ck = "checked";
	for(int w=0;w<4;w++){
	switch(w){
	case 0:
		msgs="무통장 입금";
		
		break;
	case 1:
		msgs="신용카드";
		ck = "";
		break;
	case 2:
		msgs="도서상품권";
		ck = "";
		break;
	case 3:
		msgs="휴대폰 결제";
		ck = "";
		break;
	}
%>
<input type="radio" name="rd" id="rd<%=w%>" value="<%=msgs%>" <%=ck%>><%=msgs%>
<%		
	}
%>
</body>
</html>