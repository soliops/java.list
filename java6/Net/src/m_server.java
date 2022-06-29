import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {
		
		chatroom cr = new chatroom();
		
		
		
	}

}
class chatroom{ //�⺻���� = > �� ���Ӹ��� Thread�� ����
	ServerSocket server = null;
	static final int port = 9009; //Thread���� �������� ����ϱ� ����
	Socket sk = null;
	public chatroom() {
		try {
			this.server = new ServerSocket(port);
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("****��Ƽ ä�� ����!!****");
		while(true) {
			try {
				this.sk = this.server.accept(); //Ŭ���̾�Ʈ ���� �㰡 �κ�
				chat_thread ct = new chat_thread(this.sk);//accept ���� �����ϴ�.
				Thread t = new Thread(ct);
				t.start();
			}
			catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
	
}
class chat_thread implements Runnable{
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	//�迭�� �޸𸮿� ����Ŵ  ������? ������Ű�� ����
	//������ �߻��� Thread�� ���Ӱ� ���� �ǹǷ� static�� �ø��� ������
	//�������� ��� �ʱ�ȭ �Ǿ����
	static ArrayList<Socket> user = new ArrayList<>();//������
	public chat_thread(Socket s) {
		this.sk = s;
		this.user.add(this.sk);
		try {
			System.out.println("ä�ÿ� ���� �ϼ̽��ϴ�.");
			System.out.println(this.sk);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
		} 
		catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ ���������� �ùٸ��� �ʽ��ϴ�.");
		}
		
	}
	@Override
	public void run() {
		try {
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.message = new String(data,0,n);
				System.out.println(this.message);
				
				while(true) {
				System.out.println(this.user.size());
				this.sc = new Scanner(System.in);
				System.out.println("���� �޼����� �Է��ϼ���: ");
				this.result = sc.nextLine().intern();
				//�迭�� �ִ� vport�� ���� ������ ���� �� ��ŭ �ݺ��� �մϴ�.
				for(int w =0; w<this.user.size();w++) {
					//�迭�� �ִ� ����� vport�� ������ �ϰ� �˴ϴ�. 
					OutputStream all = this.user.get(w).getOutputStream();
					//����� ���� Stream�� ����
					all.write(this.message.getBytes());
					all.write(this.result.getBytes()); //����
					all.flush(); //�ش� ���� �޼����� ���(�޸�)
					
//					this.os.write(this.result.getBytes());
//					this.os.flush();
				}
				/*
				this.os.write(this.message.getBytes()); //ȸ��
				this.os.flush();
				
				Thread.sleep(10000);
				String m = "������ �޼��� ���!!";
				this.os.write(m.getBytes());
				this.os.flush();
				*/
			}
		}
		catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ����ϴ�.");
		}
		finally{
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
			} 
			catch (Exception e2) {
				
			}
		}
	}
}