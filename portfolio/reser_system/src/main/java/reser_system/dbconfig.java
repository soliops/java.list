package reser_system;

import java.sql.*;

public class dbconfig {
	Connection ct = null;	
	public Connection getConnection() throws ClassNotFoundException,SQLException{
		String db = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://kbsn.or.kr:3306/test";
		String user = "java_d";
		String pw = "java_dclass";
		
		Class.forName(db);
		ct = DriverManager.getConnection(url,user,pw);
		return ct;
	}
}
