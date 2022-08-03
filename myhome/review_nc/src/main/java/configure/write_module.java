package configure;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class write_module {
	static String call_sign = null;
	public void insert(ArrayList<String> data) {
		try {
			LocalDateTime time = LocalDateTime.now();
			DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String today = time.format(dt);
			dbconfig dbc = new dbconfig();
			Connection ct = dbc.dbc();
			String sql = "insert into pd_review values('0',?,?,?,?,'"+today+"','N')";
			PreparedStatement ps = ct.prepareStatement(sql);
			for(int w=0;w<data.size();w++) {
				ps.setString(w+1, data.get(w));
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
