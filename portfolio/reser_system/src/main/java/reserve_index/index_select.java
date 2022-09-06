package reserve_index;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import config.dbconfig;

public class index_select {
	private String ridx;
	private String rdate;
	private String rname;
	private String ruse;
	public String getRidx() {
		return ridx;
	}
	public void setRidx(String ridx) {
		this.ridx = ridx;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRuse() {
		return ruse;
	}
	public void setRuse(String ruse) {
		this.ruse = ruse;
	}
	
	public ArrayList<index_select> select(String rdate, String rname) {
		ArrayList<index_select> al = new ArrayList<index_select>();
		try {
			dbconfig db = new dbconfig();
			Connection ct = db.getConnection();
			String sql = "select * from reser_room where rname = ? and rdate like ?";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, rname);
			ps.setString(2, rdate+"%");
			ResultSet rs = ps.executeQuery();
			
			int count = 1;
			while(rs.next()) {
				count++;
				index_select is = new index_select();
				is.setRidx(rs.getString("ridx"));
				is.setRdate(rs.getString("rdate"));
				is.setRname(rs.getString("rname"));
				is.setRuse(rs.getString("ruse"));
				al.add(is);
			}
			if(count ==1) {
				index_select is = new index_select();
				is.setRuse("Y");
				al.add(is);
			}
			ct.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return al;
		
	}
	
}

