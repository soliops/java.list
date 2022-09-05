$(function (){
	$("#coupon_finish").click(function(){
		if($("#coupon_nm").val()==""){
			alert("쿠폰명을 입력해 주세요");
			$("#coupon_nm").focus();
		}
		else if($("#coupon_kind").val()=="0"){
			alert("쿠폰종류를 선택해 주세요");
			$("#coupon_kind").focus();
		}
		else if($("#coupon_publish_date").val()==""){
			alert("사용 시작일을 선택해 주세요");
			$("#coupon_publish_date").focus();
		}
		else if($("#coupon_expiration_date").val()==""){
			alert("사용 종료일을 선택해 주세요");
			$("#coupon_expiration_date").focus();
		}
		else if($("#coupon_type").val()==0){
			alert("쿠폰타입을 선택해 주세요");
			$("#coupon_type").focus();
		}
		else if($("#coupon_discount").val()==""){
			alert("할인금액 및 할인율을 입력해 주세요");
			$("#coupon_discount").focus();
		}
		else if($("#minimum_price").val()==""){
			alert("최소 주문금액을 입력해 주세요");
			$("#minimum_price").focus();
		}
		else if($("#coupon_img").val()==""){
			alert("쿠폰이미지를 선택해 주세요");
			$("#coupon_img").focus();
		}
		else{
			if($check()==false){
			}
			else{				
			frm.method="POST";
			frm.enctype="multipart/form-data";
			frm.action="./coupon_writeok.do";
			frm.submit();
			}
		}
	});
	$("#coupon_publish_date").datepicker({
		onSelect: function(selected){
			var publish_ck = $("#coupon_expiration_date").val().replaceAll("-","");
			var selected_ck = selected.replaceAll("-","");
			$("#coupon_expiration_date").datepicker("option","minDate:0",selected)
			if($("#coupon_expiration_date").val()==0||$("#coupon_expiration_date").val()==null||$("#coupon_expiration_date").val()==""){				
			}
			else{
				if(selected_ck>publish_ck){
					alert("사용 시작일은 사용 종료일보다 나중이어선 안됩니다.");
					$("#coupon_publish_date").focus();
				}
			}
		}
	});
	$("#coupon_expiration_date").datepicker({
		onSelect: function(selected){
			var publish_ck = $("#coupon_publish_date").val().replaceAll("-","");
			var selected_ck = selected.replaceAll("-","");
			$("#coupon_publish_date").datepicker("option","maxDate",selected)
			if(selected_ck<publish_ck){
				alert("사용 시작일은 사용 종료일보다 나중이어선 안됩니다.");
				$("#coupon_expiration_date").focus();
			}
		}
	});
	$("#coupon_discount").keyup(function(){
		var $num_ck = /[^0-9]/g;
		if($("#coupon_type").val()==0){	
			alert("쿠폰타입을 먼저 선택하셔야 합니다.");
			$("#coupon_type").focus();
		}
		else{			
		if($num_ck.test($("#coupon_discount").val())==false){	
			if($("#coupon_type").val()=="정률할인"){
				if($("#coupon_discount").val()>100){
					alert("정률할인은 숫자 100이상 입력이 불가능합니다.");
					$("#coupon_discount").focus();			
				}
			}
		}
		else{
			alert("숫자만 입력하셔야 합니다.");
			$("#coupon_discount").focus();
		}
		}
	});
	$("#coupon_list").click(function(){
		location.href="./admin_shopping.html";
	});
	function $check(){
		var $num_ck = /[^0-9]/g;
		if($("#coupon_kind").val()==0){		
			alert("쿠폰종류는 상품할인과 배송비할인 둘 중 하나로 입력하셔야 합니다.");
			$("#coupon_kind").focus();
			return false;
		}
		else if($num_ck.test($("#coupon_discount").val())==true){
			alert("숫자만 입력하셔야 합니다.");
			$("#coupon_discount").focus();
			return false;
		}
		else if($("#coupon_type").val()=="정률할인"&& $("#coupon_discount").val().length>3){
			alert("100이상은 입력하실 수 없습니다.");
			$("#coupon_discount").focus();
			return false;
		}
		else if($("#coupon_discount").val()==0){
			alert("0은 입력하실 수 없습니다.");
			$("#coupon_discount").focus();
			return false;
		}
		else if($num_ck.test($("#minimum_price").val())==true){
			alert("숫자만 입력하셔야 합니다.");
			console.log($num_ck.test($("#minimum_price").val()));
			$("#minimum_price").focus();
			return false;
		}
		else if($("#minmum_price").val()<10000){
			alert("최소 주문금액은 10000원 이상이어야 합니다.");
			$("#minimum_price").focus();
			return false;
		}
		else{
			return true;
		}
	}
});