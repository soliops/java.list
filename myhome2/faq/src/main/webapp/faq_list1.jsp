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
</script>
</head>
<body>
<%
ArrayList<select_sql> sel_datas = (ArrayList<select_sql>)request.getAttribute("list");
%>


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
		<span class="faq_content_view">
			<ul class="nodata">
				<li>등록된 FAQ가 없습니다.</li>
			</ul>
		</span>
		
		<span class="faq_content_view">
			<ul>
				<li>-</li>
				<li class="left_text">-</li>
				<li>-</li>
				<li>-</li>
			</ul>
		</span>
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