package portfolio2;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class item {
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Resource(name="it")
	private item_sql item_sql;
	
	@RequestMapping("/item.do")
	public String item_page(Model m,HttpServletRequest req,			
			@RequestParam(name = "cate",defaultValue = "1") String cate,
			@RequestParam(name = "num", defaultValue = "1") Integer num
			) throws Exception {
		String url = req.getServletContext().getRealPath("");
		SqlSession session = sqlFactory.openSession();
		item_dao list = item_sql.list_select(num);
		m.addAttribute("list",list);
		return "item";
	}
}
