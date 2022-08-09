<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./config.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일차 = 기본문법 형태(날짜 출력)</title>
</head>
<body>
<%
	Date day = new Date(); //현재 날짜 KST : 한국시간 UST : 미국시간
	out.print(day+"<br>");
	int h = day.getHours();
	int m = day.getMinutes();
	int s = day.getSeconds();
	out.print(h+"시 "+m+"분 "+s+"초"+"<br>");
//	int y = day.getYear(); //버그(X) - 2000년도 이상
	int y = day.getYear()+1900; //1900 붙이는 이유는 2000년도 이상 적용하기 위함
	int mm = day.getMonth()+1; //월
	int d = day.getDate(); //일
	int w = day.getDay(); //요일
	//getDay() : 요일
	out.print(y+"<br>"+ mm+"<br>"+d+"<br>" +w+"<br>");
%>
</body>
</html>