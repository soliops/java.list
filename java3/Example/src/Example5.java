import java.util.Scanner;

public class Example5 {
 
	public static void main(String[] args) {
		/*
		 ���빮��
		 extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ��Ͻÿ�.
		 ���� �ΰ��� �Է��մϴ�.
		 �ΰ��� ���ڸ� Ȯ���Ͽ� ������ ���� üũ �մϴ�.
		 ù��° ���ڰ� �ι�° ���ں��� Ŭ ���
		 ù��° ���ں��� �ι�° ���ڰ� Ŭ ���
		 ù��° ���ڰ� �ι�° ���ڶ� ���� ���
		  
		 ù��° ���� ���� ���: �ش� �ΰ��� ���� ��ģ ����� ��� a<b
		 �ι�° ���� ���� ��� : �ش� ���� ��ŭ ���ڸ� ��� ���� ������� ��� a~b+
 		 ù��°�� �ι�° ���ڰ� ���� ���: "�ش� ���� �����ϴ�."��� �޼��� ���
		 */
		ex2 ex3 = new ex2();
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���?");
		int user= sc.nextInt();
		System.out.println("���ڸ� �Է����ּ���?");
		int user2=sc.nextInt();
		ex3.cal(user, user2);
//		ex3.print();
		int result = ex3.exam1();
		System.out.println("��������� :"+result);
		
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
			System.out.println("�ش� ���� �����ϴ�.");
//			this.msg="�ش� ���� �����ϴ�.";
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