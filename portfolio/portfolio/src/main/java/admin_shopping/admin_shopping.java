package admin_shopping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_shopping extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public admin_shopping() {
   
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=utf-8");
    	String pgno = req.getParameter("page");
    	coupon_select cs = new coupon_select();
    	cs.coupon_select(pgno);
    	ArrayList<Map<String,Object>> list = cs.list();
    	ArrayList<Object> page_data = cs.page_data();
    	req.setAttribute("list", list);
    	req.setAttribute("page_data", page_data);
    	RequestDispatcher rd = req.getRequestDispatcher("./admin_shopping.jsp");
    	rd.forward(req, resp);

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
