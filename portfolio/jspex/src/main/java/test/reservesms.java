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


public class reservesms extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public reservesms() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		String mid = request.getParameter("mid");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		
		String host="smtp.naver.com";
		String user="opete2012";
		String pass="soliops5857!@";
		String useremail="opete2012@naver.com";
		String subject = "펜션 예약 정보 입니다.";
		String renumber = "";
		for(int w=0; w<11;w++) {
			int num = (int)(Math.random()*10);
			if(w==4) {
				renumber+=num+"-";
			}else {
				renumber+=num;
			}
		}
		
		
		Properties pr = new Properties();
		pr.put("mail.smtp.host",host);
		pr.put("mail.smtp.port",587);
		pr.put("mail.smtp.auth",true);
		pr.put("mail.smtp.debug",true);
		pr.put("mail.smtp.socketFactory.port",587);
		pr.put("mail.smtp.ssl.protocols","TLSv1.2");
		
		Session se = Session.getDefaultInstance(pr,new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,pass);
			}
		});
		
		try {
			MimeMessage msg = new MimeMessage(se);
			msg.setFrom(new InternetAddress(useremail, "펜션"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			msg.setSubject(subject);
			String text = "<span style='display:block; width:300px; height:210px;'>\r\n"
					+ "<ul style=\"list-style:none; width:300px; height:30px; text-align:left; line-height:30px;\">\r\n"
					+ "<li style=\"background-color:black; color:#ccc; text-align:center;\">펜션 예약 정보 입니다</li>\r\n"
					+ "<li>\r\n"
					+ "고객명 : "+mid+" <br>\r\n"
					+ "</li>\r\n"
					+ "<li>\r\n"
					+ "연락처 : "+tel+" <br>\r\n"
					+ "</li>\r\n"
					+ "<li>\r\n"
					+ "이메일 : "+email+"<br>"
					+ "</li>\r\n"
					+ "<li>예약번호 : "+renumber+"</li>"
					+ "<li>\r\n"
					+ "<a href='http://opete95.cafe24.com/index.jsp?number="+renumber+"''>"
							+ "<input type='button' value='입금하기' style='background-color:black; margin-left:100px; color:#ccc;'>"
					+ "</a>"
					+ "</li>\r\n"
					+ "</ul>\r\n"
					+ "</span>";
			msg.setContent(text,"text/html; charset=utf-8");
			Transport.send(msg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
