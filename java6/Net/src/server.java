import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		int port = 8009;
		ServerSocket ss =null;
		Socket sc =null; 
		InputStream is =null;
		OutputStream os = null;
		Scanner sr = null;
		try {
			ss = new ServerSocket(port);
			System.out.println("서버 연결 대기중....");
			sc = ss.accept();
			is = sc.getInputStream();
			os = sc.getOutputStream();
			for(;;) {
			
			byte data[] = new byte[1024];
			int n = is.read(data);
			String message = new String(data,0,n);
			System.out.println(message);
			
			sr = new Scanner(System.in);
			System.out.println("입력하실 내용을 적어주세요: ");
			String msg ="이순신: " +sr.nextLine();
			os.write(msg.getBytes());
			
			os.flush();
//			is.close();
//			os.close();
//			sc.close();
			}
		}
		catch (Exception e) {
			System.out.println(sc.getInetAddress());
			
		}
//		finally {
//			
//		}
	}

}
