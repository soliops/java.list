<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">

<p>공지사항 VIEW 페이지</p>
<div class="write_view">
<ul>
    <li>공지번호</li>
    <li><input type="hidden" name="idx" id="idx" value="<%=list.get(0).get("idx") %>"><%=list.get(0).get("idx") %> 번째 공지글</li>
</ul>
<ul>
    <li>공지사항 여부</li>
    <li>
        <label class="label_notice"><em class="cbox"><input type="checkbox" name="notice_print" id="notice_print" value="<%=ck %>" <%if(ck.equals("Y")){%>checked<%} %>></em> 공지 출력</label> ※ 공지출력을 체크할 시 해당 글 내용은 최상단에 노출 되어 집니다.
    </li>
</ul>
<ul>
    <li>공지사항 제목</li>
    <li>
        <input type="text" class="notice_input1" name="notice_title" id="notice_title" value="<%=list.get(0).get("notice_title")%>"> ※ 최대 150자까지 입력이 가능
    </li>
</ul>
<ul>
    <li>글쓴이</li>
    <li>
        <input type="text" class="notice_input2" name="notice_writer" id="notice_writer" value="<%=list.get(0).get("notice_writer")%>" readonly> ※ 관리자 이름이 노출 됩니다.       
    </li>
</ul>
<ul>
    <li>첨부파일</li>
    <li>
        <input type="file" name="notice_file" id="notice_file"> ※ 새로운 첨부파일 적용시 기본 첨부파일은 삭제 됩니다.
        <em class="fileview">기존 첨부 파일명 : <%=list.get(0).get("notice_file") %></em>
        <input type="hidden" name="notice_file_origin" id="notice_file_origin" value="<%=list.get(0).get("notice_file") %>">
    </li>
</ul>
<ul class="ul_height">
    <li>공지내용</li>
    <li>
        <textarea class="notice_input3" name="notice_text" id="notice_text"placeholder="공지내용 출력">
        <%=text%>
        </textarea>
    </li>
</ul>
</div>
<div class="board_btn">
    <input type="button" class="border_list" name="list_go" id="list_go" value="공지목록">
    <input type="button" class="border_modify" name="notice_modify" id="notice_modify"  value="공지수정">
    <input type="button" class="border_del" name="notice_del" id="notice_del" value="공지삭제">
</div>