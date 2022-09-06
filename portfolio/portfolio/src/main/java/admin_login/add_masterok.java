package admin_login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin_configure.timer;

public class add_masterok extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
  
    public add_masterok() {
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");		
		response.setContentType("text/html; charset=utf-8");
		this.pr = response.getWriter();
		timer time = new timer();
		String admin_check = null;
		String admin_indate = time.now_datetime();
		String admin_tel = "";
		Enumeration<String> em = request.getParameterNames();
		int w=0;
		ArrayList<String> admin_list = new ArrayList<String>();
		while(em.hasMoreElements()) {
			String allcheck = (String)em.nextElement();
			String pmcheck = request.getParameter(allcheck);
			if(allcheck.equals("admin_pw2")) {
				continue;
			}
			else if(allcheck.equals("admin_tel1")||allcheck.equals("admin_tel2")) {
				admin_tel+=pmcheck;
				continue;
			}
			else if(allcheck.equals("admin_tel3")) {
				admin_tel+=pmcheck;				
				admin_list.add(admin_tel);
				continue;
			}
			admin_list.add(pmcheck);
			w++;
		}
		admin_list.add(admin_indate);
		if(admin_check==null) {
			admin_check="N";
		}
		admin_list.add(admin_check);
		try {
			admin_insert ai = new admin_insert();
			ai.insert(admin_list);
			String msg = ai.call_sign().intern();
			if(msg=="success") {
				pr.write("<script>"
						+ "alert('새로운 관리자 등록이 완료 되었습니다.');"
						+ "location.href='./admin/index.jsp';"
						+ "</script>");
			}
			else {
				throw new Exception();
			}
		} catch (Exception e) {
			pr.write("<script>"
					+ "alert('DB 저장에 문제가 생겼습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
		
	}

}
