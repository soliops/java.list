var check = false;
function product_list(){
	location.href="./admin_product.html";
}
function code_check(){
	var code_ck = /[^0-9]/g;
	if(frm.product_code.value==""){
		alert("상품코드를 입력하셔야 합니다.");
		frm.product_code.focus();
		return false;
	}
	else if(frm.product_code.value.length!=8){
		alert("상품코드는 8자리를 입력하셔야 합니다.");
		frm.product_code.focus();		
		return false;
	}
	else if(code_ck.test(frm.product_code.value)==true){
		alert("상품코드는 숫자로만 입력하셔야 합니다.");
		frm.product_code.focus();
		return false;
	}
	else{		
		let pm;
		function wck(){
			if(window.XMLHttpRequest){
				return new XMLHttpRequest();
			}
		}
		function ajax_post(){
			if(pm.readyState==XMLHttpRequest.DONE && pm.status==200){
				if(this.response==null||this.response==""){
					alert("중복 체크 시스템 오류");
				}
				else{
					var sign = this.response;
					if(sign=="true"){
						alert("사용 가능한 상품코드입니다.");
						check=true;
						return true;
					}
					else{
						alert("사용 불가능한 상품코드입니다.");
						return false;
					}
				}
			}
			else if(pm.status==404){
				alert("통신 오류");
			}
		}
		var data = "check_code=" + frm.product_code.value;
		pm=wck();
		pm.onreadystatechange=ajax_post;
		pm.open("post","./product_writeok.do",true);
		pm.setRequestHeader("content-type","application/x-www-form-urlencoded");
		pm.send(data);
	}
}
function all_check(){
	var num_ck = /[^0-9]/g;
	if(num_ck.test(frm.cbcate_code.value)==true){
		alert("대메뉴 카테고리는 숫자만 입력하셔야 합니다.");
		frm.cbcate_code.focus();
		return false;
	}
	else if(frm.cbcate_code.value.length!=3){
		alert("대메뉴 카테고리는 3자리 숫자를 입력하셔야 합니다.");
		frm.cbcate_code.focus();
		return false;
	}
	else if(num_ck.test(frm.cscate_code.value)==true){
		alert("소메뉴 카테고리는 숫자만 입력하셔야 합니다.");
		frm.cscate_code.focus();
		return false;
	}
	else if(frm.cscate_code.value.length!=3){
		alert("소메뉴 카테고리는 3자리 숫자를 입력하셔야 합니다.");
		frm.cscate_code.focus();
		return false;
	}
	else if(num_ck.test(frm.product_price.value)==true){
		alert("판매 가격은 숫자만 입력하셔야 합니다.");
		frm.product_price.focus();
		return false;
	}
	else if(frm.product_price.value<0){
		alert("정상적인 판매 가격을 입력해 주세요.");
		frm.product_price.focus();
	}
	else if(num_ck.test(frm.product_discount.value)==true){
		alert("할인율은 숫자만 입력하셔야 합니다.");
		frm.product_discount.focus();
		return false;
	}
	else if(num_ck.test(frm.product_stock.value)==true){
		alert("상품 재고는 숫자만 입력하셔야 합니다.");
		frm.product_stock.focus();
		return false;
	}
	else{
		return true;
	}	
}
function product_add(){
	if(frm.cbcate_code.value==""){
		alert("대메뉴 카테고리 코드를 입력하셔야 합니다.");
		frm.cbcate_code.focus();
	}
	else if(frm.cscate_code.value==""){
		alert("소메뉴 카테고리 코드를 입력하셔야 합니다.");
		frm.cscate_code.focus();
	}
	else if(frm.product_code.value=="" || check==false){
		alert("중복체크를 먼저 진행하셔야 합니다.");
	}
	else if(frm.product_name.value==""){
		alert("상품명을 입력하셔야 합니다.");
		frm.product_name.focus();
	}
	else if(frm.product_addexplain.value==""){
		alert("상품 부가설명을 입력하셔야 합니다.");
		frm.product_addexplain.focus();
	}
	else if(frm.product_price.value==""){
		alert("판매 가격을 입력하셔야 합니다.");
		frm.product_price.focus();
	}
	else if(frm.product_discount.value==""){
		alert("할인율을 입력하셔야 합니다.");
		frm.product_discount.focus();
	}
	else if(frm.product_stock.value==""){
		alert("상품재고를 입력하셔야 합니다.");
		frm.product_stock.focus();
	}
	else if(frm.product_img1.value==""){
		alert("상품 대표이미지를 선택하셔야 합니다.");
		frm.product_img1.focus();
	}
	else if(CKEDITOR.instances.product_explain.getData()==""){
		alert("상품 상세설명을 입력하셔야 합니다.");
		CKEDITOR.instances.product_explain.getData().focus();
	}
	else{
		if(all_check()==false){
			
		}
		else{
			frm.method="post";
			frm.action="./product_writeok.do";
			frm.enctype="multipart/form-data";
			frm.submit();			
		}
	}
}

function price_cal(){
	var cal = frm.product_price.value * (1 - (frm.product_discount.value/100));
	frm.product_disprice.value=Math.round(cal);
}