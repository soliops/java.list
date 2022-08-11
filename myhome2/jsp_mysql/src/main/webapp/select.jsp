<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - sql연동(select)</title>
</head>
<body>
<%@ include file = "dbconnect.jsp" %><!-- DB접속환경 로드함-->
<%
	String sql = "select * from poll"; //SQL 문법
	try{
		//PreparedStatement : SQL 문법을 실행 시키는 클래스
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		//select에서만 ResulSet : 모든 값을 받아서 처리하는 클래스
		while(rs.next()){ //SQL에 있는 데이터를 반복시킴
			//getString : 문자
			//getInt : 숫자
			//getBoolean : true, false
			//getfloat......
%>
<!-- 실제로는 안 쓰이는 직접쓰는 형태 -->
	<ul>
	<li>고유번호 : <%=rs.getString("pidx")%></li>
	<li>고객명 : <%=rs.getString("pname")%></li>
	<li>고객아이디 : <%=rs.getString("puserid")%></li>	
	<li>연락처 : <%=rs.getString("ptel")%></li>
	<li>설문조사내용 : <%=rs.getString("ptext")%></li>
	<li>참여일자 : <%=rs.getString("pindate").substring(0,19)%></li>	
	</ul>
<%			
		}
	}
	catch(Exception e){
		out.print("DB 연결 실패 및 테이블 오류!!");
	}
	finally{ //DB 연결 및 출력 모두 완료 되면 DB접속해제
		if(con!=null){
			con.close();
		}
	}
%>
</body>
</html>