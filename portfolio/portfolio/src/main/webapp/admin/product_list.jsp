<%@page import="com.mysql.jdbc.StringUtils"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<meta charset="UTF-8">
<% 
ArrayList<Map<String,Object>> list = (ArrayList<Map<String,Object>>)request.getAttribute("list");
ArrayList<Object> page_data = (ArrayList<Object>)request.getAttribute("page_data");
int total = (int)page_data.get(3);
int startpage = (int)page_data.get(2);
double pagenumber= (double)page_data.get(1);
String pn = request.getParameter("page");
if(pn==null){pn="1";}
int pt = Integer.parseInt(pn);
%>
<p>상품관리 페이지</p>
<div class="subpage_view">
<%
int total_num =0;
if(list.size()!=0){
	total_num=list.size();
}%>
    <span>등록된 상품 <%=total_num %>건</span>
    <span>      
        <select class="p_select1" name="product_search" id="product_search">
            <option value="0">상품명</option>
            <option value="1">상품코드</option>
        </select>
        <input type="text" name="p_search" id="p_search" class="p_input1" placeholder="검색어를 입력해 주세요">
        <input type="submit" value="검색" title="상품검색" class="p_submit" onclick="search();">      
    </span>
</div>
<div class="subpage_view2">
    <ul>
        <li><input type="checkbox" name="allcheck" id="allcheck" onclick="all_check();"></li>
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
<%
if(list.size()!=0){ 
int w=0;
do{
%>
    <ul>
        <li><input type="checkbox" name="product_check" id="product_check<%=list.get(w).get("pidx")%>" value="<%=list.get(w).get("pidx")%>" onclick="product_change(this);"></li>
        <li><%=list.get(w).get("product_code")%></li> 
        <li><img src=".<%=list.get(w).get("product_img1")%>" style="height:90%; margin-top:1px;" alt="사진 없음"></li>
        <li><%=list.get(w).get("product_name")%></li>
        <li><%=list.get(w).get("cbcate_code")%><%=list.get(w).get("cscate_code")%></li>
        <li><%=list.get(w).get("product_price")%></li>
        <li><%=list.get(w).get("product_disprice")%></li>
        <li><%=list.get(w).get("product_discount")%>%</li>
        <li><%=list.get(w).get("product_stock")%></li>
        <li><%=list.get(w).get("product_sale")%></li>
        <li><%=list.get(w).get("product_saleout")%></li>
        <li>관리</li>
    </ul>
<%
w++;
}while(w<list.size());
}else{ %>
    <ul>
        <li style="width: 100%;">등록된 상품이 없습니다.</li>
    </ul>
<%} %>    
</div>
<div class="subpage_view3">
    <ul class="pageing">
        <li onclick="pagefirst();"><img src="./ico/double_left.svg"></li>
        <li onclick="pagebefore(<%=pt-1%>);"><img src="./ico/left.svg"></li>
<%int p=1;
do{%>
        <li onclick="pagego(<%=p%>);"><%=p%></li>
<%
p++;}while(p<=pagenumber); %>    
        <li onclick="pagenext(<%=pt+1%>,<%=p%>);"><img src="./ico/right.svg"></li>
        <li onclick="pageend(<%=pagenumber%>);"><img src="./ico/double_right.svg"></li>
    </ul>
</div>
<div class="subpage_view4">
    <input type="button" value="선택상품 삭제" title="선택상품 삭제" class="p_button" onclick="product_del();">
    <input type="hidden" value="" name="product_delck" id="product_delck">
    <span style="float: right;">
    <input type="button" value="신규상품 등록" title="신규상품 등록" class="p_button p_button_color1" onclick="product_regi();">
    <input type="button" value="카테고리 등록" title="카테고리 등록" class="p_button p_button_color2" onclick="cate_regi();">
    </span>
</div>