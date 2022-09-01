package admin_product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;


public class admin_category_delok extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
   
    public admin_category_delok() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=utf-8");
		String delck = request.getParameter("cate_delck");
		String msg = null;
    	pr = response.getWriter(); 
		if(delck!=null||delck!=""||delck!="null") {
    		admin_category_delete acd = new admin_category_delete();
    		acd.category_delete(delck);
    		msg=acd.call_sign().intern();
    	}
    	if(msg=="success") {
    		pr.write("<script>alert('카테고리를 성공적으로 삭제하였습니다.'); "
    				+ "location.href='./admin_category.html';</script>");
    	}
    	else if(msg=="fail"){
    		pr.write("<script>alert('카테고리 삭제를 실패했습니다.');"
    				+ " history.go(-1)</script>");
    	}
	}

}
