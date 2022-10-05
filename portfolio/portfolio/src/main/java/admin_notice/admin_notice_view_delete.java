package admin_notice;

import java.sql.*;

import admin_configure.dbconfig;

public class admin_notice_view_delete {
	String msg=null;
	public void view_delete(String idx) {
		Connection ct=null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "delete from admin_notice where idx=?";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, idx);
			int n = 0;
			n=ps.executeUpdate();
			if(n>0) {
				this.msg="success";
			}
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			this.msg="fail";
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
