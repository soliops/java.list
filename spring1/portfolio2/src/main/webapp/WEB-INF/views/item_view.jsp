<%@page import="portfolio2.item_dao"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
item_dao list = (item_dao)request.getAttribute("list");
out.print(list.getPidx());
String url = request.getRealPath("");
out.print(url);
%>
<div class="detail_title_area">
	<h3 class="name" ><%=list.getProduct_name() %></h3>
	<p class="summary">
		<%=list.getProduct_addexplain() %>
		<span class="detail_icons">
		</span>
	</p>
	<p class="seq_num Hide">상품번호 : 767</p>
</div>

<div id="goods_view">
	<div class="goods_thumbs_spec">
		<!-- ++++++++++++++++++++++++ 상품 이미지 ++++++++++++++++++++++++ -->
		<style>
			#goods_thumbs { width:600px; }
		</style>
		<div id="goods_thumbs">
			<div class="slides_container hide" style="position:relative;">
					<div class="viewImgWrap">
							<img src="<%=list.getProduct_img1() %>" title="<%=list.getProduct_name() %>" alt="상품이미지"/>
					</div>
			</div>

			<script type="text/javascript">
				//$("#goods_thumbs .pagination").hide().width('540').show();
				var setGoodsThumbsPaginationScroll = function(){
					var paginationWidth = $("#goods_thumbs .pagination").width();
					var currentWidth = $("#goods_thumbs .pagination>li.current").outerWidth();
					var currentLeft = $("#goods_thumbs .pagination>li.current").position().left;

					var gap = ($("#goods_thumbs .pagination").scrollLeft()+currentLeft+(currentWidth/2))-(paginationWidth/2);

					$("#goods_thumbs .pagination").stop(true,true).animate({'scrollLeft':gap});
				};
				$("#goods_thumbs .slides_container>.viewImgWrap:gt(0)").hide();
				$("#goods_thumbs .pagination>li:eq(0)").addClass('current');
				$("#goods_thumbs .slides_container").show();
				$("#goods_thumbs .pagination>li").bind('click',function(){
					var i = $("#goods_thumbs .pagination>li").index(this);
					$("#goods_thumbs .slides_container>.viewImgWrap").hide().eq(i).show();
					$("#goods_thumbs .pagination>li").removeClass('current').eq(i).addClass('current');
					setGoodsThumbsPaginationScroll();
					return false;
				});
				$("#goods_thumbs .prev").bind('click',function(){
					var i = $("#goods_thumbs .slides_container>.viewImgWrap").index($("#goods_thumbs .slides_container>.viewImgWrap:visible"));
					if(i<=0) i = $("#goods_thumbs .slides_container>.viewImgWrap").length-1;
					else i--;
					$("#goods_thumbs .slides_container>.viewImgWrap").hide().eq(i).show();
					$("#goods_thumbs .pagination>li").removeClass('current').eq(i).addClass('current');
					setGoodsThumbsPaginationScroll();
					return false;
				});
				$("#goods_thumbs .next").bind('click',function(){
					var i = $("#goods_thumbs .slides_container>.viewImgWrap").index($("#goods_thumbs .slides_container>.viewImgWrap:visible"));
					if(i>=$("#goods_thumbs .slides_container>.viewImgWrap").length-1) i = 0;
					else i++;
					$("#goods_thumbs .slides_container>.viewImgWrap").hide().eq(i).show();
					$("#goods_thumbs .pagination>li").removeClass('current').eq(i).addClass('current');
					setGoodsThumbsPaginationScroll();
					return false;
				});
			</script>
		</div>
		<div id="goods_spec">
		    <ul class="goods_spec_sections">
				<!-- ~~~~~ 가격, 할인율, 할인내역 ~~~~~ -->
				<li class="deatil_price_area">
						<div class="deatil_sale_rate">
							<p class="inner">
								<span class="num">20</span>%
							</p>
						</div>
						<p class="org_price">
							<span class="dst_th_size"><s><span class="num">8,910,000</span></s>&#x20a9;</span>
						</p>
						<p class="sale_price">
								<span class="num">7,128,000</span><span class='price_won'>&#x20a9;</span>
						</p>

					<!--<button type="button" class="btn_open_small btn_resp B" onclick="detail_contents_toggle(this,'priceDetail')"><span designElement="text">할인금액</span></button>//-->
					
                    <button type="button" class="btn_open_small btn_resp B"><span designElement="text" textIndex="5" >할인금액</span></button>
                    
                    <div id="priceDetail" class="detail_option_list hide">
						<ul>
							<li>
								<span class="title">이벤트</span>
								<span class="detail">1,782,000&#x20a9;</span>
							</li>
						</ul>
					</div>
				</li>
				<!-- ~~~~~ //가격, 할인율, 할인내역 ~~~~~ -->

				<!-- ~~~~~ 상품번호 ~~~~~ -->
				<li class="goods_spec_number hide">
					<ul class="detail_spec_table">
						<li class="th"><span designElement="text" textIndex="6" >상품번호</span></li>
						<li class="td">767</li>
					</ul>
				</li>
				<!-- ~~~~~ //상품번호 ~~~~~ -->
				<li class="goods_spec_halbu">
					<ul class="detail_spec_table">
						<li class="th"><span designElement="text" textIndex="24" >무이자할부</span></li>
						<li><span class="gray_06" designElement="text" textIndex="25" >우측 '자세히' 참조</span></li>
					</ul>
				</li>
				<li class="goods_spec_saving_benefit">
					<ul class="detail_spec_table">
						<li class="th"><span designElement="text" textIndex="44" >적립혜택</span></li>
						<li>
							<span designElement="text" textIndex="45" >구매</span>
							21,384&#x20a9;

						</li>
					</ul>
					<div id="reviewDetail" class="detail_option_list hide">
						<ul>
						</ul>
					</div>
				</li>
				<!-- ~~~~~ 배송 ~~~~~ -->
				<li class="goods_spec_shipping">
					<ul class="detail_spec_table">
						<li class="th">
							<span designElement="text" textIndex="54" >배송</span>
						</li>
						<li>

							<ul class="detail_spec_table sub">
								<li>
									<select class="M" name="shipping_method" onchange="view_delivery_cost();" style="display:none">
										<option value='21' selected grp_seq="1" nation="korea" prepay_info="all" shipping_set_code="direct_delivery" >직접배송(<span class="prepay_info_area prepay_info_delivery">주문 시 결제</span>/<span class="prepay_info_area prepay_info_postpaid">착불</span>)</option>
									</select>
									<script>$(function(){view_delivery_cost()});</script>
									<span>직접배송(<span class="gray_06"><span class="prepay_info_area prepay_info_delivery">주문 시 결제</span>/<span class="prepay_info_area prepay_info_postpaid">착불</span></span>)</span>
									<input type="hidden" name="shipping_prepay_info" id="shipping_prepay_info" value="" alt="선/착불정보" />
									<input type="hidden" name="shipping_store_seq" id="shipping_store_seq" value="" alt="수령매장정보" />
									<!--div id="shipping_detail_lay" class="resp_layer_pop hide"></div-->
									<div id="shipping_detail_lay" class="resp_layer_pop hide">
										<h4 class="title"><span designElement="text" textIndex="57" >배송비 안내</span></h4>
										<div class="y_scroll_auto2">
											<div class="layer_pop_contents v5"></div>
										</div>
										<a href="javascript:void(0)" class="btn_pop_close" onclick="hideCenterLayer()"></a>
									</div>
								</li>
								<li class="btn_area1">
									<button type="button" class="btn_resp no_border" id="shipping_detail_info_resp"><span designElement="text" textIndex="58" >자세히</span></button>
								</li>
							</ul>

							<ul class="detail_spec_table sub shipping_set_area">
								<li>
									<div class="set_lay set_21 hide">
										<div class="std">
											무료배송
										</div>
									</div>
									<input type="hidden" name="hop_select_date" id="hop_select_date" value="" />
									<script>view_delivery_cost();</script>
								</li>
							</ul>

						</li>
					</ul>

					<div id="deliverydateDetail" class="Relative hide">
						<div class="hopCalendarLayer layer_simple_basic"><span designElement="text" textIndex="63" >달력</span></div>
					</div>

					<div id="customsDetail" class="detail_option_list hide">
						<ul>
							<li>
								<p class="e_title" designElement="text" textIndex="64" >해외구매대행 상품이란?</p>
								<p class="e_content" designElement="text" textIndex="65" >
									해외에서 수입하여 판매하는 상품으로 배송, 반품, 교환이 일반상품과 다를 수 있습니다. 또한 관세청 수입통관 신고 시 구매자의 개인통관고유부호가 필요하기 때문에 주문 시 구매자로부터 개인통관고유부호를 수집하게 됩니다.
								</p>
							</li>
							<li>
								<p class="e_title" designElement="text" textIndex="66" >개인통관고유부호란?</p>
								<p class="e_content" designElement="text" textIndex="67" >
									관세청에서는 개인정보 유출을 방지하기 위하여 개인물품 수입신고 시 주민등록번호를 대신 활용할 수 있는 개인통관고유부호 제도를 운영합니다. 개인통관고유부호는 <a href="https://p.customs.go.kr" class="Und" target="_blank" title="새창" designElement="text" textIndex="68" >관세청 사이트</a>에서 신청 즉시 부여되며, 계속 같은 번호로 사용이 가능합니다. 분실하면 관세청 사이트에서 조회 가능합니다. 부호 체계는 P로 시작하고 13자리입니다.
								</p>
							</li>
						</ul>
					</div>

					<div id="eachDeliveryDetail" class="detail_option_list hide">
						<ul>
							<li>
								<p class="e_title" designElement="text" textIndex="69" >포장최대단위</p>
								<div class="e_content">
									상품 0개
								</div>
							</li>
							<li>
								<p class="e_title" designElement="text" textIndex="70" >포장단위별 배송비</p>
								<div class="e_content">
									0&#x20a9;
								</div>
							</li>
							<li>
								<p class="e_title" designElement="text" textIndex="71" >포장단위별 추가배송비</p>
								<div class="e_content">
									0&#x20a9;
								</div>
							</li>
						</ul>
					</div>
				</li>
				<!-- ~~~~~ //배송 ~~~~~ -->

				<!-- ~~~~~ 해외배송 ~~~~~ -->
				<!-- ~~~~~ //해외배송 ~~~~~ -->

				<!-- ~~~~~ 상품정보 ~~~~~ -->
				<li class="goods_spec_sub_info">
					<ul class="detail_spec_table">
						<li class="th"><span designElement="text" textIndex="75" >상품정보</span></li>
						<li><span class="gray_06" designElement="text" textIndex="76" >우측 '자세히' 참조</span></li>
						<li class="btn_area1">
							<button type="button" class="btn_resp no_border" onclick="showCenterLayer('#infoDetail')"><span designElement="text" textIndex="77" >자세히</span></button>
						</li>
					</ul>
				</li>
	
				<!-- ~~~~~ 브랜드 ~~~~~ -->
				<li class="goods_spec_brand">
					<ul class="detail_spec_table">
						<li class="th"><span designElement="text" textIndex="81" >브랜드</span></li>
						<li>
							<a href="#">AQUARIC</a>
						</li>
					</ul>
				</li>
				<!-- ~~~~~ //브랜드 ~~~~~ -->
			</ul>

			<!-- ~~~~~~~~~~~ 구매하기 열기 섹션( 모바일 전용 ) ~~~~~~~~~~~ -->
			<div id="goodsBuyOpenSection" class="goods_buy_open_sections">
				<a href="javascript:void(0);" id="btnSectionOpen" class="btn_section_open off">열기</a>
				<ul class="goods_buttons_section">
					<li>
						<ul class="basic_btn_area">
	
							<li><button type="button" id="buy_btn" class="btn_resp size_c color2"><span designElement="text" textIndex="99" >구매하기</span></button></li>
						</ul>
					</li>

				</ul>
			</div>
			

<!-- ~~~~~~~~~~~ 구매하기 ~~~~~~~~~~~ -->
<div id="goodsOptionBuySection" class="goods_buy_sections">
<div class="goods_option_select_area">
<div id="select_option_lay">
	<div class="goods_option_area">
		<table class="goods_option_table" width="100%" cellpadding="0" cellspacing="0" border="0">
		<colgroup>
			<col />
			<col width="15" />
		</colgroup>
		<tr>
			<th colspan="2"><span designElement="text">상품수량</span></th>
		</tr>
		<tr class="optionTr">
			<td colspan="2">
				<span class="optionTitle hide">수량</span>
				<select>
					<option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
				</select>
			</td>
		</tr>
		<tr id="viewoptionsInfoTr" class="hide">
			<td id="viewOptionsInfo" class="center" colspan="2"></td>
		</tr>
		</table>

		<!-- 선택된 옵션 노출 영역 시작( 장바구니에 해당 ) -->
		<div class="goods_quantity_table_container"  style="display:none">
			<table class="goods_quantity_table" cellpadding="0" cellspacing="0">
			</table>
		</div>
		<!-- 선택된 옵션 노출 영역 끝 -->
	</div>
</div>
				<!-- //상품 옵션 인클루드 -->
				</div>

				<!-- 총 상품 금액 표기 시작-->
				<div class="goods_price_area">
					<table width="100%" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<!-- 단일옵션일 경우 수량 -->
						<td class="total_goods_price">
							<span class="total_goods_tit" designElement="text">총 상품금액</span>
							<span id="total_goods_price">7,128,000</span> &#x20a9;
						</td>
					</tr>
					</table>
				</div>
				<!-- 총 상품 금액 표기 끝-->

				<div class="goods_buttons_area">
					<ul class="goods_buttons_section">
						<li>
							<ul class="basic_btn_area">
								<li><button type="button" class="btn_resp size_extra2 NpayNo"><span designElement="text" textIndex="107" >장바구니</span></button></li>
								<li><button type="button" class="btn_resp size_extra2 color2 NpayNo"><span designElement="text" textIndex="109" >구매하기</span></button></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
  </li>
</ul>
		 	  </div>
 </div>

</div>
    
    <br/><br/> 

	<div id="goods_contents_quick" class="set_preload">

		<div id="goods_tabs" class="goods_tabs">
			<div class="resp_area">
				<div class="goods_information_tabs">
					<a href="#goods_contents_quick" class="current" onclick="open_information_tab(this,'goods_description');"><span designElement="text" textIndex="119" >상세설명</span></a>
					<a href="#goods_contents_quick" id="goodsReviewLoad" onclick="open_information_tab(this,'goods_review');"><span><span designElement="text" textIndex="120" >상품후기</span> </span></a>
					<a href="#goods_contents_quick" id="goodsQnaLoad" onclick="open_information_tab(this,'goods_qna');"><span><span designElement="text" textIndex="121" >상품문의</span> </span></a>
					<a href="#goods_contents_quick" onclick="open_information_tab(this,'exchange_guide');"><span designElement="text" textIndex="122" >교환/반품/<span class="Dib">배송</span></span></a>
				</div>
			</div>
		</div>
		<script>
		var goodsTabsTop = $('#goods_tabs').offset().top;
		//var goodsTabsMargin = 180;
		function open_information_tab(thisTab,type){
			$(".goods_information_tabs>a.current").removeClass('current');
			$(thisTab).addClass('current');

			$(".goods_information_contents").hide();
			$('.info_goods_add').hide();
			$('.info_goods_add_map').hide();
			$('.info_goods_add_bigdata').hide();
			$('.info_goods_add_relation').hide();
			$('.'+type).show();
			if( type == 'goods_description' || type == 'exchange_guide' ) {
				$('.info_goods_add').show();
				if( type == 'goods_description' ) {
					$('.info_goods_add_map').show();
					$('.info_goods_add_bigdata').show();
					$('.info_goods_add_relation').show();
				}
			}
		}
		$(function() {
			var scrollPosition, tabHeight, goodsTabsTop2;
			tabHeight = $('#goods_tabs').outerHeight();
			goodsTabsTop2 = $('#goods_tabs').offset().top;
			$(window).scroll(function() {
				scrollPosition = $(window).scrollTop();
				if ( scrollPosition > goodsTabsTop2 ) {
					$('#goods_tabs').addClass('flyingMode');
					if ( $('#gon').length < 1 ) {
						$('#goods_tabs').after('<div id="gon" style="height:' + tabHeight + 'px"></div>');
					}
				} else {
					if ( $('#goods_tabs').hasClass('flyingMode') ) {
						$('#goods_tabs').removeClass('flyingMode');
					}
					$('#gon').remove();
				}
			});
			$( window ).resize(function() {
				if ( window.innerWidth != WINDOWWIDTH ) {
					tabHeight = $('#goods_tabs').outerHeight();
					goodsTabsTop2 = $('#goods_tabs').offset().top;
				}
			});
		});
		</script>

		<!-- 상품상세설명 -->
		<div class="goods_information_contents goods_description">

            <br/><br/>
            
            <style type="text/css">
            .goods_description_images.goods_view_contents {
	        text-align: center;
            }
            </style>
			<div class="goods_description_images goods_view_contents">
				카페24에 올려놓은 이미지가 출력되어야 하는 부분
               <!-- 상세설명 출력 부분 해당 부분에 상세정보 이미지가 추가 되어야 합니다.-->
			</div>
		</div>

		<!-- 상품후기 -->
		<div class="goods_information_contents goods_review hide" id="goods_review_frame_div"><!-- 상품후기 게시판 가져옴 --></div>

		<!-- 상품문의 -->
		<div class="goods_information_contents goods_qna hide" id="goods_qna_frame_div"><!-- 상품문의 게시판 가져옴 --></div>

        
        <style>
    .detail_ex{margin:40px auto;width:70%;font-size:16px;}
    .detail_ex .subject{width:20%;color:#222}
    .detail_ex .ex_title{font-size:20px;font-weight:bold;text-align:center;color:#222}
.detail_ex table{border:1px solid #aaa;text-align:left;}
    .detail_ex table th{padding-left:20px;padding-right:20px;border-right:1px solid #aaa;font-weight:bold;color:#222}
.detail_ex table tr{border-bottom:1px solid #aaa;}
    .detail_ex table tr td {text-align:left;padding:20px;line-height:24px;color:#222}
@media only screen and (max-width:1023px) {
        .detail_ex{width:100%;}
        .detail_ex .subject{width:25%;}
        .detail_ex table th{padding-left:10px;padding-right:10px;}
        .detail_ex table tr td {padding:10px;}
    }
</style>
        
<!-- 교환/반품/배송 -->
		<div class="goods_information_contents exchange_guide hide">
			<div class="detail_ex">
<table summary="배송/교환/반품규정">
<caption>배송/교환/반품규정</caption>
<colgroup>
<col class="subject">
<col>
</colgroup>
<tbody>
<tr>
<td class="ex_title" colspan="2">상품결제정보</td>
</tr>
<tr><td colspan="2">무통장 입금은 상품 구매 대금은 PC뱅킹, 인터넷뱅킹, 텔레뱅킹 혹은 가까운 은행에서 직접 입금하시면 됩니다.
주문시 입력한 입금자명과 실제입금자의 성명이 반드시 일치하여야 하며, 7일 이내로 입금을 하셔야 하며 입금되지 않은 주문은 자동취소 됩니다.</td>
</tr>
<tr>
<td class="ex_title" colspan="2">배송정보</td>
</tr>
<tr>
<th>배송 방법</th>
<td>택배, 업체설치</td>
</tr>
 <tr>
<th>배송 지역</th>
<td>전국(도서산간포함) ,해외 / 상품상세 및 업체규정 참조</td>
</tr>
<tr>
<th>배송 비용</th>
    <td>상품상세 상단 배송비 참조 (설치상품/수입/맞춤제작의 경우 판매자 별도규정 참고)</td>
</tr>
<tr>
<th>배송 기간</th>
<td>일요일/공휴일 포함 시 추가 배송기일 소요 <br>
                   설치 상품의 경우 업체에서 사전연락<br>
                   주문제작 상품 및 상품 재고상황, 택배사 사정에 의해 배송 지연 될 수 있음<br>
                   희망발송일 등 고객 별도 요청에 의해 배송기일과 배송비 변경될 수 있음<br>
</td>
</tr>
<tr><td colspan="2">
고객님께서 주문하신 상품은 입금 확인후 배송해 드립니다.<br>
다만, 상품종류에 따라서 상품의 배송이 다소 지연될 수 있습니다.<br>
해외배송인 경우 EMS 우체국 국제특송을 이용하여 배송 상품의 중량 및 배송국가에 따라 배송비 부과</td>
</tr>

<tr><td class="ex_title" colspan="2">교환 및 반품정보</td></tr>
<tr>
<th>교환/반품/AS 신청</th>
<td>
- 상품을 공급 받으신 날로부터 7일이내 단, 가전제품의 경우 포장을 개봉하였거나 포장이 훼손되어 상품가치가 상실된 경우에는 교환/반품이 불가능합니다.<br>
- 공급받으신 상품 및 용역의 내용이 표시.광고 내용과 다르거나 다르게 이행된 경우에는 공급받은 날로부터 3개월이내, 그사실을 알게 된 날로부터 30일이내
</td>
</tr>
<tr>
<th>교환/반품/AS 불가안내</th>
<td>
     - 설치상품/주문제작,맞춤상품의 경우, 수입제품으로 개봉후 설치제품의 경우<br>
   
    
    - 특가상품/세일 제품의 경우, 청약철회가 불가능으로 공지되어 판매된 경우<br>
    

    
    - 고객님의 책임 있는 사유로 상품등이 멸실 또는 훼손된 경우. 단, 상품의 내용을 확인하기 위하여 포장 등을 훼손한 경우는 제외<br>
- 포장을 개봉하였거나 포장이 훼손되어 상품가치가 상실된 경우<br>
(예 : 가전제품, 식품, 음반 등, 단 액정화면이 부착된 노트북, LCD모니터, 디지털 카메라 등의 불량화소에 따른 반품/교환은 제조사 기준에 따릅니다.)<br>
- 고객님의 사용 또는 일부 소비에 의하여 상품의 가치가 현저히 감소한 경우 단, 화장품등의 경우 시용제품을 제공한 경우에 한 합니다.<br>
- 시간의 경과에 의하여 재판매가 곤란할 정도로 상품등의 가치가 현저히 감소한 경우<br>
- 복제가 가능한 상품등의 포장을 훼손한 경우<br>
    (자세한 내용은 고객센터 1:1 문의상담(이메일/카카오톡)을 이용해 주시기 바랍니다.)
</td>
</tr>
<tr>
<td colspan="2">
※ 고객님의 마음이 바뀌어 교환, 반품을 하실 경우 상품반송 비용은 고객님께서 부담하셔야 합니다.<br>
 (색상 교환,사이즈교환 포함)<br>
    <b>※ 청약철회시 각 판매자의 별도규정을 우선합니다.</b>
    </td>
</tr>
</tbody></table>

</div>
		</div>

			<div class="goods_description_images goods_common_contents">
			</div>

		</div>