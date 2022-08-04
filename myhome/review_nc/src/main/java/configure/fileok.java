package configure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;

@MultipartConfig(
		fileSizeThreshold = 1024 * 1024 * 2,
		maxFileSize = 1024 * 1024 * 2,
		maxRequestSize = 1024 * 1024 * 2
		
		)

public class fileok extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public fileok() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
//			String url ="/opete95/tomcat/webapps/review_nc/upload/orange.jpg";
//			String url2 = url.replace("/opete95/tomcat/webapps",".");
//			System.out.println(url2);
			Collection<Part> parts = request.getParts();
			ArrayList<Part> result = new ArrayList<Part>(parts.size());
			for(Part p : parts) {
				result.add(p);
			}
			int w = 0;
			String filenm = null;
			String path = request.getServletContext().getRealPath("");
			String upfile = path + "upload/";
			filedb fdb = new filedb();
			String url =null;
			String url2 =null;
			while(w<result.size()) {
				filenm = result.get(w).getSubmittedFileName();
				result.get(w).write(upfile + filenm);
				url = upfile + filenm;
				url2 = url.replace("/opete95/tomcat/webapps", ".");
				try {
					fdb.fileinsert(url2);	
				}
				catch (Exception e) {
				}
				w++;
			}
	}

}
