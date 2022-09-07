package webpage;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest : 배열이, 각종 정보를 출력하는 아키텍쳐 형태로 구현하는 웹 서비스
@RestController
public class ctroller2 {
	
	@RequestMapping(value="/ctroller2.do",produces="text/html; charset=utf-8")
	public String confirm() {
		//JSONObject : 배열 라이브러리 클래스
		JSONObject jb = new JSONObject();
		//데이터 di 
		jb.put("idx", 1);
		jb.put("name", "한산");
		jb.put("person", "이순신");
		jb.put("person2", "거북선");
		
		//해당 값을 배열로 생성하게 됨
		String json_parsing = jb.toString();
		
		return json_parsing; //생성된 값을 아키텍쳐 웹에 출력
	}
}
