package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aop6 {
	ApplicationContext ac = new ClassPathXmlApplicationContext("aop1.xml");
	
	@RequestMapping("/member_insert.do")
	public void member_insert() throws Exception {
		aop_class6 ac6 = ac.getBean("member",aop_class6.class);
		//System.currentTimeMillis() : 메소드가 실행하는 지연시간을 확인 할 때 사용하는 클래스 입니다.
		long start = System.currentTimeMillis(); //시작시간
		ac6.memberin();
		long end = System.currentTimeMillis(); //종료시간
		long result = end-start; //최종 해당 메소드 지연시간 확인
		System.out.println(result);
		ac6.memberinfo();
		ac6.memberlogin();
		ac6.memberupdate();
		ac6.memberdel();

	}
}
