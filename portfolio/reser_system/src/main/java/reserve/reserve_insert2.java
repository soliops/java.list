package reserve;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import config.dbconfig;

public class reserve_insert2 {
	static String msg = null;
	public void reser_insert(ArrayList<String> data) {
		try {
			dbconfig db = new dbconfig();
			Connection ct = db.getConnection();
			String sql = "insert into reser_room values ('0',?,?,?);";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, data.get(0));
			ps.setString(2, data.get(1));
			ps.setString(3, "N");
			int n=0;
			n=ps.executeUpdate();
			if(n>0) {
				this.msg="success";
			}else {
				this.msg="fail";
			}
			ct.close();
			ps.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
