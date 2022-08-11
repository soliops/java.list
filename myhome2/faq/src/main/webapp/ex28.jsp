<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - 멀티 데이터 전송 + substring</title>
</head>
<body>
<%
	//substring란 단어를 자르는 문법
	String a = "홍길동님";
	String b = a.substring(2);
	String c = a.substring(0,3);
	String code = "12345678";
	String recode = code.substring(0,4)+"****";
// 	out.print(recode);
	
%>
<form name="f" id="f" method="post" action="ex28_1.jsp" enctype="multipart/form-data">
첨부파일1 : <input type="file" name="file1"> <br>
첨부파일2 : <input type="file" name="file2"> <br>
첨부파일3 : <input type="file" name="file3"> <br>
<input type="submit" value="전송">
</form>
</body>
</html>