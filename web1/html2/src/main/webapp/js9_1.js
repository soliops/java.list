function check(id, pw) {
	var ids = ["hong", "park", "kim", "jang", "lee"];
	var pws = ["ahong", "bpark", "kkim123", "jang1234", "lee0909"];
	var msg;
	var idx = 0;
	for (var a = 0; a < ids.length; a++) {
		if (ids[a] == id) {
			idx = a;
			msg = ids[a];
			break;
		} else {
			msg = "아이디와 비밀번호를 다시 확인해주세요.";
		}
	}
	if (pws[idx] != pw) {
		msg = "아이디와 비밀번호를 다시 확인해주세요.";
		console.log(msg);
	} else {
		msg = "로그인에 성공하였습니다.";
		console.log(msg);
		var re = info(idx);
		if (re[0].indexOf("탈퇴") != -1) {
			console.log("탈퇴 회원입니다.");
		} else {
			console.log("회원님의 전화번호는 " + re[0] + "이며 이메일은 " + re[1] + "입니다.");
		}
	}

}