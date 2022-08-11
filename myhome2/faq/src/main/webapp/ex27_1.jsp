<%@page import="java.nio.file.StandardCopyOption"%>
<%@page import="java.nio.file.Files"%>
<%@page import="java.nio.file.Paths"%>
<%@page import="java.nio.file.Path"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex27.jsp 파일 업로드 처리파트</title>
</head>
<body>
<%
	//JSP -> COS 파일명을 변경(X)
	String now = new SimpleDateFormat("yyyyMMdd").format(new Date());
	out.print(now + "<br>");
	/* 저장 경로 */
	String save = "C:\\myhome2\\faq\\src\\main\\webapp\\upload";
	/* 저장시 POST로 전송된 파일크기 용량 */
	int max_save = 1024 * 1024 * 2;
	/* 파일명 인코딩 */
	String lang = "UTF-8";
	
// 	MultipartRequest mr = new MultipartRequest(request,"C:\\myhome2\\faq\\src\\main\\webapp\\upload",
// 			1024*1024*2,"UTF-8",new DefaultFileRenamePolicy);
	
	MultipartRequest mr = new MultipartRequest(request,save,max_save,lang,new DefaultFileRenamePolicy());
	//MultipartRequest : 파일 저장시 사용하는 라이브러리 클래스명
	//new DefaultFileRenamePolicy() : 새로운 객체 생성을 하기 위해서 사용함
	
	/* Enumeration : 파일 객체 이므로 자료형으로 받음 */
	Enumeration files = mr.getFileNames(); //getFileNames() 배열정보
	/* 문자열로 변환 nextElement() : 업로드한 파일 모두를 말합니다. */
	String filenm = (String) files.nextElement();
	/* 실제 파일명 */
	String postfile = mr.getOriginalFileName(filenm);
	/* 복사된 파일명 */
	String savefile = mr.getFilesystemName(filenm);
	
	/* 파일 type형태 */
	String filetype = mr.getContentType(filenm);
	
	out.print(postfile + "<br>");
	out.print(savefile + "<br>");
	out.print(filetype + "<br>");

	/* 파일명을 강제 변경 업로드 된 파일을 변경하는 방식 */
	if(savefile!=null){
		File f = new File(save+"\\"+savefile);
		String fnm = f.getName();
		//abc.jpg => abc  jpg
				
		//IndexOf : 앞에서부터 단어를 읽어감
		//lastIndexOf : 뒤에서부터 단어를 읽어감
		//substring : 글자를 잘라서 사용하게 됩니다.
		String split = fnm.substring(fnm.lastIndexOf("."));
		String newfilenm = now + split;
		
		/* Files.io 사용해서 해당 파일명을 변경 */
		Path a = Paths.get(save+"\\"+savefile);
		Path b = Paths.get(save+"\\"+newfilenm);
		Files.move(a,b, StandardCopyOption.ATOMIC_MOVE);
		//StandardCopyOption.ATOMIC_MOVE : JAVA 언어
		//기존 파일은 삭제 하고, 변경된 파일로 복사하면서 이름이 변경
		out.print(newfilenm);
		
	}
	
	
	
	
%>
</body>
</html>