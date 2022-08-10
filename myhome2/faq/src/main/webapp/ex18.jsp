<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP forward 형태 이며, ex17_1.jsp 연계</title>
</head>
<body>
<p>해당 페이지는 ex18.jsp 페이지 입니다.</p>
<jsp:forward page="./ex17_1.jsp"></jsp:forward>
<!-- 자신의 결과값 또는 HTML 코드등 출력하지 않음 -->
<p>응답확인</p>
</body>
</html>