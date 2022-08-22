package admin_configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class notice_writeok extends HttpServlet {
	PrintWriter pw = null;
	private static final long serialVersionUID = 1L;
       
    
    public notice_writeok() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		this.pw = response.getWriter();
		Enumeration<String> em = request.getParameterNames();		
		ArrayList<String> notice_list = new ArrayList<>();
		notice_list.add("admin_notice");
		while(em.hasMoreElements()) {
			String notice_check=(String) em.nextElement();
			String nocheck=request.getParameter(notice_check);
			if(notice_check.equals("notice_print")) {
			}
			notice_list.add(nocheck);
		}
		timer time = new timer();
		notice_list.add(time.now_datetime());
		String msg=null;
		try {
			notice_write_insert nwi = new notice_write_insert();
			nwi.notice_insert(notice_list);
			msg=nwi.call_sign();
			if(msg=="success") {
				this.pw.print("<script>alert('공지사항 등록이 완료되었습니다.'); location.href='./admin/admin_notice.html';</script>");
			}
			else {
				throw new Exception("error");
			}
		}
		catch(Exception e) {
			this.pw.print("<script>alert('공지사항 등록을 실패했습니다.'); history.go(-1);</script>");			
		}
	}

}
