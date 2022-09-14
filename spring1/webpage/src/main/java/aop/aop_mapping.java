package aop;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

//web 실행부분
@Controller
public class aop_mapping {
	@Autowired
	BasicDataSource dataConnect;
	ApplicationContext ac =new ClassPathXmlApplicationContext("aop_log.xml");

	Connection ct = null;
	PreparedStatement ps = null;
	@RequestMapping("/memberin.do")
	public void memberin(){
		try {
			String mid="jung";
			String pass = "a123456";
			//MD5로 해당 값을 암호화로 변경함
			String pass2 = DigestUtils.md5DigestAsHex(pass.getBytes());
			String mnm = "정경호";
			String mtel = "01023467774";
			String mage = "37";
			
			String sqls = "insert into test3 values ('0',?,?,?,?,?)";
			this.ct = dataConnect.getConnection();
			this.ps = this.ct.prepareStatement(sqls);
			this.ps.setString(1, mid);
			this.ps.setString(2, pass2);
			this.ps.setString(3, mnm);
			this.ps.setString(4, mtel);
			this.ps.setString(5, mage);
			int n = 0;
			n = this.ps.executeUpdate();
			if(n>0) {
				System.out.println("회원 가입이 완료 되었습니다.");
			}
			else {
				System.out.println("회원 가입 실패");
			}
			aop_query aq = ac.getBean("querys",aop_query.class);
			aq.insert();			
		}
		catch (Exception e) {
			
		}
	}
	@RequestMapping("/memberdel.do")
	public void memberdel() {
		try {
			//query 클래스에 delete 메소드 실행
			aop_query aq = ac.getBean("querys",aop_query.class);
			aq.delete();			
		} catch (Exception e) {
		}
		
	}
}
