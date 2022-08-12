package admin_configure;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginok extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
    
    public loginok() {
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		this.pr = response.getWriter();
		timer time = new timer();
		String admin_indate = time.now_datetime();
		try {
		String id = request.getParameter("admin_log_id").intern();
		String pw = request.getParameter("admin_log_pw").intern();
			login_check lc = new login_check();
			String[] data = lc.logindata(id,pw);
//			String id_check = data[0];
//			String pw_check = data[1];
			if(id== data[0] && pw== data[1]) {
				pr.print("<script>alert('로그인에 성공하셨습니다.');"
//						+ "location.href='./admin_main.html?admin_id="+data[0]+"';"
						+ "</script>");
			}
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			pr.print("<script>alert('로그인 오류');"
					+ "history.go(-1);"
			+ "</script>");
		}
	}

}
