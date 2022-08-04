package configure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class dataload {
	private String ridx;
	private String rname;
	private String rproduct;
	private String rscore;
	private String r_text;
	private String r_date;
	private String imgs;

	protected void setridx(String ridx) {
		this.ridx = ridx;
	}
	protected void setrname(String rname) {
		this.rname = rname;
	}
	protected void setrproduct(String rproduct) {
		this.rproduct = rproduct;
	}
	protected void setrscore(String rscore) {
		this.rscore = rscore;
	}
	protected void setr_text(String r_text) {
		this.r_text = r_text;
	}	
	protected void setr_date(String r_date) {
		this.r_date = r_date;
	}	
	protected void setimgs(String imgs) {
		this.imgs = imgs;
	}	
	
	
	public String getridx() {
		return this.ridx;
	}
	public String getrname() {
		return this.rname;
	}
	public String getrproduct() {
		return this.rproduct;
	}
	public String getrscore() {
		return this.rscore;
	}
	public String getr_text() {
		return this.r_text;
	}	
	public String getr_date() {
		return this.r_date;
	}	
	public String getimgs() {
		return this.imgs;
	}	
	
	public ArrayList<dataload> all_list(){
		ArrayList<dataload> list = new ArrayList<dataload>();
		
		try {
			dbconfig db = new dbconfig();
			Connection ct = db.dbc();
			String sql = "select ridx,rname,rproduct,rscore,r_text,r_date,imgs from pd_review";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				dataload dl = new dataload();
				dl.setridx(rs.getString("ridx"));
				dl.setrname(rs.getString("rname"));
				dl.setrproduct(rs.getString("rproduct"));
				dl.setrscore(rs.getString("rscore"));
				dl.setr_text(rs.getString("r_text"));
				dl.setr_date(rs.getString("r_date"));
				dl.setimgs(rs.getString("imgs"));
				list.add(dl);
				
			}
		}
		catch (Exception e) {
		}
		return list;
	}
}
