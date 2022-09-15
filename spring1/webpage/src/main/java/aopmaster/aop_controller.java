package aopmaster;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop_controller {
	@Autowired
	private BasicDataSource dataConnect;
	
	@RequestMapping("/aop.do")
	public void aop(String idx) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aopmaster.xml");
		
		//interface를 사용시 해당 interface 메소드 이름을 먼저 로드 해야 합니다.
		//web에서는 implements를 실행하지 못함. 객체지향 프로그램형태 이므로
		//interface를 로드해야 하며, aopmaster.xml에서 id로 연결된 class를 로드하게 됩니다.
		aop_service as = ac.getBean("service_class1",aop_service.class);
		
//		System.currentTimeMillis();//지연시간 시작
		
		//aop에서는 DB Connect을 객체프로그램에서 직접적으로 운영하기는 힘듭니다.
		//why? XML에서 로드하여 출력하기 때문에 다른 XML을 인식하지 못하는 상황이 발생합니다.
		try {
			System.out.println(idx);
			Connection ct = dataConnect.getConnection();
//			String sql = as.insertdb("./review/aop.jpg"); 
			//해당 값을 주입시킵니다. sql문법으로 return받고 
//			PreparedStatement ps = ct.prepareStatement(sql); //실행
//			ps.executeUpdate(); //DB입력
			
			//삭제파트
			String delete_sql = as.deletedb(idx); //sql문법 return
			PreparedStatement ps = ct.prepareStatement(delete_sql); //실행
			ps.executeUpdate(); //DB입력
			
			
			System.out.println("웹 프로그램 실행");
			as.modify();
			//aop_servicetemp 안에 메소드를 실행시키면, aop_daotemp가 적용되도록 합니다.
			System.out.println("웹 프로그램 실행");			
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
	}
}
