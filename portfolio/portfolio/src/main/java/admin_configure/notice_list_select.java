package admin_configure;

import java.sql.*;
import java.util.*;

public class notice_list_select {
	ArrayList<Map<String,Object>> al = null;
	ArrayList<Object> pg = null;
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
			ct.close();
		} catch (Exception e) {
			
		}

	}
	public void nlist_select (String pgno) {
		Connection ct =null;
		try {
			int pageview = 10; 
			int startpage = 0; 
			double pagenumber = 1; 
			int total = 0;
			
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String countsql = "select count(*) as count from admin_notice where notice_print='N';";
			PreparedStatement psct = ct.prepareStatement(countsql);
			ResultSet rsct = psct.executeQuery();
			while(rsct.next()) {
				total = rsct.getInt("count");
			}
			if( pgno==null||  pgno==""||pgno=="null") {
				startpage=0;
			}
			else {
				startpage=((Integer.parseInt(pgno))-1)*pageview;
			}
			
			if(total%pageview==0) {
				pagenumber=total/pageview;
			}else {
				pagenumber=(total/pageview)+1;
			}
			this.pg = new ArrayList<>();
			this.pg.add(pageview);
			this.pg.add(startpage);
			this.pg.add(pagenumber);
			this.pg.add(total);
			String sql = "select * from admin_notice where notice_print='N'order by idx desc limit "+startpage+","+pageview+";";
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
			ct.close();
		} catch (Exception e) {
			
		}
	}
	
	public ArrayList<Map<String,Object>> select_list(){
		return this.al;
	}
	
	public ArrayList<Object> page_data(){
		return this.pg;
	}
}
