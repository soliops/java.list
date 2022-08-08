package configure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class insert_sql {
	String fcategory =null;
	String fname =null;
	String fqtext =null;
	String fatext = null;
	String indate = null;
	String check =null ; 
	static String msg=null;

	public insert_sql(String fcategory,String fname,String fqtext, String fatext,String indate,String check) {
		this.fcategory = fcategory;
		this.fname =  fname;
		this.fqtext = fqtext;
		this.fatext = fatext;
		this.indate =indate;
		this.check =  check;
		
	}
	public String insql() throws ClassNotFoundException,SQLException {
		try {
			dbconfig dbc = new dbconfig();
			Connection ct = dbc.cafe24();
			String sql = "insert into faq_list values('0',?,?,?,?,?,?)";

			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, this.fcategory);
			ps.setString(2, this.fname);
			ps.setString(3, this.fqtext);
			ps.setString(4, this.fatext);
			ps.setString(5, this.check);
			ps.setString(6, this.indate);
			
			int n = 0;
			if(n>0) {this.msg="success";}else {throw new Exception("error");}
		}
		catch (Exception e) {
			this.msg="fail";
		}
		return this.msg;
	}
//	public String call_sign() {
//		return this.msg;
//		}
}
