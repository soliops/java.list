<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<%
ArrayList<Map<String,Object>> notice_list =(ArrayList<Map<String,Object>>)request.getAttribute("notice_list");
ArrayList<Map<String,Object>> notice_nlist =(ArrayList<Map<String,Object>>)request.getAttribute("notice_nlist");		
%>
<p>공지사항 관리페이지</p>
<div class="subpage_view">
<ul>
    <li><input type="checkbox" name="view_allcheck" id="view_allcheck" onclick=all_check();></li>
    <li>NO</li>
    <li>제목</li>
    <li>글쓴이</li>
    <li>날짜</li>
    <li>조회</li>
</ul>
<%if(notice_list.size()!=0||notice_nlist.size()!=0){
	int t=0;
	do{
	
	
 %>
<ol>
    <li><input type="checkbox" name="view_check"></li>
    <li>공지 사항</li>
    <li><%=notice_list.get(t).get("notice_title")%></li>
    <li><%=notice_list.get(t).get("notice_writer")%></li>
    <li><%=notice_list.get(t).get("notice_date").toString().substring(0,10)%></li>
    <li>100</li>
</ol>
<%
	t++;
	}while(t<notice_list.size());
	int r=0;
	do{
%>
<ol>
   <li><input type="checkbox" name="view_check"></li>
   <li><%=notice_nlist.get(r).get("notice_idx")%></li>
   <li><%=notice_nlist.get(r).get("notice_title")%></li>
   <li><%=notice_nlist.get(r).get("notice_writer")%></li>
   <li><%=notice_nlist.get(r).get("notice_date").toString().substring(0,10)%></li>
   <li>100</li>
</ol>
<%
	r++;
	}while(r<notice_nlist.size());
}
else{
%>
<ol class="none_text">
    <li>등록된 공지 내용이 없습니다.</li>
</ol>
<%	
} %>
</div>
<div class="board_btn">
    <button class="border_del" onclick="notice_delete();">공지삭제</button>
    <button class="border_add" onclick="notice_write();">공지등록</button>
</div>
<div class="border_page">
    <ul class="pageing">
        <li><img src="./ico/double_left.svg"></li>
        <li><img src="./ico/left.svg"></li>
        <li>1</li>
        <li><img src="./ico/right.svg"></li>
        <li><img src="./ico/double_right.svg"></li>
    </ul>
</div>