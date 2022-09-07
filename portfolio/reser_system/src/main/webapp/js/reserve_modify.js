function rp() {
	location.href="./reserve_info.html?rnumber="+f.rnumber.value;
}
function np1() {
	var num_ck = /[^0-9]/g;
	var email_ck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/g;
	if(f.rtel.value==""){
		alert("연락처를 입력해 주세요.");
		f.rtel.focus();
	}
	else if(f.remail.value==""){
		alert("이메일을 입력해 주세요.");
		f.remail.focus();
	}
	else if(f.rpeople.value==""){
		alert("인원수를 입력해 주세요.");
		f.rpeople.focus();
	}
	else if(f.rarrival.value==""){
	alert("도착시간을 입력해 주세요.");
		f.rarrival.focus();
	}
	else{
		if(num_ck.test(f.rtel.value)==true){
		alert("숫자만 입력해 주세요.");
		f.rtel.focus();
		}
		else if(email_ck.test(f.remail.value)==false){
		alert("숫자만 입력해 주세요.");
		f.remail.focus();
		}
		else if(num_ck.test(f.rpeople.value)==true){
		alert("숫자만 입력해 주세요.");
		f.rpeople.focus();
		}
		else if(f.rpeople.value<1 || f.rpeople.value>20){
		alert("인원은 1 ~ 20명까지만 입력 가능합니다.");
		f.rpeople.focus();
		}
		else{
		f.method="post";
		f.action="./modify_ok.do";
		f.enctype="application/x-www-form-urlencoded";
		f.submit();
		}
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