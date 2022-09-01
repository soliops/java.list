function product_list(){
	location.href="./admin_product.html";
}
function cate_regi(){
	location.href="./admin_category_write.html";
}
function cate_del(){
	var delck = document.getElementsByName("cate_check");
	var delok= [];
	for(var i=0; i<delck.length;i++){
		if(delck[i].checked==true){
			delok.push(delck[i].value);
		}
	}
	frm.cate_delck.value=delok;
	if(delok.length==0){
		alert("체크를 하셔야 합니다.");
	}
	else{
		frm.method="post";
		frm.enctype="application/x-www-form-urlencoded";		
		frm.action="./admin_category_delok.do";
		frm.submit();
	}
}
function cate_change(box){ 
	var check_all = document.getElementsByName("cate_check");
	var check_all_checked = document.querySelectorAll("input[name='cate_check']:checked");
	var all_ch = document.getElementById("allcheck");
	if(check_all.length == check_all_checked.length){
		all_ch.checked = true;
	}
	else if(check_all.length !=check_all_checked.length){
		all_ch.checked = false;
	}
	else if(box.checked==false){
		all_ch.checked = false;
	}
	
}
function all_check(){
	var all = document.getElementById("allcheck");
	const check = document.getElementsByName("cate_check");
	check.forEach((checkbox)=>{
		checkbox.checked=all.checked;
	})
}

function search(){
	frm.method="post";
	frm.enctype="application/x-www-form-urlencoded";
	frm.action="./admin_category.html";
	frm.submit();
}
function pagefirst(){
location.href="./admin_category.html?page="+1;
}
function pagebefore(pgno){
if(pgno<1){
		pgno=1
		location.href="./admin_category.html?page="+pgno
	}
	else{
		location.href="./admin_category.html?page="+pgno
	}
}
function pagego(pgno){
	location.href="./admin_category.html?page="+pgno
}
function pagenext(pgno,endno){
	if(pgno>=endno){
	location.href="./admin_category.html?page="+endno
	}
	else{
		location.href="./admin_category.html?page="+pgno
	}
}
function pageend(pgno){
	location.href="./admin_category.html?page="+pgno
}