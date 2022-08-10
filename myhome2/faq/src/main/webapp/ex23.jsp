<%@page import="configure.ex23"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - JAVA 파일 load</title>
</head>
<body>
<%
	/*권장사항은 아님 : 기본 지식정도로 알고 있으면 됩니다.
	(속도가 급격하게 떨어짐, 메모리를 많이 잡아먹음)
	ex23 ex1 = new ex23();
	ex1.inname();
	*/
%>
<!-- useBean : JAVA파일에 대한 Class를 로드할 때 사용하는 jsp 태그 입니다.  -->
<jsp:useBean id="abc" class="configure.ex23" scope="request">
<%//abc.inname();
abc.inname2("강감찬","골드회원");
request.setCharacterEncoding("UTF-8");
%>

</jsp:useBean>
<p>고객명 : <%=abc.names() %></p>
<p>고객등급 : <%=abc.level() %></p>
<jsp:include page="ex23_1.jsp">
<jsp:param value="<%=abc.names() %>" name="person"/>
</jsp:include>
</body>
</html>