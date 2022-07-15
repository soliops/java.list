function idsearch(s){
	var ids = {
		"Person":["김수빈","김정민","오유나","김진수","김창순","이유림","하윤성"],
		"Userid":["kimsubin","min1004","yuna0809","jinsulove","soon777","lim_lee79","hayunsung1313"]
	};
	var ea2 = Object.values(ids)[0].length;
		var ww=0;
		var msg2,nm2;
		while(ww<ea2){
			if(ids[Object.keys(ids)[1]][ww]==s){
			nm2=ids[Object.keys(ids)[0]][ww];	
			msg2 = "결과값 - 아이디 : "+nm2+", 고객명 : "+s;
			break;
			}
			else{
			msg2="해당 사용자는 검색대상에 없습니다.";		
			}
			ww++;
		}
		console.log(msg2);
}