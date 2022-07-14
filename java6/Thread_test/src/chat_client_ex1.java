import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client_ex1 {

	public static void main(String[] args) {
		/*
		 Client
		 클라이언트 프로그램을 실행합니다.
		 "접속할 IP 번호를 입력해 주세요 : "
		 "접속할 PORT 번호를 입력해 주세요: "
		 */
		opchatuser op = new opchatuser();
		op.opchat();
		
	}

}
class opchatuser{
	Scanner sc = null;
	String ip = null;
	int port;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String msg =null;
	String userid = null;
	public void opchat() {
		try {
		this.sc = new Scanner(System.in);
		System.out.println("접속할 IP 번호를 입력해 주세요 : ");
		this.ip = this.sc.nextLine();
		System.out.println( "접속할 PORT 번호를 입력해 주세요: ");
		this.port = this.sc.nextInt();
		System.out.println("사용하실 아이디를 입력해주세요");
		this.userid = this.sc.nextLine().intern();
		this.sk = new Socket(this.ip,this.port);
		this.is = this.sk.getInputStream();
		this.os = this.sk.getOutputStream();
		this.msg = "***** "+this.userid+"가 참여 하였습니다.*****";
		this.os.write(this.msg.getBytes());
		this.os.flush();
		}
		catch(Exception a) {
			
		}
	}
}