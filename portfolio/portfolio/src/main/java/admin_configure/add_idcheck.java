package admin_configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class add_idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public add_idcheck() {

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("admin_id").intern();
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pr = response.getWriter();		
		Connection ct = null;
		String ck = "false";
		try {
			admin_siteinfo_select ass = new admin_siteinfo_select();
			ArrayList<admin_siteinfo_select> se = ass.selectdata();
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from admin_add where admin_id='"+id+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			String idcheck ="";
			while(rs.next()) {
				idcheck = rs.getString("admin_id");
			}
			if(idcheck!="") {
				ck="true";
			}else if(id=="admin"||id=="master") {
				ck="true";
			}
			pr.print(ck);
			ct.close();
		} catch (Exception e) {
			pr.write("<script>alert('DB연결 오류'); history.go(-1)</script>");
		}
	}

}
