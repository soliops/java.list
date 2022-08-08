package faqprocess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class faq_writeok extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public faq_writeok() {

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");		
		String fcate = req.getParameter("fcate");
		String fwrite = req.getParameter("fwrite");
		String faq_qc = req.getParameter("faq_qc");
		String faq_aw2 = req.getParameter("faq_aw2");
		String faq_view = req.getParameter("faq_view");
		timer tr = new timer();
		String faq_indate = tr.now_datetime();
		insert_sql is = new insert_sql(fcate, fwrite, faq_qc, faq_aw2, faq_view, faq_indate);
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pr = resp.getWriter();
		try {
			String sign = is.insql().intern();
			if(sign=="ok") {
				pr.write("<script>"
						+ "alert('새로운 FAQ가 등록 되었습니다.');"
						+ "location.href='./faq_list.html';"
						+ "</script>");
			}
			else {
				throw new Exception("error");
			}
		}
		catch(Exception e) {
			pr.write("<script>"
					+ "alert('DB 저장에 문제가 생겼습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		
	}

}
