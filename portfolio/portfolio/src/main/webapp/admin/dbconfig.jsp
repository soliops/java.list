<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<%
	Connection ct = null;
	try{
		String driver = "com.mysql.jdbc.Driver";
// 		String url = "jdbc:mysql://localhost:3306/opete95";
		String url = "jdbc:mysql://umj7-009.cafe24.com/opete95";
		String id = "opete95";
		String pw = "soli5857!@";
		Class.forName(driver);
		ct = DriverManager.getConnection(url,id,pw);
		
	}catch(Exception e){
		
	}
%>