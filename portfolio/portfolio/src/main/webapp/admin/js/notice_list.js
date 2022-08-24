function notice_delete(){
	var delck = document.getElementsByName("view_check");
	var delok = [];
	for(var i=0; i<delck.length; i++){
		if(delck[i].checked==true){
			delok.push(delck[i].value);
		}
	}
	if(delok.length==0){
		alert("체크를 하셔야 합니다.");	
	}else{
		f.action="./notice_list.html?del="+delok;
		f.submit();
	}
}
function view_allchange(){ //하나라도 체크해제하면 전체체크인거 해제
	var view_ck = document.getElementsByName("view_check");
	var all_ch=document.getElementById("view_allcheck");
	for(var p=0;p<view_ck.length;p++){
		if(view_ck[p].ckecked==false){
			all_ch.checked=false;
			break;
		}
	}
}
function notice_write(){
	location.href = "./admin_notice_write.html";
}
function all_check(){
	var all = document.getElementById("view_allcheck");
	const view_box = document.getElementsByName("view_check");
	view_box.forEach((checkbox)=>{
		checkbox.checked = all.checked;
	})
}
function pagefirst(){
	location.href="./admin_notice.html?page="+1
}
function pagebefore(pgno){
	if(pgno<1){
		pgno=1
		location.href="./admin_notice.html?page="+pgno
	}
	else{
		location.href="./admin_notice.html?page="+pgno
	}
}
function pagego(pgno){
	location.href="./admin_notice.html?page="+pgno
}
function pagenext(pgno,endno){
	if(pgno>=endno){
	location.href="./admin_notice.html?page="+endno
	}
	else{
		location.href="./admin_notice.html?page="+pgno
	}
}
function pageend(pgno){
	location.href="./admin_notice.html?page="+pgno
}