package admin_login;

import java.sql.*;

import admin_configure.dbconfig;

public class login_loghistory {
	
	static String msg = null;
	public void loghistory(String id,String indate) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql ="insert into admin_loghistory values ('0',?,?);";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, indate);
			int n = ps.executeUpdate();
			if (n>0) {
				this.msg="good";
			} 
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			this.msg="fail";
		}
		finally {
			try {
				if(ct!=null) {
					ct.close();
				}				
			} catch (Exception e2) {
			}
		}
	}
	public String call_msg() {
		return this.msg;
	}
}
