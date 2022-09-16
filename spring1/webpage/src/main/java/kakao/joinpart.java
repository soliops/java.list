package kakao;

import java.sql.*;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class joinpart {
	
	@Autowired
	BasicDataSource dataConnect;	
	Connection ct = null;
	PreparedStatement ps = null;
	
	//자회사몰 회원가입 페이지(Front)
	@RequestMapping("/join.do")
	public String join() {
		return "join";
	}
	
	//자회사몰 회원등록 페이지(Back)
	@RequestMapping("/joinok.do")
	public String joinok (Model m, String userid, String username, String useremail) {
		try {
			ct = dataConnect.getConnection();
			String sql ="insert into mall values('0',?,?,?)";
			ps = ct.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, username);
			ps.setString(3, useremail);
			int n = 0;
			n = ps.executeUpdate();
			if(n>0) {
				m.addAttribute("result","회원 등록 완료");
			}
			ps.close();
			ct.close();
		} catch (Exception e) {
			m.addAttribute("result",e);
		}		
		return "mall";
	}
	
	
	//카카오 회원가입 및 로그인 체크
	@RequestMapping("/kakaojoin.do")
	public String kakao (Model m, String userid, String username, String useremail) {
		try {
			System.out.println(userid);
			System.out.println(username);
			System.out.println(useremail);
			ct = dataConnect.getConnection();
			String sql ="insert into kakao values('0',?,?,?)";
			ps = ct.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, username);
			ps.setString(3, useremail);
			int n = 0;
			n = ps.executeUpdate();
			if(n>0) {
				m.addAttribute("result","회원 등록 완료");
			}
			ps.close();
			ct.close();
		} 
		catch (Exception e) {
			m.addAttribute("result",e);
		}
		return "kakao";
	}
}
