import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���?");
		int number = sc.nextInt();
		String msg;
		if(number>60) {
			msg="�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.";
		}else {
			if(number%2==0) {
				msg="�ش� ���ڴ� ¦���Դϴ�.";
			}else {
				msg="�ش� ���ڴ� Ȧ���Դϴ�.";
			}
		}
		System.out.println(msg);
		sc.close();
	}

}
