package admin_info;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class admin_info extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public admin_info() {
      
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
    	HttpSession session = req.getSession();
    	String id = (String)session.getAttribute("admin_id");
    	admin_info_select ais = new admin_info_select();
    	ais.info_select(id);
    	ArrayList<Map<String,Object>> data = ais.ar_data();
    	req.setAttribute("data", data);
    	RequestDispatcher rd = req.getRequestDispatcher("./admin_info.jsp");
    	rd.forward(req, resp);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
