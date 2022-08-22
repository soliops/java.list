function notice_list(){
	location.href = "./admin_notice.html";
}
function notice_save(){
	if(frm.notice_title.value==""){
		alert("공지사항 제목을 입력해 주세요.");
		frm.notice_title.focus();
	}	
	else if(frm.notice_writer.value==""){
		alert("글쓴이가 존재하지 않습니다.");
		frm.notice_writer.focus();
	}
	else if(frm.notice_text.value==""){
		alert("공지내용을 작성해 주세요.");
		frm.notice_text.focus();
	}
	else if(frm.notice_print.checked){
		frm.notice_print_hidden.diabled = true;
	}
	else{
		frm.notice_print.value="N";
		frm.method="post";
		frm.action="../notice_writeok.do"
		frm.enctype="application/x-www-form-urlencoded";
		frm.submit();
		
	}
}