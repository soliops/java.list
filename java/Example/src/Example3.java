import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/* 
		 ���빮��3.
		 ����ڰ� �ش� ���� �Է��մϴ�.
		 ��, ����ڰ� 2���� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���� ����
		  �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.]
		  ��, �ش� �ڵ�� do-while������ �ۼ��մϴ�.
		  
		  ����)
		  ù��° ���� ���ڴ�? 5
		  �ι�° ���� ���ڴ�? 10
		  ���� ���� ��� �հ�� : 45 �Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		String msg = "ù��° ���� ���ڴ�?";
		System.out.println(msg);
		int user = sc.nextInt();
		String msg2 = "�ι�° ���� ���ڴ�?";
		System.out.println(msg2);
		int user2 = sc.nextInt();
		int s=user;
		int total=0; 
		do {
			total+=s;
			s++;
		} while (s<=user2);
		System.out.println("���� ���� ��� �հ�� : "+ total+" �Դϴ�.");
		sc.close();
	}

}
