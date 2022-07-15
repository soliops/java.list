function info(idx) {
	var check = ["Y", "N", "Y", "Y", "Y"];
	var phone = ["01012345678", "01055994411", "01035370132", "01078015457", "01031374882"];
	var email = ["hong@naver.com", "park@nate.com", "kim_001@gmail.com", "jang_go@gmail.com", "lee09@naver.com"];
	var msg;
	if (check[idx] == "N") {
		msg = ["탈퇴 회원", "존재하지 않는 이메일"];
	} else {
		msg = [phone[idx], email[idx]];
	}
	return msg;
}
