package admin_shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import admin_configure.dbconfig;

public class coupon_select {
	ArrayList<Map<String,Object>> ar =null;
	ArrayList<Object> page= null;
	public void coupon_select(String pgno) {
		Connection ct = null;
		try {
			int pageview = 5;
			int startpage = 0;
			double pagenumber = 1;
			int total = 0;
			
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String countsql = "select count(*) as count from coupon;";
			PreparedStatement psct = ct.prepareStatement(countsql);
			ResultSet rsct = psct.executeQuery();
			while(rsct.next()) {
				total = rsct.getInt("count");
			}
			if(pgno==null||pgno=="" ||pgno=="null") {
				startpage=0;
			}
			else {
				startpage=((Integer.parseInt(pgno))-1)*pageview;
			}
			if(total%pageview==0) {
				pagenumber=total/pageview;
			}
			else {
				pagenumber=(total/pageview)+1;
			}
			this.page = new ArrayList<>();
			this.page.add(pageview);
			this.page.add(pagenumber);
			this.page.add(startpage);
			this.page.add(total);
			String sql = "select * from coupon order by cidx asc limit "+startpage+","+pageview+";";				
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.ar = new ArrayList<Map<String,Object>>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String, Object>();
				m.put("cidx",rs.getString("cidx"));
				m.put("coupon_name",rs.getString("coupon_name"));
				m.put("coupon_kind",rs.getString("coupon_kind"));
				m.put("coupon_publish_date",rs.getString("coupon_publish_date"));
				m.put("coupon_expiration_date",rs.getString("coupon_expiration_date"));
				m.put("coupon_type",rs.getString("coupon_type"));
				m.put("coupon_discount",rs.getString("coupon_discount"));
				m.put("minimum_price",rs.getString("minimum_price"));
				m.put("coupon_img",rs.getString("coupon_img"));
				this.ar.add(m);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public ArrayList<Map<String,Object>> list (){
		return this.ar;
	}
	public ArrayList<Object> page_data(){
		return this.page;
	}
}
