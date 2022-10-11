package portfolio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.inject.Inject;

@Controller
public class cs {
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Autowired
	BasicDataSource dataSource;
	
	@RequestMapping("/cs.do")
	public String page(HttpServletRequest req, Model m) throws Exception {
		String cate = req.getParameter("cate");
		Connection ct = dataSource.getConnection();
		String sql = null;
		if(cate==null||cate=="") {
			sql = "select * from faq_list where f_check='Y' limit 0,5";			
		}
		else {
			sql = "select * from faq_list where f_check='Y' and fcategory='" + cate + "'";
		}
		PreparedStatement ps = ct.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Map<String,String>> data = new ArrayList<Map<String,String>>();
		while (rs.next()) {
			Map<String,String> mp = new HashMap<String,String>();
			mp.put("fidx", rs.getString("fidx"));
			String msg="";
			switch(rs.getString("fcategory")) {
			case "1":
				msg="배송문의";
				break;
			case "2":
				msg="반품/교환문의";
				break;
			case "3":
				msg="상품문의";
				break;
			case "4":
				msg="쿠폰내역";
				break;
			case "5":
				msg="마일리지내역";
				break;
			default:
				msg="기타문의";
				break;
			}
			mp.put("fcategory", msg);
			mp.put("fname", rs.getString("fname"));
			mp.put("f_qtext", rs.getString("f_qtext"));
			mp.put("f_atext", rs.getString("f_atext"));
			data.add(mp);		
		}
		m.addAttribute("data",data);
		ct.close();
		ps.close();
		return "cs";
	}
	@RequestMapping("/notice.do")
	public String notice_page(HttpServletRequest req, Model m) throws Exception {
		String pgno = req.getParameter("page");
		if(pgno==null||pgno=="") {
			pgno="1";
		}
		notice_select ns = new notice_select();
		System.out.println("처음");
		ns.list_select();
		ArrayList<Map<String,Object>> notice_list = ns.select_list();
		System.out.println("중간");
		System.out.println(notice_list);
//		ns.nlist_select(pgno);
//		ArrayList<Map<String,Object>> notice_nlist = ns.select_list();
//		m.addAttribute("notice_list",notice_list);
//		m.addAttribute("notice_nlist",notice_nlist);
//		ArrayList<Object> page_data = ns.page_data();
//		m.addAttribute("page_data", page_data);
		return "notice";
	}
}
