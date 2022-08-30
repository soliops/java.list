package admin_product;

import java.sql.*;

import admin_configure.dbconfig;

public class admin_category_delete {
	String msg =null;
	public void category_delete(String del_data) {
		Connection ct = null;
		try {
			String[] data = del_data.split("");
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			int n = 0;
			int t = 0;
			do {
				String sql = "delete from category where cidx=?;";
				PreparedStatement ps = ct.prepareStatement(sql);
				ps.setString(1, data[t]);
				n=ps.executeUpdate();
				t++;
				}
			while(t<data.length);
			if(n>0) {
				this.msg="success";
				ct.close();
			}
			else {
				throw new Exception();
			}
		} catch (Exception e) {			
			this.msg = "fail";
		}
	}
	public String call_sign() {
		return this.msg;
	}
	
}
