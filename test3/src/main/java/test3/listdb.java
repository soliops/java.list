package test3;

import java.sql.*;

//DB접속
public class listdb {
	public String url = "jdbc:mysql://umj7-009.cafe24.com/opete95";	
	public String id = "opete95";
	public String pw = "soli5857!@";
	public String driver = "com.mysql.jdbc.Driver";
	public Connection con = null; 
	public listdb() {
	}
	
	public String insert (dbservice dbservice) throws SQLException, ClassNotFoundException{
		String result = "error";
		String mid = dbservice.mid;
		String mpw = dbservice.mpw;
		String usernm = dbservice.usernm;
		String tel = dbservice.tel;
		String age = dbservice.age;
		String sql = "insert into test3(midx,mid,mpw,mnm,mtel,mage)"
				+ " values ('0',?,?,?,?,?);";
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mid);
		ps.setString(2, mpw);
		ps.setString(3, usernm);
		ps.setString(4, tel);
		ps.setString(5, age);
		int n = ps.executeUpdate();
		if(n>0){
			result="ok";
		}
		ps.close();
		con.close();
		return result;
	}
		
}
