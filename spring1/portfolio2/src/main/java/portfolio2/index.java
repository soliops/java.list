package portfolio2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
	
	@RequestMapping(value= {"/","/index","/index.do","/index.html"})
	public String home(Model m, HttpServletRequest req) {
		String idx = "123";
		
		m.addAttribute("i",idx);
		System.out.println(idx);
		
		return "index";
	}
}
