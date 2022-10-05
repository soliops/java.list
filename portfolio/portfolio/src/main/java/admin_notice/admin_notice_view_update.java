package admin_notice;

import java.sql.*;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class admin_notice_view_update {
	String msg = null;
	public void view_update(ArrayList<String> list) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String file ="notice_file='', ";
			if(list.get(4)!="") {
				file="notice_file='"+list.get(4)+"', ";
			}
			String sql ="update admin_notice set notice_print='"+list.get(1)+"', notice_title='"+list.get(2)+"', notice_writer='"+list.get(3)+"', "+file+"notice_text='"+list.get(6)+"', notice_date='"+list.get(7)+"' where idx='"+list.get(0)+"'";
			PreparedStatement ps = ct.prepareStatement(sql);
			int n=0;
			n = ps.executeUpdate();
			if(n>0) {
				this.msg="success";
			}
			else{
				throw new Exception("error");
			}
			ct.close();
			ps.close();
		} catch (Exception e) {
			this.msg="fail";
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
