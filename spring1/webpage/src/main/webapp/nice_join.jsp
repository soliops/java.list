<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나이스 인증 체크 페이지</title>
</head>
<body>
<form name="f" id="f" method="POST" action="nice_joinok.do" enctype="application/x-www-form-urlencoded">
고객명 : <input type="text" name="username"> <br>
고객전화번호 : <input type="text" name="usertel"> ※ "-"없이 숫자만 입력하시길 바랍니다. <br>
<input type="button" value="본인 인증확인" onclick="user_check();">
</form>
</body>
<script>
function user_check(){
	if(f.username.value==""){
		alert("고객명을 입력해 주세요.");
		f.username.focus();
	}
	else if(f.usertel.value==""){
		alert("휴대폰 연락처를 올바르게 입력하세요.");
		f.usertel.focus();
	}
	else{
		f.submit();
	}
}
</script>
</html>