package reserve;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.datetimer;

public class reserveok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public reserveok() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Enumeration<String> em = request.getParameterNames();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		ArrayList<String> ar = new ArrayList<String>();
		datetimer time = new datetimer();
		String datetime = time.now_datetime();
		while(em.hasMoreElements()) {
			String allcheck=em.nextElement();
			String emcheck=request.getParameter(allcheck);
			if(allcheck.equals("reser_date")) {
				emcheck+= " "+request.getParameter("reser_arrival")+":00";
			}
			else if(allcheck.equals("reser_arrival")) {
				String artime = emcheck;
				emcheck= request.getParameter("reser_date")+" "+artime+":00";
			}
			ar.add(emcheck);
		}
		ar.add(datetime);
		try {
			reserve_check rc= new reserve_check();
			rc.num_ck();
			String nummsg = rc.call_sign2();
			if(nummsg.equals("ok")) {
				String rnumber = rc.number();
				ar.add(rnumber);
			}
			rc.reser_ck(ar);
			String ckmsg = rc.call_sign();
			if(ckmsg.equals("fail")) {
					pr.write("<script>"
						+ "alert('이미 예약된 객실로 예약이 불가능합니다.');"
						+ "location.href='./reserve.html';"
						+ "</script>");
				}
				else {
					reserve_insert ri = new reserve_insert();
					ri.reser_insert(ar);
					String msg = ri.call_sign().intern();
					
					reserve_insert2 ri2 = new reserve_insert2();
					ri2.reser_insert(ar);
					String msg2 = ri2.call_sign().intern();
					
					reserve_sms rs = new reserve_sms();
					rs.reser_sms(ar);
					String msg3 = rs.call_sign().intern();
				if(msg.equals("fail")) {
				pr.write("<script>alert('펜션 예약시스템 오류입니다.'); location.href='./reserve.html';</script>");	
				}
				else {								
				if(msg2.equals("fail")) {				
					pr.write("<script>alert('펜션 예약시스템 오류입니다.'); location.href='./reserve.html';</script>");	
				}
					else {
					if(msg3.equals("fail")) {
						pr.write("<script>alert('예약 번호 발송 오류입니다.'); location.href='./reserve.html';</script>");									
						}
						else {
						pr.write("<script>"
						+ "alert('예약이 완료 되었습니다.\\n입력하신 이메일에서 예약 번호를 확인해 주세요.');"
						+ "location.href='./reserve_check.html';"
						+ "</script>");		
						}
						
					}
									
				
				}		
					
			}
				
			
		}
		catch(Exception e) {
			pr.write("<script>"
					+ "alert('DB 저장에 문제가 생겼습니다.');"
					+ "history.go(-1);"
					+ "</script>");
		}
	}

}
