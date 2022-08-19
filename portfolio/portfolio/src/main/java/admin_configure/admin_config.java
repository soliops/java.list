package admin_configure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_config extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public admin_config() {
     
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	admin_siteinfo_select ass = new admin_siteinfo_select();
    	ArrayList<admin_siteinfo_select> als = ass.selectdata();
    	req.setAttribute("cf_list", als);
    	RequestDispatcher rd = req.getRequestDispatcher("./admin_config.jsp");
    	rd.forward(req, resp);
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
