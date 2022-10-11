 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<meta charset="UTF-8">
<p>상품 등록 페이지</p>
<div class="product_insert">
    <ul>
        <li>대메뉴 카테고리</li>
        <li>
            <input type="text" class="product_input1" name="cbcate_code" id="cbcate_code" maxlength="2"> 
        </li>
    </ul>
    <ul>
        <li>소메뉴 카테고리</li>
        <li>
            <input type="text" class="product_input1" name="cscate_code" id="cscate_code" maxlength="2"> 
        </li>
    </ul>
    <ul>
        <li>상품코드</li>
        <li>
            <input type="text" class="product_input1" name="product_code" id="product_code" maxlength="6"> 
            <input type="button" value="중복확인" title="중복확인" class="product_btn" onclick="code_check();"> <span class="help_text">※ 상품코드는 절대 중복되지 않도록 합니다.</span>
        </li>
    </ul>
    <ul>
        <li>상품명</li>
        <li>
            <input type="text" class="product_input2" maxlength="100" name="product_name" id="product_name"> <span class="help_text">※ 상품명은 최대 100자까지만 적용할 수 있습니다.</span>
        </li>
    </ul>
    <ul>
        <li>상품 부가설명</li>
        <li>
            <input type="text" class="product_input4" maxlength="200" name="product_addexplain" id="product_addexplain"> <span class="help_text">※ 상품 부가설명은 최대 200자까지만 적용할 수 있습니다.</span>
        </li>
    </ul>
    <ul>
        <li>판매가격</li>
        <li>
            <input type="text" class="product_input3" maxlength="7" name="product_price" id="product_price" onkeyup="price_cal();"> <span class="help_text">※ , 없이 숫자만 입력하세요 최대 7자리</span>
        </li>
    </ul>
    <ul>
        <li>할인율</li>
        <li>
            <input type="text" class="product_input3" maxlength="2" value="0" name="product_discount" id="product_discount" onkeyup="price_cal();">% <span class="help_text">※ 숫자만 입력하세요</span>
        </li>
    </ul>
    <ul>
        <li>할인가격</li>
        <li>
            <input type="text" class="product_input3" maxlength="7" value="0" name="product_disprice" id="product_disprice" readonly> <span class="help_text">※ 할인율이 0%일 경우 할인가격은 0으로 처리 합니다.</span>
        </li>
    </ul>
    <ul>
        <li>상품재고</li>
        <li>
            <input type="text" class="product_input3" maxlength="4" value="0" name="product_stock" id="product_stock">EA <span class="help_text">※ 숫자만 입력하세요. 재고가 0일 경우 soldout이 됩니다.</span>
        </li>
    </ul>
    <ul>
        <li>판매 유/무</li>
        <li>
            <label class="product_label">
            <input type="radio" name="product_sale" id="product_sale" value="Y" style="vertical-align:-1px;" checked> 판매시작
            </label>
            <label class="product_label">
            <input type="radio" name="product_sale" id="product_sale" value="N" style="vertical-align:-1px;"> 판매종료
            </label> <span class="help_text">※ 숫자만 입력하세요. 재고가 0일 경우 soldout이 됩니다.</span>
        </li>
    </ul>
    <ul>
        <li>조기품절</li>
        <li>
            <label class="product_label">
                <input type="radio" name="product_saleout" id="product_saleout" value="Y" style="vertical-align:-1px;"> 사용
            </label>
            <label class="product_label">
                <input type="radio" name="product_saleout" id="product_saleout" value="N" style="vertical-align:-1px;" checked> 미사용
            </label>
        </li>
    </ul>
    <ul style="height: 160px;">
        <li>상품 대표이미지</li>
        <li>
            <ol style="width:100%; height: auto;">
            <li style="width:100%; height:45px;">
            <input type="file" name="product_img1" id="product_img1">
            <span class="help_text">※ 상품 대표이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>
            </li>
            <li style="height:45px;">
            <input type="file" name="product_img2" id="product_img2">
            <span class="help_text">※ 추가 이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>
            </li>
            <li style="height:45px;">
            <input type="file" name="product_img3" id="product_img3">
            <span class="help_text">※ 추가 이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>
            </li>
            </ol>
        </li>
    </ul>
    <ul style="height: 400px;">
        <li>상품 상세설명</li>
        <li>
            <textarea class="product_text1" name="product_explain" id="product_explain"></textarea>
        </li>
    </ul>
</div>
<div class="subpage_view4" style="text-align:center;">
    <input type="button" value="상품 리스트" title="상품 리스트" class="p_button p_button_color1" style="margin-right: 5px;" onclick="product_list();">
    <input type="button" value="상품 등록" title="상품 등록" class="p_button p_button_color2" onclick="product_add();">
</div>