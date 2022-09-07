package webpage;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("dataRepo")
public class DATAREPO {

	@Resource(name="sqlTemp")
	private SqlSessionTemplate s;
	
	public dataDAO select_test(String mid) {
		dataDAO t = s.selectOne("sql.select_test",mid);
		return t;
	}
	
	public List<dataDAO> selectall() {
		List<dataDAO> userlist = s.selectList("sql.selectall");
		return userlist;
	}
}
