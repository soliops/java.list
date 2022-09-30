/*js파일에는 jsp 코드 사용이 안됨*/

/*기본 상품 정보 입력*/
export function gopage(){
	if(frm.product_name.value==""){
		alert("상품명을 입력하세요.");
	}
	else if(frm.product_money.value==""){
		alert("상품 결제 금액을 입력하세요.");
	}
	else if(frm.product_ea.value==""){
		alert("상품 수량을 입력하세요.");
	}
	else{
		if(frm.product_ea.value <= 0){
			alert("상품 수량을 입력하세요.");
		}
		else{
		frm.method="POST",
		frm.action="index2.jsp"
		frm.submit();
		}
	}
}

/* 기본 적립금 확인 및 실제 결제할 금액 체크*/
export function gopayment(money){
	var oksign = "no";
	if(frm.point.value > 0){
		var ori_m = frm.price.value; //현재 상품 금액
		var point = frm.point.value;// 사용자가 입력한 적립금 금액
		var new_m = ori_m - point; // 상품금액 - 적립금 금액
		frm.price.value = new_m;
		document.getElementById("total").innerText = new_m.toLocaleString();
		oksign="ok";
	}
	else if(frm.point.value=="" || frm.point.value=="0"){
		frm.point.value=0;
		frm.price.value=money;
		document.getElementById("total").innerText = money.toLocaleString();
		oksign="ok";
	}
	//oksign
	if(oksign=="ok"){
		frm.method="POST";
		frm.action = "./index3.jsp";
		frm.submit();
	}
}