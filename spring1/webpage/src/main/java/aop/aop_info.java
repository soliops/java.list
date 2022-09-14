package aop;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//log관련 class 및 method에는 별도로 Servlet 관련 정보 및 인자값에 
//객체를 넣어버리면 aop 시작시 에러가 무조건 발생하는 형태

//log 기록 class
public class aop_info extends HttpServlet{ 
	String driver = "com.mysql.jdbc.Driver";
	String dburl = "jdbc:mysql://umj7-009.cafe24.com/opete95";
	String dbuser = "opete95";
	String dbpass = "soli5857!@"; 
	static String url = "";
	//강제 setter 역할
	public void aop_info2(String url) {
		this.url = url;
	}
	public void log_indata(){
		try {
			Class.forName(driver);
			Connection ct = DriverManager.getConnection(dburl,dbuser,dbpass);
			String sqls = "insert into logdata values ('0',?)";
		    PreparedStatement ps = ct.prepareStatement(sqls);
		    ps.setString(1,this.url);
		    ps.executeUpdate();
			System.out.println("로그 실행");		
			ct.close();
			ps.close();
		} catch (Exception e) {
		}
			
	}
}
