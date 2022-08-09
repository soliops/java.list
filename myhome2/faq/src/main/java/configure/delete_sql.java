package configure;

import java.sql.*;

public class delete_sql {
	public String delfaq(String idx) {
		String msg = null;
		dbconfig db = null;
		Connection ct = null;
		try {			
			db = new dbconfig();
			ct = db.cafe24();
			String sql = "delete from faq_list where fidx='"+idx+"'";
			PreparedStatement ps = ct.prepareStatement(sql);
			int n = 0;
			n=ps.executeUpdate();
			if(n>0) {
				msg= "success";
			}else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			msg = "fail";
		}
		finally {
			try {
				ct.close();
				
			} catch (Exception e2) {
				System.exit(0);
			}
			
		}
		return msg;
	}
}
