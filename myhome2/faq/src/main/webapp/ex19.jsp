<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP include 형태 이며, ex17_1.jsp 연계</title>
</head>
<body>
<p>해당 페이지는 ex19.jsp 페이지 입니다.</p>
<jsp:include page="./ex17_1.jsp" flush="true"></jsp:include>
<!-- 자신의 결과값 또는 HTML 코드도 출력하며, 외부 파일의 jsp도 출력 합니다. 
flush : 
false(외부파일에 사용되는 버퍼를 지우지 않음)
 
true(외부파일로 제어가 이동할 때 지금까지 출력 된 
버퍼에 저장된 내용을 웹브라우저에 출력하고 버퍼를 지웁니다.)
-->
<p>응답확인</p>
</body>
</html>