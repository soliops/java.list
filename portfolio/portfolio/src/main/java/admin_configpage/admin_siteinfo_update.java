package admin_configpage;

import java.sql.*;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class admin_siteinfo_update {
	String msg = null;
	public void siteinfo_update (ArrayList<String> data) {
		Connection ct =null;
		try {
			dbconfig db = new dbconfig();
			ct=db.cafe24();
			String sql = "update homepage_config set htitle='"+data.get(0)+"',hadmin_email='"+data.get(1)+"',hpoint_use='"+data.get(2)+"',hpoint='"+data.get(3)+"'";
			sql+=",hmember_level='"+data.get(4)+"',hcom_name='"+data.get(5)+"',hbusiness_number='"+data.get(6)+"',hrep_name='"+data.get(7)+"',hrep_tel='"+data.get(8)+"',hmob_number='"+data.get(9)+"'";
			sql+=",hvan_number='"+data.get(10)+"',hpost_number='"+data.get(11)+"',hcom_address='"+data.get(12)+"',hinfomg_name='"+data.get(13)+"',hinfomg_email='"+data.get(14)+"',hbankbook='"+data.get(15)+"'";
			sql+=",haccount_number='"+data.get(16)+"',hcard_use='"+data.get(17)+"',hphone_use='"+data.get(18)+"',hgift_use='"+data.get(19)+"',hpoint_mini='"+data.get(20)+"',hpoint_max='"+data.get(21)+"'";
			sql+=",hreceipt_use='"+data.get(22)+"',hdeli_name='"+data.get(23)+"',hdeli_price='"+data.get(24)+"',hdelidate_use='"+data.get(25)+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			int n = ps.executeUpdate();
			
			if(n>0) {
				this.msg="success";
			}else {
				throw new Exception("error");
			}
		} catch (Exception e) {
			this.msg="fail";
		}
		finally {
			try {
				if(ct!=null) {
					ct.close();
				}
			} catch (Exception e2) {
			}
		}
	}
	public String call_sign() {
		return this.msg;
	}
}
