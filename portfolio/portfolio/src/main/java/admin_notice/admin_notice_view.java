package admin_notice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class admin_notice_view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public admin_notice_view() {
       
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String idx = req.getParameter("idx");
    	admin_notice_view_select anvs = new admin_notice_view_select();
    	anvs.view_select(idx);
    	ArrayList<Map<String,Object>> list = anvs.list();
    	req.setAttribute("list", list);
    	RequestDispatcher rd = req.getRequestDispatcher("./admin_notice_view.jsp");
    	rd.forward(req, resp);
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
