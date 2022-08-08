package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		dbconfig db = new dbconfig();
		Connection ct = db.cafe24();
		String idx = request.getParameter("idx");
		
		String sql2 = "select count(*) from faq_list where fidx='"+idx+"';";
		PreparedStatement ps2 = ct.prepareStatement(sql2);
		ResultSet rs2 =ps2.executeQuery();
	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		//rs.next() : buffer와 동일하게 한번 코드 입력시 값이 소멸합니다.
		if(rs2.next()==false) { //count로 값을 확인합니다.
			//단, select에 대한 where 
			pr.write("<script>"
					+ "alert('올바른 접근이 아닙니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		else {
			String sql = "select * from faq_list where fidx='"+idx+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			
			String fidx =null;
			String fcategory = null;
			String fname = null;
			String f_qtext = null;
			String f_atext = null;
			String f_check = null;
			String f_indate = null;
			while(rs.next()) {
				fidx = rs.getString("fidx");
				fcategory = rs.getString("fcategory");
				fname = rs.getString("fname");
				f_qtext = rs.getString("f_qtext");
				f_atext = rs.getString("f_atext");
				f_check= rs.getString("f_check");
				f_indate = rs.getString("f_indate");

			}
			request.setAttribute("fidx", fidx);
			request.setAttribute("fcategory", fcategory);
			request.setAttribute("fname", fname);
			request.setAttribute("f_qtext", f_qtext);
			request.setAttribute("f_atext", f_atext);
			request.setAttribute("f_check", f_check);
			request.setAttribute("f_indate", f_indate);

			RequestDispatcher rd = request.getRequestDispatcher("/faq_view.jsp");
			rd.forward(request, response);
		}
	}
	catch (Exception e) {
	}
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
