import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		/* ���빮��
		 * while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�.
		 * ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
		 * "7000 �����Ͻðڽ��ϱ�?"��� ��µǸ�, ���� 1�̶�� �Է��ϸ�
		 * �������� �ݾ׿� �߰� �Ǿ� ���ϴ�. ��, 2��� �Է½�
		 * �������� �ݾ׿� �߰� �Ǿ����� �� �˴ϴ�.
		 * 
		 * �� ���� Ƚ���� 4�� �Դϴ�.
		 * �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int a=1;
		int total=0;
		int user;
		final int money=7000;
		while (a<=4) {
			System.out.println("7000 �����Ͻðڽ��ϱ�?");
			user=sc.nextInt();
			
			if(user==1) {
			
				total+=money;
			}
	
			a++;
		}
		sc.close();
		
		System.out.printf("���� ���� �ݾ�: %d��", total);

		
	}

}
