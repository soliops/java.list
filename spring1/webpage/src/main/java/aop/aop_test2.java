package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop_test2 {
	
	@RequestMapping("/aop_test2.do")
	public void aop_test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
		aop_test_class2 atc2 = ac.getBean("aop_test2",aop_test_class2.class);
		String msg = atc2.getName()+"님의 나이는 "+atc2.getAge()+"이며 회원등급은 "+atc2.getLevel()+"입니다.";
		System.out.println(msg);
	}
}
