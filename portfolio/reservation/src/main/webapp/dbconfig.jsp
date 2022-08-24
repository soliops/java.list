<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	Connection con = null;
	try{
		String db = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://kbsn.or.kr:3306/dclass";
		String user = "java_d";
		String pw = "java_dclass";
		
		Class.forName(db);
		con = DriverManager.getConnection(url,user,pw);
	}
	catch(Exception e){
		String error = e.getMessage();
	}
	
%>