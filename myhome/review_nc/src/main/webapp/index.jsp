<%@page import="configure.dataload"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<dataload> list = (ArrayList<dataload>)request.getAttribute("list");
	for(dataload aa : list){		
	
%>
고유값 : <%=aa.getridx()%>
고객명 : <%=aa.getrname()%>
상품명 : <%=aa.getrproduct()%>
평점 : <%=aa.getrscore()%>
내용 : <%=aa.getr_text()%>
작성날짜 : <%=aa.getr_date()%>
사진 : <%=aa.getimgs()%>
<%
	}
%>
</body>
</html>