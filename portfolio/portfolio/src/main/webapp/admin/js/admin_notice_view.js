$(function(){
	$("#list_go").click(function(){
	location.href="./admin_notice.html";
	})
	$("#notice_modify").click(function(){	
		if($("#notice_title").val()==""){
			alert("공지사항 제목을 입력하세요.");
			$("#notice_title").focus();
		}
		else if(CKEDITOR.instances.notice_text.getData()==""){
			alert("공지사항 내용을 입력하세요.");
			CKEDITOR.instances.notice_text.focus();
		}
		else if($("#notice_print").checked){
		frm.notice_print_hidden.disabled = true;
		}
		else{
			frm.notice_print.value="N";
			frm.method="POST" 
			frm.enctype="multipart/form-data"
			frm.action="./admin_notice_viewok.do";
			frm.submit();
		}
	})
	$("#notice_del").click(function(){
	if(confirm("해당 내용을 정말로 삭제 하시겠습니까?")){
		frm.method="POST" 
		frm.enctype="application/x-www-form-urlencoded"
		frm.action="./admin_notice_view_delok.do";
		frm.submit();	
	}
	})
})