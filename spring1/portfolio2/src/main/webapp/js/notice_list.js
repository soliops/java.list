function search_reset(){
	location.href="./notice.do?page=1";
}
function search(){
	if(frm.category.value=="긴급공지"){
		frm.p_check.value="Y";
		}
	frm.method="post";
	frm.enctype="application/x-www-form-urlencoded";
	frm.action="./notice.do";
	frm.submit();
}