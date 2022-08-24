package admin_configure;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class notice_list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public notice_list() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		String del_data = request.getParameter("del");
		String del_list = del_data.replaceAll(",","");
		notice_list_delete nld = new notice_list_delete();
		nld.notice_list(del_list);
		String msg = nld.call_sign();
		if(msg=="success") {
			pw.print("<script>alert('선택된 공지 사항이 삭제되었습니다'); location.href='./admin_notice.html';</script>");
		}
		else {
			pw.print("<script>alert('공지 사항 삭제에 실패했습니다.'); history.go(-1);</script>");			
		}
	}

}
