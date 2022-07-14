import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//Server�� �������� ��Ʈ�� ���� 8001, 8002
//Exception : bind Exception (Port �浹)
public class chat_server {

	public static void main(String[] args) {
		/*
		Server - port2��
		1.Server 8001,8002
		2.client 8001,client 8002
		
		server - port1��
		1.Server 8003
		2.client 8003 ��� ����
		*/
		/*
		int port[] = {8001,8002};
		int ea = port.length;
		int w = 0;
		openchat oc = null;
		while(w<ea) {
			oc = new openchat(port[w]);
			oc.start();
			w++;
		}
		*/
		//��Ʈ�� �ϳ��϶�
		int port = 8003;
		openchat oc = null;
		oc = new openchat(port);
		oc.start();
	}

}
class openchat extends Thread{
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	public openchat (int p) {
		this.pt = p;
	}

	@Override
	public void run() {
		try {
			sk = new ServerSocket(this.pt);
			while(true) {
			Socket s = sk.accept(); //�ش� port ��� ����
			
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			
			/*Ŭ���̾�Ʈ���� ���� �޼����� �޴� �κ�*/
			byte data[] = new byte[1024];
			int n = this.is.read(data);
			String message = new String(data,0,n);
			System.out.println(message);
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
