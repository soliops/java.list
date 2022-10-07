package admin_product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import admin_configure.dbconfig;

public class admin_product_select {
	ArrayList<Map<String,Object>> ar =null;
	ArrayList<Object> page= null;
	public void product_select(String product, String search, String pgno) {
		Connection ct = null;
		try {
			int pageview = 10;
			int startpage = 0;
			double pagenumber = 1;
			int total = 0;
			
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String countsql = "select count(*) as count from product;";
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
			String sql="";
			if(product==""&&search=="" || product==null && search==null || product=="null" && search=="null") {
				sql = "select * from product order by product_code asc limit "+startpage+","+pageview+";";			
			}
			else {
				if(product.equals("0")) {
					sql="select * from product where product_name like '%"+search+"%' order by product_code asc limit "+startpage+","+pageview+";";
				}
				else{
					sql="select * from product where product_code like '%"+search+"%' order by product_code asc limit "+startpage+","+pageview+";";					
				}
			}
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.ar = new ArrayList<Map<String,Object>>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String, Object>();
				m.put("pidx",rs.getString("pidx"));
				m.put("cbcate_code",rs.getString("cbcate_code"));
				m.put("cscate_code",rs.getString("cscate_code"));
				m.put("product_code",rs.getString("product_code"));
				m.put("product_name",rs.getString("product_name"));
				m.put("product_addexplain",rs.getString("product_addexplain"));
				m.put("product_price",rs.getString("product_price"));
				m.put("product_discount",rs.getString("product_discount"));
				m.put("product_disprice",rs.getString("product_disprice"));
				m.put("product_stock",rs.getString("product_stock"));
				m.put("product_sale",rs.getString("product_sale"));
				m.put("product_saleout",rs.getString("product_saleout"));
				m.put("product_img1",rs.getString("product_img1"));
				m.put("product_img2",rs.getString("product_img2"));
				m.put("product_img3",rs.getString("product_img3"));
				m.put("product_explain",rs.getString("product_explain"));
				this.ar.add(m);
			}
			ct.close();
			ps.close();
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
