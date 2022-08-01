package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index3 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected PrintWriter pr = null;	
	protected Connection con = null;
	protected LocalDateTime now = null;
	String mname, mid, mpw, memail;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		this.pr = resp.getWriter();
		
	
	}
	
    public index3() {
    	try {
    		dbconnect db = new dbconnect();
    		this.con = db.ct();
    		index3 idx = new index3();
    		idx.service(null,null);
    		this.pr.print("<script>console.log('DB접속 성공')</script>");
    		
    	}
    	catch (Exception e) {
    		this.pr.print("<script>console.log('DB접속 오류')</script>");
    	}
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			this.mname = request.getParameter("join_nm");
			this.mid = request.getParameter("join_id");
			this.mpw = request.getParameter("join_pw");
			this.memail = request.getParameter("join_email");
			//Timestamp로 설정할 경우
			//java.util.Date date = new java.util.Date();
			//long time = date.getTime();
			//java.sql.Timestamp ts = new java.sql.Timestamp(time);
			//datetime 으로 설정할 경우
			this.now = LocalDateTime.now();
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String today = this.now.format(df);
			System.out.println(today);
			int point = 1000;
			/* auto_increment 컬럼값도 적용해야 합니다. */
			String sql = "insert into joinmember (jidx,jnm,jid,jpass,jemail,jpoint,jindate) values ('0','"+this.mname+"','"+this.mid+"','"+this.mpw+"','"+this.memail+"','"+point+"','"+today+"')";
//			System.out.println(sql);
			/* ? 표시할 경우 무조건 물음표는 1부터 시작 합니다.*/
			try {
				PreparedStatement pr = this.con.prepareStatement(sql);
				int oksign = 0;
				//executeUpdate : insert, update, delete 에서만 사용
				oksign = pr.executeUpdate(); //데이터가 실제로 들어가는 부분
				//정확하게 저장될 경우 oksign은 무조건 +1이 작동합니다.
				//오류발생시 0으로 계속 진행이 됩니다.
				response.setContentType("text/html; charset=utf-8");
				this.pr = response.getWriter();
				
				if(oksign > 0) {					
					this.pr.write("회원가입이 정상적으로 진행 되었습니다.");
				}
				else {					
					this.pr.write("DB 컬럼에 문제가 발생 하였습니다.");
				}
			} 
			catch (Exception e) {
			}
			
	}

}
