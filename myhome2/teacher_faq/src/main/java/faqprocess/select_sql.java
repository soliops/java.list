package faqprocess;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class select_sql {
	private String fidx = null;
	private String fcate = null;
	private String fwite = null;
	private String faq_qc = null;
	private String faq_view = null;
	private String faq_indate = null;
		
	public String getFidx() {
		return this.fidx;
	}
	public void setFidx(String fidx) {
		this.fidx = fidx;
	}
	public String getFcate() {
		return this.fcate;
	}
	public void setFcate(String fcate) {
		this.fcate = fcate;
	}
	public String getFwite() {
		return this.fwite;
	}
	public void setFwite(String fwite) {
		this.fwite = fwite;
	}
	public String getFaq_qc() {
		return this.faq_qc;
	}
	public void setFaq_qc(String faq_qc) {
		this.faq_qc = faq_qc;
	}
	public String getFaq_view() {
		return this.faq_view;
	}
	public void setFaq_view(String faq_view) {
		this.faq_view = faq_view;
	}
	public String getFaq_indate() {
		return this.faq_indate;
	}
	public void setFaq_indate(String faq_indate) {
		this.faq_indate = faq_indate;
	}
	
	public ArrayList<select_sql> viewdata(){
		ArrayList<select_sql> list = new ArrayList<>();
		try {
			dbcon db = new dbcon();
			Connection con = db.cafe24();
			String sql = "select * from faq_board order by faq_indate desc";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
			select_sql ss = new select_sql();
			ss.setFidx(rs.getString("fidx"));
			ss.setFcate(rs.getString("fcate"));
			ss.setFwite(rs.getString("fwrite"));
			ss.setFaq_qc(rs.getString("faq_qc"));
			ss.setFaq_view(rs.getString("faq_view"));
			ss.setFaq_indate(rs.getString("faq_indate"));
			list.add(ss);
			}
		}
		catch(Exception e) {
			
		}
		return list;
	}
	
}
