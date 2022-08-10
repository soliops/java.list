<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
%>
<%
	String mid = request.getParameter("mid");
	String mname = request.getParameter("mname");
	String nickname = request.getParameter("nickname");
%>
<br>
아이디 : <%=mid %> <br>
고객명 : <%=mname %> <br>
닉네임 : <%=nickname %> <br>
<jsp:include page="./ex21_2.jsp">
<jsp:param value="연습입니다." name="nickname"/>
</jsp:include>

</body>
</html>