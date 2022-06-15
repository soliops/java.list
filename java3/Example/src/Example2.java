
public class Example2 {
private int number; //pc
private int user;  //user
private String msg; //결과메세지
	public static void main(String[] args) {
		
		Example1.main(args);
		
	
	
	}
	public void result(int pc_num,int user_num) { //setter 인수값
		this.number = pc_num;
		this.user = user_num;
		if(this.number==this.user) {
			this.msg="정답입니다.";
//			System.out.println(this.msg+" PC 숫자는 "+this.number+"였습니다.");
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
	public String result1() { //getter (인수값x) return
		return this.msg;
	}
}
