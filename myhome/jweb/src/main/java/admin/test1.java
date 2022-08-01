package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public test1() {

	}

	public void init(ServletConfig config) throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pr = response.getWriter();
		String s = request.getParameter("sdate").intern();
		String e = request.getParameter("edate").intern();
		/*
		pr.print(s);
		pr.print(e);
		 */
		pr.print("ok");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
