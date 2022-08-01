package admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class test3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public test3() {

    }

	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			ArrayList<String> ck = new ArrayList<String>();
			/*//name명이 모두 다르게 적용을 해야할 경우
			int w=1;
			while(w<=5) {
			ck.add(request.getParameter("link"+w));
			w++;
			}
			System.out.println(ck);
			*/
			//name명이 모두 같게 적용을 할 경우
			/*
			getParameterValues : name값이 같은 경우이며,			
			값이 다른 상황이며 해당 값만 추출하여 배열로 생성함
			*/
			String like[] = request.getParameterValues("like");
//			System.out.println(like.length);
			int w=0;
			while(w<like.length) {
				System.out.println(like[w]);
				w++;
			}
	}

}
