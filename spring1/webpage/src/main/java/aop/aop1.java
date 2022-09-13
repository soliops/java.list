package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop1 {
	
	@RequestMapping("/aop1.do")
	public String aop(Model m) {
		//ApplicationContext : 스프링 컨테이너
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		aop_class1 z = (aop_class1)ac.getBean("aa");
		//getBean : bean 태그를 조회할 때 사용합니다.
		aop_class1 zz = ac.getBean("aa",aop_class1.class);
		//getBean( bean id명, 클래스명 )		
		String zresult = z.test() + z.testbox();
//		String zresult = z.test();
		m.addAttribute("result",zresult);
		return "aop1";
	}
}
