<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session ="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script></script>
</head>
<body>
<%@ include file="dbconfig.jsp" %>
<%
	String id = request.getParameter("admin_id");
	String sql = "select * from admin_add where admin_id='"+id+"';";
	try{
		PreparedStatement ps = ct.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		String nm =null;
		while(rs.next()){
			nm = rs.getString("admin_nm");			
		}
		session.setMaxInactiveInterval(20*60);
		session.setAttribute("admin_id", id);
		session.setAttribute("admin_nm", nm);
	if(id.equals(null)||id==""){
		out.print("<script>alert('로그인 하셔야만 접근이 됩니다.'); location.href='/index.html';</script>");
	}
	else{
		out.print("<script>location.href='/portfolio/admin/admin_main.jsp';</script>");
	}
	}
	catch(Exception e){
		
	}
	finally{
		try{
			if(ct!=null){
				ct.close();
			}
		}catch(Exception z){
		}
		
	}
%>
</body>
</html>