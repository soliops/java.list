package reservation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class select2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public select2() {

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
			db = new dbconfig();
			con = db.getConnection();
			String sql = "select * from reservation where rnm=? and rtel=? and rno=?;";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "세종대왕");
			ps.setString(2, "01076543210");
			ps.setString(3, "987654");
			
			ResultSet rs = ps.executeQuery();
			ArrayList<String> al = new ArrayList<String>();
			while(rs.next()) {
				al.add(0,rs.getString("rnm"));
				al.add(1,rs.getString("remail"));
				al.add(2,rs.getString("rtel"));
			}
			req.setAttribute("rnm", al.get(0));
			req.setAttribute("remail", al.get(1));
			req.setAttribute("rtel", al.get(2));
			RequestDispatcher rd = req.getRequestDispatcher("./view.jsp");
			rd.forward(req, resp);
			
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
