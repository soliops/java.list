package reserve_check;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class check_view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public check_view() {
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html; charset=UTF-8");
    	
    	RequestDispatcher rd = req.getRequestDispatcher("reserve_check.jsp");
    	rd.forward(req, resp);
    }
}
