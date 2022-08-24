<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function finish(){
	if(f.nm.value==""){
		alert("신청인 이름을 입력하세요");
		f.nm.focus();
	}
	else if(f.em.value==""){
		alert("신청인 이메일을 입력하세요");
		f.em.focus();
	}
	else if(f.bi.value==""){
		alert("신청인 생년월일을 입력하세요");
		f.bi.focus();
	}
	else if(f.card.value==""){
		alert("카드번호를 입력하세요");
		f.card.focus();
	}
	else if(f.tel.value==""){
		alert("연락처를 입력하세요");
		f.tel.focus();
	}
	else{
		f.submit();
	}
}
</script>
</head>
<body>
<form name="f" id="f" method="post" action="./indata.jsp" enctype="application/x-www-form-urlencoded">
<div>
<table style="border:1px solid black;">
<tr>
<td>신청인 이름</td>
<td>
<input type="text" name="nm" id="nm">  
</td>
</tr>
<tr>
<td>신청인 이메일</td>
<td>
<input type="text" name="em" id="em">  
</td>
</tr>
<tr>
<td>신청인 생년월일</td>
<td>
<input type="text" name="bi" id="bi">  
</td>
</tr>
<tr>
<td>신청 방법</td>
<td>
<input type="radio" name="way" id="way" value="방문"> 방문
<input type="radio" name="way" id="way" value="온라인" checked> 온라인  
</td>
</tr>
<tr>
<td>카드번호</td>
<td>
<input type="text" name="card" id="card">  
</td>
</tr>
<tr>
<td>연락처</td>
<td>
<input type="text" name="tel" id="tel">  
</td>
</tr>
</table>
</div>
<input type="button" value="목차" onclick="golist();">
<input type="button" value="입력완료" onclick="finish();">
</form>
</body>
</html>