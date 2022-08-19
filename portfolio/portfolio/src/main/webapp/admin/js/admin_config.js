
function config_save(){
	if(config_f.siteinfo_hometitle.value==""){
		alert("홈페이지 제목을 입력하세요.");
		config_f.siteinfo_hometitle.focus();
	}
	else if(config_f.siteinfo_adminmail.value==""){
		alert("관리자 메일 주소를 입력하세요.");
		config_f.siteinfo_adminmail.focus();
	}
	else if(config_f.siteinfo_pointnew.value==""){
		alert("회원 가입시 적립금을 입력하세요.");
		config_f.siteinfo_pointnew.focus();
	}
	else if(config_f.siteinfo_comname.value==""){
		alert("회사명을 입력하세요.");
		config_f.siteinfo_comname.focus();
	}
	else if(config_f.siteinfo_comnumber.value==""){
		alert("사업자 등록번호를 입력하세요.");
		config_f.siteinfo_comnumber.focus();
	}
	else if(config_f.siteinfo_repname.value==""){
		alert("대표자명을 입력하세요.");
		config_f.siteinfo_repname.focus();
	}
	else if(config_f.siteinfo_reptel.value==""){
		alert("대표전화번호를 입력하세요.");
		config_f.siteinfo_reptel.focus();
	}
	else if(config_f.siteinfo_postnumber.value==""){
		alert("사업장 우편번호를 입력하세요.");
		config_f.siteinfo_postnumber.focus();
	}
	else if(config_f.siteinfo_comaddress.value==""){
		alert("사업장 주소를 입력하세요.");
		config_f.siteinfo_comaddress.focus();
	}
	else if(config_f.siteinfo_infomgname.value==""){
		alert("정보관리책임자명을 입력하세요.");
		config_f.siteinfo_infomgname.focus();
	}
	else if(config_f.siteinfo_infomgemail.value==""){
		alert("정보책임자 E-mail을 입력하세요.");
		config_f.siteinfo_infomgemail.focus();
	}
	else if(config_f.siteinfo_bankbook.value==""){
		alert("무통장 은행을 입력하세요.");
		config_f.siteinfo_bankbook.focus();
	}
	else if(config_f.siteinfo_acnumber.value==""){
		alert("은행 계좌번호를 입력하세요.");
		config_f.siteinfo_acnumber.focus();
	}
	else if(config_f.siteinfo_pointmini.value==""){
		alert("결제 최소 포인트를 입력하세요.");
		config_f.siteinfo_pointmini.focus();
	}
	else if(config_f.siteinfo_pointmax.value==""){
		alert("결제 최대 포인트를 입력하세요.");
		config_f.siteinfo_pointmax.focus();
	}
	else if(config_f.siteinfo_deliname.value==""){
		alert("배송업체명을 입력하세요.");
		config_f.siteinfo_deliname.focus();
	}
	else if(config_f.siteinfo_deliprice.value==""){
		alert("배송비 가격을 입력하세요.");
		config_f.siteinfo_deliprice.focus();
	}
	else{
		config_f.submit();
	}
	
}
function config_cancel(){
	if(confirm("설정을 정말 취소하시겠습니까? 해당 내용들은 모두 사라지게 됩니다.")){		
	window.location.reload(true);
	}
}
