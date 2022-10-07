package admin_product;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import admin_configure.timer;

@MultipartConfig(
		fileSizeThreshold = 1024*1024*2,
		maxFileSize = 1024*1024*2,
		maxRequestSize = 1024*1024*2*3
		)
public class product_writeok extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       

    public product_writeok() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		try {
		this.pr = response.getWriter();
		ArrayList<String> ar = new ArrayList<String>();
		String ck_msg =null;
		String api_msg = null;
		boolean ck = false;
		String cate_ck = null;
		String realpath = request.getServletContext().getRealPath("");
		String path = realpath+"product_img\\";
		String check_code = request.getParameter("check_code");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		timer time2 = new timer();
		String times = time2.now_datetime();
		String time = sdf.format(date);
			if(check_code==null || check_code=="") {
			Collection <Part> parts = request.getParts();
			for(Part file : parts) {
			String filecheck  =file.getName();
			String filetext = request.getParameter(filecheck);
			if(filecheck.equals("product_img1")||filecheck.equals("product_img2")||filecheck.equals("product_img3")) {
				String originName = time + file.getSubmittedFileName();
//				String realpath = "C:/portfolio/portfolio/src/main/webapp/admin/product_img/";
				if(originName==null||originName=="") {						
					filetext="";
				}
				else {
					filetext= path + originName;						
					File fe = new File(path);
					if(!fe.exists()) {fe.mkdir();}
					file.write(filetext);
//					filetext="./product_img/"+originName;
				}
//				filetext=filetext.replace("C:/portfolio/portfolio/src/main/webapp/admin",".");
			}
			ar.add(filetext);
			}
			ar.add(times);
			admin_product_check apcs = new admin_product_check();
			apcs.catecode_check(ar.get(0), ar.get(1));
			cate_ck = apcs.call_sign2().intern();
			if(cate_ck=="success") {				
			admin_product_insert api = new admin_product_insert();
			api.product_insert(ar);
			api_msg=api.call_sign().intern();
				if(api_msg=="success") {
					pr.write("<script>alert('상품 등록이 완료되었습니다.'); location.href='./admin_product.html';</script>");
				}
				else {
					pr.write("<script>alert('상품 등록을 실패했습니다.'); location.href='./admin_product_write.html';</script>");
				}
			}
			else if(cate_ck=="fail"){
				pr.write("<script>alert('잘못된 대메뉴 카테고리 코드입니다.'); history.go(-1)</script>");
			}
			else {
				pr.write("<script>alert('잘못된 소메뉴 카테고리 코드입니다.'); history.go(-1)</script>");				
			}
		}
		else if(check_code!=null||check_code!=""||check_code!="null") {
			admin_product_check apc = new admin_product_check();
			apc.code_check(check_code);			
			ck_msg= apc.call_sign().intern();
			if(ck_msg=="success") {
				ck=true;
			}
			this.pr.print(ck);
		}
		}
		catch(Exception e) {
			this.pr.write("<script>alert(DB 저장 오류입니다.); location.href='./admin_product_write.html';</script>");
		}
	}

}