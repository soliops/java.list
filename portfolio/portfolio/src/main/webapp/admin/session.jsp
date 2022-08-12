<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session ="true" %>
<%
	String admin_id= null;
	String admin_nm = null;
	admin_id = (String)session.getAttribute("admin_id");
	admin_nm = (String)session.getAttribute("admin_nm");
	if(admin_nm.equals(null)||admin_nm==""){
		out.print("<script>alert('로그인 하셔야만 접근이 됩니다.'); location.href='/index.html';</script>");
	}
// 	session.setAttribute("admin_nm",admin_nm);
//아이디, 이메일, 고유값(id), 이름
%>