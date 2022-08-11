<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - 파일업로드 - cos</title>
</head>
<body>
<form method="post" action="ex27_1.jsp" enctype="multipart/form-data">
첨부파일 : <input type="file" name="file"> <br>
<input type="submit" value="전송">
</form>
</body>
</html>