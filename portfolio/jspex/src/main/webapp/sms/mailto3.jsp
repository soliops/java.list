<%@page import="test.se"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.util.*"%>
<%@page import="javax.mail.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    String admin = request.getParameter("admin");
    String postmail = request.getParameter("postmail");
    String subject = request.getParameter("postsubject");
    String postmsg = request.getParameter("postmsg");
    
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
		msg.setText("인증코드번호 : ");
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
<title>메일 발송(CKeditor)</title>
<script src="../ckeditor/ckeditor.js"></script>
</head>
<body>
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
</body>
<script>
CKEDITOR.replace("postmsg");
</script>
</html>