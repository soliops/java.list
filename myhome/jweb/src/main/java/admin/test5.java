package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class test5 extends HttpServlet {
	PrintWriter pr = null;
	String key=null;
	private static final long serialVersionUID = 1L;
       
   
    public test5() {
    }

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//url에 직접적으로 접근시 무조건 doget으로 발동
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		this.pr= response.getWriter();
		if(this.key==""||this.key==null) { //해당 키값은 무조건 null로 처리함
			this.pr.print("<script>"
					+ "alert('올바른 접근 방식이 아닙니다.');"
					+ "history.go(-1);"
					+"</script>"
					);
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		this.key = request.getParameter("key").intern();
		this.pr= response.getWriter();
		if(this.key=="" || this.key==null) { 
			this.pr.print("<script>"
					+ "alert('올바른 접근 방식이 아닙니다.');"
					+ "history.go(-1);"
					+"</script>"
					);
		}
		else if(this.key=="loginpost") { //키값이 확인 되었을 경우
			String mid =request.getParameter("mid");
			String mpass =request.getParameter("mpass");
			//Database 연결
		}
	}

}
