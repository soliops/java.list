package admin_shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class coupon_check {
	String msg =null;
	public void coupon_check(String data,String data2,String data3) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from coupon where coupon_name='"+data+"' and coupon_publish_date like '"+data2+"' "
					+ "and coupon_expiration_date like '"+data3+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> ar = new ArrayList<>();
			while(rs.next()) {
				ar.add(rs.getString("coupon_name"));
				ar.add(rs.getString("coupon_publish_date"));
				ar.add(rs.getString("coupon_expiration_date"));				
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
