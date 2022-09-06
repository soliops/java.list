package mydb;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class select4 {
	@Inject
	//private DataSource dataSource;
	private SqlSessionFactory sqlFactory;
	
	@Resource(name="xmlj")
	private xmljava xmljava;
	
	@RequestMapping("user_delete.do")
	public String deletemb (Model m,String mid, String mpw, String mnm) {
		try {
			SqlSession delete = sqlFactory.openSession();
			String result = xmljava.userdelete(mid, mpw, mnm);
			m.addAttribute("msg",result);
		} catch (Exception e) {
			
		}
		return "view/deleteok";
	}
	@RequestMapping("member_update.do")
	public String updatemb (Model m,String mid, String mpw, String mnm) {
		try {
			SqlSession modify = sqlFactory.openSession();
			String result = xmljava.userupdate(mid, mpw, mnm);
			m.addAttribute("msg",result);
		} catch (Exception e) {
		}
		return "view/updateok";
	}
	
	@RequestMapping("/select5.do")
	public String insertmb(Model m, String mid, String mpw, String mnm, String mtel, String mage) {
		try {
			SqlSession session = sqlFactory.openSession();
			String call = xmljava.userinsert(mid, mpw, mnm, mtel, mage);
			if(call=="ok") {
				m.addAttribute("msg", call);
			}
			else {
				m.addAttribute("msg","error");
			}
		} catch (Exception e) {
		
		}
//		m.addAttribute("mid",mid);
//		m.addAttribute("mpw",mpw);
//		m.addAttribute("mname",mname);
//		m.addAttribute("mage",mage);

		return "view/insertok";
	}
	
	
	@RequestMapping("/select4.do")
	public String homepage(Model m ) {
		try {
			SqlSession session = sqlFactory.openSession();
//			System.out.println("DB연결");
		
			List<uservo> userlist = xmljava.selectall();
//			m.addAttribute("list",userlist);
//			System.out.println(userlist.size()+"명 입니다.");
			
//			uservo uv = xmlj.selectid("park");
//			System.out.println("사용자 이름 : "+uv.getMnm()
//			+ "사용자 아이디 : "+uv.getMid());
			
			int age = 20;
			List<uservo> datas2 = xmljava.selectage(age);
			m.addAttribute("list",datas2);
			
		} catch (Exception e) {
			System.out.println("연결오류");
			e.printStackTrace();
		}
		return "view/select4";
	}
}
