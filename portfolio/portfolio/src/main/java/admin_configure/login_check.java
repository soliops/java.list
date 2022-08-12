package admin_configure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class login_check {
	String[] list =null;
	Connection ct =null;
	public String[] logindata (String id,String pw) throws ClassNotFoundException, SQLException {
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from admin_add where admin_id='"+id+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			String id_data = null;
			String pw_data = null;
			while(rs.next()) {
				id_data = rs.getString("admin_id");
				pw_data = rs.getString("admin_pw");
			}
			String[] data = {id_data,pw_data};
			list=data; 
		} catch (Exception e) {

		}
		return list;
	}
	
}
