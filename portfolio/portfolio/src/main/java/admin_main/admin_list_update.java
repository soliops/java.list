package admin_main;

import java.sql.*;

import admin_configure.dbconfig;

public class admin_list_update {
	
	static String msg =null;
	
	public void list_update(String id, String ck) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "update admin_add set admin_check='"+ck+"' where admin_id='"+id+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			int n = ps.executeUpdate();
			if(n>0) {
				this.msg="success";
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
	public String call_sign() {
		return this.msg;
	}
}
