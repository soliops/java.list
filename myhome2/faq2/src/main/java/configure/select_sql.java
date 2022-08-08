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
	private String f_check= null;
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
	public String getF_check() {
		return this.f_check;
	}
	public void setF_check(String f_check) {
		this.f_check = f_check;
	}
	public String getF_indate() {
		return this.f_indate;
	}
	public void setF_indate(String f_indate) {
		this.f_indate = f_indate;
	}
	
	public ArrayList<select_sql> viewdata() throws ClassNotFoundException, SQLException {
		try {
		this.sel_faqdata = new ArrayList<select_sql>();
		dbconfig db = new dbconfig();
		Connection ct = db.cafe24();
		String sql = "select * from faq_list order by fcategory asc;";

		// order by faq_list desc;
		PreparedStatement pss = ct.prepareStatement(sql);
		ResultSet rs = pss.executeQuery();
		while(rs.next()) {
			select_sql sels = new select_sql();
			sels.setFidx(rs.getString("fidx"));
			sels.setFcategory(rs.getString("fcategory"));
			sels.setFname(rs.getString("fname"));
			sels.setF_qtext(rs.getString("f_qtext"));
			sels.setF_check(rs.getString("f_check"));
			sels.setF_indate(rs.getString("f_indate"));
			this.sel_faqdata.add(sels);
		}
		
		}
		catch(Exception e) {
			
		}
		return this.sel_faqdata;
	}
	
}
