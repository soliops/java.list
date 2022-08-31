package admin_product;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.Response;


public class admin_category extends HttpServlet {
	PrintWriter pr = null;
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
    	String delck = req.getParameter("cate_delck"); 
    	String msg = null;
    	pr = resp.getWriter();  		
    	if(delck!=null||delck!=""||delck!="null") {
    		admin_category_delete acd = new admin_category_delete();
    		acd.category_delete(delck);
    		msg=acd.call_sign().intern();
    	}
    	if(msg=="success") {
    		pr.write("<script>alert('카테고리를 성공적으로 삭제하였습니다.');</script>");
    	}
    	else if(msg=="fail"){
    		pr.write("<script>alert('카테고리 삭제를 실패했습니다.');</script>");
    	}
    	
    	
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
