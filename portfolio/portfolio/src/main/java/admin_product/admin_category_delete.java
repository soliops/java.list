package admin_product;

import java.sql.*;
import java.util.Arrays;

import admin_configure.dbconfig;

public class admin_category_delete {
	String msg =null;
	public void category_delete(String data1) {
		Connection ct = null;
		try { 
			String data[] = data1.split(",");
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			int n = 0;
			int m = 0;
			int t = 0;
			String sql ="";
			String sql2 = "";
			PreparedStatement ps = null;
			PreparedStatement ps2 = null;
			do {
				if(data[t].length()==3) {
					sql = "delete from category where cbcate_code=?;";					
					ps = ct.prepareStatement(sql);
					ps.setString(1, data[t]);
					sql2 ="delete from product where cbcate_code=?;";
					ps2 = ct.prepareStatement(sql2);
					ps2.setString(1, data[t]);
				}
				else {
					sql = "delete from category where cbcate_code=? and cscate_code=?;";
					ps = ct.prepareStatement(sql);
					ps.setString(1, data[t].substring(0,3));
					ps.setString(2, data[t].substring(3,6));					
					sql2 ="delete from product where cbcate_code=? and cscate_code=?;";
					ps2 = ct.prepareStatement(sql2);
					ps2.setString(1, data[t].substring(0,3));
					ps2.setString(2, data[t].substring(3,6));
				}
				n=ps.executeUpdate();
				m=ps2.executeUpdate();
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
