package admin_info;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin_configure.timer;


public class admin_infook extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
   
    public admin_infook() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		this.pr = response.getWriter();
		timer time = new timer();
		Enumeration<String> em = request.getParameterNames();
		ArrayList<String> info_list = new ArrayList<String>();
		String admin_tel = "";
		while(em.hasMoreElements()) {
			String allcheck = (String)em.nextElement();
			String pmcheck = request.getParameter(allcheck);
			if(allcheck.equals("admin_pw2")) {
				continue;
			}
			else if(allcheck.equals("admin_tel1")||allcheck.equals("admin_tel2")) {
				admin_tel+=pmcheck;
				continue;
			}
			else if(allcheck.equals("admin_tel3")) {
				admin_tel+=pmcheck;
				info_list.add(admin_tel);
				continue;
			}
			info_list.add(pmcheck);
		}
		info_list.add(time.now_datetime());
		try {
			admin_info_update aiu = new admin_info_update();
			aiu.info_update(info_list);
			String msg = aiu.call_sign().intern();
			if(msg=="success") {
				this.pr.write("<script>"
						+ "alert('정상적으로 정보 수정이 완료되었습니다.');"
						+ "location.href='./admin_main.html';"
						+ "</script>");
			}
			else {
				throw new Exception();
			}
		}
		catch(Exception e) {
			this.pr.write("<script>"
					+ "alert('DB 저장에 문제가 생겼습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
	}
}
