package test3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mydb.model_dao;

@Controller
public class dbquerys {
	//DI : (Dependency Injection)
	//IOC : (객체에 따른 의존성 메소드 호출) - bean과 연계
	//ioc에 등록된 bean에 대한 id값을 가져와서 사용하는 형태
	String data = null;
	@Autowired //ioc에 등록된 bean에 대한 id값 가져오기
	BasicDataSource dataSource; //xml에서 DB정보르 가져옴
	Connection ct = null;
	PreparedStatement ps = null;
	
	@RequestMapping("insert.do")
	public String dbinsert (Model m) throws Exception{
		ct = dataSource.getConnection();
		String sql = "insert into test3 values ('0',?,?,?,?,?)";
		String msg = "error";
		ps = ct.prepareStatement(sql);
		ps.setString(1, "park");
		ps.setString(2, "qwer1234");
		ps.setString(3, "박찬호");
		ps.setString(4, "01012349090");
		ps.setString(5, "48");
		int n = ps.executeUpdate();
		if(n>0) {
			msg="ok";
		}
		m.addAttribute("msg",msg);
		return "insert";
	}
	@RequestMapping("/update.do")
	public String dbupdate(Model m) throws Exception{
		ct = dataSource.getConnection();
		String sql = "update test3 set mpw=?,mnm=?,mtel=?,mage=? where mid=?";
		ps = ct.prepareStatement(sql);
		ps.setString(1, "qwer1234");
		ps.setString(2, "박찬호");
		ps.setString(3, "01011119876");
		ps.setString(4, "45");
		ps.setString(5, "park");
		int n = ps.executeUpdate();
		String msg ="error";
		if(n>0) {
			msg="ok";
		}
		m.addAttribute("msg",msg);
		return "update";
	}
	@RequestMapping("/delete.do")
	public String dbdelete(Model m) throws Exception{
		ct = dataSource.getConnection();
		String sql = "delete from test3 where mid=?";
		ps = ct.prepareStatement(sql);
		ps.setString(1, "park");
		int n = ps.executeUpdate();
		String msg ="error";
		if(n>0) {
			msg="ok";
		}
		m.addAttribute("msg",msg);
		return "delete";
	}
	@RequestMapping("/select.do")
	public String db_select (Model m) {
		try {
			//database 로드하는 부분
			ArrayList<model_dao> list = new ArrayList<model_dao>();
			ct = dataSource.getConnection();
			String sql = "select * from test3";
			ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			//DAO를 사용하지 않고, 배열형태로 생성 후 view에서 jstl로 출력시키는 형태
			ArrayList<Map<String,Object>> pso = new ArrayList<Map<String, Object>>();
			while(rs.next()) {
				//DB에 있는 필드값을 map으로 이관하는 형태
				Map<String,Object> mp =new HashMap<String, Object>();
				mp.put("midx",rs.getString("midx"));
				mp.put("mid",rs.getString("mid"));
				mp.put("mpw",rs.getString("mpw"));
				mp.put("mnm",rs.getString("mnm"));
				mp.put("mtel",rs.getString("mtel"));
				mp.put("mage",rs.getString("mage"));
				pso.add(mp); //모든 데이터를 반복하면 ArrayList 생성
				}
				m.addAttribute("pso",pso);
				rs.close();
				ct.close();
			/*
			 배열을 설정
			 BO - 정보를 직접 확인해 보시길 
			 class DAO, DTO(VO)
			 DAO - 생성(create), 읽기(select), 갱신(update), 삭제(delete)
			 DTO - 읽기(select) - getter, setter
			 Data Access Object 객체생성(getter, setter)
			 Data Transfer Object 계층간 데이터 교환
			 VO (Value Object) 
			 */
				//Map (setter, getter)
				//add (키 배열로 등록)
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(ps !=null)ps.close();
				if(ct!=null)ct.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return "view/select";
	}
}
