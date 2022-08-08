<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>FAQ 리스트 등록</title>
<script>
function faqcheck(no){
	if(no==1){	//리스트로 이동
		location.href='faq_list.html';
	}
	else{	//FAQ 저장
		if(frm.fcate.value==""){
			alert("카테고리를 선택해 주세요");
		}
		else if(frm.faq_qc.value==""){
			alert("질문내용을 입력해 주세요");
		}
		else if(frm.faq_aw2.value==""){
			alert("답변내용을 입력해 주세요");
			frm.faq_aw2.focus();
		}	
		else{
			frm.method="POST";
			frm.action="faq_updateok.do";
			frm.enctype="application/x-www-form-urlencoded";
			frm.submit();
		}
		
	}
}

function del_faq(){	//데이터 삭제 페이지 연결
	if(confirm("해당 내용을 삭제 하시겠습니까? 데이터 삭제시 복구 되지 않습니다.")){
	var uri = window.location.search;
	var idx = uri.split("?idx=");
	location.href='./faq_del.do?idx='+idx[1];
	}
}
</script>
</head>
<body>
<p>FAQ 입력 페이지</p><br>
<form name="frm" id="frm">
<input type="hidden" name="fidx" value="<%=request.getAttribute("fidx")%>">
<% 
//request.getAttribute : Enumeration(자료형)
String cate = (String)request.getAttribute("fcate");
String cate1 = "";
String cate2 = "";
String cate3 = "";
String cate4 = "";
String cate5 = "";
switch(cate){
	case "0":
		cate1 = "selected";
	break;
	
	case "1":
		cate2 = "selected";
	break;
	
	case "2":
		cate3 = "selected";
	break;
	
	case "3":
		cate4 = "selected";
	break;
	
	case "4":
		cate5 = "selected";
	break;
}
%>
카테고리 : 
<select name="fcate">
<option value="">카테고리를 선택하세요</option>
<option value="0" <%=cate1%>>배송문의</option>
<option value="1" <%=cate2%>>반품/교환/환불</option>
<option value="2" <%=cate3%>>주문/결제</option>
<option value="3" <%=cate4%>>회원서비스</option>
<option value="4" <%=cate5%>>안전거래</option>
</select>
<%
String ck = (String)request.getAttribute("faq_view");
String check = "";
if(ck.equals("Y")){
	check = "checked";
}
%>
<label><input type="checkbox" name="faq_view" value="Y" <%=check%>>리스트 출력 여부</label>

<br>
글쓴이 : <%=request.getAttribute("fwrite")%><br>
질문내용 : <input type="text" name="faq_qc" value="<%=request.getAttribute("faq_qc")%>"><br>
답변내용 : <textarea cols="100" rows="10" name="faq_aw2">
<%=request.getAttribute("faq_aw")%>
</textarea><br>
<input type="button" value="FAQ 삭제" onclick="del_faq();">
<input type="button" value="FAQ 리스트" onclick="faqcheck(1)">
<input type="button" value="FAQ 수정완료" onclick="faqcheck(2)">
</form>
</body>
</html>