import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server_ex1 {

	public static void main(String[] args) {
		/*
		 Server (Port 번호는 무조건 숫자만 입력 받도록 합니다.)
		 서버 프로그램을 실행합니다. 실행 가장 먼저 해당 질문하게 됩니다.
		 "사용하실 Port번호를 입력하세요 : " 9009
		 "**** 채팅서버 오픈[9009] *****"
		 
		 서버 최종 메세지
		 "***** GUEST가 참여 하였습니다. *****"
		 */
		
		openchat1 op = new openchat1();
		op.opchat();

	}

}
class openchat1{
	ServerSocket server = null;
	Socket sk = null;
	Scanner sc = null;
	int port=0;
	String msg= null;
	InputStream is = null;
	OutputStream os = null;
	String userid = null;
	public void opchat() {
		try {
		this.sc = new Scanner(System.in);
		System.out.println("사용하실 Port번호를 입력하세요 : ");
		this.port = this.sc.nextInt();
		this.server = new ServerSocket(this.port);
		System.out.println("사용하실 아이디를 입력해주세요");
		this.userid = this.sc.next().intern();
		System.out.println("서버 오픈 대기중");
		System.out.println("**** 채팅서버 오픈["+this.port+"] *****");
		while(true) {
		this.sk = this.server.accept();
		this.is = this.sk.getInputStream();
		this.os = this.sk.getOutputStream();
		
		byte data[] = new byte[1024];
		int n = this.is.read(data);
		this.msg = new String(data,0,n);
		System.out.println(this.msg);
		}
		}
		catch (Exception e) {
			System.out.println("숫자를 입력하세요!");
			this.opchat();
		
		}
	}
}