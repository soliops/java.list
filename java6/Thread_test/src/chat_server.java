import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//Server에 여러개의 포트를 오픈 8001, 8002
//Exception : bind Exception (Port 충돌)
public class chat_server {

	public static void main(String[] args) {
		/*
		Server - port2개
		1.Server 8001,8002
		2.client 8001,client 8002
		
		server - port1개
		1.Server 8003
		2.client 8003 모두 접속
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
		//포트가 하나일때
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
			Socket s = sk.accept(); //해당 port 모두 오픈
			
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			
			/*클라이언트에서 보낸 메세지를 받는 부분*/
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
