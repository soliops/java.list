package reserve;

import java.sql.*;
import java.util.ArrayList;

import config.dbconfig;

public class reserve_insert {
	static String msg = null;
	public void reser_insert(ArrayList<String> data) {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct = db.getConnection();
			String sql = "insert into reser_user values ('0',";
			int w=0;
			do {
				if(w==data.size()-1) {
					sql+="?);";
				}
				else {
					sql+="?,";
				}
				w++;
			}while(w<data.size());
			PreparedStatement ps = ct.prepareStatement(sql);
			int r = 0;
			while(r<data.size()) {
				ps.setString(r+1, data.get(r));
				r++;
			}
			int i= ps.executeUpdate();
			if(i>0) {
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
