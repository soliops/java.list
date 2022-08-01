package jstest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/jstest1.do")
public class jstest1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    public jstest1() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pr = response.getWriter();
		String id = request.getParameter("mid").intern();
		String pw = request.getParameter("mpass").intern();
		String name = request.getParameter("mname").intern();
		String nick = request.getParameter("mnick").intern();
		String email = request.getParameter("memail").intern();
		String mtel1 = request.getParameter("mtel1").intern();
		String mtel2 = request.getParameter("mtel2").intern();
		String mtel3 = request.getParameter("mtel3").intern();
		String mtel = mtel1 + mtel2 + mtel3;
		String ptel1 = request.getParameter("ptel1").intern();
		String ptel2 = request.getParameter("ptel2").intern();
		String ptel3 = request.getParameter("ptel3").intern();
		String ptel = ptel1 + ptel2 + ptel3;
		String addr_number = request.getParameter("addr_number");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2").intern();
		String addr = addr_number +" " + addr1 +" "+ addr2;

		pr.print("아이디 : "+id+"<br>"
				+"비밀번호 : "+pw+"<br>"
				+"이름 : "+name+"<br>"
				+"닉네임 : "+nick+"<br>"
				+"이메일 : "+email+"<br>"
				+"전화번호 : "+mtel+"<br>"
				+"휴대폰번호 : "+ptel+"<br>"
				+"주소 : "+addr);
	}

}
