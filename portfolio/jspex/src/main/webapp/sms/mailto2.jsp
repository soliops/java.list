<%@page import="javax.mail.internet.*"%>
<%@page import="test.se"%>
<%@page import="javax.mail.*"%>
<%@page import="java.util.Properties"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String admin = request.getParameter("admin");
    String postmail = request.getParameter("postmail");
    String subject = request.getParameter("postsubject");
    String postmsg = request.getParameter("postmsg");
    
    /* 난수번호 */
    String code = "123456";
    
    Properties pr = new Properties();
	pr.put("mail.smtp.host","smtp.naver.com");
	pr.put("mail.smtp.port",587);
	pr.put("mail.smtp.auth",true);
	pr.put("mail.smtp.debug",true);
	pr.put("mail.smtp.socketFactory.port",587);
	pr.put("mail.smtp.ssl.protocols","TLSv1.2");
	
	try{
		//se.java와 연계하여 Session을 로드하게됨.
		Authenticator at = new se();
		Session se = Session.getDefaultInstance(pr,at);
		//본 코드 = servlet과 동일
		MimeMessage msg = new MimeMessage(se);
		msg.setFrom(new InternetAddress(admin,"관리자"));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(postmail));
		msg.setSubject("인증번호 발송");
		msg.setText("인증코드번호 : "+code);
		Transport.send(msg);
		out.print("<script>alert('인증코드가 발송 되었습니다.\n 인증코드를 확인 하시고 해당 코드를 입력하세요.');</script>");
		}
	catch(Exception e){
	e.getMessage();	
	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인증 확인</title>
</head>
<body>
<form name="f" id="f">
<p>인증번호 확인 : <input type="text" name="user_code" maxlength="6" palceholder="인증번호를 입력해주세요"></p>
<input type="button" value="인증번호 확인" onclick="code_ck();">
</form>
</body>
<script>
function code_ck(){
	var ori_code='<%=code%>';
	var user_code=f.user_code.value;
	if(user_code==""||user_code.length<6){
		alert("해당 코드 6자리를 입력하세요.");
		f.user_code.focus();
	}
	else{
		if(ori_code!=user_code){
			alert("발송된 메일에 인증코드 6자리가 맞지 않습니다.");
		}
		else{
			alert("인증이 완료 되었습니다.");
		}
	}
}
</script>
</html>