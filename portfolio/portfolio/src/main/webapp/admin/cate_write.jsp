<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<meta charset="UTF-8">
<% ArrayList<Map<String,Object>> list = (ArrayList<Map<String,Object>>)request.getAttribute("list");%>
<p>카테고리 등록 페이지</p>
<div class="cate_insert">
    <ul>
        <li>분류코드</li>
        <li><input type="text" name="classcode" id="classcode" class="cate_input1" readonly></li>
        <li>※ 분류코드는 대메뉴 코드와 소메뉴 코드를 합쳐서 자동 입력 됩니다.</li>
    </ul>
    <ul>
        <li>대메뉴 코드</li>
        <li>
            <input type="text" name="cbcate_code" id="cbcate_code" class="cate_input2" onkeyup="cate_plus();" list="lg_menu" maxlength="2">
            <datalist id="lg_menu">
            <%
            int w= 0;
            while(w<list.size()){ %>
                <option><%=list.get(w).get("cbcate_code") %></option>
                <%
                w++;
                } %>
            </datalist>
        </li>
        <li>※ 대메뉴에 사용할 코드 번호를 입력하세요 2자리 숫자로 입력하셔야 합니다.</li>
    </ul>
    <ul>
        <li>대메뉴명</li>
        <li><input type="text" name="cbcate_name" id="cbcate_name" class="cate_input3"> <label><input type="checkbox" name="cbcate_use" id="cbcate_use" style="margin-left:10px; margin-right: 5px;">대메뉴만 생성</label></li>
        <li>※ 소메뉴만 등록시 대메뉴 코드와 대메뉴명은 무조건 입력 되어야 합니다.</li>
    </ul>
    <ul>
        <li>소메뉴 코드</li>
        <li>
            <input type="text" name="cscate_code" id="cscate_code" class="cate_input2" onkeyup="cate_plus();" list="lg_menu" maxlength="2">
            <datalist id="lg_menu">
                     <%
            int e= 0;
            while(e<list.size()){ %>
                <option><%=list.get(e).get("cscate_code") %></option>
                <%
                e++;
                } %>
            </datalist>
        </li>
        <li>※ 소메뉴에 사용할 코드 번호를 입력하세요 2자리 숫자로 입력하셔야 합니다.</li>
    </ul>
    <ul>
        <li>소메뉴명</li>
        <li><input type="text" name="cscate_name" id="cscate_name" class="cate_input3"></li>
        <li>※ 대메뉴만 등록시 소메뉴 코드 및 소메뉴명은 입력하지 않으셔도 됩니다.</li>
    </ul>
    <ul>
        <li>사용 유/무</li>
        <li>
            <label class="rmargin"><input type="radio" name="cate_use" value="Y" checked>사용함 </label>
            <label class="rmargin"><input type="radio" name="cate_use" value="N">사용안함</label>
        </li>
        <li>※ 카테고리 사용안함으로 설정시 쇼핑몰에 해당 메뉴는 생성 되지 않습니다.</li>
    </ul>
</div>
<div class="subpage_view4" style="text-align:center;">
    <input type="button" value="카테고리 리스트" title="카테고리 리스트" class="p_button p_button_color1" style="margin-right: 5px;" onclick="cate_list();">
    <input type="button" value="카테고리 생성" title="카테고리 생성" class="p_button p_button_color2" onclick="cate_create();">
</div>