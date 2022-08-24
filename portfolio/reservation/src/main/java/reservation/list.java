package reservation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public list() {

    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        list_select sel = new list_select();
        sel.list_sel();
        ArrayList<Map<String,Object>> list = sel.call_sign();
        req.setAttribute("list", list);
        RequestDispatcher rd = req.getRequestDispatcher("/list.jsp");
        rd.forward(req, resp);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
