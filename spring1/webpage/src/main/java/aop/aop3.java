package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop3 {
	@RequestMapping("/aop3.do")
	public void aop3_box() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		aop_class3 aop = ac.getBean("cc",aop_class3.class);
		System.out.println(aop.getName());
		System.out.println(aop.getAge());
	}
}
