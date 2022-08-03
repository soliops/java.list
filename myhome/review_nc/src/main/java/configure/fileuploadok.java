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
		Part filepart = request.getPart("file"); //사용자 PC에 있는 이미지 경로를 저장 
		String filename = filepart.getSubmittedFileName(); //업로드할 파일명을 가져옴
		for(Part part:request.getParts()) { //여러개의 파일을 업로드시 모든 파일을 서버에 저장 되도록 하기 위함.
			//해당 파일을 저장할 위치에 동일한 이름을 copy하게 됩니다.
			part.write("C:\\myhome\\review_nc\\src\\main\\webapp\\upload\\"+filename);
			//로컬이랑 서버랑 다르다
		}
		response.getWriter().print("ok");
		
	}

}
