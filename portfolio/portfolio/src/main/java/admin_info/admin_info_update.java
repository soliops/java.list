package admin_info;

import java.sql.*;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class admin_info_update {
	String msg = null;
	public void info_update(ArrayList<String> list) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "update admin_add set admin_pw=?, admin_nm=?,"
					+ " admin_email=?, admin_tel=?, admin_part=?, "
					+ "admin_position=?, admin_indate=? where admin_id=? ";
			PreparedStatement ps = ct.prepareStatement(sql);
			for(int w=1; w<=list.size(); w++) {
				if(w==list.size()) {
					ps.setString(w, list.get(0));
				}
				else {
				ps.setString(w, list.get(w));
				}
			}
			int n =0;
			n = ps.executeUpdate();
			if(n>0) {
				this.msg = "success";
			}
			else {
				throw new Exception("error");
			}
			ct.close();
			ps.close();
		} catch (Exception e) {
			this.msg="fail";
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
