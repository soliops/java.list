function cate_list(){
	location.href="./admin_category.html";
}
function cate_plus(){
	var plus = frm.cbcate_code.value + frm.cscate_code.value;
	frm.classcode.value=plus;
}
function cate_create(){
	var name_ck= /[^0-9a-zA-zㄱ-ㅎ]/g;
	if(frm.cbcate_code.value==""){
		alert("대메뉴 코드를 입력하셔야 합니다.");
		frm.cbcate_code.focus();
	}
	else if(frm.cbcate_name.value==""){
		alert("대메뉴명을 입력하셔야 합니다. ");
		frm.cbcate_name.focus();
	}
	else{
		if(frm.cbcate_use.checked==true){
			frm.cbcate_use.value="Y";
			if(name_ck.test(frm.cbcate_name.value)==false){		
				alert("대메뉴는 영어, 한글, 숫자만 입력 가능합니다.");
				frm.cbcate_name.focus();		
			}
			else if(frm.cbcate_code.value.length!=2){
				alert("대메뉴 코드는 무조건 2자리 숫자로 입력하셔야 합니다.");
				frm.cbcate_code.focus();
			}
			else{
			frm.submit();
			}
		}
		else{
			frm.cbcate_use.value="N";
			if(frm.cscate_code.value==""){
				alert("소메뉴 코드를 입력하셔야 합니다.");
				frm.cscate_code.focus();
			}
			else if(frm.cscate_name.value==""){
				alert("소메뉴명을 입력하셔야 합니다.");
				frm.cscate_name.focus();
			}
			else{
				if(name_ck.test(frm.cscate_name.value)==false){
					alert("소메뉴명은 영어, 한글, 숫자만 입력 가능합니다.");
					frm.cscate_name.focus();
				}
				else if(frm.cbcate_code.value.length!=2){
				alert("대메뉴 코드는 무조건 2자리 숫자로 입력하셔야 합니다.");
				frm.cbcate_code.focus();
				}
				else if(frm.cscate_code.value.length!=2){
				alert("소메뉴 코드는 무조건 2자리 숫자로 입력하셔야 합니다.");
				frm.cscate_code.focus();
				}
				else{	
					frm.submit();							
				}
			}
		}
	}
}
