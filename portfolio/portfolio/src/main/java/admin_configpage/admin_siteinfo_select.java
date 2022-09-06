package admin_configpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import admin_configure.dbconfig;

public class admin_siteinfo_select {
	private String htitle = null;
	private String hadmin_email = null;
	private String hpoint_use = null;
	private String hpoint = null;
	private String hmember_level = null;
	private String hcom_name = null;
	private String hbusiness_number = null;
	private String hrep_name = null;
	private String hrep_tel = null;
	private String hmob_number = null;
	private String hvan_number = null;
	private String hpost_number = null;
	private String hcom_address = null;
	private String hinfomg_name = null;
	private String hinfomg_email = null;
	private String hbankbook = null;
	private String haccount_number = null;
	private String hcard_use = null;
	private String hphone_use = null;
	private String hgift_use = null;
	private String hpoint_mini = null;
	private String hpoint_max = null;
	private String hreceipt_use = null;
	private String hdeli_name = null;
	private String hdeli_price = null;
	private String hdelidate_use = null;
	static ArrayList<admin_siteinfo_select> al = null;


	public void setHtitle(String htitle) {
		this.htitle = htitle;
	}
	public String getHtitle() {
		return this.htitle;
	}

	public String getHadmin_email() {
		return hadmin_email;
	}

	public void setHadmin_email(String hadmin_email) {
		this.hadmin_email = hadmin_email;
	}

	public String getHpoint_use() {
		return hpoint_use;
	}

	public void setHpoint_use(String hpoint_use) {
		this.hpoint_use = hpoint_use;
	}

	public String getHpoint() {
		return hpoint;
	}

	public void setHpoint(String hpoint) {
		this.hpoint = hpoint;
	}

	public String getHmember_level() {
		return hmember_level;
	}

	public void setHmember_level(String hmember_level) {
		this.hmember_level = hmember_level;
	}

	public String getHcom_name() {
		return hcom_name;
	}

	public void setHcom_name(String hcom_name) {
		this.hcom_name = hcom_name;
	}

	public String getHbusiness_number() {
		return hbusiness_number;
	}

	public void setHbusiness_number(String hbusiness_number) {
		this.hbusiness_number = hbusiness_number;
	}

	public String getHrep_name() {
		return hrep_name;
	}

	public void setHrep_name(String hrep_name) {
		this.hrep_name = hrep_name;
	}

	public String getHrep_tel() {
		return hrep_tel;
	}

	public void setHrep_tel(String hrep_tel) {
		this.hrep_tel = hrep_tel;
	}

	public String getHmob_number() {
		return hmob_number;
	}

	public void setHmob_number(String hmob_number) {
		this.hmob_number = hmob_number;
	}

	public String getHvan_number() {
		return hvan_number;
	}

	public void setHvan_number(String hvan_number) {
		this.hvan_number = hvan_number;
	}

	public String getHpost_number() {
		return hpost_number;
	}

	public void setHpost_number(String hpost_number) {
		this.hpost_number = hpost_number;
	}

	public String getHcom_address() {
		return hcom_address;
	}

	public void setHcom_address(String hcom_address) {
		this.hcom_address = hcom_address;
	}

	public String getHinfomg_name() {
		return hinfomg_name;
	}

	public void setHinfomg_name(String hinfomg_name) {
		this.hinfomg_name = hinfomg_name;
	}

	public String getHinfomg_email() {
		return hinfomg_email;
	}

	public void setHinfomg_email(String hinfomg_email) {
		this.hinfomg_email = hinfomg_email;
	}

	public String getHbankbook() {
		return hbankbook;
	}

	public void setHbankbook(String hbankbook) {
		this.hbankbook = hbankbook;
	}

	public String getHaccount_number() {
		return haccount_number;
	}

	public void setHaccount_number(String haccount_number) {
		this.haccount_number = haccount_number;
	}

	public String getHcard_use() {
		return hcard_use;
	}

	public void setHcard_use(String hcard_use) {
		this.hcard_use = hcard_use;
	}

	public String getHphone_use() {
		return hphone_use;
	}

	public void setHphone_use(String hphone_use) {
		this.hphone_use = hphone_use;
	}

	public String getHgift_use() {
		return hgift_use;
	}

	public void setHgift_use(String hgift_use) {
		this.hgift_use = hgift_use;
	}

	public String getHpoint_mini() {
		return hpoint_mini;
	}

	public void setHpoint_mini(String hpoint_mini) {
		this.hpoint_mini = hpoint_mini;
	}

	public String getHpoint_max() {
		return hpoint_max;
	}

	public void setHpoint_max(String hpoint_max) {
		this.hpoint_max = hpoint_max;
	}

	public String getHreceipt_use() {
		return hreceipt_use;
	}

	public void setHreceipt_use(String hreceipt_use) {
		this.hreceipt_use = hreceipt_use;
	}

	public String getHdeli_name() {
		return hdeli_name;
	}

	public void setHdeli_name(String hdeli_name) {
		this.hdeli_name = hdeli_name;
	}

	public String getHdeli_price() {
		return hdeli_price;
	}

	public void setHdeli_price(String hdeli_price) {
		this.hdeli_price = hdeli_price;
	}

	public String getHdelidate_use() {
		return hdelidate_use;
	}

	public void setHdelidate_use(String hdelidate_use) {
		this.hdelidate_use = hdelidate_use;
	}

	public ArrayList<admin_siteinfo_select> selectdata (){
		Connection ct = null;
		this.al = new ArrayList<admin_siteinfo_select>();
		try {
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String sql = "select * from homepage_config;";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				admin_siteinfo_select sel = new admin_siteinfo_select();
				sel.setHtitle(rs.getString("htitle"));
				sel.setHadmin_email(rs.getString("hadmin_email"));
				sel.setHpoint_use(rs.getString("hpoint_use"));
				sel.setHpoint(rs.getString("hpoint"));
				sel.setHmember_level(rs.getString("hmember_level"));
				sel.setHcom_name(rs.getString("hcom_name"));
				sel.setHbusiness_number(rs.getString("hbusiness_number"));
				sel.setHrep_name(rs.getString("hrep_name"));
				sel.setHrep_tel(rs.getString("hrep_tel"));
				sel.setHmob_number(rs.getString("hmob_number"));
				sel.setHvan_number(rs.getString("hvan_number"));
				sel.setHpost_number(rs.getString("hpost_number"));
				sel.setHcom_address(rs.getString("hcom_address"));
				sel.setHinfomg_name(rs.getString("hinfomg_name"));
				sel.setHinfomg_email(rs.getString("hinfomg_email"));
				sel.setHbankbook(rs.getString("hbankbook"));
				sel.setHaccount_number(rs.getString("haccount_number"));
				sel.setHcard_use(rs.getString("hcard_use"));
				sel.setHphone_use(rs.getString("hphone_use"));
				sel.setHgift_use(rs.getString("hgift_use"));
				sel.setHpoint_mini(rs.getString("hpoint_mini"));
				sel.setHpoint_max(rs.getString("hpoint_max"));
				sel.setHreceipt_use(rs.getString("hreceipt_use"));
				sel.setHdeli_name(rs.getString("hdeli_name"));
				sel.setHdeli_price(rs.getString("hdeli_price"));
				sel.setHdelidate_use(rs.getString("hdelidate_use"));
				this.al.add(sel);
			}

		} 
		catch (Exception e) {

		}
		return this.al;
		
	}
}
