package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import com.mysql.jdbc.Driver;

public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public index() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	//Connection getConnection : SQL 연결되는 메소드 이름 입니다.(무조건 return	) - 자료형
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		/*DB 접속 정보*/
		String dbconnect = "com.mysql.jdbc.Driver";
		//com.mysql.jdbc.Driver(5.X) or com.mysql.cj.jdbc.Driver(8.X)
		
		String dburl = "jdbc:mysql://localhost:3306/webmail"; 
		//localhost(서버주소):3306(mysql port) /데이터베이스 이름
		
		String dbuser = "guest2"; //사용자 DB 접속 아이디
		String dbpass = "qwer1234"; //사용자 DB접속 패스워드
		Class.forName(dbconnect); //해당 정보를 Class 로드 함
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpass);
		//DriverManager.getConnection(연결주소, 사용자 아이디, 사용자 패스워드);
		return con; //return 필수
	} 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con = getConnection();
			System.out.println("연결성공!!");
			String sql = "select * from shopmember";
			//con.createStatement(); 속도가 많이 떨어지고 로드가 달라서 실무에서는 안쓴다.
			PreparedStatement ps = con.prepareStatement(sql);
			//프리페어드를 사용하는 이유는 데이터베이스 효율성을 높이기 위해서 사용하는
			//문법 입니다.
			ResultSet rs = ps.executeQuery();
			//executeQuery : select문에서 사용합니다. (ResultSet)
			
			int a = 0;
			while(rs.next()) { //next() 데이터베이스 전체 리스트값
				String user = rs.getString("suser"); // getString 컬럼명을 사용
//				String pass = rs.getString("spassword");
//				String user = rs.getString(a);
//				System.out.println(user);
//				System.out.println(pass);
			}
		} catch (Exception e) {
			System.out.println("연결실패");
		}
	}

}
