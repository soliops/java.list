<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - Action 태그 활용</title>
</head>
<!-- 
jsp 태그 사용형태 : Server + Client 쪽에 명령을 적용할 수 있음
 -->
<%-- <%@ include %> --%> <!-- 페이지를 불러오기만 함 -->
<%-- <jsp:/> : jsp 액션 태그 --%>
<%-- <jsp:forward page="ex17_1.jsp" />  --%>
<!-- forward : 다른 페이지로 이동과 같은 페이지 흐름을 제어합니다. -->
<!-- jsp 태그 열고,닫기를 해야함 : forward : ex17_1.jsp 값을 가져옴-->
<jsp:include page="ex17_1.jsp" flush="false"/>
<!-- include : 외부 페이지의 내용을 포함하거나 페이지를 모듈화 합니다. -->
<p>테스트 입니다.</p>
</body>
</html>