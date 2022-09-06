package admin_product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class admin_category_write_select {
	String msg =null;
	
	public void category_select(ArrayList<String> data) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql= "";
			if(data.size()==4) {
				sql = "select * from category where cbcate_code='"+data.get(1)+"';";				
			}
			else {
				sql = "select * from category where cbcate_code='"+data.get(1)+"' and cscate_code='"+data.get(3)+"';";
			}
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> ar = new ArrayList<String>();
			while(rs.next()) {
				ar.add(rs.getString("cbcate_code"));
				ar.add(rs.getString("cscate_code"));
			}
			if(ar.size()==0) {
				this.msg="ok";
			}
			else {
				if(data.get(1).equals(ar.get(0))==true) {
					this.msg="no1";
				}
				else if(data.get(3).equals(ar.get(3))==true) {
					this.msg="no2";
				}
			}
			ct.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public String call_sign (){
		return this.msg;
	}
}
