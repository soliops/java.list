<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문자발송 시스템</title>
</head>
<%
String randno = ""; 
for(int f=0;f<6;f++){
	randno+=(int)(Math.random()*10);
}
out.print(randno);
%>
<body>
<form name="f" id="f" method="post"action="security.jsp">
<input type="hidden" name="method" value="2">
<!-- SMS 아이디 : <input type="text" name="smsID"> <br> -->
<!-- SMS 패스워드 : <input type="text" name="hashValue"> <br> -->
<!-- 발신자번호 : <input type = "text" name="senderPhone"> <br> -->
수신자번호 : <input type = "text" name="receivePhone"> <br>
<!-- 날짜 : <input type="text" name="reserveDate"> <br> -->
<!-- 시간 : <input type="text" name="reserveTime"><br> -->
<input type="hidden" name="userDefine">
<%-- 문자메세지 내용 : <input type = "text" name="smsContent" maxlength="50" value="<%=no%>"> <br> --%>
<input type="button" value="인증번호 받기" onclick="ok();">
</form>
<script>
function ok(){
	f.submit();
}
</script>
</body>
</html>