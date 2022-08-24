package admin_configure;

import java.sql.*;

public class notice_list_delete {
	String msg = null;
	public void notice_list (String datas) {
		Connection ct = null;
		try {
			String[] data= datas.split("");
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			int t =0;
			int n =0;
			do {
				String sql = "delete from admin_notice where idx=?;";
				PreparedStatement ps = ct.prepareStatement(sql);
				ps.setString(1, data[t]);
				n=ps.executeUpdate();
				t++;
			}while(t<data.length);
			if(n>0) {
				this.msg="success";
				ct.close();
				
			}
			else {
				this.msg = "fail";
			}
		}catch (Exception e) {
			e.getMessage();
		}
		
	}
	public String call_sign() {
		return this.msg;
	}
}
