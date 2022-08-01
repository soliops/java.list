package test;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Decoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class security extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public security() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* base64 - decoder, encoder 두가지가 존재 합니다.
		  기초 암호화 부분이며, 역으로 암호를 풀수도 있습니다. 
		  실무에선 잘 쓰진 않지만 알아둘 것*/
		/*
		String pw = "a12345";
		byte[] a = pw.getBytes();
		Encoder ec = Base64.getEncoder();
		byte[] ectext = ec.encode(a);
		System.out.println(new String(ectext));
		
		String pw2 = "YTEyMzQ1";
		Decoder dc = Base64.getDecoder();
		byte[] dctext= dc.decode(pw2);
		System.out.println(new String(dctext));
		 */
		//응용부문
		request.setCharacterEncoding("UTF-8");
		String pw = request.getParameter("pw");
		Decoder dc = Base64.getDecoder();
		byte[] userpw = dc.decode(pw);
		System.out.println(new String(userpw));
	
		try {
			//MD5 형태 암호화
			String p ="a1234";
			//MessageDigest : Hash알고리즘(암호화)
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(p.getBytes("UTF-8")); //update -> byte
			byte[] md = md5.digest(); //배열기준으로 대입하게 됨
			StringBuilder sb = new StringBuilder();
			//StringBuilder : 문자 배열
			for(byte ck: md) {
				String recode = String.format("%02x", ck);
				//%02x : 16진수 변환
				sb.append(recode);
			}
			System.out.println(sb);
		} catch (Exception e) {
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
