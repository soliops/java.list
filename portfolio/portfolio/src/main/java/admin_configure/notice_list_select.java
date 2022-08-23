package admin_configure;

import java.sql.*;
import java.util.*;

public class notice_list_select {
	ArrayList<Map<String,Object>> al = null;
	public void list_select () {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from admin_notice where notice_print='Y'order by idx desc;";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.al = new ArrayList<>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String, Object>();
				m.put("notice_idx", rs.getString("idx"));
				m.put("notice_print", rs.getString("notice_print"));
				m.put("notice_title", rs.getString("notice_title"));
				m.put("notice_writer", rs.getString("notice_writer"));
				m.put("notice_file", rs.getString("notice_file"));
				m.put("notice_text", rs.getString("notice_text"));
				m.put("notice_date", rs.getString("notice_date"));
				this.al.add(m);
			}
		} catch (Exception e) {
			
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
	public void nlist_select () {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from admin_notice where notice_print='N'order by idx desc;";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.al = new ArrayList<>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String, Object>();
				m.put("notice_idx", rs.getString("idx"));
				m.put("notice_print", rs.getString("notice_print"));
				m.put("notice_title", rs.getString("notice_title"));
				m.put("notice_writer", rs.getString("notice_writer"));
				m.put("notice_file", rs.getString("notice_file"));
				m.put("notice_text", rs.getString("notice_text"));
				m.put("notice_date", rs.getString("notice_date"));
				this.al.add(m);
			}
		} catch (Exception e) {
			
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
	
	public ArrayList<Map<String,Object>> select_list(){
		return this.al;
	}
}
