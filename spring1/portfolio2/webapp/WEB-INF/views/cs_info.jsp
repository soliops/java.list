<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--     <%=request.getRequestURL()%> --%>
<%
ArrayList<Map<String,String>> data = (ArrayList<Map<String,String>>)request.getAttribute("data");
// out.print(data.get(0).get("fcategory"));
%>    
<meta charset="utf-8">
<div id="boardlayout" >
    <div class="subpage_wrap">
        <div id="subpageLNB" class="subpage_lnb">
<div id="boardLnbCommon">
    <h2 class="title1"><a href="<%=url%>/cs.do" designElement="text" >CS CENTER</a></h3>
    <ul class="lnb_sub">
        <li ><a href="<%=url%>/notice.do" designElement="text">공지사항</a></li>
        <li ><a href="<%=url%>/cs.do" designElement="text">자주 묻는 질문</a></li>
        <li ><a href="<%=url%>/cs.do?cate=3" designElement="text">상품문의</a></li>
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

        <!-- +++++ cscenter contents ++++ -->
        <div class="subpage_container">
            <!-- 전체 메뉴 -->
            <a id="subAllButton" class="btn_sub_all" href="#" designElement="text">MENU</a>

            <!-- -->
            <div class="cs_top2 mycs_fcont_margin">
                <a class="menu2" href="<%=url%>/cs.do?cate=1" designElement="text"><span class="area"><span class="text2">배송문의</span></span></a>
                <a class="menu3" href="<%=url%>/cs.do?cate=2" designElement="text"><span class="area"><span class="text2">반품/교환문의</span></span></a>
                <a class="menu1" href="<%=url%>/cs.do?cate=3" designElement="text"><span class="area"><span class="text2">상품문의</span></span></a>
                <a class="menu9" href="<%=url%>/cs.do?cate=4" designElement="text"><span class="area"><span class="text2">쿠폰내역</span></span></a>
                <a class="menu10" href="<%=url%>/cs.do?cate=5" designElement="text"><span class="area"><span class="text2">마일리지내역</span></span></a>
                <a class="menu5" href="<%=url%>/cs.do?cate=6" designElement="text"><span class="area"><span class="text2">자주묻는질문</span></span></a>
            </div>
            <!-- 타이틀 -->
            <div class="title_container2">
                <h3 class="title_sub6"><span designElement="text" textIndex="8" >자주 묻는 질문</span> <span class="top5" designElement="text" textIndex="9" >TOP5</span></h3>
                <a class="btn_thebogi" href="#" designElement="text" textIndex="10" >더보기</a>
            </div>
            
            <!-- 반복사용 필요 -->	
            <%
            int w=0;
            while(w<data.size()){
            %>
            <ul class="faq_new v2">
                <li>
                    <div class="question">
                        <p class="subject pointer boad_faqview_btn" board_seq="<%=data.get(w).get("fidx")%>"> <span class="cat">
			[<%=data.get(w).get("fcategory")%>] 
                        </span>
				<%=data.get(w).get("f_qtext")%>
                           </p>
                        <p class="add_info">
                            <span class="hide">번호:  <%=w+1 %></span>
                        </p>
                    </div>
                 <div id="faqcontent_<%=data.get(w).get("fidx")%>" class="answer hide">								
                        <p style="box-sizing: inherit;">
<!--                         ${f_atext} -->
					<%=data.get(w).get("f_atext")%>
                        </p>
                    </div>
                </li>
            </ul>
            <!-- 반복사용 끝 -->
            <%
            w++;
            };%>
            <script type="text/javascript">
            // FAQ 게시글 보기
            $('.boad_faqview_btn').on('click', function() { 
                var board_seq = $(this).attr('board_seq');
                $("#faqcontent_"+board_seq).toggle();
            }); 
            </script>
        </div>
        
    </div>
    <script type="text/javascript" src="./js/cscenter_ui.js"></script><!-- 고객센터 ui 공통 -->

</div>
        
        </div>
</div>