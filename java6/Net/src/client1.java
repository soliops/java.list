import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//Client
public class client1 {
	public static void main(String[] args) {
		/*ä�ÿ��� ����Ͻ� ���̵� �Է����ּ���.
		 ȫ�浿
		 "������ �Է����ּ���." ����: �ݰ����ϴ�.
		 ������: �������~
		 "������ �Է��� �ּ���: " exit
		 "ä���� ���� �Ǿ����ϴ�."
		 */
	
		try {
		client_chat cc =new client_chat();
		cc.chat();
		}
		catch (Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a);
			}
		}
	}

}
class client_chat{
	private final String ip = "192.168.100.45";
	//192.168.1.197
	final int port = 8009;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = null; //�ܺο��� ���̵� ������ ������� �ʵ���
	Socket sk = null;
	String msg = null; //����ڰ� �Է�
	String msg2 =null;
	String smsg = null; //������ �����ϴ� �޼���
	String check = null; // exit �ܾ� ����
	public void chat() {
		//thorws Excpetion ������ try-catch�� ��� ��
		//****���� Stream�� close ���� �ʽ��ϴ�. 
		//�ֳ��ϸ�, ��� Stream�� ���ϰ� ������ �Ǿ� �����Ƿ� 
		//close�� ���ϵ� �Բ� ���ᰡ �˴ϴ�.
		
		//**Socket�� �� �����Ͱ� ������ �̷������ ������ �������� ������ �߻��� �� �ֽ��ϴ�.
		try {
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �������ּ���: ");
			this.mid = this.sc.next();
			int count = 0;
			while(true) {
				
				this.sk = new Socket(this.ip,this.port);
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
	
				
				//���� �޼��� 
				if(count==0) {
				this.msg = "["+this.mid+"] �� �����Ͽ����ϴ�.";
				}				
				else{
					this.sc = new Scanner(System.in);
					System.out.println("������ �Է��� �ּ���: ");	
					this.check = this.sc.nextLine().intern();
					this.msg = "["+this.mid+"]: "+this.check;
				}
				if(this.check == "exit") {
					this.msg = "["+this.mid+"]���� �����ϼ̽��ϴ�.";
					this.os.write(this.msg.getBytes());
					this.os.flush();
					
					this.is.close();
					this.os.close();
					this.sc.close();
					this.sk.close();
				}
				else {
				this.os.write(this.msg.getBytes());
				this.os.flush();
				}
			
					
					byte data[] = new byte[1024];
					int n = this.is.read(data);
					this.smsg = new String(data,0,n);
					System.out.println(this.smsg);
					count++;
			
				
			}
		} 
		catch (Exception e) {
			if(e.getMessage()!=null) {
//				String error = e.getMessage();
//				if(error.indexOf("StringIndexOutOfBoundsException")!=-1) {
					System.out.println("�������� ��ְ� �߻��Ͽ� ���� ���� �˴ϴ�.");					
//				}
				//System.out.println(e);
			}
		}
	}
	
}