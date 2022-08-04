package configure;

import java.sql.*;

public class dbconfig { 
	protected Connection dbc () throws ClassNotFoundException, SQLException {
		String db_Driver = "com.mysql.jdbc.Driver";
//		String db_url = "jdbc:mysql://localhost:3306/opete95";
		String db_url = "jdbc:mysql://umj7-009.cafe24.com/opete95";
		String db_user= "opete95";
		String db_pass="soli5857!@";
		Class.forName(db_Driver);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		return con;
	}
}
