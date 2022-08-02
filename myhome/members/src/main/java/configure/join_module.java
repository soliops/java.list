package configure;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
public class join_module {
	static String callsign = null;
	//base64 (getter ) //많이 중요
	public String pass_sc(String pw) { 
		byte[] code = pw.getBytes();
		Encoder ec = Base64.getEncoder();
		byte[] code2 = ec.encode(code);
		String repass = new String(code2);
		return repass;
	}
	
	public void insert(ArrayList<String> datas) { //DB저장 회원부분
		try {
			LocalDateTime time = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String today = time.format(dtf);
			dbconfig dc = new dbconfig();
			Connection ct = dc.dbcon();
//			System.out.println(datas.get(0));
			String sql = "insert into person values('0',?,?,?,?,?,?,?,?,'"+today+"','0001-01-01 01:00:00','Y');";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, datas.get(0));
			ps.setString(2, datas.get(1));
			ps.setString(3, datas.get(2));
			ps.setString(4, datas.get(3));
			ps.setString(5, datas.get(4));
			ps.setString(6, datas.get(5));
			ps.setString(7, datas.get(6));
			ps.setString(8, datas.get(7));
			//원래는 반복문으로 돌려야함 for-in
			int n=0;
			n = ps.executeUpdate();
			if(n>0) {
				this.callsign = "ok";
			}
			else {
				throw new Exception("error");
			}
		} 
		catch (Exception e) {
			this.callsign = "no";
		}
	}
	public String join_msg() {
		return this.callsign;
	}
}
