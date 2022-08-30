package admin_product;

import java.sql.*;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class admin_product_check {
	String msg = null;
	public void code_check(String data) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql ="select * from product where product_code='"+data+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> ar = new ArrayList<>();
			while(rs.next()) {
				ar.add(rs.getString("product_code"));
			}
			if(ar.size()==0) {
				this.msg="success";
			}
			else {
				throw new Exception();
			}
			ct.close();
		} catch (Exception e) {
			this.msg="fail";
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
