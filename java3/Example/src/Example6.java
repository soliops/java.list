import java.util.Scanner;

public class Example6 {
	
	public static void main(String[] args) {
		/*
		 ���빮��
		 ��ǰ������ 42000�� �Դϴ�.
		 ����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�.
		 �ش� ��ǰ ���ݿ� �´� ���� ��ŭ ���Ͽ� ���� ���� �ݾ���
		 ��½�Ű�� extends�� �����Ͻÿ�.
		 ��, 42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
		 ����ڰ� �ִ� ���� �� �� �ִ� ������ 5�� �Դϴ�.
		 ���� ������� main method���� ��� �մϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� ��ǰ ������ �Է����ּ���?");
		object2 ob = new object2();
		int user = sc.nextInt();
		ob.sum(user);
		System.out.printf("���� �ݾ��� : %s�� �Դϴ�.",ob.results());	
		sc.close();
		System.exit(0);
		System.gc();
	}
	
}
class object{
	private int users;
	private String msg;
	protected int sums;
	public void sum(int user1){
		final int w = 42000;
		this.users = user1;
		if(this.users>5) {
			msg="����ڰ� �ִ� ������ �� �ִ� ������ 5���Դϴ�.";
			System.out.println(msg);
			System.exit(0);
		}else {
		this.sums = this.users *w;
		}
}
}
class object2 extends object {
	public int results(){
		return this.sums;
	}
	
}