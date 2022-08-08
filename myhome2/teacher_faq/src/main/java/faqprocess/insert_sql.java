package faqprocess;

import java.sql.*;

public class insert_sql {

	String fcate = null;
	String fwrite = null;
	String faq_qc = null;
	String faq_aw = null;
	String faq_view = null;
	String faq_indate = null;
	
	public insert_sql(String fcate,String fwrite,String faq_qc,String faq_aw,String faq_view,String faq_indate) {
		this.fcate = fcate;
		this.fwrite = fwrite;
		this.faq_qc = faq_qc;
		this.faq_aw = faq_aw;
		this.faq_view = faq_view;
		this.faq_indate = faq_indate;
	}
	
	public String insql() throws ClassNotFoundException, SQLException {
		
		dbcon db = new dbcon();	
		Connection ct = db.cafe24();		
		String sql = "insert into faq_board values ('0',?,?,?,?,?,?)";
		PreparedStatement ps = ct.prepareStatement(sql);
		ps.setString(1, this.fcate);
		ps.setString(2, this.fwrite);
		ps.setString(3, this.faq_qc);
		ps.setString(4, this.faq_aw);
		ps.setString(5, this.faq_view);
		ps.setString(6, this.faq_indate);
		int n = 0;
		n = ps.executeUpdate();
		String msg = null;
		
		if(n > 0) {
			msg = "ok";
		}
		else {
			msg = "no";
		}
		return msg;
	}
	
	
	
}
