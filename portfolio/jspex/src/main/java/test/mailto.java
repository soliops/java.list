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
		PrintWriter pwrite = response.getWriter();
		
		
		String admin = request.getParameter("admin");
		String postmail = request.getParameter("postmail");
		String postsubject = request.getParameter("postsubject");
		String postmsg = request.getParameter("postmsg");
		//Properties,Map : 같은 속성임(키값이 있는 배열)
		
		String host="smtp.naver.com";
		String user= "opete95";
		String pw = "soli0423@#";
		
		Properties pr = new Properties();
		pr.put("mail.smtp.host",host);
		pr.put("mail.smtp.port",587);
		pr.put("mail.smtp.auth",true); //메일 전송에 따른 연결 인증절차
		pr.put("mail.smtp.debug",true); //메일 회신 정보 결과
		pr.put("mail.smtp.socketFactory.port", 587); //자신의 PC 포트를 오픈
		pr.put("mail.smtp.ssl.protocols","TLSv1.2"); //TLS 규격 버전
		//SSLv2, SSLv3, TLSv1, TLSv1.2, TLSv1.4, TLSvs1.6 
		
		//비밀번호 생성 ->회원가입(비밀번호)
		Session se = Session.getDefaultInstance(pr,new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("opete2012","soliops5857!@");
			}
		}); 
		try {
			MimeMessage msg = new MimeMessage(se);
			msg.setFrom(new InternetAddress("opete2012@naver.com","관리자")); //송신자 정보
			msg.addRecipient(Message.RecipientType.TO,new InternetAddress(postmail)); //수신자
			msg.setSubject(postsubject);	//setSubject : 수신제목
			String img = "<span style='display:block; border:1px solid #ccc;"
					+ "width:300px; height:30px; text-align:center; line-height:30px'>"
					+ "<a href='http://opete95.cafe24.com/index.jsp?mail='"+postmail+">"
					+ "[인증번호 : 12345678]"
					+ "</a>"
					+ "</span>";
			msg.setContent(img,"text/html; charset=utf-8"); 
			//setContent: text/html을 이용하여 태그를 적용하여 메일 발송하게 됩니다. (HTML 사용가능)
//			msg.setText(img); //setText: 수신내용
			Transport.send(msg); //메일 발송
			System.out.println("전송완료");

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
