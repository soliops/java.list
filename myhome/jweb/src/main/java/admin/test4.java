package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test4 extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
   
    public test4() {
       
    }

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		int radio = Integer.parseInt(request.getParameter("ck"));
		this.pr = response.getWriter();
		switch(radio) {
		case 0:
			//response.sendRedirect() : 강제 페이지 이동
			response.sendRedirect("http://www.naver.com");
			break;
		case 1:
			response.sendRedirect("http://daum.net");
			break;
		case 2:
			this.pr.print(radio);
			break;
		case 3: //도서상품권
			this.pr.print("<script>alert('해당 결제사항은 시스템 점검에 있습니다.'); history.go(-1);</script>");
			break;
		case 4:
			this.pr.print(radio);
			break;
		}
		

	}

}
