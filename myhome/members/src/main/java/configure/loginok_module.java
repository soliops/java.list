package configure;
import java.sql.*;
//MVC : Module
public class loginok_module {
	protected Connection ct = null;
	String u = null;
	String n = null;
	String msg = null;
	public void userinfo(String userid,String username,String message) {
		this.u = userid;
		this.n = username;
		this.msg = message;
		
	}
//	public void user (String userid) {
//		this.u = userid;
//	}
//	public void pass(String userpw) {
//		this.p = userpw;
//	}
	public loginok_module() throws ClassNotFoundException, SQLException {
	}
	
	//클래스 형태의 메소드 getter, setter 사용이유는 : 자료형에 구분없이 사용하기 위함
	public loginok_module getter(String userid, String userpw) { //getter return loginok로
		loginok_module ld =null;
		
		
		try {
			dbconfig dc = new dbconfig();
			this.ct = dc.dbcon();		
			ld = new loginok_module(); //class 인스턴스 적용함.
			/*
			sql문법은 해당 값이 잘못 되었을 경우 또는 필드명이 잘못 될 경우
			해당 문법을 세그먼트를 꼭 찍어서 확인 하셔야 합니다.
			암호화가 있을 경우 무조건 암호화값이 들어가야만 확인이 정상적으로 이루어 집니다.
			
			해당 필드값만 가져와서 사용할 경우 각각의 필드명을 입력하시면 됩니다.
			*/
			
			String sql = "select mid,mname from person where mid=? and mpass=?";
			PreparedStatement ps = this.ct.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, userpw);
			ResultSet rs =ps.executeQuery();

			if(rs.next()==false) {
				ld.userinfo(rs.getString("mid"), rs.getString("mname"), "nojoin");
			}
			else {				
				ld.userinfo(rs.getString("mid"), rs.getString("mname"), "okjoin");
			}
//			ld.user(userid); 
//			ld.pass(userpw);
			//void 메소드로 this를 적용시켜줌, loginok.java에서 this값을 바로 load하기 위함.
			
		} catch (Exception e) {

		}
		return ld;
	}
}

