import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server_ex1 {

	public static void main(String[] args) {
		/*
		 Server (Port ��ȣ�� ������ ���ڸ� �Է� �޵��� �մϴ�.)
		 ���� ���α׷��� �����մϴ�. ���� ���� ���� �ش� �����ϰ� �˴ϴ�.
		 "����Ͻ� Port��ȣ�� �Է��ϼ��� : " 9009
		 "**** ä�ü��� ����[9009] *****"
		 
		 ���� ���� �޼���
		 "***** GUEST�� ���� �Ͽ����ϴ�. *****"
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
		System.out.println("����Ͻ� Port��ȣ�� �Է��ϼ��� : ");
		this.port = this.sc.nextInt();
		this.server = new ServerSocket(this.port);
		System.out.println("����Ͻ� ���̵� �Է����ּ���");
		this.userid = this.sc.next().intern();
		System.out.println("���� ���� �����");
		System.out.println("**** ä�ü��� ����["+this.port+"] *****");
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
			System.out.println("���ڸ� �Է��ϼ���!");
			this.opchat();
		
		}
	}
}