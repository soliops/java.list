package admin_product;

import java.sql.*;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class admin_product_check {
	String msg = null;
	String msg2 =null;
	public void code_check(String data) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql ="select * from product where product_code='"+data+"';";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> ar = new ArrayList<>();
			while(rs.next()) {
				ar.add(rs.getString("product_code"));
			}
			if(ar.size()==0) {
				this.msg="success";
			}
			else {
				throw new Exception();
			}
			ct.close();
		} catch (Exception e) {
			this.msg="fail";
		}
	}
	public String call_sign() {
		return this.msg;
	}
	public void catecode_check(String data2,String data3) {
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from category where cbcate_code='"+data2+"';";
			PreparedStatement ps1 = ct.prepareStatement(sql);
			ResultSet rs1 = ps1.executeQuery();
			ArrayList<String> ar1 = new ArrayList<>();
			while(rs1.next()) {
				ar1.add(rs1.getString("cbcate_code"));
			}
			if(ar1.size()==0) {	
			String sql2 ="select * from category where cbcate_code='"+data2+"' and cscate_code='"+data3+"';";
			PreparedStatement ps = ct.prepareStatement(sql2);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> ar = new ArrayList<>();
			while(rs.next()) {
				ar.add(rs.getString("cbcate_code"));
				ar.add(rs.getString("cscate_code"));
			}
			if(ar.size()==0) {
				this.msg2="success";
			}
			else {
				this.msg2="fail2";
			}
			}
			else {
				throw new Exception();				
			}
			ct.close();
		} catch (Exception e) {
			this.msg2="fail";
		}
	}
	public String call_sign2() {
		return this.msg2;
	}
}
