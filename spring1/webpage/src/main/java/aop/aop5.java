package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop5 {
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean3.xml");

	@RequestMapping("/aop5.do")
	public void aop5_method() {

		//test1이라는 객체가 메모리에 등재
		aop_class5 a = ac.getBean("test1",aop_class5.class);
		//test2이라는 객체가 메모리에 등재
		aop_class5 b = ac.getBean("test2",aop_class5.class);
		//test1이라는 객체를 메모리에서 로드
		aop_class5 c = ac.getBean("test3",aop_class5.class);
		if(a==c) {
			System.out.println("a와 c에 있는 인스턴스는 같습니다.");
		}
		else {
			System.out.println("c의 인스턴스는 새로운 주소값입니다.");			
		}
		if(a!=b) {
			System.out.println("b의 인스턴스는 새로운 주소값입니다.");	
		}
		else {
			System.out.println("a와 b에 있는 인스턴스는 같습니다.");
		}
		int aa=12;
		int bb=5;
		int sum=2;
		sum+= ++aa * bb-- /4;
		System.out.println(++aa);
		System.out.println(bb--);
		System.out.println(sum);
	}
}
