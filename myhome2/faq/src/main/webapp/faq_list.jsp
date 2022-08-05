<%@page import="configure.select_sql"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>FAQ 리스트</title>
<link rel="stylesheet" type="text/css" href="./css/faq.css?v=8">
<script src="./js/jquery.js"></script>
<script>
function faq_write(){
	location.href="./faq_write.html";
}
//faq.jsp 파일 참고해서 수정 http://mekeyace.kbsn.or.kr/faqjsp.txt
//http://mekeyace.kbsn.or.kr/faq.pdf
</script>
</head>
<body>
<%
ArrayList<select_sql> sel_datas = (ArrayList<select_sql>)request.getAttribute("list2");
%>
<%=sel_datas.size()%>
<section class="faq_view">
	<div class="faq_list">
		<p>FAQ LIST</p>
		<span class="faq_content">
			<ul>
				<li>카테고리</li>
				<li>제목</li>
				<li>글쓴이</li>
				<li>등록일자</li>
			</ul>
		</span>
		<% if(sel_datas.size()==0){ %>
		<span class="faq_content_view">
			<ul class="nodata">
				<li>등록된 FAQ가 없습니다.</li>
			</ul>
		</span>
			<%
		} else {
			for(select_sql fetch : sel_datas){
		%>
		<span class="faq_content_view" onclick="modify(<%=fetch.getFidx()%>);">
			<ul>
				<li><%=fetch.getFcategory()%></li>
				<li class="left_text"><%=fetch.getF_qtext()%></li>
				<li><%=fetch.getFname()%></li>
				<li><%=fetch.getF_indate()%></li>
			</ul>
		</span>
		<%
			}
		}
		%>
	</div>
	<div class="pageing">
	<ol>
	<li>1</li>
	</ol>
	</div>
	<div class="page_btn">
	<input type="button" value="FAQ 등록" class="faq_btn" title="FAQ 등록" onclick="faq_write();">
	</div>
</section>
</body>
</html>