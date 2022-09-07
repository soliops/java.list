package webpage;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class testweb {
	@Inject
    private SqlSessionFactory sqlFactory;
	
	@Resource(name="dataRepo")
	private DATAREPO repo;
	
	@Autowired
	BasicDataSource dataConnect;
	
	@RequestMapping("/test.do")
	public String abc(Model m) {
		try {
//			System.out.println(sqlFactory.openSession());			
			SqlSession s = sqlFactory.openSession();
			dataDAO dao = repo.select_test("hong");
			m.addAttribute("list",dao.getMnm());
//			System.out.println(dao.getMnm());
		} catch (Exception e) {
			
		}
//		dataDAO da = new dataDAO();
//		da.setMid("hong");
//		da.setMpass("test");
//		System.out.println(da.getMid());
//		System.out.println(da.getMpass());
		return "test";
	}
	
	@RequestMapping("/alltest.do")
	public String ttt(Model m) {
		try {
			SqlSession s = sqlFactory.openSession();		
			List<dataDAO> userlist = repo.selectall();
			m.addAttribute("list",userlist.get(0).getMid());

		} catch (Exception e) {
			System.out.println("연결오류");
			e.printStackTrace();
		}
		return "test";
	}
}
