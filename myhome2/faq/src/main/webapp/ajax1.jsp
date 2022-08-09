<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일차 - AJAX 통신</title>
<script src="./js/jquery.js"></script>
<script>
	function ajax(){
		var id = document.getElementById("mid").value;
		if(id==""){
			alert("아이디를 입력하세요");
			document.getElementById("mid").focus();
		}
		else{
			var aj;
			function wck(){
				if(window.XMLHttpRequest){
					return new XMLHttpRequest();
				}
			}
			function acall(){
			if(aj.readyState==XMLHttpRequest.DONE && aj.status==200){
					console.log(JSON.parse(this.response));
// 				var data = JSON.parse(this.response);
// 					console.log(data);
// 					console.log(data["mid"]);
// 					console.log(data["mname"]);					
// 					console.log(this.response);				
// 				if(this.response=="no"){
// 					alert("해당 아이디는 사용할 수 없습니다.");
// 				}
// 				else{
// 					alert("해당 아이디는 사용가능 합니다.");
// 				}
				}
				
			}
// 			var gopage = "./data.json";
			var gopage="./ajax1_ok.jsp?mid="+id;
			aj = wck();
			aj.onreadystatechange=acall;
			aj.open("GET",gopage,true);
			aj.send();
		}
	}
$(function(){
	$("#ajx").click(function(){
		var $mid = $("#mid").val();
		$.ajax({
// 			url:"./ajax1_ok.jsp",
			url:"http://192.168.100.209:8080/faq/data.jsp",
			data:{apikey:$mid},
			cache:false,
			method:"GET",
			datatype:"text",
			success:function($data){
				console.log($data);
			},
			error:function(){
				console.log("오류");
			}
		});
	});
});	
</script>
</head>
<body>
<input type="text" name="mid" id="mid">
<input type="button" value="중복확인" onclick="ajax();">
<input type="button" value="중복확인-jq" id="ajx">
</body>
</html>