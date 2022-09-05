package mydb;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class select3 {
	
	@Autowired
	BasicDataSource datasource; 
	
	@RequestMapping("select3.do")
	public String lombok(Model m) {
		//lombok 클래스로 값을 전달하게 됨
		lombok_dao ld = new lombok_dao();
		//각 setter 값을 전달
		ld.setUsername("홍길동");
		ld.setUserid("hong");
		ld.setUserage("52");
		//각각의 DAO 값을 가져오는 getter 부분
		m.addAttribute("mname",ld.getUsername());
		m.addAttribute("mid",ld.getUserid());
		m.addAttribute("mage",ld.getUserage());
		
		//view로 처리하는 부분
		return "view/select3";
	}
}
