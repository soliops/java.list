package reserve;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;


public class reserve_sms {
	static String fmsg = null;
	public void reser_sms(ArrayList<String> data){
		
		String adminmail="opete2012@naver.com";
		String postmail = data.get(4);
		String host = "smtp.naver.com";
		String user="opete2012";
		String pw = "soli5857!@";
		
		Properties pr = new Properties();
		pr.put("mail.smtp.host", host);
		pr.put("mail.smtp.port",587);
		pr.put("mail.smtp.auth",true);
		pr.put("mail.smtp.debug",true);
		pr.put("mail.smtp.socketFactory.port", 587);
		pr.put("mail.smtp.ssl.protocols","TLSv1.2");
		
		Session se = Session.getDefaultInstance(pr,new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, pw);
			}
		});
		try {
			MimeMessage msg = new MimeMessage(se);
			msg.setFrom(new InternetAddress(adminmail,"더조은 펜션"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(postmail));
			msg.setSubject("펜션 예약번호 입니다.");
			msg.setText("예약번호 : "+data.get(8));
			Transport.send(msg);
			this.fmsg="success";
		} catch (Exception e) {
			this.fmsg="fail";
		}
	}
	public String call_sign() {
		return this.fmsg;
	}
}
