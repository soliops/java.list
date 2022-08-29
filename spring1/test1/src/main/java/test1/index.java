package test1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class index implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("test");
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Spring 잘 되고 있습니다.");
		//sevView : URL이 이동되면서 완전 다른 화면으로 이동할 때
		//setViewName : URL 변화가 없고, 해당 화면을 자신의 페이지에서 출력 및 request가 가능함
//		mv.setViewName("/WEB-INF/view/index.jsp");
		//view 실제 디렉토리명을 바탕으로 제작해야함
		return mv;
	}
	
}
