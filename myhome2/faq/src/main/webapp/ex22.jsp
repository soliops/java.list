<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - JAVA + JSP</title>
<%! 
	Package aaa;
	//JAVA 코드 (class,method) - Module
	public class abc{
		String a = "홍길동";
		String b = "이순신";
		String zz = null;
	
		public String[] getter(){ //getter

			ArrayList<String> ar = new ArrayList<String>();
			String[] data = {a,b};
			ar.add(a);
			ar.add(b);
			return data;
		}
		public void setter (String z){ 
		//setter에 값을 적용 후 전산처리/산술처리가 완료 되면 this로 값을 보냄
			this.zz = z;
		}
		public String getter2 (){
		//JSP에 출력 역할
			return this.zz;
		}
}		

%>
<%
//JSP에서 JAVA를 로드해서 사용함
		abc aa = new abc(); //Controller
		String result[] = aa.getter();
		request.setAttribute("result0", result[0]);
		request.setAttribute("result1", result[1]);				

		aa.setter("유관순");
		String name2 = aa.getter2();
%>
</head>
<!-- View -->
<body>
고객명 : <%=result[0] %> <br>
고객명 : <%=result[1]%> <br> <br>

고객명 : ${result0} <br>
고객명 : ${result1} <br>
고객명 : <%=name2%>
</body>
</html>