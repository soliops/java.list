package test3;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@MultipartConfig(
		fileSizeThreshold=1024*1024*2,
		maxFileSize =1024*1024*2,
		maxRequestSize = 1024*1024*50,
		location="c:\\upload"
		)
@Controller
public class upload {
	
	@RequestMapping("fileupload.do")
	public String filesok(Model m, HttpServletRequest req){
		try {
			Part part = req.getPart("file1");
			String filenm = part.getSubmittedFileName();
		} catch (Exception e) {

		}
		return "view/okfile";
	
	}
}
