package test3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class api {
	//HttpServletResponse resp : 외부서버에 대한 값을 전달
//	@RequestMapping("/check_page.do")
//	public void postck (@ModelAttribute ck ck, Model m, HttpServletResponse resp) throws IOException {
//		String result="";
//		if(ck.getSecurity().intern()=="a123456") {
//			result="ok";
//		}
//		else {
//			result="cancel";
//		}
////		m.addAttribute("result",result);
//		String url = "http://192.168.100.210:8080/test3/result.jsp?result="+result;
//		resp.sendRedirect(url);
//	}
	//@RequestParam : 받는 변수값을 다른 변수명으로 변환할 때 사용하게 됩니다.
	@RequestMapping("/dataload.do")
	public String da(Model m,@RequestParam("users") String user2) {
		String callsign = user2;
		String call="";
		if(callsign.equals("hong")) {
			call="ok";
		}
		else {
			call="no";
		}
		m.addAttribute("call",call);
		return "result";
	}
}
