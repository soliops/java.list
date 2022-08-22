package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public index() {
       
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    RequestDispatcher rd = req.getRequestDispatcher("./main.jsp");
    resp.setContentType("text/html;charset=utf-8");
    String product= "로봇청소기";
	String mid = "홍길동님 환영합니다.";
	String imgs = "../img/thum_new01.png";
	req.setAttribute("msg", mid);
	req.setAttribute("product", product);
	req.setAttribute("imgs", imgs);
	
	
    rd.forward(req, resp);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
