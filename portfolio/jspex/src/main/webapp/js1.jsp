<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 6일차 session</title>
</head>
<body>
<!-- 
session, cookie : client에 대한 정보를 저장하여 서버와 통신하면서
페이지 이동시 지속적으로 사용 가능하도록 하는 객체
※ chrome에서 session, cookie가 저장 되더라도 Edge에서는 새롭게 등록 되어야함

session : 클라이언트 입력 정보 -> 서버에 저장 -> 브라우저에 저장하는 형태

cookie : 서버에서 생성하여 -> 클라이언트에 저장되어 사용됩니다.

예제) session : 로그인, 메일발송에 대한 정보, 결제정보
cookie : 팝업, 접속자 PC정보

session 단점 : 여러서버에서 공유할 수 없음 (JSP)
cookie 단점 : 정보노출 단계가 낮은 편임 (Javascript, JSP)
 -->
 <a href="js1_1.jsp">session 생성</a>
 <a href="js1_2.jsp">session 확인</a>
 <a href="js1_3.jsp">session 삭제</a>
 
</body>
</html>