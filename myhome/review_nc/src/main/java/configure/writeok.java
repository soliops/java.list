package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class writeok extends HttpServlet {
	String rname,rproduct,rtext,rscore,msg;
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
   
    public writeok() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		this.rname = request.getParameter("rname");
		this.rproduct = request.getParameter("rproduct");
		this.rscore = request.getParameter("rscore");
		this.rtext = request.getParameter("rtext");
		write_module wm = new write_module();
		ArrayList<String> list = new ArrayList<String>();
		list.add(this.rname);
		list.add(this.rproduct);
		list.add(this.rscore);
		list.add(this.rtext);
		wm.insert(list);
		this.msg = wm.join_msg().intern();
		response.setContentType("text/html;charset=utf-8");
		this.pr = response.getWriter();
		if(this.msg =="success"){
			this.pr.print("<script>"
					+ "alert('리뷰 작성이 완료 되었습니다.');"
					+ "location.href='./review_write.html';"
					+ "</script>");
		}else {
			this.pr.print("<script>"
					+ "alert('올바른 값이 아닙니다.');"
					+ "location.href='./review_write.html';"
					+ "</script>");
		}
	}

}
