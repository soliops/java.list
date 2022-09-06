package reserve_modify;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reserve_info.info_select;

public class modify_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public modify_ok() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = response.getWriter();
    	info_select iv = new info_select();
    	String rnumber = request.getParameter("rnumber");
    	ArrayList<info_select> al1 = iv.select(rnumber);
    	ArrayList<String> al = new ArrayList<String>();
    	Enumeration<String> em = request.getParameterNames();
    	while(em.hasMoreElements()) {
			String a = (String)em.nextElement();
			String b = request.getParameter(a);
			if(a.equals("rarrival")) {
				b = al1.get(0).getRarrival().substring(0,10)+" " + b + al1.get(0).getRarrival().substring(16,19);
			}
			al.add(b);
		}
    	al.add("0001-01-01 01:00:00");
    	modify_update mu = new modify_update();
    	if(mu.update(al)) {
    		out.print("<script>alert('수정성공');location.href='./reserve_modify.html?rnumber="+rnumber+"';</script>");
    	}
    	else {
    		out.print("<script>alert('수정실패');history.go(-1);</script>");
    	}
	}

}
