import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		 /*
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����ڰ� �ּҸ� �Է��մϴ�.");
		String Address = sc.nextLine();
		System.out.println("����ڰ� ��ȭ��ȣ�� �Է��մϴ�.");
		String phone = sc.next();
		
		System.out.println("�ش������� Ȯ�����ּ���.");
		System.out.printf("�ּ�: %s ��ȭ��ȣ: %s", Address,phone);
		sc.close();
	}

}
