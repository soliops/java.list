<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 - spring Controller와 병행 처리</title>
</head>
<body>
<form name="f" id="f" method="post" enctype="multipart/form-data" action="fileupload.do">
<input type="file" name="file1" accept=".jpg,.gif,.txt">
<input type="submit" value="로컬 파일전송">
</form>
<br>

<form name="f" id="f" method="post" enctype="multipart/form-data"  action="fileupload2.do">
<input type="file" name="file2" accept=".jpg,.gif,.txt">
<input type="submit" value="서버 파일전송">
</form>
<br>
 <br>
<form name="f" id="f" method="post" enctype="multipart/form-data"  action="fileupload3.do">
<input type="file" name="file3" accept=".jpg,.gif,.txt">
<input type="file" name="file3" accept=".jpg,.gif,.txt">
<input type="file" name="file3" accept=".jpg,.gif,.txt">
<input type="submit" value="여러 파일전송">
</form>

</body>
</html>