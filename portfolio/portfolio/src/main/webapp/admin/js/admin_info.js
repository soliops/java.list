$(function(){
	$("#admin_info_fin").click(function(){
	function $pass_check(){
   		var $code2 = /[^ㄱ-ㅎ가-힣ㅏ-ㅣ]/gi;
		var $code = /[^a-zA-Z0-9ㄱ-ㅎ가-힣ㅏ-ㅣ]/g;	
		var $ck = $("#admin_pw").val().match($code);
			if($code2.test($("#admin_pw").val())==false){
   				alert("패스워드는 한글을 입력할 수 없습니다.");
   				$("#admin_pw").focus();
   				return false;
   			}
			else if($ck==null){
   				alert("패스워드는 특수문자 2자 이상 포함해야 합니다.");
				$("#admin_pw").focus();
   				return false;
   			}
   			else if($ck.length<2 ){
   				alert("패스워드는 특수문자 2자 이상 포함해야 합니다.");
				$("#admin_pw").focus();
   				return false;
   			}
			else if($("#admin_pw").val().length<4 || $("#admin_pw").val().length>17){
				alert("패스워드는 최소 4~16 이하로 입력하셔야 합니다.");
				$("#admin_pw").focus();	   		
				return false;
			}
			else{
			if($("#admin_pw").val()!=$("#admin_pw2").val()){
				alert("패스워드가 일치하지 않습니다. 동일한 패스워드를 입력해 주세요.");
				$("#admin_pw2").focus();
				return false;
			}
   			else{
				return true;					
			}
   		}
   		}
   		function $nm_check(){
   			var $nm_ck = /[^a-zA-Z가-힣]/g;
   			if($nm_ck.test($("#admin_nm").val())==true){
   				alert("이름은 영어,한글만 입력하셔야 합니다.");
   				$("#admin_nm").focus();
   				return false;
   			}
   			else{
   				return true;
   			}
   		}
   		function $email_check(){
   			var $email_ck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/g;
   			if($email_ck.test($("#admin_email").val())==false){
   				alert("올바른 이메일 형식을 입력하셔야 합니다.");
   				$("#admin_email").focus();
   				return false;
   			}
   			else{
   				return true;
   			}
   		}
   		function $tel_check(){
   			var $tel_ck= /[^0-9]/;
   			var $tel_ck2=/[^0-9]\d{2,3}$/;
   			if($tel_ck.test($("#admin_tel1").val())==true){
   				alert("연락처는 숫자만 입력하셔야 합니다.");
   				$("#admin_tel1").focus();
   				return false;
   			}
   			else if($tel_ck2.test($("#admin_tel2").val())==true){
   				alert("연락처는 숫자만 입력하셔야 합니다.");
   				$("#admin_tel2").focus();
   				return false;
   			}
   			else if($tel_ck.test($("#admin_tel3").val())==true){
   				alert("연락처는 숫자만 입력하셔야 합니다.");
   				$("#admin_tel3").focus();
   				return false;
   			}
   			else{
   				return true;
   			}
   		}
		if($("#admin_pw").val()==""){
			alert("변경할 패스워드를 입력하세요.");
			$("#admin_pw").focus();  
		}
		else if($("#admin_pw2").val()==""){
			alert("동일한 패스워드를 입력하세요.");
			$("#admin_pw2").focus();  
		}
		else if($("#admin_nm").val()==""){
			alert("담당자 이름을 입력하세요.");
			$("#admin_nm").focus();  
		}
		else if($("#admin_email").val()==""){
			alert("담당자 이메일을 입력하세요.");
			$("#admin_email").focus();  
		}
		else if($("#admin_tel1").val()==""){
			alert("담당자 연락처를 입력하세요.");
			$("#admin_tel1").focus();  
		}
		else if($("#admin_tel2").val()==""){
   			alert("담당자 연락처를 입력하세요");
   			$("#admin_tel2").focus();
   		}
   		else if($("#admin_tel3").val()==""){
   			alert("담당자 연락처를 입력하세요");
   			$("#admin_tel3").focus();
   		}
   		else if($("#admin_part").val()=="0"){
   			alert("담당자 부서를 선택하세요");
   			$("#admin_part").focus();
   		}
   		else if($("#admin_position").val()=="0"){
   			alert("담당자 직책를 선택하세요");
   			$("#admin_position").focus();
   		}
   		else{
   			if($pass_check()==false){
   	   				
   	   		}	
   			else if($nm_check()==false){
   				
   			}
			else if($email_check()==false){
   				
   			}
   			else if($tel_check()==false){
   				
   			}
   			else{
   				frm.method="POST";
   				frm.enctype="application/x-www-form-urlencoded";
		   		frm.action="./admin_infook.do";
   	    		frm.submit();
   			}
   		}
	})


})