<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<meta charset="UTF-8">
<% ArrayList<Map<String,Object>> list = (ArrayList<Map<String,Object>>)request.getAttribute("list");
ArrayList<Object> page_data = (ArrayList<Object>)request.getAttribute("page_data");
int total = (int)page_data.get(3);
int startpage = (int)page_data.get(2);
double pagenumber= (double)page_data.get(1);
%>
<p>카테고리관리 페이지</p>
<div class="subpage_view">
    <span>등록된 카테고리 <%=list.size() %>건</span>
    <span>
        <select class="p_select1" name="cate_search" id="cate_search">
            <option value="0">카테고리명</option>
            <option value="1">카테고리코드</option>
        </select>
        <input type="text" name="p_search" id="p_search" class="p_input1" placeholder="검색어를 입력해 주세요">
        <input type="submit" value="검색" title="카테고리 검색" class="p_submit" onclick="search();">
    </span>
</div>
<div class="subpage_view2">
    <ul>
        <li><input type="checkbox" name="allcheck" id="allcheck" onclick="all_check();"></li>
        <li>분류코드</li>
        <li>대메뉴 코드</li>
        <li>대메뉴명</li>
        <li>소메뉴 코드</li>
        <li>소메뉴명</li>
        <li>사용 유/무</li>
        <li>관리</li>
    </ul>
    <%
    if(list.size()!=0){
    int w=0;
    do{
    	%>
    <ul>
        <li><input type="checkbox" name="cate_check" id="cate_check<%=list.get(w).get("cidx")%>" value="<%=list.get(w).get("cidx")%>" onclick="cate_change();"></li>
        <li style="text-align: left; text-indent: 5px;"><%=list.get(w).get("classcode") %></li>
        <li><%=list.get(w).get("cbcate_code") %></li>
        <li style="text-align: left; text-indent: 5px;"><%=list.get(w).get("cbcate_name") %></li>
        <li><%=list.get(w).get("cscate_code") %></li>
        <li style="text-align: left; text-indent: 5px;"><%=list.get(w).get("cscate_name") %></li>
        <li><%=list.get(w).get("cate_use") %></li>
        <li>[수정]</li>
    </ul>
    <%w++;
    }while(w<list.size());%>
<%}else{%>
    <ul>
        <li style="width: 100%;">등록된 카테고리가 없습니다.</li>
    </ul>
<%}%>
</div>
<div class="subpage_view3">
    <ul class="pageing">
<%
int p=1;
do{
%>
        <li onclick="pagefirst();"><img src="./ico/double_left.svg"></li>
        <li onclick="pagebefore(<%=p-1%>);"><img src="./ico/left.svg"></li>
        <li onclick="pagego(<%=p%>);"><%=p %></li>
        <li onclick="pagenext(<%=p+1%>,<%=pagenumber%>);"><img src="./ico/right.svg"></li>
        <li onclick="pageend(<%=pagenumber%>);"><img src="./ico/double_right.svg"></li>
<%
p++;
}while(p<=pagenumber);
%>
    </ul>
</div>
<div class="subpage_view4">
    <input type="button" value="카테고리 삭제" title="카테고리 삭제" class="p_button" onclick="cate_del();">
    <input type="hidden" value="" name="cate_delck" id="cate_delck">
    <span style="float: right;">
    <input type="button" value="상품 리스트" title="상품 리스트" class="p_button p_button_color1" onclick="product_list();">
    <input type="button" value="카테고리 등록" title="카테고리 등록" class="p_button p_button_color2" onclick="cate_regi();">
    </span>
</div>