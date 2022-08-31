package test3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class info {
	
	//url에 method를 연결시켜주는 어노테이션 입니다.
	@RequestMapping("/userinfo")
	public String abc(Model model) { 
		//ModelAndView : 배열 키값이 있는 형태로 저장하는 방식
		//Model : 서버 메모리에 자료를 저장하는 방식
		String user="홍길동";
		String msg = user+ "님 환영 합니다.";
		model.addAttribute("username",msg);
		//admin이라는 디렉토리 안에 info.jsp를 맵핑하세요 라는 뜻
		return "admin/info";
		//return "/WEB-INF/view/info.jsp";
		//mapping.xml에 view-resolvers 설정하지 않을 경우
	}
}
