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
	//set Servlet에서 입력시키기 위한 부분(인스턴스)
	private void setridx(String ridx) {
		this.ridx = ridx;
	}
	private void setrname(String rname) {
		this.rname = rname;
	}
	private void setrproduct(String rproduct) {
		this.rproduct = rproduct;
	}
	private void setrscore(String rscore) {
		this.rscore = rscore;
	}
	private void setr_text(String r_text) {
		this.r_text = r_text;
	}	
	private void setr_date(String r_date) {
		this.r_date = r_date;
	}	
	private void setimgs(String imgs) {
		this.imgs = imgs;
	}	
	
	//get JSP로 출력하기 위해서 사용
	
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
	
	public ArrayList<dataload> all_lists(){ //배열자료형에 메소드 형태
		ArrayList<dataload> list = new ArrayList<dataload>(); //배열자료형 생성
		
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
				list.add(dl); //최종 DB값을 받아서 배열로 처리
				
			}
		}
		catch (Exception e) {
		}
		return list; //최종 DB 배열값을 return JSP에게 전달하기 위해서 사용
	}
}
