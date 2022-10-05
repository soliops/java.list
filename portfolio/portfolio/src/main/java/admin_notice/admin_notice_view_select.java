package admin_notice;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import admin_configure.dbconfig;

public class admin_notice_view_select {
	ArrayList<Map<String,Object>> ar = null;
	public void view_select(String idx) {
		Connection ct = null;
		try {
			dbconfig db =new dbconfig();
			ct = db.cafe24();
			String sql = "select * from admin_notice where idx='"+idx+"'";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.ar = new ArrayList<Map<String,Object>>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String, Object>();
				m.put("idx", rs.getString("idx"));
				m.put("notice_print", rs.getString("notice_print"));
				m.put("notice_title", rs.getString("notice_title"));
				m.put("notice_writer", rs.getString("notice_writer"));
				m.put("notice_file", rs.getString("notice_file"));
				m.put("notice_text", rs.getString("notice_text"));
				m.put("notice_date", rs.getString("notice_date"));
				this.ar.add(m);
			}
			ct.close();
			ps.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public ArrayList<Map<String,Object>> list (){
		return this.ar;
	}
}
