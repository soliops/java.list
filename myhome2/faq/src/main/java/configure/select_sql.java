package configure;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class select_sql {
	private String fidx = null;

	private String fcategory = null;
	private String fname= null;
	private String f_qtext = null;
	private String check= null;
	private String f_indate = null;
	public ArrayList<select_sql> sel_faqdata = null;

	
	public String getFidx() {
		return this.fidx;
	}
	public void setFidx(String fidx) {
		this.fidx = fidx;
	}
	public String getFcategory() {
		return this.fcategory;
	}
	public void setFcategory(String fcategory) {
		this.fcategory = fcategory;
	}
	public String getFname() {
		return this.fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getF_qtext() {
		return this.f_qtext;
	}
	public void setF_qtext(String f_qtext) {
		this.f_qtext = f_qtext;
	}
	public String getCheck() {
		return this.check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getF_indate() {
		return this.f_indate;
	}
	public void setF_indate(String f_indate) {
		this.f_indate = f_indate;
	}
	
	public ArrayList<select_sql> viewdata() throws ClassNotFoundException, SQLException {
		this.sel_faqdata = new ArrayList<select_sql>();
		try {
		dbconfig db = new dbconfig();
		Connection conn = db.cafe24();
		String sql = "select * from faq_list order by faq_list desc";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			select_sql ss = new select_sql();
			ss.setFidx(rs.getString("fidx"));
			ss.setFcategory(rs.getString("fcategory"));
			ss.setFname(rs.getString("fname"));
			ss.setF_qtext(rs.getString("f_qtext"));
			ss.setCheck(rs.getString("f_check"));
			ss.setF_indate(rs.getString("f_indate"));
			this.sel_faqdata.add(ss);
		}
		}
		catch(Exception e) {
			
		}
		System.out.println(this.sel_faqdata);
		return this.sel_faqdata;
	}
	
}
