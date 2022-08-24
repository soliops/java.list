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


public class delete2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public delete2() {

    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		int n =0;
		dbconfig db = null;
		Connection con = null;
		String ridx="4";
		try {
			db= new dbconfig();
			con = db.getConnection();
			String sql = "delete from reservation where ridx=?;";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ridx);
						
			ps.executeUpdate();
			pw.write("정상적으로 삭제되었습니다.");
		
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
