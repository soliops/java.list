function np() {
	var a = document.getElementById("rnumber").value;
	var b = document.getElementById("rname").value;
	var c = document.getElementById("rtel").value;
	var d = document.getElementById("remail").value;
	if(a == ""){
		alert("예약번호를 확인해 주세요");
	}
	else if(b==""){alert("이름을 확인해 주세요");}
	else if(c==""){alert("전화번호를 확인해 주세요");}
	else if(d==""){alert("이메일을 확인해 주세요");}
	else{
		f.method="post";
		f.action = "./check_ok.do";
		f.enctype="application/x-www-form-urlencoded";
		f.submit();
	}
}
function re() {
	location.href="./index.html";
}
function res() {
	location.href="./reserve.html";
}
function ck() {
	location.href="./reserve_check.html";
}