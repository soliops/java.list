import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//1:1채팅 프로그램 프로세서
//Server
public class server1 {
	public static void main(String[] args) {
		/*
		 서버 포트 9090
		 서버에서 사용하실 아이디를 입력해 주세요.
		 유관순
		 [대기중...]
		 홍길동: 반값습니다.
		 "내용을 입력해주세요: " 어서오세요~
		 "홍길동님 퇴장하셨습니다."
		 "내용을 입력해 주세요."
		 */
		chat ch = new chat();
		ch.chatserver();
		
	}

}
class chat{
	private int port = 8009;
	ServerSocket sk = null;
	Scanner sc = null;
	Socket so = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null;
	String msg = null;
	String cmsg = null;
	String check = null;
	public void chatserver() {
		try {
			this.sk = new ServerSocket(port);
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성하세요 : ");
			this.mid = sc.next();
			System.out.println("채팅방 개설 되었습니다.");

			while(true) {
				
			this.so = sk.accept();
			this.is = so.getInputStream();
			this.os = so.getOutputStream();
			this.sc = new Scanner(System.in);

			byte data[] = new byte[1024];
			int n = this.is.read(data);
			this.msg = new String(data,0,n);
			System.out.println(this.msg);
			if(this.msg.indexOf("퇴장")!=-1) {
				this.sk.close();
				this.sc.close();
				break;
			}
			else {
			System.out.println("내용을 입력해 주세요: ");
			this.check = this.sc.nextLine().intern();
			if(this.check=="exit") {
				sc.close();
				so.close();
				break;
				
			}
			this.cmsg = "["+this.mid+"]: "+this.check;
			this.os.write(this.cmsg.getBytes());
			this.os.flush();	
			}

			}
		}
		catch (Exception e) {
			
		}
	}
}