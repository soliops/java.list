function search(s) {
	var list = {
		"Person": ["김수빈", "김정민", "오유나", "김진수", "김창순", "이유림", "하윤성"],
		"Email": ["kim@nate.com", "jungmin@gmail.com", "ouna123@gmail.com", "kimjsu@nate.com", "soon0707@naver.com",
			"limlee@gmail.com", "hayounsong@naver.com"]
	};
//		console.log(s);
		var ea = Object.values(list)[0].length;
		var w=0;
		var msg,nm;
		while(w<ea){
			if(list[Object.keys(list)[0]][w]==s){
			nm=list[Object.keys(list)[1]][w];	
			msg = "결과값 - 이름 : "+s+", 이메일 : "+nm;
			break;
			}
			else{
			msg="해당 사용자는 검색대상에 없습니다.";		
			}
			w++;
		}
		console.log(msg);
}