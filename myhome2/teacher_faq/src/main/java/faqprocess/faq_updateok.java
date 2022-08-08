package faqprocess;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class faq_updateok extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public faq_updateok() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		try {
			dbcon db = new dbcon();
			Connection con = db.cafe24();
			String idx = request.getParameter("fidx");
			String fcate = request.getParameter("fcate");
			String faq_qc = request.getParameter("faq_qc");
			String faq_aw2 = request.getParameter("faq_aw2");
			String faq_view = (String)request.getParameter("faq_view").intern();
			String faq_view2 = "N"; 
			if(faq_view=="Y") {
				faq_view2 = "Y";
			}
			System.out.println(faq_view2);
			String sql = "update faq_board set faq_view='"+faq_view2+"', fcate='"+fcate+"',faq_qc='"+faq_qc+"',faq_aw='"+faq_aw2+"' where fidx='"+idx+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			int n = 0;
			n = ps.executeUpdate();
			if(n>0) {
				con.close();
				pw.print("<script>"
						+ "alert('FAQ 수정이 완료 되었습니다.');"
						+ "location.href='./faq_list.html';"
						+ "</script>");
			}
			else {
				throw new Exception("error");
			}
		
		}
		catch(Exception e) {
			pw.print("<script>"
					+ "alert('올바른 접근이 아닙니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
	}

}
