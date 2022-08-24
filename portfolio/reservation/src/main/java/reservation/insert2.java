package reservation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class insert2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public insert2() {
       
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		int n =0;
		dbconfig db = null;
		Connection con = null;
		try {
			db = new dbconfig(); //dbconfig.java
			con = db.getConnection(); //dbconfig class =>getConnection() 메소드를 가져옴
			String sql = "insert into reservation values('0',?,?,?,?,?,?,?);";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"세종대왕");
			ps.setString(2,"a123456");
			ps.setString(3,"987654");
			ps.setString(4,"sejong@naver.com");
			ps.setString(5,"01076543210");
			ps.setString(6,"7");
			ps.setString(7,"2022-08-24 08:00:00");
			n= ps.executeUpdate();
			if(n>0){
				pw.print("올바르게 저장되었습니다.");
				con.close();
			}
			else{
				pw.print("올바른 값이 아닙니다.");
			}
		} catch (Exception e) {
		}
		finally {
			try {
			if(n>0) {
				con.close();
			}
			}
			catch(Exception f) {
				
			}
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
