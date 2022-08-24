package reservation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ajax.jsp")
public class ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ajax() {

    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=utf-8");
    	String id = req.getParameter("id").intern();
    	String sign=null;    		
    	if(id=="sejong") {
    		sign="ok";
    	}
    	else {
    		sign="no";
    	}
    	PrintWriter pw = resp.getWriter();
    	pw.write(sign); //ajax 통신에 따른 return
    }

}
