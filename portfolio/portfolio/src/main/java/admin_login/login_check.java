package admin_login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class login_check {
	Connection ct =null;
	static String msg = null;
	ArrayList<String> data = null;
	public void logindata (String id,String pw) throws ClassNotFoundException, SQLException {
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from admin_add where admin_id='"+id+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			String id_data = null;
			String pw_data = null;
			String nm_data = null;
			String ck_data =null;
			this.data = new ArrayList<String>();
			while(rs.next()) {
				id_data = rs.getString("admin_id");
				pw_data = rs.getString("admin_pw");
				nm_data = rs.getString("admin_nm");
				ck_data = rs.getString("admin_check");
			}
			if(id.equals(id_data) && pw.equals(pw_data) && ck_data.equals("Y")) {
					this.msg="success";				
					this.data.add(id_data);
					this.data.add(nm_data);
			}else {
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
	public String call_msg() {
		return this.msg;
	}
	public ArrayList<String> list (){
		return this.data;
	}
}
