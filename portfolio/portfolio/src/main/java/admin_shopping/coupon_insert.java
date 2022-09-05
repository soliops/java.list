package admin_shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class coupon_insert {
	String msg = null;
	public void coupon_insert(ArrayList<String> data) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "insert into coupon values ('0',";
			for(int s=0;s<data.size();s++) {
				if(s==data.size()-1) {
					sql+="?);";
				}
				else {
					sql+="?,";
				}
			}
			PreparedStatement ps = ct.prepareStatement(sql);
			int t = 0;
			do {
				ps.setString(t+1, data.get(t));
				t++;
			}while(t<data.size());
			int n = ps.executeUpdate();
			if(n>0){
				this.msg = "success";
			}
			else{
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
