<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--     
errorPage : 코드 또는 DB 또는 Servlet등 다양한 오류 발생시
해당 페이지로 이동 시키게 됩니다.
web.xml에 error 코드를 입력하여 페이지가 로드 되도록 설정 합니다. 
<error-page>
  <error-code>500</error-code>
  <location>/error.jsp</location>
  </error-page>
    <error-page>
  <error-code>404</error-code>
  <location>/error.jsp</location>
  </error-page>

-->
    <%@ page errorPage="./error.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일차 - page 디렉티브</title>
</head>
<body>
<%-- <%=request.getParameter("test").toUpperCase()%> --%>
</body>
</html>