package admin_product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_category_write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public admin_category_write() {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	admin_category_select acs = new admin_category_select();
    	String msg1 = "";
    	String msg2 = "";
    	String msg3 = "";
    	acs.category_select(msg1,msg2,msg3);
    	ArrayList<Map<String,Object>> list = acs.list();
    	req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("./admin_category_write.jsp");
 		rd.forward(req, resp);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
