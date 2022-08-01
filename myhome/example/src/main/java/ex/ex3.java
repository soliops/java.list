package ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex3.do")
public class ex3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ex3() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getRequestDispatcher : servlet에서 해당 파일을 로드할 때 사용합니다. forward (요청, 답변);
		
		request.getRequestDispatcher("./ex3.html").forward(request, response);
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid").intern();
		String mpass = request.getParameter("mpass").intern();
//		response.setContentType("text/html charset=utf-8");
//		PrintWriter pr = response.getWriter();
//		pr.print(mid);
//		pr.print(mpass);
		System.out.println(mid+mpass);
//		if(mid=="hong" &&mpass=="a1234"){
//			response.sendRedirect("longinok.html");
//		}
//		else {
//			response.getWriter().print(
//					"<script>"
//							+"alert('아이디 패스워드를 확인하세요');"
//							+"location.href='./ex3.do';"
//							+"</script>");
//		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
