package configure;

import java.io.IOException;
import java.util.ArrayList;

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
    	try {
    		dataload dl =new dataload();
    		ArrayList<dataload> list = dl.all_lists(); //해당 메소드에서 배열 리턴값을 배열로 다시 값을 전달 받음
    		req.setAttribute("list", list); //JSP와 연결하기 위한 별명 명칭
    		
			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.forward(req, resp);
			
		}
    	catch (Exception e) {
    		
		}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
