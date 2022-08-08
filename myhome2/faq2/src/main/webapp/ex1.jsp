<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 -기초문법</title>
</head>
<body>
<%-- <%(JSP 시작) %>(JSP 종료) --%>
<%-- <%!.... %> -> 자바 변수나 메소드를 정의할 때 사용함 --%>
<%-- <%=.. %> 해당 값을 출력하는 문자열, 숫자를 사용합니다. --%>
<%-- <%@... %> 페이지 속성 지정 --%>
<%@ include file ="ex2.jsp" %>
<%! int a;
   int b;
   public int sum(int aa, int bb){
	   return aa+bb;
   }
   %>
<!--    JSP -->
<%
   a=20;
   b=10;
   out.print(sum(a,b)); //out.print : JSP 출력 파트
%>
<!-- JSP 문법만 사용    -->

<ul>
<% for(int i=0; i<9; i++){ %>
<li><% out.print(i); %></li>
<% } %>
</ul>
</body>
</html>