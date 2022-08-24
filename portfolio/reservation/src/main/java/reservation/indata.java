package reservation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class indata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public indata() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		Enumeration<String> em = request.getParameterNames();
		ArrayList<String> ar = new ArrayList<>();
		while(em.hasMoreElements()) {
			String allcheck = em.nextElement();
			String emcheck= request.getParameter(allcheck);
			ar.add(emcheck);
		}
		indata_put ip = new indata_put();
		ip.indata(ar);
		String msg=ip.call_sign();
		if(msg=="success") {
			pw.print("<script>alert('입력 완료했습니다.'); location.href='http://192.168.100.210:8080/list.html';</script>");
		}
		else {
			pw.print("<script>alert('입력 실패했습니다.'); history.go(-1);</script>");			
		}
	}

}
