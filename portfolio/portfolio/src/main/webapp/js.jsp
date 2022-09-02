<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Js 이벤트 핸들링 추가 설명ㄴ</title>
<script src="admin/ckeditor/ckeditor.js"></script>
</head>
<body>
<input type="text" id="aaa" onkeyup="abc()">
<br>
<br>
<br>
<input type="text" id="bbb" onkeyup="plus(this.value)" list="op"> <br>
<input type="text"id="ccc" onkeyup="plus(this.value)"> <br>
<input type="text" id="code" readonly list="op">
<br>
 <!-- 
onkeyup : 키보드의 키를 누르고 나서 띄웠을때 반응 (한자키, 한영변환 반응을 안함)
onkeydown : 키보드의 키를 누를때 반응 (한자키, 한영변환 반응을 안함)
onkeypress : 키보드의 키를 누를때 반응 (특수키는 반응을 안함)
 -->
 <input type="text" id="ddd" onkeyup="abc()" onmouseover="bbb();"> <br> 
 <!-- 
 datalist 태그와 함께 사용을 하지만 onkeyup 이벤트는
 지속적으로 작용하게 됩니다.
 단, select일 경우 onkey 이벤트는 절대 사용하지 않습니다.
 -->
 <input type="text" id="ddd" onkeyup="plus()" list="op"> <br>
<br>
<datalist id="op">
<option>1</option>
<option>2</option>
<option>3</option>
</datalist>
<br>
 <br>
<input type="text" id="code" readonly="readonly"> <br>
<form name="f" id="f" method="post">
<textarea id="contents"></textarea>
<div style="width:150px; height:150px;">
<img alt="이미지 없음" src="./admin/product_img/orange.jpg" style="object-fit:cover;">
<img alt="이미지 없음" src="C:/portfolio/portfolio/src/main/webapp/admin/product_img/orange.jpg" style="object-fit:cover;">
</div>
<input type="button" value="전송" onclick="ck()">
</form> 
</body>
<script>
CKEDITOR.replace("contents"); // editor api를 적용
function ck(){
	var ct = CKEDITOR.instances.contents.getData();
	//ckeditor는 별도의 instances를 가져와서 값을 검토를 해야 합니다.
	if(ct==""){
		alert("내용을 입력해 주세요.");
	}
	else{
		f.submit();
	}
}
function abc(){
	var a = document.getElementById("aaa").value;
	console.log(a);
}
function bbb(){
	alert("test");
}
function plus(){
	var aa = document.getElementById("bbb").value
	var bb = document.getElementById("ccc").value
	var z = aa+bb;
	document.getElementById("code").value=z;
}
</script>
</html>