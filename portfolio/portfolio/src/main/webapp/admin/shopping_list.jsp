<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<p>쇼핑몰 관리 페이지</p>
    <div class="subpage_view">
        <span>※ 쿠폰발행 현황 리스트 | <em>[ 사용중인 쿠폰 0 ]</em></span>
        <span>
         <ol class="coupon_title">
            <li>번호</li>
            <li>쿠폰명</li>
            <li>쿠폰종류</li>
            <li>사용시작일</li>
            <li>사용종료일</li>
            <li>쿠폰타입</li>
            <li>할인금액</li>
            <li>최소주문금액</li>
         </ol>
         <ol class="coupon_lists">
            <li>1</li>
            <li>신규가입쿠폰</li>
            <li>상품할인</li>
            <li>2022-09-01</li>
            <li>2022-09-30</li>
            <li>정액할인</li>
            <li>1,000</li>
            <li>30,000</li>
         </ol>
         <ol class="coupon_none_lists">
            <li>등록된 쿠폰이 없습니다.</li>
        </ol>
        </span>
        <span><input type="button" value="쿠폰 등록하기" class="shopping_btn" onclick="coupon_add();"></span>
    </div>
    <div class="subpage_view">
        <span>※ 팝업창 현황 리스트 </span>
        <span>
         <ol class="popup_title">
            <li>번호</li>
            <li>팝업명</li>
            <li>팝업 창크기</li>
            <li>링크</li>
            <li>사용시작일</li>
            <li>사용종료일</li>
         </ol>
         <ol class="popup_lists">
            <li>1</li>
            <li>가을신상품 소개</li>
            <li>300 * 200</li>
            <li>http://</li>
            <li>2022-09-01</li>
            <li>2022-09-30</li>
         </ol>
         <ol class="coupon_none_lists">
            <li>등록된 팝업창이 없습니다.</li>
        </ol>
        </span>
        <span><input type="button" value="팝업창 등록하기" class="shopping_btn" onclick="popup_add();"></span>
    </div>