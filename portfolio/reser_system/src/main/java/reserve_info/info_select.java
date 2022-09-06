package reserve_info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import config.dbconfig;

public class info_select {
	private String rnumber;
	private String rdate;
	private String rname;
	private String ruser;
	private String rtel;
	private String remail;
	private String rperson;
	private String rarrival;
	public String getRnumber() {
		return rnumber;
	}
	public void setRnumber(String rnumber) {
		this.rnumber = rnumber;
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
	public String getRuser() {
		return ruser;
	}
	public void setRuser(String ruser) {
		this.ruser = ruser;
	}
	public String getRtel() {
		return rtel;
	}
	public void setRtel(String rtel) {
		this.rtel = rtel;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	public String getRperson() {
		return rperson;
	}
	public void setRperson(String rperson) {
		this.rperson = rperson;
	}
	public String getRarrival() {
		return rarrival;
	}
	public void setRarrival(String rarrival) {
		this.rarrival = rarrival;
	}
	
	
	public ArrayList<info_select> select(String rnumber) {
		ArrayList<info_select> al = new ArrayList<info_select>();
		try {
			dbconfig db = new dbconfig();
			Connection ct = db.getConnection();
			String sql = "select * from reser_user where rnumber=?";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, rnumber);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				info_select is = new info_select();
				is.setRnumber(rs.getString("rnumber"));
				is.setRdate(rs.getString("rdate"));
				is.setRname(rs.getString("rname"));
				is.setRuser(rs.getString("ruser"));
				is.setRtel(rs.getString("rtel"));
				is.setRemail(rs.getString("remail"));
				is.setRperson(rs.getString("rpeople"));
				is.setRarrival(rs.getString("rarrival"));
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
