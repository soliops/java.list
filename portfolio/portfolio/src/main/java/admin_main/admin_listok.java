package admin_main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_listok extends HttpServlet {
	PrintWriter pw = null;
	private static final long serialVersionUID = 1L;
       

    public admin_listok() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String admin_id= request.getParameter("admin_id");
		String admin_ck= request.getParameter("admin_check").intern();
		try {
			admin_list_update alu = new admin_list_update();
			alu.list_update(admin_id,admin_ck);
			String msg = alu.call_sign();
			pw = response.getWriter();
			if(admin_ck=="Y" && msg=="success") {
				pw.print("<script>alert('해당 관리자를 승인하였습니다.'); location.href='./admin/admin_main.html';</script>");
			}
			else if(admin_ck=="N" && msg=="success") {
				pw.print("<script>alert('해당 관리자를 미승인하였습니다.'); location.href='./admin/admin_main.html';</script>");
			}
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			pw.print("<script>alert('승인 오류가 발생하였습니다.'); history.go(-1);</script>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
