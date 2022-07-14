import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력해 주세요: ");
		String user = sc.nextLine();
		chatclient cc = new chatclient(user);

	}

}
class chatclient{
	static final String ip = "192.168.100.45";
	static final int port = 9009;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	static ArrayList<Socket> user = new ArrayList<>();
	public chatclient(String mid) {
		try {
			System.out.println(mid+ "님 접속 하셨습니다.");
			this.sk = new Socket(this.ip,this.port);
			this.os = this.sk.getOutputStream();
			this.is = this.sk.getInputStream();
			this.sc = new Scanner(System.in);
			
			this.user.add(this.sk);	
			while(true) {
				System.out.println("내용을 입력해주세요: ");
				this.message = mid+": "+this.sc.nextLine().intern();				
//			for(int j =0;j<this.user.size();j++) {
				this.os.write(this.message.getBytes());
				this.os.flush();
//				InputStream iss = this.user.get(j).getInputStream();
// 				OutputStream oss = this.user.get(j).getOutputStream();			
//			}
				byte[] data = new byte[4096];
				int n = this.is.read(data);
				this.result = new String(data,0,n);
				System.out.println(this.result);
			}
		}
		catch (Exception e) {
			
		}
	}
}