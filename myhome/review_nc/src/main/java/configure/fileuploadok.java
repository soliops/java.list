package configure;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(//파일 업로드 기능 처리시 사용되는 어노테이션 속성
		
		fileSizeThreshold = 1024 * 1024 * 1, //1MB(파일 업로드시 사용되는 메모리 임시크기 용량)
		maxFileSize = 1024 * 1024 *2, 		//2MB(업로드 파일 최대 크기값)
		maxRequestSize = 1024 * 1024 * 2	//2MB(전송에 따른 최대 크기값)
		)

public class fileuploadok extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public fileuploadok() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		Part filepart = request.getPart("file");
		String filename = filepart.getSubmittedFileName();
		for(Part part:request.getParts()) {
			part.write("C:\\myhome\\review_nc\\src\\main\\webapp\\upload\\"+filename);
			//로컬이랑 서버랑 다르다
		}
		response.getWriter().print("ok");
		
	}

}
