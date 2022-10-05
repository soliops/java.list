package admin_info;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import admin_configure.dbconfig;

public class admin_info_select {
	ArrayList<Map<String,Object>> ar =null;
	public void info_select (String id) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from admin_add where admin_id='"+id+"'";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.ar= new ArrayList<Map<String,Object>>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String, Object>();
				m.put("admin_id",rs.getString("admin_id"));
				m.put("admin_nm",rs.getString("admin_nm"));
				m.put("admin_email",rs.getString("admin_email"));
				m.put("admin_tel",rs.getString("admin_tel"));
				m.put("admin_part",rs.getString("admin_part"));
				m.put("admin_position",rs.getString("admin_position"));
				this.ar.add(m);
			}
		} catch (Exception e) {
		}
	}
	public ArrayList<Map<String,Object>> ar_data (){
		return this.ar;
	}
}
