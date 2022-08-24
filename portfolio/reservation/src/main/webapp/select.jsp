<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="dbconfig.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	String user ="세종대왕";
	String pw = "a123456";
	String rno = "987654";
	String sql = "select * from reservation where rnm=? and rpw=? and rno=?;";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,user);
	ps.setString(2,pw);
	ps.setString(3,rno);
	ResultSet rs = ps.executeQuery();
// 	String remail = null;
// 	while(rs.next()){
// 		remail = rs.getString("remail");
// 	}
	
	ArrayList<String> al = new ArrayList<>();
	while(rs.next()){
		al.add(0,rs.getString("remail"));
		al.add(1,rs.getString("rtel"));
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select</title>
</head>
<body>
이메일 : <%=al.get(0)%> <br>
전화번호 : <%=al.get(1)%> <br>
</body>
</html>