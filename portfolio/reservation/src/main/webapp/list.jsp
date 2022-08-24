<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% ArrayList<Map<String,Object>> list = (ArrayList<Map<String,Object>>) request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>번호</td>
<td>신청인</td>
<td>이메일</td>
<td>신청방법</td>
<td>수정/삭제<td>
</tr>
<%
int t=0;
while(t<list.size()){
	%>
<tr>
<td><%=list.get(t).get("cidx") %></td>
<td><%=list.get(t).get("cname") %></td>
<td><%=list.get(t).get("cemail") %></td>
<td><%=list.get(t).get("cmethod") %></td>
<td><input type="button" value="수정/삭제" onclick="updatego(<%=list.get(t).get("cidx")%>);"><td>
</tr>
	<%
	t++;
}

if(list.size()==0){%>
<tr>
<td>등록된 신청자가 없습니다.</td>
</tr>
<%}%>
</table>
<input type="button" value="실업급여 신청" onclick="finish();">
</body>
<script>
function updatego(no){
	location.href="http://192.168.100.209:8080/reservation/view_modify?idx="+no;
}
</script>
</html>