<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<meta charset="UTF-8">
<%
ArrayList<admin_siteinfo_select> cf_list = (ArrayList<admin_siteinfo_select>)request.getAttribute("cf_list");
out.print(cf_list);
%>
<p>홈페이지 가입환경 설정</p>

<div class="subpage_view">
<ul class="info_form">
    <li>홈페이지 제목</li>
    <li>
        <input type="text" name="siteinfo_hometitle" id="siteinfo_hometitle" class="in_form1" value="">
    </li>
</ul>    
<ul class="info_form">
    <li>관리자 메일 주소</li>
    <li>
        <input type="text" class="in_form2" name="siteinfo_adminmail" id="siteinfo_adminmail"> ※ 관리자가 보내고 받는 용도로 사용하는 메일 주소를 입력합니다.(회원가입,인증메일,회원메일발송 등에서 사용)
    </li>
</ul> 
<ul class="info_form">
    <li>포인트 사용 유/무</li>
    <li class="checkcss">
        <em><label><input type="radio" class="ckclass" name="siteinfo_pointuse" id="siteinfo_pointuse" value="Y">포인트 사용</label></em> 
        <em><label><input type="radio" class="ckclass" name="siteinfo_pointuse" id="siteinfo_pointuse" value="N" checked>포인트 미사용</label></em>
    </li>
</ul>
<ul class="info_form2" style="border-bottom:1px solid rgb(81, 61, 61);">
    <li>회원가입시 적립금</li>
    <li>
        <input type="text" class="in_form3" maxlength="5" value="1000" readonly name="siteinfo_pointnew" id="siteinfo_pointnew"> 점
    </li>
    <li>회원가입시 권한레벨</li>
    <li>
        <input type="text" class="in_form3" maxlength="1" value="1" readonly name="siteinfo_newlevel" id="siteinfo_newlevel"> 레벨
    </li>
</ul> 
</div>
<p>홈페이지 기본환경 설정</p>
<div class="subpage_view">
<ul class="info_form2">
    <li>회사명</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_comname" id="siteinfo_comname"> 
    </li>
    <li>사업자등록번호</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_comnumber" id="siteinfo_comnumber"> 
    </li>
</ul> 
<ul class="info_form2">
    <li>대표자명</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_repname" id="siteinfo_repname"> 
    </li>
    <li>대표전화번호</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_reptel" id="siteinfo_reptel"> 
    </li>
</ul>
<ul class="info_form2">
    <li>통신판매업 신고번호</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_mobnumber" id="siteinfo_mobnumber"> 
    </li>
    <li>부가통신 사업자번호</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_vannumber" id="siteinfo_vannumber" > 
    </li>
</ul>
<ul class="info_form2">
    <li>사업장 우편번호</li>
    <li>
        <input type="text" class="in_form0" maxlength="5" name="siteinfo_postnumber" id="siteinfo_postnumber"> 
    </li>
    <li>사업장 주소</li>
    <li>
        <input type="text" class="in_form2" name="siteinfo_comaddress" id="siteinfo_comaddress"> 
    </li>
</ul>
<ul class="info_form2" style="border-bottom:1px solid rgb(81, 61, 61);">
    <li>정보관리책임자명</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_infomgname" id="siteinfo_infomgname"> 
    </li>
    <li>정보책임자 E-mail</li>
    <li>
        <input type="text" class="in_form1" name="siteinfo_infomgemail" id="siteinfo_infomgemail"> 
    </li>
</ul>
</div>
<p>결제 기본환경 설정</p>
<div class="subpage_view">  
<ul class="info_form2">
    <li>무통장 은행</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_bankbook" id="siteinfo_bankbook"> 
    </li>
    <li>은행계좌번호</li>
    <li>
        <input type="text" class="in_form1" name="siteinfo_acnumber" id="siteinfo_acnumber"> 
    </li>
</ul>
<ul class="info_form">
    <li>신용카드 결제 사용</li>
    <li class="checkcss">
        <em><label><input type="radio" class="ckclass" name="siteinfo_carduse" id="siteinfo_carduse" value="Y"> 사용</label></em> 
        <em><label><input type="radio" class="ckclass" checked name="siteinfo_carduse" id="siteinfo_carduse" value="N"> 미사용</label></em> ※ 해당 PG사가 있을 경우 사용으로 변경합니다.
    </li>
</ul>
<ul class="info_form">
    <li>휴대폰 결제 사용</li>
    <li class="checkcss">
        <em><label><input type="radio" class="ckclass" name="siteinfo_phoneuse" id="siteinfo_phoneuse" value="Y"> 사용</label></em> 
        <em><label><input type="radio" class="ckclass" checked name="siteinfo_phoneuse" id="siteinfo_phoneuse" value="N"> 미사용</label></em> ※ 주문시 휴대폰 결제를 가능하게 할 것인지를 설정합니다.
    </li>
</ul>
<ul class="info_form">
    <li>도서상품권 결제사용</li>
    <li class="checkcss">
        <em><label><input type="radio" class="ckclass" name="siteinfo_giftuse" id="siteinfo_giftuse" value="Y"> 사용</label></em> 
        <em><label><input type="radio" class="ckclass" checked name="siteinfo_giftuse" id="siteinfo_giftuse" value="N"> 미사용</label></em> ※ 도서상품권 결제만 적용이 되며, 그 외에 상품권은 결제 되지 않습니다.
    </li>
</ul>
<ul class="info_form2">
    <li>결제 최소 포인트</li>
    <li>
        <input type="text" class="in_form0" maxlength="5" name="siteinfo_pointmini" id="siteinfo_pointmini"> 점
    </li>
    <li>결제 최대 포인트</li>
    <li>
        <input type="text" class="in_form0" maxlength="5" name="siteinfo_pointmax" id="siteinfo_pointmax"> 점
    </li>
</ul>
<ul class="info_form">
    <li>현금 영수증 발급사용</li>
    <li class="checkcss">
        <em><label><input type="radio" class="ckclass" name="siteinfo_receiptuse" id="siteinfo_receiptuse" value="Y"> 사용</label></em> 
        <em><label><input type="radio" class="ckclass" checked name="siteinfo_receiptuse" id="siteinfo_receiptuse" value="N"> 미사용</label></em> ※ 현금영수증 관련 사항은 PG사 가입이 되었을 경우 사용가능 합니다.
    </li>
</ul>
<ul class="info_form2">
    <li>배송업체명</li>
    <li>
        <input type="text" class="in_form0" name="siteinfo_deliname" id="siteinfo_deliname"> 
    </li>
    <li>배송비 가격</li>
    <li>
        <input type="text" class="in_form0" maxlength="7" name="siteinfo_deliprice" id="siteinfo_deliprice" value="2500"> 원
    </li>
</ul>
<ul class="info_form" style="border-bottom:1px solid rgb(81, 61, 61);">
    <li>희망배송일</li>
    <li class="checkcss">
        <em><label><input type="radio" class="ckclass" name="siteinfo_delidate" id="siteinfo_delidate" value="Y"> 사용</label></em> 
        <em><label><input type="radio" class="ckclass" name="siteinfo_delidate" id="siteinfo_delidate" value="N" checked> 미사용</label></em> ※ 희망배송일 사용시 사용자가 직접 설정 할 수 있습니다.
    </li>
</ul>
</div>

<div class="btn_div">
    <button type="button" class="sub_btn1" title="설정 저장" onclick="config_save();">설정 저장</button>
    <button type="button" class="sub_btn2" title="저장 취소" onclick="config_cancel();">저장 취소</button>
</div>