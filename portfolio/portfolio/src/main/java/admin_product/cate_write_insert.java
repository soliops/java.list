package admin_product;

import java.sql.*;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class cate_write_insert {
	static String msg = null;
	public void write_insert(ArrayList<String> data) {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "insert into category values('0',";
			int w =0;
			while(w<data.size()) {
				if(w==data.size()-1) {
					if(data.size()==4) {
						sql+="'','',?);";
					}
					else {						
						sql+="?);";
					}
				}
				else {
					sql+="?,";
				}
				w++;
			}
			PreparedStatement ps = ct.prepareStatement(sql);
			int t =0;
			do {				
				ps.setString(t+1, data.get(t));
				t++;
			}while(t<data.size());

			int n = ps.executeUpdate();
			if(n>0) {
				this.msg="success";
				ct.close();
			}
			else {
				throw new Exception();
			}
		} catch (Exception e) {
			this.msg="fail";
		}
	} 
	public String call_sign() {
		return this.msg;
	}
}
