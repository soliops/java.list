<%@page import="portfolio2.notice_dao"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String url = request.getContextPath();
List<notice_dao> list = (List<notice_dao>)request.getAttribute("notice_list");
List<notice_dao> notice_list = (List<notice_dao>)request.getAttribute("notice_list_limit");
ArrayList<Object> page_data = (ArrayList<Object>)request.getAttribute("page_data");
int total = (int)page_data.get(3);
int startpage = (int)page_data.get(1);
double pagenumber = (double)page_data.get(2);
int size = 0;
if(notice_list.size()!=0){
	size=notice_list.size();
}
String pages = request.getParameter("page");
if(pages==null){pages="1";}
%>    


<meta charset="utf-8">
<div id="boardlayout" >
    <div class="subpage_wrap">
        <div id="subpageLNB" class="subpage_lnb">
<div id="boardLnbCommon">
    <h2 class="title1"><a href="#" designElement="text">CS CENTER</a></h3>
    <ul class="lnb_sub">
        <li ><a href="<%=url%>/notice.do" designElement="text">공지사항</a></li>
        <li ><a href="<%=url%>/cs.do" designElement="text">자주 묻는 질문</a></li>
        <li ><a href="<%=url%>/cs.do?cate=3"  designElement="text">상품문의</a></li>
        <li ><a href="#" designElement="text"><b>상품후기</b></a></li>
    </ul>
</div>
<script>
$(function() {
    // 고객센터 LNB 텍스트 수정기능으로 삭제시, 클라이언트단에서 삭제 처리
    $('#boardLnbCommon a').each(function(e) {
        if ( $(this).text() == '' ) {
            $(this).parent('li, h2').remove();
        }
    });
});
</script>
        </div>
    <div class="subpage_container">
        <!-- 전체 메뉴 -->
        <a id="subAllButton" class="btn_sub_all" href="javascript:void(0)"><span designElement="text" textIndex="1"  textTemplatePath="cmVzcG9uc2l2ZV93cmlzdHdhdGNoX2NsYXNzaWNfZ2wvYm9hcmQvaW5kZXguaHRtbA==" >MENU</span></a>

        <!-- 타이틀 ( 관리자에서 설정한 "게시판명"이 노출됩니다. ) -->
        <div class="title_container">
            <h2>공지사항</h2>
        </div>

        <div id="bbslist">
<ul class="bbs_top_wrap">
    <li class="left">
        <select name="category" id="searchcategory">
            <option value="0" selected="selected">- 전체 -</option>
            <option value="공지" >공지</option>
            <option value="긴급공지" >긴급공지</option>
        </select>
    </li>
    <li class="right2">
        <span class="searchform">
            <input type="text" name="search_text" id="search_text" class="res_bbs_search_input" value="" title="제목, 내용" />
            <input type="hidden" name="p_check" value="N">
            <input type="submit" class="btn_resp size_b" value="검색" onclick="search();">
            <input type="button" class="btn_resp size_b" value="초기화" onclick="search_reset();">
        </span>
    </li>
</ul>
<div class="article_info hide">
총 <%=size %>개 (현재 <%=pages%>/총 <%=pagenumber %>페이지)
</div>
<%if(size==0){ %>
<!--등록된 글이 없을 경우-->
<div class="no_data_area2">
    등록된 게시글이 없습니다.
</div>
<%}
else{%>
<!--등록된 글이 있을 경우-->

<div class="res_table">
<ul class="thead">
<li style="width:45px;"><span designElement="text">번호</span></li>
<li><span designElement="text">제목</span></li>
<li style="width:94px;"><span designElement="text">작성자</span></li>
<li style="width:84px;"><span designElement="text">등록일</span></li>
</ul>
<%
if(!page_data.get(4).equals("공지")){
int t = 0;
while(t<list.size()){%>
<ul class="tbody">
<li class="mo_hide">
<span class="mtitle" designElement="text">번호:</span> 긴급 </li>
<li class="subject">
    <%=list.get(t).getNotice_title() %>
</li>
<li class="subject" style="text-align: center;">
  <%=list.get(t).getNotice_writer() %>
</li>
<li class="subject" style="text-align: center;">
    <%String date =list.get(t).getNotice_date(); %>
    	<%=date.substring(0,10)%>
</li>
</ul>
<%t++;
}
}
%>
<!--반복구간 사항-->
<% 
if(!page_data.get(4).equals("긴급공지")){
int w=0;
int no =0;
String title = "공지";
while(w<size){
	String p_check = notice_list.get(w).getNotice_print();
	no= total-startpage-w;
%>
<ul class="tbody">
<li class="mo_hide">
<span class="mtitle" designElement="text">번호:</span> <%if(p_check.equals("Y")){%><%=title%><%}else{%><%=no%><%}%></li>
<li class="subject">
    <%=notice_list.get(w).getNotice_title() %>
</li>
<li class="subject" style="text-align: center;">
  <%=notice_list.get(w).getNotice_writer() %>
</li>
<li class="subject" style="text-align: center;">
    <%String date =notice_list.get(w).getNotice_date(); %>
    	<%=date.substring(0,10)%>
</li>
</ul>
<%
w++;
} 
}
}
%>
<!--반복구간 종료-->
</div>
<div id="pagingDisplay" class="paging_navigation">
<p>
<%
int ww=1;
while(ww<=pagenumber){%>
<!--페이지 번호 반복구간-->
<a class="on red" href="./notice.do?page=<%=ww %>"><%=ww%></a>
<%
ww++;} %>
<!--페이지 번호 반복구간-->
</p>
</div>
     </div>
    </div>
<!--공지사항 끝-->