package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class joinok extends HttpServlet {
	String mid, mpass, mname, memail, mtel, mpost, maddr1, maddr2;
	PrintWriter pr =null;
	private static final long serialVersionUID = 1L;
       
    public joinok() {
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		this.mid = request.getParameter("userid");
		this.mpass = request.getParameter("userpw");
		this.mname = request.getParameter("usernm");
		this.memail = request.getParameter("useremail");
		this.mtel = request.getParameter("usertel");
		this.mpost = request.getParameter("addr1");
		this.maddr1 = request.getParameter("addr2");
		this.maddr2 = request.getParameter("addr3");
		join_module jm = new join_module();
		this.mpass = jm.pass_sc(this.mpass);//base64변환
		//backend가 확인하는 법 sysout으로 한번에 다 찍고 완성될때까지 페이지는 joinok.do로 유지
		ArrayList<String> list = new ArrayList<String>();
		list.add(this.mid);
		list.add(this.mpass);
		list.add(this.mname);
		list.add(this.memail);
		list.add(this.mtel);
		list.add(this.mpost);
		list.add(this.maddr1);
		list.add(this.maddr2);
		jm.insert(list);
		String r = jm.join_msg();
		response.setContentType("text/html;charset=UTF-8");
		this.pr = response.getWriter();
		if(r=="ok") {
			this.pr.print("<script>"
					+ "alert('회원가입이 정상적으로 등록 완료 되었습니다.');"
					+ "location.href='./index.html';"
					+ "</script>");
		}
		else {
			this.pr.print("<script>"
					+ "alert('데이터가 올바르지 않습니다.');"
					+ "location.href='./join.html'"
					+ "</script>");
		}
	}

}
