package reserve_info;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.datetimer;

@WebServlet("/info")
public class reserve_info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public reserve_info() {
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = resp.getWriter();
    	
    	String rnumber = req.getParameter("rnumber");
    	info_select iv = new info_select();
    	ArrayList<info_select> al = iv.select(rnumber);
    	
    	datetimer date = new datetimer();
    	String time = date.now_datetime().substring(0,10);
    	String rt= req.getParameter("rtime");
    	if(rt!=null) {time=rt;}
    	req.setAttribute("al", al);
    	req.setAttribute("time", time);
    	RequestDispatcher rd = req.getRequestDispatcher("reserve_info.jsp");
    	rd.forward(req, resp);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
