<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹페이지 메인</title>
</head>
<body>
<%
String m = (String)request.getAttribute("msg");
String p = (String)request.getAttribute("product");
String img = (String)request.getAttribute("imgs");
%>
<script src="../ckeditor/ckeditor.js"></script> <!-- ckeditor 엔진 -->
<header style="height:200px; background-color:yellowgreen;">
<%@ include file="top.jsp" %>
</header>
<section style="height:800px; background-color:yellow;">
<%@ include file="view.jsp" %>
</section>
<footer style="height:800px; background-color:gray;">
<%@ include file="footer.jsp" %>
</footer>
</body>
<script>
// ckeditor 엔진에 해당 name값 가진 오브젝트를 로드하게 됩니다.
CKEDITOR.replace("notice_text");
</script>
</html>