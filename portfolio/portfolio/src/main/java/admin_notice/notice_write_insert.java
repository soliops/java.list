package admin_notice;

import java.sql.*;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class notice_write_insert {
	String msg = null;
	public void notice_insert(ArrayList<String> data) {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String table_nm= data.get(0);
			String sql = "insert into "+table_nm+" values ('0',";
			int w=1;
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
			for(int ww=1; ww<data.size();ww++) {
				ps.setString(ww, data.get(ww));
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
				e2.getMessage();
			}
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
