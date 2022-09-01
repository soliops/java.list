package test3;

import java.sql.*;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dbquerys {
	//DI : (Dependency Injection)
	//IOC : (객체에 따른 의존성 메소드 호출) - bean과 연계
	//ioc에 등록된 bean에 대한 id값을 가져와서 사용하는 형태
	String data = null;
	@Autowired
	BasicDataSource dataSource;
	@RequestMapping("/select.do")
	public String db_select (Model m) {
		Connection ct = null;
		PreparedStatement ps = null;
		try {
			ct = dataSource.getConnection();
			String sql = "select count(*) as cnt from test3;";
			ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				data = rs.getString("cnt");
				m.addAttribute("data_rows",data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(ps!= null) {
					ps.close();}
				if(ct!=null) {
					ct.close();
				}
			} catch (SQLException f) {
				f.printStackTrace();
			}
		}
		return "view/select";
	}
}
