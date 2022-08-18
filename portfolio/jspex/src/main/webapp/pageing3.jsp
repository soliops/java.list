<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./gselect.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 8일차 - 갤러리 보드 + DB JOIN</title>
<style>
.imgs{width:150px; height:50px; object-fit:fill;}
</style>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="0">
<thead>
<tr bgcolor="#ccc" style="text-align:center;">
<td width="80">번호</td>
<td width="150">이미지</td>
<td width="300">제목</td>
<td width="100">글쓴이</td>
<td width="80">추천수</td>
<td width="80">첨부파일</td>
<td width="150">등록일자</td>
</tr>
</thead>
<tbody>
<%
int w=0;
int total= al.size();
String thumb = "";
while(w<al.size()){
	int no = total-w;
	//이미지 일 경우
	if(al.get(w).get("gimg")==null||al.get(w).get("gimg")==""){
		thumb="NONE";
	}else{
		thumb="<img src="+(String)al.get(w).get("gimg")+">";
	}
%>
<tr style="text-align:center; height:50px;">
<td><%=no %></td>
<td class="imgs"><%=thumb %></td>
<td style="text-align:left;"><%=al.get(w).get("gsubject") %></td>
<td><%=al.get(w).get("gwriter") %></td>
<td><%=al.get(w).get("gcount") %></td>
<td><%=al.get(w).get("rd") %></td>
<td><%=al.get(w).get("gindate") %></td>
</tr>
<%
w++;
} %>
</tbody>
</table>
<ol style="list-style:none; margin:0; padding:0;">
<li style="display:inline-block; border:1px solid #ccc;width:30px; height:30px; text-align:center">1</li>
</ol>
<div>
<form name="f" id="f" method="get" action="./pageing3.jsp" enctype="application/x-www-form-urlencoded">
<input type="text" name="" placeholder="글쓴이 이름을 입력하세요.">
<input type="submit" value="검색">
</form>
</div>
</body>
</html>