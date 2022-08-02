package configure;

import java.sql.*;

public class dbconfig { //SQL 환경설정
	
	protected Connection dbcon() throws ClassNotFoundException,SQLException {
		String dbDriver ="com.mysql.jdbc.Driver"; //JAR 안에 있는 라이브러리를 말함.
		String dburl = "jdbc:mysql://localhost:3306/webmail";
		String dbuser = "guest2";
		String dbpass = "qwer1234";
		Class.forName(dbDriver); // JDBC 클래스 로드명
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpass);
		return con;
	}
	
}
