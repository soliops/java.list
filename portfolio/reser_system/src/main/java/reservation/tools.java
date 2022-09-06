package reservation;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class tools {
	public Connection dbcon() {
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://kbsn.or.kr:3306/test";
			String id = "java_d";
			String pw = "java_dclass";
			
			con = DriverManager.getConnection(url,id,pw);
		}
		catch(Exception e){
			e.getMessage();
		}
		
		return con;
	}
	
	public String time() {
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String date = dt.format(dtf);
		return date;
	}
	
}
