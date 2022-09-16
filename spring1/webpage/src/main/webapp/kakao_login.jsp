<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카카오 로그인 - API 연동 및 자회사몰 가입</title>
</head>
<body>
<input type= "button" value="자회사몰 회원가입" onclick="join();"> <br>
<!-- 카카오 로그인 및 로그아웃 -->
<img src="./login.png" onclick="abc();"> <br>
<input type="button" value="로그아웃" onclick="logout();">
<form name="kakao" method="POST" action="kakaojoin.do">
<input type="hidden" name="userid" value="">
<input type="hidden" name="username" value="">
<input type="hidden" name="useremail" value="">
</form>

</body>
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
<script>
function join(){
	location.href="./join.do";
}

Kakao.init('a3153e28aea16e8e314caa055e46c127');
//카카오 로그아웃
function logout(){ 
	//웹 + 하이브리브앱 : API
	//웹전용 : Auth
	if(Kakao.Auth.getAccessToken()){
		Kakao.API.request({
			url:'/v1/user/unlink',
			success:function(response){
				console.log(response);
			},
			fail:function(error){
				console.log(error);
			}
		});
		Kakao.Auth.setAccessToken(undefined);
	}
}
function abc(){
	 Kakao.Auth.login({ //로그인 및 회원가입
		success: function(response) {
			Kakao.API.request({
				url:'/v2/user/me',
				success:function(response){
// 					console.log(response); //사용자 정보 API 배열
					kakao.userid.value = response["id"];
					kakao.username.value= response["kakao_account"]["email"];
					kakao.useremail.value = response["kakao_account"]["email"];
					kakao.submit();
				},
				fail:function(error){
					console.log(error); // 
				}
			});
     	},
     	fail: function(error) {
     		console.log(error);
    	},
     });
}

</script>
</html>