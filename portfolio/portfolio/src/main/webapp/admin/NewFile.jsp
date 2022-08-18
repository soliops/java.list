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

// Jquery 비밀번호 체크 
$("#btn").click(function(){	
var $code2 = /[ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;
// var $code = /[^a-zA-Z0-9ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;
// var $code = /^[0-9]/;
// var $code = /^[0-9]\d{2,3}$/;
// var $code = /^[a-zA-Z가-힣]/g;
// var $code = /^[0-9a-zA-Z]*@[0-9a-zA-Z]*\.[a-zA-Z]{2,3}$*\[a-zA-Z\\d.]{0,3}$*/g;
//   /^[0-9a-zA-Z]*@[0-9a-zA-Z]*\.[a-zA-Z]{2,3}$/i;
// var code=  /^[0-9a-zA-Z]*@[0-9a-zA-Z]*\.[a-zA-Z\\d.]{2,5}$/i;
// var code=  /^[0-9a-zA-Z]*@[0-9a-zA-Z]*\.[a-zA-Z]{2,3}*[a-zA-Z\\d.]{0,3}$/i;
// var code=   /^[0-9a-zA-Z]*@[0-9a-zA-Z]*\.[a-zA-Z]{2,3}*\.*[a-zA-Z]{0,3}$/i;
// var $word = $("#number").val();
// var $ck = $("#number").val().match($code);
var $code = /^[0-9a-zA-Z]*@[0-9a-zA-Z]*\.[a-zA-Z]{2,3}*(\.[a-zA-Z]{2,2})$*/g;
console.log($code.test($("#number").val()));
// console.log($ck.length);
// code.exec(z.value)
//console.log($code.exec($("#number").val()));
// if($code2.test($("#number").val())==true){
// 	alert("올바른 패스워드가 아닙니다.");
// }else{		
// 	if($code.test($("#number").val())!=false){
// 		if($ck.length<2){
// 		alert("패스워드는 특수문자 2자 이상 입력하세요.");
// 		}
// 		else{		
		
// 		}
// 	}else{
// 		alert("패스워드는 특수문자 2자 이상 입력하세요");	
// 	}
// }
	})



})
	
</script>
</head>
<body>
<% String date = "2022-08-12 14:40:00.0";
out.print(date.substring(0,19));

%>

<form name="f" id="f" action="./NewFile.jsp" method="POST">
<input type="text" name="number" id="number">
<input type="button" id="btn" value="전송">
</form>
</body>
</html>