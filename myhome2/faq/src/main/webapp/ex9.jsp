<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일차 - SPA 응용</title>
</head>
<body>
<!-- 응용문제
사용자가 숫자 1~9까지를 선택합니다. 
해당 숫자를 선택 후 전송 버튼을 클릭시 
해당 숫자에 맞는 구구단을 출력하시오.
 -->
 <%
 request.setCharacterEncoding("UTF-8");
 String sel = request.getParameter("sel");
 if(sel!=null){
 	%> 
	<table border="1">
	<% 
 	int g=Integer.parseInt(sel); 
 	for(int i=1;i<=9;i++){ 
	%> 
 	<tr> 
	<td width="100" height="30"><%=g%> * <%=i %> = <%=g*i %></td>  
 	</tr> 
 	<%}%> 
 	</table> 
 	<% 
 	} 
	 else{
  	%> 
<%-- <% --%>
 <form name="frm" id="frm" method="post" action="./ex9.jsp">
<select name="sel"> 
<option value="">원하는 숫자를 선택해주세요.</option>
<% 
 for(int t=1;t<=9;t++){
%>
<option value="<%=t%>"><%=t%></option>
<!-- <option value="1">1</option> -->
<!-- <option value="2">2</option> -->
<%} %>
</select>
<input type="submit" value="전송">
 </form>
<% } %>
</body>
</html>