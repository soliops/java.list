package ex;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex4.do")
public class ex4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ex4() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String tel = request.getParameter("usertel").intern();
		response.setContentType("text/html; charset=utf-8");
		/* 5자리 인증번호를 생성하여 회신 */
		if(tel==""||tel==null) {
			response.getWriter().print("error");
		}
		else {
		//Math 사용함
//			String num= "";
//			int w=0;
//			while(w<5) {
//				int pcnum= (int)(Math.random()*10);
//				num +=pcnum;
//				w++;
//			}
//			response.getWriter().print("Math : "+num);
		//Random
			String sc = "";
			Random rd = new Random();
			int ww=0;
			while(ww<5) {
				int i = rd.nextInt(10);
				sc+=i;
				ww++;
			}
			response.getWriter().print(sc);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
