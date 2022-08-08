package configure;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class faq_del extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public faq_del() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String idxs = request.getParameter("idx").intern();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		
		if(idxs==null|| idxs==""){
			pr.write("<script>"
					+ "alert('올바른 접근이 아닙니다.');"
					+ "history.go(-1)"
					+ "</script>");
		}
		else {
			delete_sql ds = new delete_sql();
			String msg = ds.delfaq(idxs).intern();
			if(msg=="success") {
				pr.write("<script>"
						+ "alert('해당 데이터가 정상적으로 삭제 완료 되었습니다.')"
						+ "location.href='./faq_list.html';"
						+ "</script>");
			}
			else {
				pr.write("<script>"
						+ "alert('DB가 올바르지 않습니다.')"
						+ "history.go(-1)"
						+ "</script>");
			}
		}
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
