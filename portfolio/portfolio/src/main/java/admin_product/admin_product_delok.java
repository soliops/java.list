package admin_product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_product_delok extends HttpServlet {
	PrintWriter pr = null;

	private static final long serialVersionUID = 1L;
       
   
    public admin_product_delok() {
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=utf-8");
		String delck = request.getParameter("product_delck");
		String msg = null;
    	pr = response.getWriter(); 
		if(delck!=null||delck!=""||delck!="null") {
    		admin_product_delete apd = new admin_product_delete();
    		apd.product_delete(delck);
    		msg=apd.call_sign().intern();
    	}
    	if(msg=="success") {
    		pr.write("<script>alert('상품을 성공적으로 삭제하였습니다.'); "
    				+ "location.href='./admin_product.html';</script>");
    	}
    	else if(msg=="fail"){
    		pr.write("<script>alert('상품 삭제를 실패했습니다.');"
    				+ " history.go(-1)</script>");
    	}
	}

}
