package ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ex1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ex1() {
       
    }

	//파라미터 전송 & 사용자가 URL을 직접 입력했을 때
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request : Front data
		//response : Backend가 출력하는 data
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		String a = request.getParameter("cal");
		String b = request.getParameter("cal2");
		String job = request.getParameter("job_data");
		PrintWriter pr = response.getWriter();
		pr.print("<html lang='ko'><head>"
				+ "<meta charset='utf-8'>"
				+ "</head>"
				+ "<body>"
				+ "<p>결과값 출력: "+a+"</p>"
				+ "<p>결과값 출력2: "+b+"</p>"		
				+ "<p>선택하신 직업군은 "+job+"입니다."+"</p>"
				+ "</body>"
				+ "</html>");
	}

	//FORM & AJAX(POST)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
