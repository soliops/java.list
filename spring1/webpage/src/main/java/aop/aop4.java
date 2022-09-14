package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop4 {
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
	aop_person ap = ac.getBean("person",aop_person.class);
	aop_class4 ac4 = ac.getBean("aop4",aop_class4.class);
	@RequestMapping("/aop4.do")
	public void aop4_data() {
		System.out.println(ap.getName());
		System.out.println(ap.getId());
		System.out.println(ap.getAge());
		System.out.println(ac4.getListdata().get(ap.getLevel()));
	}
}
