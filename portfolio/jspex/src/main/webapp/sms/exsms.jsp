<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 등록 시스템 문자</title>
</head>
<body>
<form name="f" id="f" method="post" action="reservesms.jsp"enctype="application/x-www-form-urlencoded">
<div>
<ul style="list-style:none; width:300px; height:30px; text-align:left; line-height:30px;">
<li style="background-color:black; color:#ccc; text-align:center;">펜션 예약 등록 시스템</li>
<li>
고객명 : <input type="text" name="mid" id="mid" style="margin-top:5px; width:225px; float:right;"> <br>
</li>
<li>
연락처 : <input type="text" name="tel" id="tel" style="margin-top:5px; width:225px; float:right;"> <br>
</li>
<li>
이메일 : <input type="text" name="email" id="email" style="margin-top:5px; width:225px; float:right;"> <br>
</li>
<li>
<input type="button" style="background-color:black; color:#ccc; margin-left:100px;" name="btn" id="btn" value="예약등록" onclick="ok();">
</li>
</ul>
</div>
</form>
</body>
<script>
function ok(){
	f.submit();
}
</script>
</html>