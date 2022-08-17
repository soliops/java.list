<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ taglib prefix="jh" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="no1" required="true" type="java.lang.String"%>
<%@ attribute name="no2" required="false"%>
<!-- 
attribute는 JSP에서 값을 가져올때 사용하는 문법 입니다. name으로 태그에 있는
값을 가져옴 type 값을 가져올 때 자료형을 말합니다.
required : true (자료형을 무조건 사용), false(자료형과 관계없이 사용)
 -->
<!--
variable : 출력 여부 및 변수이름을 추가 할 때 사용합니다.(return에 사용할 이름)
variable-class : 자료형을 구분하게 됨. 단, required가 false일 경우 사용하지 않으셔도 됩니다.
scope는 출력 형태
AT_END는 태그 종료 후 출력
AT_BEGIN은 태그 시작에 초기값을 입력 받아 출력
NESTED는 forEach 사용시 적용하게 됩니다.
  -->
<%@ variable name-given="returncall" variable-class = "java.lang.String" scope="AT_END"%>
<%@ variable name-given="returncall2" scope="AT_END"%>

<jh:set var = "returncall" value="${no1}"></jh:set>
<jh:set var = "returncall2" value="${no2}"></jh:set>

