package test;

import java.sql.*;

public class dbconnect {
	public static Connection ct() throws ClassNotFoundException, SQLException {
		String dbdrive = "com.mysql.jdbc.Driver";
		String dburl = "jdbc:mysql://localhost:3306/webmail";
		String dbuser = "guest2";
		String dbpw = "qwer1234";
		//mssql일 경우
		/*
		String dbdrive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dburl = "jdbc:sqlserver://localhost:1433/webmail";
		String dbuser = "guest2";
		String dbpw = "qwer1234";
		 */
		Class.forName(dbdrive);
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpw);
		
		return con;
	}
}
