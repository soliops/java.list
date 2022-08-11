<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" autoFlush="true"%>
<%@	page isThreadSafe="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일차 - Buffer 사용법 + Thread</title>
</head>
<body>
<!-- buffer 사이즈는 기본 8kb autoflush= true로 설정되어있음
 false로 하면 해당 사이즈를 넘으면 자동으로 멈춤-->
<!--  글자 1개당 1byte -->
<!--
Buffer : 페이지 로드시 읽어들이는 메모리 사용량 제한ㅡ
autoflush : true(메모리를 비우고 다시 페이지를 로드), false(메모리 데이터를 비우지 않음)
isThreadSafe : false(멀티스레드를 사용하지 않음), true(멀티스레드를 사용함)
isThreadSafe(true)권장 - 풀데이터 처리시 다중처리시 속도를 높이기 위해서 사용 
-->
<%=out.getBufferSize()%>byte
<%
for(int a=1; a<=1500; a++){
	out.println(a);
}

%>

</body>
</html>