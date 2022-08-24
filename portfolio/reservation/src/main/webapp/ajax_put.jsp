<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- ajax에는 post, get, put, delete, head 
put: 값을 갱신, head는 정보 출력-->
</body>
<script>
//put: get+post 형태 입니다. 단, servlet에 한정 되어 있습니다.
//servlet에 doPut 메소드가 있어야만 적용됨

//Put 기능 post 형태로 보내는 코드
var data = "sejong";
var ajax = new XMLHttpRequest();
ajax.open("put","./ajax.jsp",true);
ajax.send();

ajax.onload = function(){
	if(ajax.status==200){
		if(ajax.response=="ok"){
			alert("해당 아이디는 중복됩니다.");
		}
		else{
			alert("해당 아이디는 사용 가능합니다.");
		}
	}

}
</script>
</html>