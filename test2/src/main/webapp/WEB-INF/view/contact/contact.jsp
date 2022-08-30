<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- tiles.apache.org : backend가 유일하게 페이지 레이아웃을 구성하는
라이브러리가 있습니다.
   
tiles 라이브러리를 꼭 POM.XML에 추가 하시고, and tiles.xml를 생성하여
적용해 주도록 합니다. 단, class에 경로 사용시 /가 아닌, .으로 설정 하셔야 합니다.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
</head>
<body>
<!-- header -->
<tiles:insertAttribute name="header"></tiles:insertAttribute>
<section style="background-color:orange;">
고객센터 메인
</section>
<!-- footer -->
<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</body>
</html>