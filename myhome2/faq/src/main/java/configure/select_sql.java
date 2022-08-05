package configure;

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
	

	
	public String getFidx() {
		return fidx;
	}
	public void setFidx(String fidx) {
		this.fidx = fidx;
	}
	public String getFcategory() {
		return fcategory;
	}
	public void setFcategory(String fcategory) {
		this.fcategory = fcategory;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getF_qtext() {
		return f_qtext;
	}
	public void setF_qtext(String f_qtext) {
		this.f_qtext = f_qtext;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getF_indate() {
		return f_indate;
	}
	public void setF_indate(String f_indate) {
		this.f_indate = f_indate;
	}
	
	public ArrayList<select_sql> viewdata () throws ClassNotFoundException, SQLException {
		ArrayList<select_sql> list = new ArrayList<select_sql>();
		select_sql ss = new select_sql();
		dbconfig db = new dbconfig();
		Connection conn = db.cafe24();
		String sql = "select * from faq_list order by faq_list desc";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			ss.setFidx(rs.getString("fidx"));
			ss.setFcategory(rs.getString("fcategory"));
			ss.setFname(rs.getString("fname"));
			ss.setF_qtext(rs.getString("f_qtext"));
			ss.setCheck(rs.getString("f_check"));
			ss.setF_indate(rs.getString("f_indate"));
			list.add(ss);
		}
		return list;
	}
	
}
