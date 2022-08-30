package test3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class index implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		test3.dbservice ds = new dbservice("lee", "qwer1234", "이순신", "01023456789", "30");
		listdb ld = new listdb();
		String msg = ld.insert(ds);
		mv.addObject("msg",msg);
		mv.setViewName("/index.jsp");
		return mv;
	}
	
}
