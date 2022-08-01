package ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//web.xml에는 절대 추가하면 안됨
@WebServlet("/ex2.do")
public class ex2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ex2() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter pr = response.getWriter();
	String mid = request.getParameter("mid").intern();
	String mpass = request.getParameter("mpass").intern();
	//intern은 checkbox, radio는 사용하지 않음
	String msex = request.getParameter("msex");
	String sms = request.getParameter("sms");
	//사용자가 입력한 것은 intern()을 적용해도 되는데 
	//마우스로 세팅하는 radio나 checkbox는 intern()을 적용하면 안된다.
	if(sms==null){
		sms="N";
	}
	pr.print("<html><meta charset='UTF-8'><head></head><body>"
			+"<p>아이디 : "+mid+"</p>"
			+"<p>패스워드 : "+mpass+"</p>"
			+"<p>성별 : "+msex+"</p>"
			+"<p>SMS 여부 : "+sms+"</p>"
			+"</body><html>");
//	pr.print(mid+"<br>");
//	pr.print(mpass+"<br>");
//	pr.print(msex+"<br>");
//	pr.print(sms+"<br>");
			
	}

}
