<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 - spring Controller와 병행 처리</title>
</head>
<body>
<form name="f" id="f" method="post" action="fileupload.do" enctype="multipart/form-data">
<input type="file" name="file">
<input type="submit" value="파일업로드">
</form>
</body>
</html>