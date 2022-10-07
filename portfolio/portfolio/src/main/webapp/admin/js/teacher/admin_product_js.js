function pagego(){
var url = "";
var lc="yes";
switch(no){
case"1": //상품 삭제 부분
url="";
break;
case"2": //상품등록 페이지 이동
url="";
break;

case"3":
url="";
break;

case"4":
url="";
break;

case"5":
url="";
break;

case"6":
url="";
break;

case"7":
url="";
break;

case"8":
url="";
break;

case"9": //카테고리 리스트 페이지
url="./admin_category.html";
break;

case"10": //카테고리 생성
lc="no";
make_cate();
break;

}
if(lc=="yes"){
location.href=url;
}
}
function make_cate(){
	alert("test");
}