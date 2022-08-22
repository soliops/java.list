<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

session.getAttribute("admin_nm");
session.getAttribute("admin_id");
session.removeAttribute("admin_id");
session.removeAttribute("admin_nm");
out.print("<script>alert('로그아웃 되었습니다.');location.href='./index.html';</script>");
%>