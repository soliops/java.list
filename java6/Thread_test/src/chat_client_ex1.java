import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client_ex1 {

	public static void main(String[] args) {
		/*
		 Client
		 Ŭ���̾�Ʈ ���α׷��� �����մϴ�.
		 "������ IP ��ȣ�� �Է��� �ּ��� : "
		 "������ PORT ��ȣ�� �Է��� �ּ���: "
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
		System.out.println("������ IP ��ȣ�� �Է��� �ּ��� : ");
		this.ip = this.sc.nextLine();
		System.out.println( "������ PORT ��ȣ�� �Է��� �ּ���: ");
		this.port = this.sc.nextInt();
		System.out.println("����Ͻ� ���̵� �Է����ּ���");
		this.userid = this.sc.nextLine().intern();
		this.sk = new Socket(this.ip,this.port);
		this.is = this.sk.getInputStream();
		this.os = this.sk.getOutputStream();
		this.msg = "***** "+this.userid+"�� ���� �Ͽ����ϴ�.*****";
		this.os.write(this.msg.getBytes());
		this.os.flush();
		}
		catch(Exception a) {
			
		}
	}
}