package admin_product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_product extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       

    public admin_product() {
      
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=utf-8");
    	String product = req.getParameter("product_search");
    	String search = req.getParameter("p_search");
    	String pgno = req.getParameter("page");
    	String delck = req.getParameter("product_delck"); 
    	String msg = null;
    	pr = resp.getWriter();  
    	if(delck!=null||delck!=""||delck!="null") {
    		
    	}
    	if(msg=="success") {
    		pr.write("<script>alert('상품을 성공적으로 삭제하였습니다.');</script>");
    	}
    	else if(msg=="fail"){
    		pr.write("<script>alert('상품 삭제를 실패했습니다.');</script>");
    	}
    	admin_product_select aps = new admin_product_select();
    	aps.product_select(product,search,pgno);
    	ArrayList<Map<String,Object>> list = aps.list(); 
    	ArrayList<Object> page_data = aps.page_data();
    	req.setAttribute("list", list);
    	req.setAttribute("page_data", page_data);
		RequestDispatcher rd = req.getRequestDispatcher("./admin_product.jsp");
 		rd.forward(req, resp);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
