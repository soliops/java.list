<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 상품검색 응용파트</title>
<script>
function abc(){
	if(f.search.value==""){
		alert("검색할 상품명을 입력하세요.");
		return false;
	}
	else{
		return;
	}
}
</script>
<%
	request.setCharacterEncoding("UTF-8");
	String ss =request.getParameter("search"); 
	//ex24_1.jsp include -> param으로 값 리턴 시 적용
	if(ss==null || "null".equals(ss)){ //최초 실행시 값이 없을 경우 처리
		ss=""; //검색 초기값을 적용
	}
%>
</head>
<body>
<form name="f" id="f" method="POST" action="ex24_2.jsp"  onsubmit="return abc();">
<input type="text" name="search" value="<%=ss %>">
<input type="submit" value="검색">
</form>
</body>
</html>