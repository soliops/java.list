package admin_product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class cate_writeok extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
  
    public cate_writeok() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		this.pr = response.getWriter();
		Enumeration<String> em = request.getParameterNames();
		ArrayList<String> ar = new ArrayList<String>();
		while(em.hasMoreElements()) {
			String allcheck = em.nextElement();
			String emcheck=request.getParameter(allcheck);
			if(allcheck.equals("classcode")) {				
				if(emcheck.length()==2) {
					emcheck+="00";
				}
			}
			else if(allcheck.equals("cbcate_use")) {
				if(emcheck.equals("Y")) {
					emcheck=request.getParameter("cate_use");
					ar.add(emcheck);
					break;
				}
				else {
					continue;
				}
			}
			ar.add(emcheck);
		}
		try {
		admin_category_write_select acws = new admin_category_write_select();
		acws.category_select(ar);
		String acws_msg = acws.call_sign().intern();
		if(acws_msg=="no1") {
			this.pr.write("<script>"
					+ "alert('이미 있는 대메뉴 코드입니다.');"
					+ "location.href='./admin_category_write.html';"
					+ "</script>");
		}
		else if(acws_msg=="no2") {
			this.pr.write("<script>"
					+ "alert('이미 있는 소메뉴 코드입니다.');"
					+ "location.href='./admin_category_write.html';"
					+ "</script>");

		}
		else {		
			cate_write_insert cwi = new cate_write_insert();
			cwi.write_insert(ar);
			String msg = cwi.call_sign().intern();
			if(msg=="success") {
				this.pr.write("<script>"
						+ "alert('카테고리 등록이 완료되었습니다.');"
						+ "location.href='./admin_category.html';"
						+ "</script>");
			}
			else {
				this.pr.write("<script>"
						+ "alert('카테고리 등록을 실패했습니다.');"
						+ "location.href='./admin_category_write.html';"
						+ "</script>");
			}
		}
		
		} catch (Exception e) {
			this.pr.write("<script>alert(DB 저장 오류입니다.); location.href='./admin_category_write.html';</script>");
		}
		
	}

}
