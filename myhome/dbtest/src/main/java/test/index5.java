package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public index5() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		String idx = request.getParameter("idx");
		try {
			dbconnect db = new dbconnect();
			Connection ct = db.ct();
			//삭제시 고유값 기준으로 삭제를 하게 됩니다. (추후 고유값 + 아이디)
			//단, delete 사용시 where 부분이 중요하며 삭제된 데이터는 백업하지 않을 경우
			//절대 복구가 되지 않음
			String sql = "delete from joinmember where jidx='"+idx+"'";
			PreparedStatement ps = ct.prepareStatement(sql);
			int n =0;
			n= ps.executeUpdate();
			if(n>0) {
				pr.write("<script>alert('정상적으로 삭제가 되었습니다.');location.href='./index5.html';</script>");
			}
			else {
				throw new Exception("error");
			}
		} 
		catch (Exception e) {
			pr.write("<script>alert('올바른 접근이 아닙니다.'); history.go(-1);</script>");
		}
	}

}
