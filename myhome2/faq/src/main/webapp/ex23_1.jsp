<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex23.jsp에 대한 추가 데이터 출력파트</title>
</head>
<body>
<%
	String pnm = request.getParameter("person").intern();
	if(pnm=="강감찬"){
		int point = 5300;
		String sales = "15%";
		request.setAttribute("sales", sales);
		request.setAttribute("point", point);		
	}
	else{
		out.print("ERROR");
	}
%>
<p>보유적립금 : ${point}원</p>
<p>회원등급할인정책 : ${sales}</p>
</body>
</html>