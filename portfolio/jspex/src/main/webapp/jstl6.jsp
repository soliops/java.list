<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>  
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@	taglib prefix="dbinfo" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 7일차 - tagdir 응용편</title>
</head>
<body>
<!-- taglibs 라이브러리 파일 중 spec.jar이 있어야만 tag 파일과 return 값을 받을 수 있음 -->
<%-- <dbinfo:table/>  --%>
<!-- 해당 tag 안에 있는 값을 jsp에서 외부로 가져오기는 힘듭니다. -->
<%-- <span><%=request.getAttribute("userid") %></span> --%>
<%-- <% request.setAttribute("returncall","홍길동"); %> --%>
<%-- <% request.setAttribute("returncall2",5); %> --%>
<dbinfo:table2 no1="숫자는" no2="100"></dbinfo:table2>
리턴 값 : ${returncall} <br>
리턴 값2 : ${returncall2} <br>
</body>
</html>