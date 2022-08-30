package test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // controller 임을 알려주는 표시 파일
@RequestMapping("/getinfo")
public class getinfo{
	
//	@GetMapping("/data") //Get 형태로 데이터를 받음
	@RequestMapping(value="/t1", method=RequestMethod.GET)
	public String t1_get () {
		return "getinfo/t1";
	}
//	@PostMapping("/data2") //Post 형태로 데이터를 받음
	@RequestMapping(value="/t2", method=RequestMethod.POST)
	public String t2_post() {
		return "getinfo/t2";
	}
	
}
