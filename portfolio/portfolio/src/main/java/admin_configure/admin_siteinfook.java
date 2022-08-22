package admin_configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_siteinfook extends HttpServlet {
	PrintWriter ps = null;
	private static final long serialVersionUID = 1L;
       
    public admin_siteinfook() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		Enumeration<String> em = request.getParameterNames();
		ArrayList<String> config_list = new ArrayList<String>();
			while(em.hasMoreElements()) {
			String config_check= (String) em.nextElement();
			String emcheck = request.getParameter(config_check);
			config_list.add(emcheck);
		}
		this.ps=response.getWriter();		
		String msg = null; 
		try {
			admin_siteinfo_select ass = new admin_siteinfo_select();
			ArrayList<admin_siteinfo_select> selectdata = ass.selectdata();
			if(selectdata.size()==0) {				
			admin_siteinfo_insert asi = new admin_siteinfo_insert();
			asi.siteinfo_insert(config_list);
			msg = asi.call_sign().intern();
			}
			else {				
			admin_siteinfo_update asu = new admin_siteinfo_update();
			asu.siteinfo_update(config_list);
			msg= asu.call_sign().intern();
			}
			if(msg=="success") {
				this.ps.print("<script>alert('설정이 저장되었습니다.'); location.href='./admin/admin_config.html';</script>");
			}
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			this.ps.print("<script>alert('설정 저장에 실패하였습니다.'); history.go(-1);</script>");
		}
	}

}
