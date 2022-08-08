package configure;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.sql.*;

public class faq_config {
	static String call_msg =null;

	public void insert(ArrayList<String> data) {
		try {
			dbconfig dbc = new dbconfig();
			Connection ct = dbc.cafe24();
			int w = 1;
			String sql = "insert into faq_list values('0',";
			while(w<data.size()) {
				if(w==data.size()-1) {sql+="?)";}
				else{sql+="?,";} 
				w++;
			}
			PreparedStatement ps = ct.prepareStatement(sql);
			for(int ww=1;ww<data.size();ww++) {
			ps.setString(ww, data.get(ww));
			}
			int n= ps.executeUpdate();
			if(n>0) {
				this.call_msg = "success"; 
			}
			else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			this.call_msg = "fail"; 
			
		}
	}
	public String call_sign() {
	return this.call_msg;
	}
}
