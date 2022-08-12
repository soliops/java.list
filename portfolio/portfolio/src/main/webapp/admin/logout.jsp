<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//
session.getAttribute("admin_nm");
session.getAttribute("admin_id");
session.removeAttribute("admin_id");
session.removeAttribute("admin_nm");
//삭제시킬 페이지라 연습용
%>