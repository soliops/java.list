package config;

import java.sql.*;

public class dbconfig {
	Connection ct = null;	
	public Connection getConnection() throws ClassNotFoundException,SQLException{
		String db = "com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/opete95";
		String url = "jdbc:mysql://umj7-009.cafe24.com/opete95";
		String user = "opete95";
		String pw = "soli5857!@";
		
		Class.forName(db);
		ct = DriverManager.getConnection(url,user,pw);
		return ct;
	}
}
