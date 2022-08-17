<%@ tag language="java"  pageEncoding="UTF-8" body-content="empty"%>
<!-- body-content : 몸체 내용을 처리하는 구성 파일 코드 -->
<%-- empty : 일반 사용 + HTML, JAVA, 태그출력${} 다 사용 가능 --%>
<%-- scriptless : HTML + 태그사용 (JAVA 사용안됨 <% %>) --%>
<!-- tagdependent : HTML +  -->
<%
	request.setCharacterEncoding("UTF-8");
	String user = "홍길동";
%>
<!-- tag파일이며, 라이브러리가 없을 경우 사용하지는 못합니다. -->
<span style="border:1px solid blue"><%=user%>님 환영합니다.</span>

<!-- doBody는 empty에서 별도로 사용하지 않습니다. -->