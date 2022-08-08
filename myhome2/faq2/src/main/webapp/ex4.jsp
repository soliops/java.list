<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일차 - 반복문 응용</title>
</head>
<body>
<table style="padding:0px; margin:0px; border:1px solid black;">
<!-- 절대 하지 말아야 할 사항 : JSP 코드에 HTML 태그를 넣지 않음 -->
<% 
int i = 0;
do{
%>
<tr>
<% 
int j = 0;
while(j<4){
%>
<td style="border:1px solid black; width:100px; heigth:30px;"><%=i%></td>
<%
j++;
}%>
</tr>
<% 
i++;
}while(i<4);
%>
</table>
<br> <br>

<table>
<%
for(int w=1;w<9;w++){
	if(w%2==0){
%>
<tr>
<td style="width:300px; height:30px; border:1px; background-color:red;"></td>
</tr>
<%
	}
	else{
%>
<tr>
<td style="width:300px; height:30px; border:1px; background-color:gray;"></td>
</tr>
<% 
}
}
%>
</table>

<table>
<%
String color="";
for(int w=1;w<9;w++){
	if(w%2==0){
		color="skyblue";
	}else{		
	color="gray";
	}
%>
<tr>
<td style="width:300px; height:30px; border:1px; background-color:<%=color%>;"></td>
</tr>
<%
	
}
%>
</table>

</body>
</html>