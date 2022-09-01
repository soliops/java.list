package admin_product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_category extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public admin_category() {
       
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=utf-8");
    	String cate = req.getParameter("cate_search");
    	String search = req.getParameter("p_search");
    	String pgno = req.getParameter("page");
    	
    	admin_category_select acs = new admin_category_select();
    	acs.category_select(cate,search,pgno);
    	ArrayList<Map<String,Object>> list = acs.list(); 
    	ArrayList<Object> page_data = acs.page_data();
    	req.setAttribute("list", list);
    	req.setAttribute("page_data", page_data);
		RequestDispatcher rd = req.getRequestDispatcher("./admin_category.jsp");
 		rd.forward(req, resp);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
