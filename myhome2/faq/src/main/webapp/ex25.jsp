<%@page import="java.net.InetAddress"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - 내장객체들 설명</title>
</head>
<body>
<!--
내장객체 : JAVA 또는 import 
또는 라이브러리를 사용하지 않고 사용하는 명령어
 
전달시 무조건 name 또는 get으로 보낼경우 파라미터 이름으로 보내야 합니다.

getParameter : 특정 name을 전달 받을 때 사용
getParameterValues : 특정 name값 전달 받지만 배열형태로 받음
getParameterNames : 모든 name을 다 가져 옵니다. (Enumeration) 객체 타입 형태
String, int, double, float...(X) Enumeration 로 받아야 함.
getParameterMap() : 
Map객체 타입에 전달 받는 형태 ("파라미터이름","값")

[접속자 정보를 확인 경우]
getHeader("host") : 접속자에 대한 도메인 호스트 URL 및 포트번호
getHeader("accept-language") : 페이지 제작에 대한 언어패킷
request.getHeader("User-Agent") :접속 기기를 확인할 때 사용
getRemoteAddr(), getRemoteHost() : 클라이언트 IP주소 확인
getRequestURI() : 도메인(X) URI경로 및 페이지명 출력
getMethod() : 전송방식(GET, POST)
response.sendRedirect("url") : 페이지 강제 이동
-->
<%
request.setCharacterEncoding("UTF-8");
String a = request.getHeader("host");
String b = request.getHeader("accept-language");
String c = request.getHeader("User-Agent");
String d = request.getRemoteAddr(); // 0:0:0...
String e = request.getRemoteHost();
String f = request.getRequestURI(); // 현재 있는 경로
String g = request.getMethod(); //Servlet (service)
String h = request.getQueryString(); //파라미터 문자열을 가져옴
response.sendRedirect("https://www.naver.com");
/* 내장객체는 아님(import) - 본 서버에서 확인 가능합니다. */
InetAddress ia = InetAddress.getLocalHost();
ia = InetAddress.getLocalHost();

out.print(d + "<br>");
out.print(e + "<br>");
out.print(ia + "<br>");
out.print(f + "<br>");
out.print(g + "<br>");
out.print(h + "<br>");
%>

</body>
</html>