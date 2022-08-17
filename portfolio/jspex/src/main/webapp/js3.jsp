<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - Javascript(정규식 코드)</title>
<script>
function abc(){
	var z = document.getElementById("mid");
	
// 	var code = /java/i; //java,i //i : 문자열 전체(대소문자 관계없이)
// 	var code = new RegExp("java","i");
	
	//a-z(소문자 a부터 z까지), A-Z, 0-9
	/* 숫자만 입력 받아야 할 경우 */
// 	var code = /[a-z][A-Z]/; 
// 	var code = /[a-z]/i; 
// 	var code = /[^0-9]/ //^(not)
// 	console.log(code.test(z.value)); //test: true, false
	
	/* 한글만 입력 받아야 할 경우 */
// 	var code = /[^ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/; //[]배열범위
// 	console.log(code.test(z.value));

	/* 입력값 패턴별 확인사항 (-가 없이 숫자만) 010 2345 1113 or 010 221 1111*/
// 	var code = /^[0-9]\d{9,11}$/; //{}입력 범위 패턴 형태
// 	console.log(code.test(z.value));
	
	
	/* 특문자 조합 */ //예시: 이메일
// 	var code = /[?/\@#$%`~^&*,.=;:_]/;

// 	var code = /^[a-z|A-Z|0-9\\d_-]/g; // g : 문자열 전체를 말함
	//    \\d  특수문자와 함께 사용한다는 의미
// 	console.log(z.value.match(code));
// 	var ck = z.value.match(code);
	//match : 해당 사용자값이 모두 정규식코드 안에 있을 경우 배열로 생성됨
	//아이디 만들때 특수문자 사용 못하게 해야함
// 	if(z.value.length!=ck.length){
// 		alert("올바른 아이디가 아닙니다. 특수문자는 -_만 사용이 가능 합니다.");
// 	}
	
	/* 특문자 포함(패스워드) */
	var code2 = /[ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;
	if(code2.test(z.value)==true){
		alert("올바른 패스워드가 아닙니다.");
	}else{		
		var code = /^[a-zA-Z0-9ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;
		var ck = z.value.match(code);
		if(ck!=null){
			if(ck.length<2){
			alert("패스워드는 특수문자 2자 이상 입력하세요.");
			}
			else{
				
			}
		}else{
			alert("패스워드는 특수문자 2자 이상 입력하세요");	
		}
	}
// 	console.log(ck);
// 	var ck = code.exec(z.value);
	//console.log(ck.value);
	//exec : 정규식 코드에 대한 데이터 리스트를 보여줌
// 	if(ck.index>-1){
// 		alert("해당 단어가 있습니다.");
// 	}
	
// 	console.log(ck);
}
//정규식 코드 문법
//match, test, exec, replace, replaceAll, split
</script>
</head>
<body>
<input type="text" id="mid" maxlength="13">
<input type="button" value="확인" onclick="abc();">
</body>
</html>