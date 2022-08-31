<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<%
ArrayList<Map<String,Object>> notice_list =(ArrayList<Map<String,Object>>)request.getAttribute("notice_list");
ArrayList<Map<String,Object>> notice_nlist =(ArrayList<Map<String,Object>>)request.getAttribute("notice_nlist");		
ArrayList<Object> page_data = (ArrayList<Object>)request.getAttribute("page_data");
int total = (int)page_data.get(3);
int startpage = (int)page_data.get(1);
double pagenumber= (double)page_data.get(2);
%>
<p>공지사항 관리페이지</p>
<div class="subpage_view">
<ul>
    <li><input type="checkbox" name="view_allcheck" id="view_allcheck" onclick="all_check();"></li>
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
    <li><input type="checkbox" name="view_check" id="view_check<%=notice_list.get(t).get("notice_idx")%>" value="<%=notice_list.get(t).get("notice_idx")%>" onclick="view_allchange();"></li>
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
	int no = 0;
	do{
		no=total-startpage-r;
%>
<ol>
   <li><input type="checkbox" name="view_check"  id="view_check<%=notice_nlist.get(r).get("notice_idx")%>" value="<%=notice_nlist.get(r).get("notice_idx")%>" onclick="view_allchange();"></li>
   <li><%=no%></li>
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
    <input type="button" class="border_add" value="공지등록" onclick="notice_write();">
</div>
<div class="border_page">
    <ul class="pageing">
<%
int p=1;
do{
 	%>
        <li onclick="pagefirst();"><img src="./ico/double_left.svg"></li>
        <li onclick="pagebefore(<%=p-1%>);"><img src="./ico/left.svg"></li>
        <li onclick="pagego(<%=p%>);"><%=p%></li>        
        <li onclick="pagenext(<%=p+1%>,<%=pagenumber%>);"><img src="./ico/right.svg"></li>
        <li onclick="pageend(<%=pagenumber%>);"><img src="./ico/double_right.svg"></li>
<%
p++;
}while(p<=pagenumber);
%>
    </ul>
</div>