package admin_product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class product_writeok extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       

    public product_writeok() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		this.pr = response.getWriter();
		Enumeration<String> em = request.getParameterNames();
		ArrayList<String> ar = new ArrayList<String>();
		String ck_msg =null;
		String api_msg = null;
		while(em.hasMoreElements()) {
			String allcheck = em.nextElement();
			String emcheck=request.getParameter(allcheck);
			ar.add(emcheck);
		}
		System.out.println(ar);
		try {
		admin_product_check apc = new admin_product_check();
		apc.code_check(ar.get(2));
		ck_msg= apc.call_sign().intern();
		if(ck_msg=="success") {
			pr.write("<script>alert('사용 가능한 상품코드입니다.'); history.go(-1)</script>");
		}
		else if(ck_msg=="fail"){
			pr.write("<script>alert('사용 불가능한 상품코드입니다. 다른 코드를 입력해 주세요'); history.go(-1);</script>");
		}
		else {
			admin_product_insert api = new admin_product_insert();
			api.product_insert(ar);
			api_msg=api.call_sign().intern();
			if(api_msg=="success") {
				pr.write("<script>alert('상품 등록이 완료되었습니다.'); location.href='./admin_product.html';</script>");
			}
			else {
				pr.write("<script>alert('상품 등록을 실패했습니다.'); location.href='./admin_product_write.html';</script>");
			}
		}
		}
		catch(Exception e) {
			this.pr.write("<script>alert(DB 저장 오류입니다.); location.href='./admin_product_write.html';</script>");
		}
	}

}
