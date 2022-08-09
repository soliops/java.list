<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//CORS : 도메인 및 IP가 다를 경우 외부에서 .json을 가져가지 못합니다.
	response.addHeader("Access-Control-Allow-Origin","*");
// * : 모든 IP를 받겠다는 것, 특정 IP만 입력하면 특정 IP만 받는다
	response.addHeader("Access-Control-Allow-Credentials", "true");
//모든 IP를 허용한다는 의미?
	//response.addHeader : .bashrc(서버) 입력하게 되어 있음
	//JSP에 코드를 입력해서 Access-Control-Allow 이용해서 허락을 적용함
	
	//A서버에서 자신의 서버로 적용시 허락된 파라미터명 + 파라미터 값을 확인함
	String aa =request.getParameter("apikey").intern();
	if(aa=="abcd"){
	String arr[][] = {
			{"hong","홍길동"},
			{"park","박찬호"}
	};
	//json으로 만드는 건 put 배열로 만드는 건 add
	JSONArray ar = new JSONArray(); 
	//JSONArray는 각각의 배열로 만들어진 데이터를 그룹화[]하여
	//값을 저장하는 클래스입니다.
	for(int k=0;k<arr.length;k++){
		JSONObject js = new JSONObject();
		js.put("mid",arr[k][0]);
		js.put("mname",arr[k][1]);		
		ar.add(js);
	}
	out.print(ar); //배열값을 전송시켜줌
	}
%>