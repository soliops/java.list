function reser_now(){
	location.href = "http://192.168.100.209:8080/reser_system/index";
}
function reser_check(){
	location.href='http://192.168.100.209:8080/reser_system/reserve_check.jsp';
}
function all_check(){
 	var name_ck=/^[a-zA-Z가-힣]/g;
 	var num_ck = /^[0-9]/g;
	var email_ck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/g;
	if(name_ck.test(frm.reser_user.value)==false){
		alert("예약자는 한글, 영어만 입력 가능합니다.");
		frm.reser_tel.focus();
		return false;
	}
	else if(num_ck.test(frm.reser_tel.value)==false){
		alert("숫자만 입력해 주세요.");
		frm.reser_tel.focus();
		return false;
	}
	else if(frm.reser_tel.length>11||frm.reser_tel.length<10){
		alert("올바른 연락처를 입력해 주세요.");
		frm.reser_tel.focus();
		return false;
	}	
   	else if(email_ck.test(frm.reser_email.value)==false){
   		alert("올바른 이메일 형식을 입력하셔야 합니다.");
   		frm.reser_email.focus();
   		return false;
   			}
	else if(frm.reser_people.value>20||frm.reser_people.value<1){
		alert("인원은 1 ~ 20명까지만 입력 가능합니다.");
		frm.reser_people.focus();
		return false;
	}
	else{
		return true;
	}
}
function reser_finish(){
	if(frm.reser_date.value==""){
		alert("예약일자를 선택해 주세요.");
		frm.reser_date.focus();
	}
	else if(frm.reser_room.value=="0"){
		alert("객실명을 선택해 주세요.");
		frm.reser_room.focus();
	}
	else if(frm.reser_user.value==""){
		alert("예약자를 입력해 주세요.");
		frm.reser_user.focus();
	}
	else if(frm.reser_tel.value==""){
		alert("연락처를 입력해 주세요.");
		frm.reser_tel.focus();
	}
	else if(frm.reser_email.value==""){	
		alert("이메일을 입력해 주세요.");
		frm.reser_email.focus();	
	}
	else if(frm.reser_people.value==""){
		alert("인원수를 입력해 주세요.");
		frm.reser_people.focus();
	}
	else if(frm.reser_arrival.value==""){
		alert("도착예정시간을 입력해 주세요.");
		frm.reser_arrival.focus();
	}
	else{
		if(all_check()==false){
		}
		else{			
		frm.submit();
		}
	}
}