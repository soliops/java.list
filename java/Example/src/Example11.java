import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 ���� ���� �ݾ��� �ֽ��ϴ�.
		 ���� �ݾ��� 60000 �Դϴ�.
		 ��, "���� %�� �Է��� �ּ���:"��� ������ �Բ� 
		 �ش� ���� ���ڸ� �Է��ϸ� 
		 ���� �ݾ��� ���� �Ǿ� ��µǵ��� �մϴ�.
		 Hint: 
		 ����)
		 int money = 10000;
		 int coupon = 20;
		 double a = coupon * 0.01;
		 System.out.println(a);
		 double b = money * a;
	 	 System.out.println(b);
		 double c = money - b;
		 sysout c
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� %�� �Է��� �ּ���: ");
		int money = 60000;
		int coupon = sc.nextInt();
		double total = money - money *coupon*0.01;
		System.out.println("���� �ݾ� "+total);
		sc.close();	
	}

}
