$(function(){
    $("#reser_date").datepicker();
});

function np() {
		var a = document.getElementById("reser_date").value;
		if(a !=""){
		location.href="./index.html?rtime="+a;
		}
	}
	function re() {
		location.href="./index.html";
	}
	function res() {
		location.href="./reserve.html";
	}
	function ck() {
		location.href = "./reserve_check.html";
	}