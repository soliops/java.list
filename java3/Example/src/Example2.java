
public class Example2 {
private int number; //pc
private int user;  //user
private String msg; //����޼���
	public static void main(String[] args) {
		
		Example1.main(args);
		
	
	
	}
	public void result(int pc_num,int user_num) { //setter �μ���
		this.number = pc_num;
		this.user = user_num;
		if(this.number==this.user) {
			this.msg="�����Դϴ�.";
//			System.out.println(this.msg+" PC ���ڴ� "+this.number+"�����ϴ�.");
//			System.exit(0);
//			System.gc();
		}else if(this.number>this.user) {
			this.msg="UP";
//			System.out.println(this.msg);
		}else if(this.number<this.user) {
			this.msg="DOWN";
//			System.out.println(this.msg);
		}
	}
	public String result1() { //getter (�μ���x) return
		return this.msg;
	}
}
