<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "z" uri="http://java.sun.com/jsp/jstl/core"%>   
<!-- 
jstl : taglib으로 생성하며 배열값을 출력시킴
pom 두가지를 설치 (jstl,taglib) 설정해야 함
 -->
<%-- <%ArrayList<model_dao> list2 = (ArrayList<model_dao>)list; %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스 연동 IOC 형태 - dbquery.java (controller)</title>
</head>
<body>
<!-- controller에서 model값으로 보내준 클래스명으로 var로 변환하며 key로 출력시킴 -->
<z:forEach items="${pso}" var="test">
고객명 :  ${test.mnm} <br>
고객전화번호 : ${test.mtel }<br>
</z:forEach>
</body>
</html>