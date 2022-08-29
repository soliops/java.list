package admin_product;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import admin_configure.dbconfig;

public class admin_category_select {
	ArrayList<Map<String,Object>> ar =null;
	ArrayList<Object> page= null;
	public void category_select(String cate, String search, String pgno) {
		Connection ct = null;
		try {
			int pageview = 10;
			int startpage = 0;
			double pagenumber = 1;
			int total = 0;
			
			dbconfig db = new dbconfig();
			ct = db.cafe24();
			String countsql = "select count(*) as count from category;";
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
			if(cate==""&&search=="" || cate==null && search==null || cate=="null" && search=="null") {
				sql = "select * from category order by classcode asc;";				
			}
			else {
				if(cate.equals("0")) {
					sql="select * from category where cbcate_name like '%"+search+"%' or cscate_name like '%"+search+"%' order by classcode asc limit "+startpage+","+pageview+";";
				}
				else{
					sql="select * from category where cbcate_code like '%"+search+"%' or cscate_code like '%"+search+"%' order by classcode asc; limit "+startpage+","+pageview+";";					
				}
			}
			
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.ar = new ArrayList<Map<String,Object>>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String, Object>();
				m.put("classcode",rs.getString("classcode"));
				m.put("cbcate_code",rs.getString("cbcate_code"));
				m.put("cbcate_name",rs.getString("cbcate_name"));
				m.put("cscate_code",rs.getString("cscate_code"));
				m.put("cscate_name",rs.getString("cscate_name"));
				m.put("cate_use",rs.getString("cate_use"));
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
