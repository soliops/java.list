package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class mailto extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public mailto() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String adminmail = request.getParameter("admin");
		String postmail = request.getParameter("postmail");
		String postsubject = request.getParameter("postsubject");
		String postmsg = request.getParameter("postmsg");
		//Properties,Map : 같은 속성임(키값이 있는 배열)
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port","587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.ssl.turst","stmp.gmail.com");
		try {
			Authenticator auth = new SMTP();
			Session sess = Session.getDefaultInstance(prop,auth);
			Message msg = new MimeMessage(sess);

			msg.setFrom(new InternetAddress("opete95@gmail.com","soliops5857#!","utf-8"));
			msg.addRecipient(Message.RecipientType.TO,new InternetAddress(postmail));
			msg.setSubject(postsubject);
			msg.setContent(postmsg,"text/html;charset=utf-8");
			Transport.send(msg);
		} catch (Exception e) {
			e.getMessage();
		}
		PrintWriter pw = response.getWriter();
		pw.print(prop.toString());
	}
}
