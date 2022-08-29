<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<meta charset="UTF-8">
<p>상품관리 페이지</p>
<div class="subpage_view">
    <span>등록된 상품 0건</span>
    <span>
        <form>
        <select class="p_select1">
            <option>상품명</option>
            <option>상품코드</option>
        </select>
        <input type="text" name="p_search" id="p_search" class="p_input1" placeholder="검색어를 입력해 주세요">
        <input type="submit" value="검색" title="상품검색" class="p_submit">
        </form>
    </span>
</div>
<div class="subpage_view2">
    <ul>
        <li><input type="checkbox"></li>
        <li>코드</li>
        <li>이미지</li>
        <li>상품명</li>
        <li>카테고리 분류</li>
        <li>판매가격</li>
        <li>할인가격</li>
        <li>할인율</li>
        <li>재고현황</li>
        <li>판매유/무</li>
        <li>품절</li>
        <li>관리</li>
    </ul>
    <ul>
        <li><input type="checkbox"></li>
        <li>상품코드</li>
        <li>이미지</li>
        <li>상품명</li>
        <li>카테고리 분류</li>
        <li>34,000</li>
        <li>30,000</li>
        <li>11%</li>
        <li>100</li>
        <li>Y</li>
        <li>N</li>
        <li>관리</li>
    </ul>
    <ul>
        <li style="width: 100%;">등록된 상품이 없습니다.</li>
    </ul>
</div>
<div class="subpage_view3">
    <ul class="pageing">
        <li><img src="./ico/double_left.svg"></li>
        <li><img src="./ico/left.svg"></li>
        <li>1</li>
        <li><img src="./ico/right.svg"></li>
        <li><img src="./ico/double_right.svg"></li>
    </ul>
</div>
<div class="subpage_view4">
    <input type="button" value="선택상품 삭제" title="선택상품 삭제" class="p_button">
    <span style="float: right;">
    <input type="button" value="신규상품 등록" title="신규상품 등록" class="p_button p_button_color1" onclick="product_regi();">
    <input type="button" value="카테고리 등록" title="카테고리 등록" class="p_button p_button_color2" onclick="cate_regi();">
    </span>
</div>