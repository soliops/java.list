package faqprocess;

import java.sql.Connection;
import java.sql.*;

public class delete_sql {
	
	public String delfaq(String idx) {
		String msg = null;
		Connection ct = null;
		dbcon db = null;
		try {
		db = new dbcon();
		ct = db.cafe24();
		String sql = "delete from faq_board where fidx='"+idx+"'";
		PreparedStatement ps = ct.prepareStatement(sql);
		int n = 0;
		n = ps.executeUpdate();
		if(n > 0) {
			msg = "ok";
		}
		else {
			throw new Exception("error");
		}
		}
		catch(Exception e) {
			msg = "no";
		}
		finally {
			try {
				ct.close();
			}catch(Exception e) {
				System.exit(0);
			}
		}
		return msg;
	}
	
	
}
