package admin_main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class admin_main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public admin_main() {
      
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html;charset=utf-8");
			HttpSession session = req.getSession();
			String id = (String)session.getAttribute("admin_id");
			if(id!=null||id!=""){
				admin_list_select als = new admin_list_select();
				als.list_data(id);
				ArrayList<Map<String,Object>> all = als.al_data();
				req.setAttribute("als", all);
				RequestDispatcher rd = req.getRequestDispatcher("./admin_main.jsp");
				rd.forward(req, resp);
			}
		} catch (Exception e) {
		
		}

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
