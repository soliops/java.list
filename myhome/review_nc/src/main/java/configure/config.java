package configure;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class config {
	static String msg2 = null;
	protected LocalDateTime now = null;
	protected dbconfig dbc = null;
	protected Connection ct2 =null;
	public PreparedStatement ps =null;
	protected String timer =null;
	protected String nowtimer() { //현재 서버 시간 관련 정보 
		try {
			this.now = LocalDateTime.now();
			DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			this.timer = this.now.format(fm);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return this.timer;
	}
	protected String insert(ArrayList<String> data) { //insert만 사용되는 list정보
		try {
			String table_name= data.get(0);
		this.dbc = new dbconfig();
		this.ct2 = this.dbc.dbc();
		int w = 1;
//		String sql ="insert into "+table_name+" values('0',";
//		while(w<data.size()) {
//			if(w==data.size()-1) {sql+="?);";
//			}else {sql+="?,";}
//			w++;
//		}
//		System.out.println(data);

			String sql = "insert into "+table_name+"values ('0',?,?,?,?,?,?,?)";
			this.ps = this.ct2.prepareStatement(sql);
			
			for(int wf=1;wf<data.size();wf++) {
				this.ps.setString(wf, data.get(wf));
			};
//			
//			this.ps.setString(1, data.get(1));
//			this.ps.setString(2, data.get(2));
//			this.ps.setString(3, data.get(3));
//			this.ps.setString(4, data.get(4));
//			this.ps.setString(5, data.get(5));
//			this.ps.setString(6, data.get(6));
//			this.ps.setString(7, data.get(7));
			
			int n =0;
			n = this.ps.executeUpdate();
			if(n>0) {
				this.msg2 = "success";
			}else {
				throw new Exception("error");
			}
		} 
		catch (Exception e) {
			this.msg2 = "fail";
		}
		finally {
			
		}
		return this.msg2;	
	}
}
