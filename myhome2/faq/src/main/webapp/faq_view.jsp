<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" >
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>FAQ 입력페이지</title>

<script src="./js/jquery.js"></script>
<script>
$(function(){
	$("#faq_finish").click(function(){
		if($("#choice").val()=="0"){
			alert("카테고리를 설정해 주세요.");
		}
		else if($("#faq_qtext").val()==""){
			alert("질문내용을 입력해 주세요.");			
		}
		else if($("#faq_atext").val()==""){
			alert("답변내용을 입력해 주세요.");	
			$("#faq_atext").focus();
		}
		else{
			frm.method="POST";
			frm.action="./faq_updateok.do";
			frm.enctype="application/x-www-form-urlencoded";
			frm.submit();	
		}
	});
	
}); 
	function faq_cancel(){//취소
		if(confirm("FAQ 입력을 취소하시겠습니까?")){
			location.href='./faq_list.html';
		}
	}
	function del_faq(){ //데이터 삭제 페이지 연결
		if(confirm("해당 내용을 삭제 하시겠습니까? 데이터 삭제시 복구 되지 않습니다.")){
		var uri = window.location.search;
		var idx =uri.split("?idx=");
		location.href="./faq_del.do?idx=" + idx[1];	
		}
	}	
</script>
</head>
<body>
FAQ 입력페이지 <br> <br>
<form name="frm" id="frm">
<input type="hidden" name="fidx" value="<%=request.getAttribute("fidx")%>">
<table border="1" cellpadding="3px" cellspacing="0">
<tr>
<td>
<%
//request.getAttribute : Enumeration(자료형)
%>
카테고리 : 
</td>
<td>
<%
String cate = (String)request.getAttribute("fcategory");

String cate1 = null;
String cate2 = null;
String cate3 = null;
String cate4 = null;
String cate5 = null;
switch(cate){
case "1":
	cate1 = "selected";
	break;
case "2":
	cate2 = "selected";
	break;
case "3":
	cate3 = "selected";
	break;
case "4":
	cate4 = "selected";
	break;
case "5":
	cate5 = "selected";
	break;
}
%>
<select name="choice" id="choice">
<option value="<%=cate%>>">카테고리를 입력하세요.</option>
<option value="1" <%=cate1%>>배송문의</option>
<option value="2" <%=cate2%>>반품/교환/환불</option>
<option value="3" <%=cate3%>>주문/결제</option>
<option value="4" <%=cate4%>>회원서비스</option>
<option value="5" <%=cate5%>>안전거래</option>
</select>
<label>
<%
String ck =(String) request.getAttribute("f_check");
String check = "";
if(ck=="y"){
	check="checked";
}
%>
<input type="checkbox"  name="f_check" value="Y" <%=check%>>리스트 출력 여부</label>
</td>
</tr>
<tr>
<td>글쓴이 : <%=request.getAttribute("fname")%></td>
<td>
<input type="text" name="usernm" id="usernm" value="관리자" readonly>
</td>
</tr>
<tr>
<td>질문내용</td>
<td>
<input type="text" name="faq_qtext" id="faq_qtext" value="<%=request.getAttribute("f_qtext")%>"  style="width:680px;">
</td>
</tr>
<tr>
<td>답변내용</td>
<td >
<textarea rows="10" cols="100" name="faq_atext" id="faq_atext" placeholder="답변내용을 입력해 주세요." ><%=request.getAttribute("f_atext")%></textarea>
</td>
</tr>
</table>
<input type="button" value="FAQ삭제"  id ="faq_finish" title="FAQ삭제" onclick="del_faq();">
<input type="button" value="FAQ리스트"  onclick="faq_cancel();" title="FAQ리스트">
<input type="button" value="FAQ등록"  id ="faq_finish" title="FAQ등록">

</form>
</body>
</html>