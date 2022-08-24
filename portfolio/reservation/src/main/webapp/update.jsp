<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbconfig.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	String rnm ="세종대왕";
	String rpw = "a123456";
	String rno = "987654";
	String rperson ="5";
	String remail = "King@naver.com";
	String sql = "update reservation set rperson=?,remail=? where rnm=? and rpw=? and rno=?;";
	PreparedStatement ps = con.prepareStatement(sql);
	
	ps.setString(1, rperson);
	ps.setString(2, remail);
	ps.setString(3, rnm);
	ps.setString(4, rpw);
	ps.setString(5, rno);
	
	int n = 0;
	n = ps.executeUpdate();
	if(n>0){
		out.print("고객 정보가 올바르게 수정 되었습니다.");
	}else{
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