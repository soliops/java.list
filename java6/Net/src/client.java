import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
//	C:\java6\Net\src\client.java
	public static void main(String[] args) {
		String ip = "192.168.1.197";
		int port = 8009;
		Socket sc= null;
		Scanner sn = null;
		OutputStream os = null;
		InputStream is = null;
		try {
			sc = new Socket(ip,port);
			System.out.println("���� ���� �Ǿ����ϴ�.");
			sn = new Scanner(System.in);
			
			 os = sc.getOutputStream();
			 is = sc.getInputStream();
			
			 for(;;) { //���������� Socket�� ��� ���� �ǵ��� �ϴ� ����
			System.out.println("�Է��Ͻ� ������ �����ּ���: ");
			String msg = "ȫ�浿: " + sn.nextLine();
			
			os.write(msg.getBytes());
			os.flush();
			
			byte data[] = new byte[1024];
			int n = is.read(data);
			String cmsg = new String(data,0,n);
			System.out.println(cmsg);
//			sn.close();
			}
		 
			
		} 
		catch (Exception a) {
			if(a.getMessage()!=null) {
			System.out.println("���� ���� ��ְ� �߻� �Ͽ����ϴ�.");
			}
		
		}
		finally { //Ŭ���̾�Ʈ�� ���� ����� �ش� ���� �� ���� Stream, Scanner ��� ����
		try {
			sc.close();
			os.close();
			is.close();
			sn.close();//������ ����� üũ
			System.out.println("����");
		}	
		catch (Exception c) {
			// TODO: handle exception
		}
		}
	}

}
