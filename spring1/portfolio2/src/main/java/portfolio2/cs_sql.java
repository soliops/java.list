package portfolio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("cs_session")
public class cs_sql {
	Map<String,Object> map = null;
	ArrayList<Object> pg =null;
	@Resource(name="sqlTemp")
	private SqlSessionTemplate session;
	
	public List<notice_dao> cs_notice_sel(String search){
		map = new HashMap<String, Object>();
		map.put("search", search);
		List<notice_dao> notice_list = session.selectList("sql.cs_notice_select",map);
		return notice_list;
	}
	public Integer cs_count() {
		return session.selectOne("sql.cs_notice_count");
	}
	public List<notice_dao> cs_notice_sel2(String pgno, int total, String cate, String search,String check){
		int pageview =10;
		int startpage=((Integer.parseInt(pgno)-1))*pageview;
		double pagenumber = 1;
		pagenumber = total%pageview==0 ? total/pageview : (total/pageview)+1;
		this.pg = new ArrayList<Object>();
		this.pg.add(pageview);
		this.pg.add(startpage);
		this.pg.add(pagenumber);
		this.pg.add(total);
		this.pg.add(cate);
		List<notice_dao> notice_list2 = null;
		map = new HashMap<String, Object>();
		map.put("startpage", startpage);
		map.put("pageview",pageview);
		map.put("search", search);
		map.put("check", check);
		notice_list2 = session.selectList("sql.cs_notice_select2",map);
		return notice_list2;
	}
	public ArrayList<Object> pagedata(){
		return this.pg;
	}
}
