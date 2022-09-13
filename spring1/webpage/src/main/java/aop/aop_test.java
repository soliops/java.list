package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop_test {
	@RequestMapping("/aop_test.do")
	public void test() {
	ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
	aop_test_class atc = ac.getBean("aop_test",aop.aop_test_class.class);
	atc.setName("김옥자");
	atc.setPoint(2500);
	System.out.println(atc.getName()+"님의 포인트는 "+atc.getPoint()+" 입니다.");
	Object result = atc.message("김옥자","2500");
	System.out.println(result);
	}
}
