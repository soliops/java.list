package nice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class nice {
	private String username =null;
	private String usertel =null;
	
//	@RequestMapping(value="/nice_joinok.do",produces="text/html; charset=UTF-8",method=RequestMethod.POST)
	//username, usertel : (front에서 넘어오는 값)
	@PostMapping(value="/nice_joinok.do", produces= "text/html; charset=utf-8")
	public String nice_method(Model m, String username, String usertel) {
		this.username  = username;
		this.usertel = usertel;
		m.addAttribute("username",this.username);
		m.addAttribute("usertel",this.usertel);
		
		return "nice_check";
	}
}
