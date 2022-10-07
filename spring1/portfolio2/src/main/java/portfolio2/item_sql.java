package portfolio2;

import java.util.*;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("it")
public class item_sql {
	item_dao ido = null;

	@Resource(name="sqlTemp")
	private SqlSessionTemplate session;
	
	public item_dao list_select (int num){
		ido = new item_dao();
		ido.setPidx(num);
		item_dao list = session.selectOne("sql.item_sel",ido);
		return list;
	}
}
