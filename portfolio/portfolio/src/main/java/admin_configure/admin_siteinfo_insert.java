package admin_configure;

import java.sql.*;
import java.util.*;

public class admin_siteinfo_insert {
	String msg = null;
	public void siteinfo_insert(ArrayList<String> data) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql ="insert into homepage_config values(";
			int w=0;
			while(w<data.size()) {
				if(w==data.size()-1) {
					sql+="?);";
				}
				else {
					sql+="?,";
				}
				w++;
			}
			PreparedStatement ps = ct.prepareStatement(sql);
			for(int ww=1;ww<=data.size();ww++) {
				ps.setString(ww, data.get(ww-1));
			}
			int n = ps.executeUpdate();
			if(n>0) {
				this.msg="success";
			}
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			this.msg="fail";
		}
		finally {
			try {
				if(ct!=null) {
					ct.close();
				}
			} catch (Exception e2) {
			}
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
