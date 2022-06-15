import java.util.Scanner;

public class Example5 {
 
	public static void main(String[] args) {
		/*
		 응용문제
		 extends를 사용하여 다음 결과에 대한 코드를 작성하시오.
		 숫자 두개를 입력합니다.
		 두개의 숫자를 확인하여 다음과 같이 체크 합니다.
		 첫번째 숫자가 두번째 숫자보다 클 경우
		 첫번째 숫자보다 두번째 숫자가 클 경우
		 첫번째 숫자가 두번째 숫자랑 같을 경우
		  
		 첫번째 숫자 작을 경우: 해당 두개의 값을 합친 결과값 출력 a<b
		 두번째 숫자 작을 경우 : 해당 범위 만큼 숫자를 모두 더한 결과값을 출력 a~b+
 		 첫번째와 두번째 숫자가 같을 경우: "해당 값이 같습니다."라고 메세지 출력
		 */
		ex2 ex3 = new ex2();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요?");
		int user= sc.nextInt();
		System.out.println("숫자를 입력해주세요?");
		int user2=sc.nextInt();
		ex3.cal(user, user2);
//		ex3.print();
		int result = ex3.exam1();
		System.out.println("최종결과값 :"+result);
		
		sc.close();
		System.exit(0);
		
		System.gc();
		
	}

}

class ex1 {
	private int aa,bb;
	protected int total;
	public String msg;
	public void cal(int a,int b) {
		this.aa=a;
		this.bb=b;
		if(this.aa<this.bb) {
			this.total=this.aa+this.bb;
			//this.msg=Integer.toString(this.total);
		}else if(this.aa>this.bb){
			exam2_loop();
//			do {
//				this.total+=this.bb;
//				this.bb++;
//			}while(this.bb<=this.aa);
//			this.msg=Integer.toString(this.total);
//			
		}else {
			System.out.println("해당 값이 같습니다.");
//			this.msg="해당 값이 같습니다.";
			System.exit(0);
		}
	}
	public void exam2_loop() {
		int w=this.aa;
		while(w<=this.bb) {
			this.total+=w;
			w++;
		};
	}
	
}
class ex2 extends ex1{
//	public void print() {
//		if(this.total!=0) {
//			this.msg=Integer.toString(this.total);
//			System.out.println(this.msg);
//		}else{
//			System.out.println(this.msg);
//			}
//	}
	public int exam1(){
		return this.total;
	}
}