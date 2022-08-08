package faqprocess;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class faq_view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public faq_view() {

    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		try {
		dbcon db = new dbcon();
		Connection con = db.cafe24();
		String idx = request.getParameter("idx");
		
		String sql2 = "select count(*) from faq_board where fidx='"+idx+"'";
		PreparedStatement ps2 = con.prepareStatement(sql2);
		ResultSet rs2 = ps2.executeQuery();
				
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		//rs.next() : buffer와 동일하게 한번 코드 입력시 값이 소멸합니다.
		if(rs2.next()==false) {	
			//count로 값을 확인합니다. 
			//단, select에 대한 where 부분에 db값이 없을 경우
			pw.write("<script>"
					+ "alert('올바른 접근이 아닙니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		else {
			String sql = "select * from faq_board where fidx='"+idx+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			String fidx = null;
			String fcate = null;
			String fwrite = null;
			String faq_qc = null;
			String faq_aw = null;
			String faq_view = null;
	
			while(rs.next()) {
				fidx = rs.getString("fidx");
				fcate = rs.getString("fcate");
				fwrite = rs.getString("fwrite");
				faq_qc = rs.getString("faq_qc");
				faq_aw = rs.getString("faq_aw");
				faq_view = rs.getString("faq_view");
			}
		
			response.setContentType("text/html;charset=utf-8");
			request.setAttribute("fidx", fidx);
			request.setAttribute("fcate", fcate);
			request.setAttribute("fwrite", fwrite);
			request.setAttribute("faq_qc", faq_qc);
			request.setAttribute("faq_aw", faq_aw);
			request.setAttribute("faq_view", faq_view);
			
			PrintWriter pr = response.getWriter();
			RequestDispatcher rd = request.getRequestDispatcher("/faq_view.jsp");
			rd.forward(request, response);
			
		}
		
		}
		catch(Exception e) {
			
		}
		
		
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
