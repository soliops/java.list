package admin_notice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class admin_notice_view_delok extends HttpServlet {
	PrintWriter pr =null;
	private static final long serialVersionUID = 1L;
   
    public admin_notice_view_delok() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String idx = request.getParameter("idx");
		try {
		admin_notice_view_delete anvd = new admin_notice_view_delete();
		anvd.view_delete(idx);
		this.pr = response.getWriter();
		String msg = anvd.call_sign().intern();
		if(msg=="success") {
			this.pr.write("<script>alert('공지사항을 성공적으로 삭제하였습니다.');"
					+ "location.href='./admin_notice.html';</script>");
		}
		else if(msg=="fail"){
    		this.pr.write("<script>alert('공지사항 삭제를 실패했습니다.');"
    				+ " history.go(-1)</script>");
    	}
		else {
			throw new Exception();
		}
		}catch(Exception e) {
			this.pr.write("<script>alert('삭제 오류');</script>");
		}
	}

}
