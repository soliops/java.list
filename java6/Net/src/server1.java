import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//1:1ä�� ���α׷� ���μ���
//Server
public class server1 {
	public static void main(String[] args) {
		/*
		 ���� ��Ʈ 9090
		 �������� ����Ͻ� ���̵� �Է��� �ּ���.
		 ������
		 [�����...]
		 ȫ�浿: �ݰ����ϴ�.
		 "������ �Է����ּ���: " �������~
		 "ȫ�浿�� �����ϼ̽��ϴ�."
		 "������ �Է��� �ּ���."
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
			System.out.println("���̵� �����ϼ��� : ");
			this.mid = sc.next();
			System.out.println("ä�ù� ���� �Ǿ����ϴ�.");

			while(true) {
				
			this.so = sk.accept();
			this.is = so.getInputStream();
			this.os = so.getOutputStream();
			this.sc = new Scanner(System.in);

			byte data[] = new byte[1024];
			int n = this.is.read(data);
			this.msg = new String(data,0,n);
			System.out.println(this.msg);
			if(this.msg.indexOf("����")!=-1) {
				this.sk.close();
				this.sc.close();
				break;
			}
			else {
			System.out.println("������ �Է��� �ּ���: ");
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