function notice_delete(){
	view_box.forEach((checkbox)=>{
		if(checkbox==true){
			console.log();
		}
	})
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