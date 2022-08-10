<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>ex21_1.jsp 리턴 콜</p>
<%
String mid2 = request.getParameter("mid"); 
String mname2 = request.getParameter("mname"); 
String nick = request.getParameter("nickname"); 
String a = "ex21_2에 대한 값";
String recall = mid2+" "+mname2 + " "+nick;
%>

아이디 : <%=mid2%> <br>
고객명 : <%=mname2%> <br>
닉네임 : <%=nick %> <br>

<%-- <jsp:forward page="./ex21.jsp"> --%>
<%-- <jsp:param value="난중일기" name="nickname"/> --%>
<%-- </jsp:forward> --%>
</body>
</html>