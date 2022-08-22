package admin_configure;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public index() {
     
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    	 HttpSession session = req.getSession();
//    	 String id = (String)session.getAttribute("admin_id");
//    	 PrintWriter pw = resp.getWriter();
// 		if(id!=null){        
//     	pw.print("<script>location.href='./admin_main.html';</script>");
//     	}
    	RequestDispatcher rd = req.getRequestDispatcher("./index.jsp");
    	rd.forward(req, resp);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
