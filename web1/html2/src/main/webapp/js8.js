function vip(k) {

	var ar = ["S","V","N","N"];
	var msg;
	if(ar[k]==null){
		msg="등급이 존재하지 않는 회원";
		
	}else{
		msg=ar[k];
	}
	return msg;
}
