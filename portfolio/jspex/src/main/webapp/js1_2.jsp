<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Js1_2 - session 확인</title>
</head>
<body>
<%
// 	session.setMaxInactiveInterval(60*60);  //페이지마다 세션 시간을 설정해놔야함, 시간을 너무 길게 잡을 필요도 없다 
// session.setMaxInactiveInterval(2*10);
	//페이지 이동시 계속 초기화됨 30분씩
	Object id = session.getAttribute("mid");
	Object lv = session.getAttribute("lv");
	String mail = (String) session.getAttribute("mail");
	
	out.print(id+"<br>");
	out.print(lv+"<br>");	
	out.print(mail+"<br>");		
	
	
	if(id==null){
		out.print("<script> alert('로그아웃이 되었습니다.'); location.href='./js1.jsp'; </script>");
	}
%>
</body>
</html>