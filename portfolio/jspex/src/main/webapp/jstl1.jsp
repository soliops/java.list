<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jsp를 추가를 이용하여 if, for 기타 등등 쉽게 적용할 수 있도록 사용하는 방식입니다.
     prefix : 생성 태그명 (jsp를 전체를 컨트롤 함)
     uri : 외부 jstl 코어를 가져올 때 사용
     tagdir : 자신의 서버에 있는 코어를 사용할 때
     -->
  <%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 - JSTL1 문법</title>
<!-- JSP (if,for,while,데이터베이스) -> JSTL(JSP standard tag library) 
쉽게 내장객체로 접근 하도록 하는 라이브러리 

JSTL -> jstl.jar 라이브러리가 필요함
-->
<%
request.setCharacterEncoding("UTF-8");
String user = request.getParameter("user"); 
response.setContentType("text/html;charset=utf-8");

// out.print(user);
%>
<!-- JSTL 태그로 출력 파트
out : 출력파트
set : 변수를 선언할 때 사용
remove : 변수를 제어할 때 사용
catch : 예외처리
 -->
 <!-- var 변수명을 생성 value : 값을 입력 받음 -->
 <jh:set var="user2" value="<%=user %>"></jh:set>
</head>
<body>
<form name="f" id="f" method="post"action="./jstl1.jsp">
<input type="text" name="user">
<input type="submit" value="전송">
</form>
<!-- out: 출력 value만 존재함 -->
<span>고객명 : <jh:out value="${user2}"></jh:out>
</span>
</body>
</html>