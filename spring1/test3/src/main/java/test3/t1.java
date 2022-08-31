package test3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class t1{
	@RequestMapping("/notice")
	public String n(HttpServletRequest req) {
		String msg = "게시판 공지사항 내용 출력";
		req.setAttribute("msg", msg);
		return "view/dataview";
	}
	
	@RequestMapping("/notice_write")
	public String n2(Model model) { // model로 자료를 저장하는 형태
		String msg ="게시판 글쓰기 페이지";
		model.addAttribute("msg",msg);
		return "view/dataview";
	}
	
//	@RequestMapping("/sum")
//	public String sums(HttpServletRequest req, Model model) {
//		int data1 = Integer.parseInt(req.getParameter("a"));
//		int data2 = Integer.parseInt(req.getParameter("b"));
//		Object data3 = data1 * data2;
//		model.addAttribute("msg",data3);
//		return "view/dataview";
//	}
	@RequestMapping("/sum") //매핑주소 (가상의 주소)
	public String sums(Model model, int a, int b) {
		//int a, int b : 파라미터 값(GET,POST)
		int data1 = a + b;
		model.addAttribute("msg",data1);
		return "view/dataview";
	}
	
	@RequestMapping("/login.do")
	public String indata() { //view만 사용 ( model X)
		return "view/indata";
	}
	/*아이디 찾기 mapping 및 class 주소
	@ModelAttribute : POST, GET, PUT ...  값이 전송이 되면 오브젝트 형태로 매핑을 해주게 됩니다.
	매핑형태는 해당 class를 로드한후 변수값과 전송된 값을 비교하여 자동으로 매칭 시켜 줍니다.
	@SessionAttribute : Session
	*/
	@RequestMapping("/loginok.do")
	public String searchid(Model m, @ModelAttribute login login) {		
		String userid = "";
		if(login.getUsernm().equals("홍길동")&& login.getUseremail().equals("hong@nate.com")) {
			userid = "hong_giledong";
		}
		else {
			userid="해당 아이디는 찾을 수 없습니다.";
		}
		//View로 값을 출력하도록 하는 부분
		m.addAttribute("usernm",login.getUsernm());
		m.addAttribute("useremail",login.getUseremail());
		m.addAttribute("userid",userid);
		return "/view/result";
	}
	
}
