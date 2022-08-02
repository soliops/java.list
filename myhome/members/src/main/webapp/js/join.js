$(function(){
	$("#joinok").click(function(){ //회원가입 버튼
		if($("#userid").val()==""){
			alert("아이디를 입력하세요.");
			$("#userid").focus();
		}
		else if($("#userpw").val()==""){
			alert("패스워드를 입력하세요.");
			$("#userpw").focus();
		}
		else if($("#userpw2").val()==""){
			alert("동일한 패스워드를 입력하세요.");
			$("#userpw2").focus();
		}
		else if($("#usernm").val()==""){
			alert("고객명을 입력해 주세요.");
			$("#usernm").focus();
		}
		else if($("#useremail").val()==""){
			alert("이메일을 입력해 주세요.");
			$("#useremail").focus();
		}
		else if($("#usertel").val()==""){
			alert("연락처를 입력해 주세요.");
			$("#usertel").focus();
		}
		else if($("#addr1").val()==""){
			alert("주소검색 버튼 클릭 후 도로명을 입력하세요.");		
			$("#addr1").focus();	
		}
		else if($("#addr3").val()==""){
			alert("상세주소를 입력해 주세요.");
			$("#addr3").focus();
		}
		else{
			if($("#ck").val()!="ok"){
				alert("아이디 중복체크를 해 주세요.");
			}
			else if($("#userpw").val()!=$("#userpw2").val()){
				alert("동일한 패스워드를 입력하셔야 합니다.");
			}
			else if($("useremail").val()!=""){
				var eck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,8}$/i;
				//com,kr,co.kr,net,io.tv			
				if(eck.test($("#useremail").val())==false){
					alert("정상적인 이메일 주소를 입력해 주세요.");
					$("#useremail").focus();
				}
				else{
					if(isNaN($("#usertel").val())==true){
						alert("정상적인 연락처를 입력해 주세요.");
						$("#usertel").focus();
					}
					else if($("#usertel").val().length <10){
						alert("정상적인 연락처를 입력해 주세요.");
						$("#usertel").focus();
					}
					else{
						f.method="POST";
						f.action="joinok.do";
						f.enctype="application/x-www-form-urlencoded";
						f.submit();
						
					}
				}
			}
		}
	});
});	