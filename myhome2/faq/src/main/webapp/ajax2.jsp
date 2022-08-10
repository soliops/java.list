<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일차 - Jquery Ajax - 그래프+타이머+배열</title>
<script src="./js/jquery.js"></script>
<script>
$(function(){
	$.fn.weather = function(){
		var $apikey = "qwer1234";
		$.ajax({
			url:"./ajax2_ok.jsp", //외부에서도 접속 할 수 있도록 하기 위해서는 JSON, JSP 값을 받도록 합니다.
			cache:false,
			dataType:"HTML", //JSON, XML파일 외에는 모두 html로 적용해야 합니다.
			data:{apikey:$apikey}, //데이터 통신을 위해서 APIKEY를 확인
			type:"GET",
			success:function($data){
				//JSON 파일이 아닌 이상은 parseJSON을 이용해서 파서 해야만 배열로 인식
				var $jdata = jQuery.parseJSON($data); //JS JSON.parse();
				$.fn.ani($jdata);
// 				console.log($jdata);
			},
			error:function(){
				console.log("AJAX 통신오류");
			}
		})
		setTimeout($.fn.weather,5000); //매 5초마다 데이터를 로드하게 됨
	}
	setTimeout($.fn.weather,5000); //최초 실행시 적용되는 부분
	
	$.fn.ani = function($jdata){
		var $w=0;
 		do{ 
		var $area = $jdata[$w]["area"];
		var $areanum = $jdata[$w]["areanum"];			
// 		$("#dataload>span:eq(0)>ul>li:eq(1)").css("width",$areanum*2 +"px");
		$("#dataload>span:eq("+$w+")>ul>li:eq(1)").animate({
			"width":$areanum*2+"px"
		},500);
		$w++;
		}while($w<$jdata.length);
		
	}
})
</script>
</head>
<body>
<p>각 지역구 강수량</p>
<div id="dataload" style="width:800px; height:500px; border-left:1px solid black; border-bottom:1px solid black;">
<span style="display:block; width:inherit; height:50px;">
<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
  <li style="height:25px;">강동구</li>
  <li style="width:0px; height:25px; background-color: purple;"></li>
</ul>
</span>

<span style="display:block; width:inherit; height:50px;">
<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
  <li style="height:25px;">중남구</li>
  <li style="width:0px; height:25px; background-color:green;"></li>
</ul>
</span>

<span style="display:block; width:inherit; height:50px;">
<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
  <li style="height:25px;">강남구</li>
  <li style="width:0px; height:25px; background-color:orange;"></li>
</ul>
</span>

<span style="display:block; width:inherit; height:50px;">
<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
  <li style="height:25px;">동대문구</li>
  <li style="width:0px; height:25px; background-color:blue;"></li>
</ul>
</span>

<span style="display:block; width:inherit; height:50px;">
<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
  <li style="height:25px;">중구</li>
  <li style="width:0px; height:25px; background-color:skyblue;"></li>
</ul>
</span>

<span style="display:block; width:inherit; height:50px;">
<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
  <li style="height:25px;">성동구</li>
  <li style="width:0px; height:25px; background-color:yellowgreen;"></li>
</ul>
</span>


</div>
</body>
</html>