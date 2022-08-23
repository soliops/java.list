package admin_configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class admin_notice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public admin_notice() {
       
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	try {
    		notice_list_select nls = new notice_list_select();
    		nls.list_select();
    		ArrayList<Map<String,Object>> notice_list = nls.select_list();
    		req.setAttribute("notice_list", notice_list);

    		nls.nlist_select();
    		ArrayList<Map<String,Object>> notice_nlist = nls.select_list();
    		req.setAttribute("notice_nlist", notice_nlist);

    		RequestDispatcher rd = req.getRequestDispatcher("./admin_notice.jsp");
    		rd.forward(req, resp);
    		
    	}catch (Exception e) {
		}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
