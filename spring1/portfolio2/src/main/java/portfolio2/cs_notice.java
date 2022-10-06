package portfolio2;

import java.util.*;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cs_notice {
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Resource(name="cs_session")
	private cs_sql cs_sql;
	
	@RequestMapping("/notice.do")
	public String notice_page(HttpServletRequest req, Model m) throws Exception{
		SqlSession session = sqlFactory.openSession();
		String pgno = req.getParameter("page");
		pgno = pgno==null||pgno=="" ? "1" : pgno ;
		String cate = req.getParameter("category");
		cate = cate==null||pgno=="" ? "0" : cate;
		String search = req.getParameter("search_text");
		search = search==null||search=="" ? "" : search;
		String check = req.getParameter("p_check");
		check = check==null||check=="" ? "N" : check;
		List<notice_dao> notice_list = cs_sql.cs_notice_sel(search);
		m.addAttribute("notice_list",notice_list);
		int size = cs_sql.cs_count();
		List<notice_dao> notice_list_limit = cs_sql.cs_notice_sel2(pgno,size,cate,search,check);
		m.addAttribute("notice_list_limit",notice_list_limit);
		ArrayList<Object> page_data = cs_sql.pagedata();
		m.addAttribute("page_data", page_data);
		return "notice";
	}
}
