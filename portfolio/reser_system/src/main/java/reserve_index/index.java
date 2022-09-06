package reserve_index;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.datetimer;
import reservation.tools;

public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public index() {
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = resp.getWriter();
    	datetimer date = new datetimer();
    	String rdate = req.getParameter("rtime");
    	out.print(rdate);
    	if(rdate == null||rdate.equals("")) {
    		rdate = date.now_datetime().substring(0,10);
    	}
    	String rname[] = {"그린하우스 봄날","스칼렛하우스 여름","국화하우스 가을","블루베리하우스 겨울"};
    	index_select is = new index_select();
    	
    	ArrayList<index_select> al1  = is.select(rdate, rname[0]);
    	ArrayList<index_select> al2  = is.select(rdate, rname[1]);
    	ArrayList<index_select> al3  = is.select(rdate, rname[2]);
    	ArrayList<index_select> al4  = is.select(rdate, rname[3]);
    	
    	Map<Integer, ArrayList<index_select>> m = new HashMap<Integer, ArrayList<index_select>>();
    	m.put(0, al1);
    	m.put(1, al2);
    	m.put(2, al3);
    	m.put(3, al4);
    	String yn[] = new String[4];
    	
    	
    	if(al1.get(0).getRuse().equals("Y")) {
    		yn[0] = "예약가능";
    	}
    	else {
    		yn[0] = "예약불가";
    	}
    	if(al2.get(0).getRuse().equals("Y")) {
    		yn[1] = "예약가능";
    	}
    	else {
    		yn[1] = "예약불가";
    	}
    	if(al3.get(0).getRuse().equals("Y")) {
    		yn[2] = "예약가능";
    	}
    	else {
    		yn[2] = "예약불가";
    	}
    	if(al4.get(0).getRuse().equals("Y")) {
    		yn[3] = "예약가능";
    	}
    	else {
    		yn[3] = "예약불가";
    	}
    	req.setAttribute("yn", yn);
    	req.setAttribute("m", m);
    	req.setAttribute("time", rdate);
    	RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
    	rd.forward(req, resp);
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
