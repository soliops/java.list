package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class faq_writeok extends HttpServlet {
	String fcategory =null;
	String fname =null;
	String fqtext =null;
	String fatext = null;
	String indate = null;
	String check =null ; 
	String msg = null;
	PrintWriter pr = null;
	
	private static final long serialVersionUID = 1L;
       
    
    public faq_writeok() {
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		this.fcategory = request.getParameter("choice");
		this.fname = request.getParameter("usernm");
		this.fqtext = request.getParameter("faq_qtext");
		this.fatext = request.getParameter("faq_atext");
		timer time = new timer();
		this.indate = time.now_datetime();
		this.check = null;
		if(check!=null) {
			check="N";
		}
		else {
			check="Y";
		}
		String[] data  = {"faq_list",this.fcategory,this.fname,this.fqtext,this.fatext,this.check,this.indate};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(data));
//		insert_sql ins = new insert_sql(fcategory, fname, fqtext, fatext, indate, check);
//		insert_sql ins = new insert_sql(list);
	
		response.setContentType("text/html; charset=utf-8");
		this.pr = response.getWriter();
		
		try {
			faq_config fc = new  faq_config();
			fc.insert(list);
			this.msg = fc.call_sign().intern();
			if(this.msg=="success") {
			this.pr.write("<script>"
					+ "alert('FAQ 등록이 완료 되었습니다.');"
					+ "location.href='./faq_list.jsp';"
					+ "</script>");
		}else {
			throw new Exception("error");
		}
		}
		catch (Exception e) {
			this.pr.write("<script>"
					+ "alert('DB 저장에 문제가 생겼습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}

		
	}

}
