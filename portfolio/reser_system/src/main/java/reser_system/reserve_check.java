package reser_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class reserve_check {
	static String msg = null;
	static String msg2 = null;
	static String num = null;
	
	public void reser_ck(ArrayList<String> data) {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct = db.getConnection();
			String sql = "select * from reser_room where rdate=? and rname=?";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, data.get(0) );
			ps.setString(2, data.get(1) );
			ResultSet rs = ps.executeQuery();
			ArrayList<Map<String,Object>> ar = new ArrayList<Map<String,Object>>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String,Object>();
				m.put("rdate",rs.getString("rdate"));
				m.put("rname",rs.getString("rname"));				
				m.put("ruse",rs.getString("ruse"));
				ar.add(m);
			}
			if(ar.size()==0) {
				this.msg="success";
			}
			else {
			for(int f=0;f<ar.size();f++) {
				String date = ((String)ar.get(f).get("rdate")).substring(0,10);
				String date2 = (String)data.get(0).substring(0,10);
				if(ar.get(f).get("rname").equals(data.get(1))) {
					this.msg="fail";
				}
				else if(date.equals(date2)) {
					this.msg="fail";
				}
				else if(ar.get(f).get("ruse").equals("Y")) {
					this.msg="fail";
				}
				else {this.msg="success";}
			}
			}
			ct.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void num_ck() {
		Connection ct2 =null;
		try {
			dbconfig db2 = new dbconfig();
			ct2 = db2.getConnection();
			datetimer time2 = new datetimer();
			String rnumber = time2.number();
			String sql2 ="select * from reser_user where rnumber=?;";
			PreparedStatement ps2 = ct2.prepareStatement(sql2);
			ps2.setString(1, rnumber);
			ResultSet rs2 = ps2.executeQuery();
			ArrayList<Map<String,Object>> ar2 = new ArrayList<Map<String,Object>>();
			while(rs2.next()) {
				Map<String,Object> m2 = new HashMap<String,Object>();
				m2.put("rnumber", rs2.getString("rnumber"));
				ar2.add(m2);
			}
			if(ar2.size()==0) {
				this.msg2="ok";
				this.num=rnumber;
			}
			else {
				this.msg2="no";
				num_ck();
			}
			ct2.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public String call_sign() {
		return this.msg;
	}
	public String call_sign2() {
		return this.msg2;
	}
	public String number() {
		return this.num;
	}
	
}
