function rp() {
	location.href="./reserve_info.html?rnumber="+f.rnumber.value;
}
function np1() {
	f.method="post";
	f.action="./modify_ok.do";
	f.enctype="application/x-www-form-urlencoded";
	f.submit();
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