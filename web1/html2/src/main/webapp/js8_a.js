function aa(r){
	var data_a = ["hong","park","kim","jang"];
	var e = 0;
	var idx=0;
	var check=0;
	do{
		if(data_a[e]==r){
			check=1;	
			idx=e;	
			break;
		}
		e++;
	}while(e<data_a.length); 	

	if(check==1){
		var cc = gettera(idx);
		var g
		switch (cc[1]){
			case "V": 
			g="vip";
			break;
			case "N": 
			g="일반";
			break;
			case "S": 
			g="Silver";
			break;
			
		}
		console.log(r+"님 적립금은 "+cc[0]+"이며, "+g+"등급 입니다.");
	}else{
		console.log("해당 사용자는 존재하지 않습니다.");
	}
}
function msg(a,b,c){
	var msg=a+"님 적립금은 "+b+"이며, "+c +"입니다.";
	console.log(msg);
}