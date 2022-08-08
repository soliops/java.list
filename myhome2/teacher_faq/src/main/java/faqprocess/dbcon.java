package faqprocess;

import java.sql.*;

public class dbcon {
	static String dbdriv = "com.mysql.jdbc.Driver";
	static String dburl = null;
	static String dbuser = null;
	static String dbpw = null;
	
	//cafe24
	public static Connection cafe24() throws ClassNotFoundException, SQLException{
		dburl = "jdbc:mysql://";
		dbuser = "";
		dbpw = "";
		
		Class.forName(dbdriv);
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpw);
		return con;
	}
	//kbsn
	public static Connection kbsn() throws ClassNotFoundException, SQLException{
		dburl = "jdbc:mysql://";
		dbuser = "";
		dbpw = "";
		
		Class.forName(dbdriv);
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpw);
		return con;
	}
}
