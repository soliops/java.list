package test3;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class upload {
	
	//파일업로드 : 바이너리파일 Exception
	@RequestMapping("/fileupload.do")
	public String filesok (Model m, MultipartFile file1, HttpServletRequest req) throws Exception{
		//로컬로 파일 업로드
		if(!file1.equals("")) {
		String directory = "c:\\upload\\";
		File fe = new File(directory);
		if(!fe.exists()) {
			fe.mkdir();
		}
		//사용자가 업로드 하는 파일명을 알아오는 부분
		String filename = file1.getOriginalFilename();
		//저장할 상대,절대 경로
		String url="";
		if(filename.equals("")) {
			url="첨부파일은 없습니다.";
		}
		else {
		url = directory + filename;
		//FileCopyUtils.copy : ajax, (form)post 둘다 사용이 가능합니다.
		//파일 복사 기능을 말하며, write + stream을 합친 형태로 인식을 합니다.
		FileCopyUtils.copy(file1.getBytes(), new File(url));
		m.addAttribute("result_file",url);
		}
		
		}
		else {
		m.addAttribute("result_file","파일이 없음");
		}
		return "view/okfile";
		
	}
	/*서버에 직접적으로 등록하는 방식*/
	@RequestMapping("/fileupload2.do")
	public String server_upload(Model m, MultipartFile file2, HttpServletRequest req) throws Exception{
		//첨부파일이 등록되었을 경우
		if(!file2.equals("")) {
			//업로드할 파일 type을 확인 하는 사항
			String filetype=file2.getContentType();
			if(!filetype.equals("image/jpeg")||!filetype.equals("image/png")) {
				System.out.println("해당 업로드는 이미지만 가능합니다.");
			}
			//req.getServletContext().getRealPath("") : 서버 상대경로
			String directory = req.getServletContext().getRealPath("");
			String upload_directory = directory + "upload/"; //상대경로 upload
			File fe = new File(upload_directory);
			if(!fe.exists()) {
					fe.mkdir();
			}
			String filename = file2.getOriginalFilename(); //추천
			String copyfile = upload_directory + filename;
			FileCopyUtils.copy(file2.getBytes(), new File(copyfile));
			m.addAttribute("result_file","서버로 파일이 전송 완료 되었습니다.");
			}
			else {
				m.addAttribute("result_file","첨부 파일이 없습니다.");				
			}
		return "view/okfile";
	}
	@RequestMapping("/fileupload3.do")
	public String server_uploads(Model m, MultipartFile[] file3, HttpServletRequest req) throws Exception{
		int t =0;
		do {
		if(!file3[t].equals("")) {
			String filetype=file3[t].getContentType().intern();
			if(!(filetype.equals("image/jpeg")||filetype.equals("image/png")||filetype.equals("image/jpg"))) {
				System.out.println("해당 업로드는 이미지만 가능합니다.");
			}
			String directory = req.getServletContext().getRealPath("");
			String upload_directory = directory + "upload/"; 
			File fe = new File(upload_directory);
			if(!fe.exists()) {
					fe.mkdir();
			}
			String filename = file3[t].getOriginalFilename();
			String copyfile = upload_directory + filename;
			FileCopyUtils.copy(file3[t].getBytes(), new File(copyfile));
			m.addAttribute("result_file"+t,"서버로 파일이 전송 완료 되었습니다.");
			}
			else {
				m.addAttribute("result_file"+t,"첨부 파일이 없습니다.");				
			}
		t++;}while(t<file3.length);
		return "view/okfile";
	}
}
