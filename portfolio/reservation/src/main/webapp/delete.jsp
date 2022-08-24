<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbconfig.jsp" %>
<%
request.setCharacterEncoding("UTF-8");
String ridx ="2";
String sql = "delete from reservation where ridx=?;";
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1,ridx);
int n = 0;
n=ps.executeUpdate();
if(n>0){
	out.print("예약을 취소 하셨습니다.");
}
else{
	out.print("올바른 값이 아닙니다.");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>