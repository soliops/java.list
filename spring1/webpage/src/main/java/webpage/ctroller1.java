package webpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//view와 controller 형태를 같이 사용하는 사항
@Controller
public class ctroller1 {
	
	//ResponseBody : Controller에서 mapping을 사용하더라도 
	//해당 javas에서 웹페이지로 결과값을 바로 출력
	@ResponseBody
	@GetMapping("ctroller.do")
	public String test1() {
		return "ok";
	}
}
