<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Js1_1 - session 생성</title>
</head>
<body>
<%

	String user ="hong";
	String email="hong@nate.com";
	int level = 4;
	session.setAttribute("mid", user);
	session.setAttribute("mail", email);
	session.setAttribute("lv", level);
	
	long last = session.getLastAccessedTime(); //세션 유지 시간
	long create = session.getCreationTime(); //세션 생성 시간
	long user_time = (last-create) / 60000; //세션 경과 시간
	out.print(last+"<br>");	
	out.print(create+"<br>");
	out.print(user_time+"<br>");	
	
	//MaxInactiveInterval : 1800초
	//session.setMaxInactiveInterval(-1); //무한으로 저장
	//session.setMaxInactiveInterval(0); //소멸	
	session.setMaxInactiveInterval(60*60); //최대시간을 조정하는 부분
	
// 	  <session-config> xml에 직접 입력, 세션 유지 시간을 셋팅함
// 	  <session-timeout>60</session-timeout> 1시간 경과후 세션 삭제
// 	  </session-config>

	int time =	session.getMaxInactiveInterval() / 60;
	//30분 동안 session 사용
	out.print(time);
%>
</body>
</html>