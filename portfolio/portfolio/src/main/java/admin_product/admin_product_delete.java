package admin_product;

import java.sql.Connection;
import java.sql.PreparedStatement;

import admin_configure.dbconfig;

public class admin_product_delete {
	String msg =null;
	public void product_delete(String data1) {
		Connection ct = null;
		try { 
			String data[] = data1.split(",");
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			int n = 0;
			int t = 0;
			String sql ="";
			PreparedStatement ps = null;
			do {
				sql = "delete from product where pidx=?;";					
				ps = ct.prepareStatement(sql);
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
