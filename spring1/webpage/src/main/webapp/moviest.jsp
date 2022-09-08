<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일별 영화순위 공작소 + movie_api.java</title>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="80">순위</th>
<th width="200">영화제목</th>
<th width="100">누적관객수</th>
</tr>
</thead>
<tbody id="listview">
<tr>
<td>순위</td>
<td>영화제목</td>
<td>누적관객수</td>
</tr>
</tbody>
</table>
</body>
<script>
/* Front(AJAX)는 apikey와 날짜를 파라미터에 적용하여 GET으로 전달 */
var today = "2022-09-07"; //mysql 저장된 날짜
var ajax = new XMLHttpRequest();
ajax.open("GET","http://localhost:8080/webpage/movie?apikey=movie_opete95&apidate="+today,true);
ajax.send();

ajax.onreadystatechange = function (){
	if(ajax.status==200 && ajax.readyState ==XMLHttpRequest.DONE){
		var mdata = JSON.parse(ajax.response);
// 		var mdata = ajax.response;
// 		var mdata2 = mdata.replaceAll(/\./gi," ");
// 		console.log(mdata2);
		html_print(mdata);
	}
}
function html_print(mdata){
	var pt =document.getElementById("listview");
	var ea = mdata.length;
	var icon = ""; //신규진입한 영화 아이콘
	var htmlcode="";
	var k=0;
	do{
		if(mdata[k]['arankpart']=="NEW"){
			icon = "[신규]";
		}
		else{
			icon="";
		}
		htmlcode+="<tr>";
		htmlcode+="<td>"+mdata[k]["arank"]+"</td>";
		htmlcode+="<td>"+mdata[k]["anm"]+icon+"</td>";
		htmlcode+="<td>"+Number(mdata[k]["aperson"]).toLocaleString()+" 명"+"</td>";
		htmlcode+="</tr>";
		k++;
		}while(k<ea);
	pt.innerHTML = htmlcode;
}
</script>
</html>