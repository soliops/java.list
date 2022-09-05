package mydb;

import java.sql.Connection;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class select4 {
	@Inject
	//private DataSource dataSource;
	private SqlSessionFactory sqlFactory;
	
	Connection ct = null;
	@RequestMapping("/select4.do")
	public String homepage(Model m ) {
		try {
//			ct = this.dataSource.getConnection();
			SqlSession session = sqlFactory.openSession();
			System.out.println("DB연결");
		} catch (Exception e) {
		}
		return "view/select4";
	}
}
