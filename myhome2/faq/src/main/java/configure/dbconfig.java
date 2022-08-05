package configure;
import java.sql.*;

public class dbconfig {
	static String db_Driver = "com.mysql.jdbc.Driver";
	static String db_url = null;
	static String db_user = null;
	static String db_pass = null;
	
	//cafe 24
	public static Connection cafe24 () throws ClassNotFoundException,SQLException {
//		db_url = "jdbc:mysql://localhost:3306/opete95";
		db_url = "jdbc:mysql://umj7-009.cafe24.com/opete95";
		db_user = "opete95";
		db_pass = "soli5857!@";
		Class.forName(db_Driver);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		return con;
	}
	//kbsn
	public static Connection kbsn() throws ClassNotFoundException,SQLException {
//		db_url = "jdbc:mysql://localhost:3306/classd";
		db_url = "jdbc:mysql://kbsn.or.kr:3306/classd";
		db_user = "classd";
		db_pass = "";
		Class.forName(db_Driver);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		return con;
	}
}
