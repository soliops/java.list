package configure;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.el.parser.AstListData;



@MultipartConfig(
		
		fileSizeThreshold = 1024 * 1024 * 2, 
		maxFileSize = 1024 * 1024 *2, 		
		maxRequestSize = 1024 * 1024 * 2	
		)
public class writeok extends HttpServlet {
	String upfile,url3;
	PrintWriter pr = null;
	Part r_part = null;
	InputStream is = null;
	FileOutputStream fos = null;
	String rname = null;
	String rproduct = null;
	String rscore = null;
	String rtext = null;
	String msg = null;
	String filenm = null;
	String path = null;
	String upload = null;
	String indate = null;
	String outdate = null;
	String url =null;
	String url2 = null;
	
	private static final long serialVersionUID = 1L;
       
   
    public writeok() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//HTML에서 enctype을 확인함
//		String enctype = request.getMethod(); //FORM POST형태
		String enctype = request.getContentType();//enctype
		if(enctype.equals("application/x-www-form-urlencoded")) {
			this.rname = request.getParameter("rname");
			this.rproduct = request.getParameter("rproduct");
			this.rscore = request.getParameter("rscore");
			this.rtext = request.getParameter("rtext");
		}
		else {
			//URLDecoder.decode : multipart/form-data 역해석 ※ 무조건 언어셋도 설정
			this.rname = URLDecoder.decode(request.getParameter("rname"),"UTF-8");
			this.rproduct = URLDecoder.decode(request.getParameter("rproduct"),"UTF-8");		
			this.rscore = URLDecoder.decode(request.getParameter("rscore"),"UTF-8");
			this.rtext = URLDecoder.decode(request.getParameter("rtext"),"UTF-8");
			this.r_part = request.getPart("fileupload");
			this.filenm = this.r_part.getSubmittedFileName().intern();
			
		}
		
		response.setContentType("text/html;charset=utf-8");
		this.pr = response.getWriter();
		config cff = new config();
		this.indate = cff.nowtimer();
		this.outdate = "0001-01-01 01:00:00";
		if(this.filenm=="") {
			this.url2=null;
		}
		else {
			this.path = request.getServletContext().getRealPath("");
			this.upload = this.path + "upload/"; //실제 저장 공간			
			
			this.url = this.upload + this.filenm;
			this.url2 = this.url.replace("/opete95/tomcat/webapps", "."); //DB경로
			for(Part p : request.getParts()) {
				p.write(this.upload + this.filenm);
			}
		}
		String[] data = {"pd_reivew",this.rname,this.rproduct,this.rscore,this.rtext,this.indate,this.outdate,this.url2}; 
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(data));		
//		config cf = new config();
//		cf.insert(list);
//		this.msg = cf.insert(list).intern();
//		
		write_module wm = new write_module();
		wm.insert(list);
		this.msg = wm.join_msg().intern();
		if(this.msg =="success"){
			this.pr.print("<script>"
					+ "alert('리뷰 작성이 완료 되었습니다.');"
					+ "location.href='./index.do';"
					+ "</script>");
		}else {
			
			this.pr.print("<script>"
					+ "alert('올바른 값이 아닙니다.');"
					+ "location.href='./review_write.html';"
					+ "</script>");
					
		}		
//		write_module wm = new write_module();
//		//파일 첨부
//		this.r_part = request.getPart("fileupload");
//		this.filenm = this.r_part.getSubmittedFileName();
//
//		this.path = request.getServletContext().getRealPath("");
//		this.upfile = this.path + "upload/";
//
//		this.url = this.upfile + this.filenm;
//		this.url2 = this.url.replace("/opete95/tomcat/webapps", ".");
//		this.is = this.r_part.getInputStream();
//		this.fos = new FileOutputStream(this.url);
//		byte[] bf = new byte[1024];
//		int r =0;
//		while((r=this.is.read(bf))!=-1) {
//			this.fos.write(bf,0,r);
//		}
//		try {
//			wm.insert(list, this.url2);							
//		} catch (Exception e) {
//
//		}
////		this.msg = wm.join_msg().intern();
//
//		if(this.msg =="success"){
//			this.pr.print("<script>"
//					+ "alert('리뷰 작성이 완료 되었습니다.');"
//					+ "location.href='./review_write.html';"
//					+ "</script>");
//		}else {
//			this.pr.print("<script>"
//					+ "alert('올바른 값이 아닙니다.');"
//					+ "location.href='./review_write.html';"
//					+ "</script>");
//		}
//		this.fos.close();
//		this.is.close();
	}
	
}
