package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pr = response.getWriter();
		try {
		dbconfig db = new dbconfig();
		Connection ct = db.cafe24();
		String idx = request.getParameter("fidx");
		String fcategory = request.getParameter("fcategory");
		String f_qtext = request.getParameter("f_qtext");
		String f_atext = request.getParameter("f_atext");
		String f_check = request.getParameter("f_check").intern();
		String f_check2 = "N";
		if(f_check=="Y") {
			f_check2="Y";
		}
		
		String sql = "update faq_list set fcategory='"+fcategory+"',f_qtext='"+f_qtext+"',f_atext='"+f_atext+"',f_check="+f_check2+"' where fidx='"+idx+"';";
		PreparedStatement ps = ct.prepareStatement(sql);
		int n= 0;
		n=ps.executeUpdate();
		if(n>0) {
			pr.print("<script>"
					+ "alert('FAQ 수정이 완료 되었습니다.');"
					+ "location.href='./faq_list.html';"
					+ "</script>");
		}
		else {
			throw new Exception("error");
		}
		}
		catch (Exception e) {
			pr.print("<script>"
					+ "alert('올바른 접근이 아닙니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
	}

}
