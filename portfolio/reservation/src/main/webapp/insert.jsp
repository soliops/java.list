<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "dbconfig.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=utf-8");

	String sql = "insert into reservation";
	sql+=" values('0',?,?,?,?,?,?,?);";
		
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,"세종대왕");
	ps.setString(2,"a123456");
	ps.setString(3,"987654");
	ps.setString(4,"sejong@naver.com");
	ps.setString(5,"01076543210");
	ps.setString(6,"7");
	ps.setString(7,"2022-08-24 08:00:00");
	int y = 0;
	y= ps.executeUpdate();
	if(y>0){
		out.print("올바르게 저장되었습니다.");
	}
	else{
		out.print("올바른 값이 아닙니다.");
	}

%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>외부 DB 데이터 입력 페이지</title>
</head>
<body>

</body>
</html>