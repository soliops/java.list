package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop7 {
	
	@RequestMapping("/aop7.do")
	public void aop7_method() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop7.xml");
		//객체 프로그램을 로드
		aop_class7 ac7 = ac.getBean("core",aop_class7.class);
		ac7.aop_test(5);//객체프로그램에 있는 클래스 중 해당 메소드 호출
		ac7.aop_test(-5);
		ac7.aop_test(15);
		ac7.aop_test(-15);
		//메소드가 호출 될 때마다 log aop는 작동하게됨
		System.out.println("데이터 입력완료");
	}
}
