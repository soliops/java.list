package configure;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class write_module {
	static String call_sign = null;
	protected LocalDateTime now = null;
	protected String timer =null;
	protected String nowtimer() { //현재 서버 시간 관련 정보 
			this.now = LocalDateTime.now();
			DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			this.timer = this.now.format(fm);
		return this.timer;
	}
	public void insert(ArrayList<String> data) { //insert만 사용되는 list정보
		try {
			dbconfig dbc = new dbconfig();
			Connection ct = dbc.dbc();
			int ww = 1;
			String sql ="insert into pd_review values('0',";
			while(ww<data.size()) {
				if(ww==data.size()-1) {sql+="?)";
				}else {sql+="?,";}
				ww++;
			}

			PreparedStatement ps = ct.prepareStatement(sql);
			for(int w=1;w<data.size();w++) {
				ps.setString(w, data.get(w));
			};
			int n =0;
			n = ps.executeUpdate();
			if(n>0) {
				this.call_sign="success";
			}
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			this.call_sign="fail";
		}
	}
	public String join_msg() {
		return this.call_sign;
	}
}
