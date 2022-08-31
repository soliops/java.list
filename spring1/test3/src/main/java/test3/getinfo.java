package test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // controller 임을 알려주는 표시 파일
@RequestMapping("/getinfo")
public class getinfo{
	/*
	 Mapping을 사용하는 이유는 컨트롤러를 통합하여 
	 별도의 view가 필요없이 사용할 때 이용하게 됩니다.
	 view 1개 + 컨트롤러 1개 <= 다수의 class 파일들
	 */
	//select, insert, update, delete
	
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
