<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form name="f" id="f" method="post" enctype="application/x-www-form-urlencoded" action="sms/mailto3.jsp">
<div>
<ul>
<li>
<input type="hidden" name="admin" value="opete2012@naver.com">
메일주소(받는분) : <input type="text" name="postmail"> <br>
메일제목 : <input type="text" name="postsubject"> <br>
메일내용 : 
<textarea rows="10" cols="60" name="postmsg"></textarea> <br>
<input type="button" value="전송" onclick="ok();">
 </li>
</ul>
</div>
</form>
<script>
function ok () {
	f.submit();
}
</script>
