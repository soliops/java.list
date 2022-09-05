package mydb;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class select2 {
	@Autowired
	BasicDataSource datasource; //dbconnect.xml 로드
	
    //생략가능
	public void setdb(BasicDataSource datasource) {
		this.datasource = datasource;
	}//생략하면 this.빼고 값을 던져야함
	
	@RequestMapping("/select2.do")
	public String dbselect2(Model m) {
		//model_dao (DAO Class를 호출하면서 db정보를 DI 해주는 형태)
		model_dao da = new model_dao(this.datasource);
		String ct = da.d_select();
		m.addAttribute("count",ct);
		return "view/select2";
	}
}
