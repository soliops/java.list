import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//Client
public class client1 {
	public static void main(String[] args) {
		/*채팅에서 사용하실 아이디를 입력해주세요.
		 홍길동
		 "내용을 입력해주세요." 예시: 반갑습니다.
		 유관순: 어서오세요~
		 "내용을 입력해 주세요: " exit
		 "채팅이 종료 되었습니다."
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
	private String mid = null; //외부에서 아이디가 강제로 노출되지 않도록
	Socket sk = null;
	String msg = null; //사용자가 입력
	String msg2 =null;
	String smsg = null; //서버로 전송하는 메세지
	String check = null; // exit 단어 검토
	public void chat() {
		//thorws Excpetion 있으면 try-catch문 없어도 됨
		//****각종 Stream을 close 하지 않습니다. 
		//왜냐하면, 모든 Stream이 소켓과 연결이 되어 있으므로 
		//close시 소켓도 함께 종료가 됩니다.
		
		//**Socket은 본 데이터가 변경이 이루어지면 접속이 끊어지는 현상이 발생할 수 있습니다.
		try {
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성해주세요: ");
			this.mid = this.sc.next();
			int count = 0;
			while(true) {
				
				this.sk = new Socket(this.ip,this.port);
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
	
				
				//입장 메세지 
				if(count==0) {
				this.msg = "["+this.mid+"] 님 입장하였습니다.";
				}				
				else{
					this.sc = new Scanner(System.in);
					System.out.println("내용을 입력해 주세요: ");	
					this.check = this.sc.nextLine().intern();
					this.msg = "["+this.mid+"]: "+this.check;
				}
				if(this.check == "exit") {
					this.msg = "["+this.mid+"]님이 퇴장하셨습니다.";
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
					System.out.println("서버접속 장애가 발생하여 강제 종료 됩니다.");					
//				}
				//System.out.println(e);
			}
		}
	}
	
}