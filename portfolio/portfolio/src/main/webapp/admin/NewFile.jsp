<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
request.setCharacterEncoding("UTF-8");
	String nb = request.getParameter("number");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script src="./js/jquery.js"></script>
<script>
$(function(){
var $code2 = /[ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;
var $code = /^[a-zA-Z0-9ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;
var $ck = $("#number").val().match($code);		
if($code2.test($("#number").val().value)==true){
	alert("올바른 패스워드가 아닙니다.");
}else{		
	var $ck = $("#number").val().match($code);
	if($ck!=null){
		if($ck.length<2){
		alert("패스워드는 특수문자 2자 이상 입력하세요.");
		}
		else{
			
		}
	}else{
		alert("패스워드는 특수문자 2자 이상 입력하세요");	
	}
}



})

</script>
</head>
<body>
<% String date = "2022-08-12 14:40:00.0";
out.print(date.substring(0,19));%>

<form name="f" id="f" action="./NewFile.jsp" method="POST">
<input type="text" name="number">
<input type="submit" value="전송">
</form>
</body>
</html>