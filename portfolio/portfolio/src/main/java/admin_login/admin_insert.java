package admin_login;

import java.sql.*;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class admin_insert {
	String call_msg=null;
	public void insert(ArrayList<String> data) {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String table_name = "admin_add";
			String sql="insert into "+table_name+" values('0',";
			String check = data.get(8);
			int w=0;
			while(w<data.size()) {
				if(w==data.size()-1) {sql+="'"+check+"');";}
				else {sql+="?,";}
				w++;
			}
			PreparedStatement ps = ct.prepareStatement(sql);
			for(int ww=1;ww<data.size();ww++) {
				ps.setString(ww, data.get(ww-1));
			}
			int n = ps.executeUpdate();
			if(n>0) {
				this.call_msg="success";
			}
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			this.call_msg="fail";
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
	public String call_sign () {
		return this.call_msg;
	}
}
