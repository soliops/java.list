<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - include 전달</title>
</head>
<body>
<!-- include : POST형식 -->
<!-- 
1. ex21에서 mid, mname, nickname 값을 보냅니다. -> ex21_1.jsp
2. ex21_1.jsp에서 nickname 값만 변경 -> ex21_2.jsp
3. ex21_2.jsp에서 최종결과 값을 출력 + ex21.jsp 추가 결과값을 받을 수 있도록
	a라는 매개변수를 추가 하여 전달함
4. ex21.jsp에서는 ex21_2.jsp에서 추가된 매개변수를 출력하게 됩니다.

 -->
<%
request.setCharacterEncoding("UTF-8");
String mid = request.getParameter("mid"); 
String mname = request.getParameter("mname"); 
%>
<p>회원정보 확인</p>
<jsp:include page="./ex21_1.jsp" flush="false">
<jsp:param value="Lee" name="mid"/>
<jsp:param value="이순신" name="mname"/>
<jsp:param value="거북선" name="nickname"/>
</jsp:include>
<br>
<%@ include file="./ex21_2.jsp"%>
<!-- 최종 결과 확인을 위해서 로드를 하게 됩니다. -->
<%
out.print(a+"<br>"+recall);
%>

</body>
</html>