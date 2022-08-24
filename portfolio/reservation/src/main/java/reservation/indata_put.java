package reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class indata_put {
	String msg = null;
	public void indata (ArrayList<String> data) {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct = db.getConnection();
			String sql = "insert into card values ('0',";
			for(int t=0; t<data.size();t++) {
				if(t==data.size()-1) {
					sql+="?);";
				}
				else {
					sql+="?,";
				}
			}
			PreparedStatement ps = ct.prepareStatement(sql);
			for(int w=0; w<data.size();w++) {
				ps.setString(w+1, data.get(w));
			}
			int n= 0;
			n = ps.executeUpdate();
			if(n>0) {
				this.msg="success";
				ct.close();
			}
			else {
				this.msg="fail";
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
