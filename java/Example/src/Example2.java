import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		/*
		 * ���빮�� ����ڰ� �Է��� ���ڿ� ���� �������� �۵��ϸ�, ������ ����� ����Ͽ� ¦�� ���� Ȧ�� ������ ����Ͻÿ�.
		 * "�����ܿ� ���� ���ڸ� �Է��ϼ���?"��� �޼����� ��µǸ� �ش� ���ڿ� ���缭 ��� ����� ���ϸ�, ���� ���� ���� ¦�� ���� Ȧ�� ������
		 * ����Ͻø� �˴ϴ�. ��, �ش� �ݺ����� for~do while������ �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
		 */

		Scanner sc = new Scanner(System.in);
		String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���?";
		System.out.println(msg);
		int user = sc.nextInt();
		int number = 1;
		//string msg;
		int total = 0;
		do {
			total += (user * number);
			number++;
		} while (number <= 9);
		if (total % 2 == 0) {
			System.out.printf("�ش� ������ �հ�� %d�̸� ¦���Դϴ�.", total);
			//msg = "¦��";
		} else if (total % 2 == 1) {
			System.out.printf("�ش� ������ �հ�� %d�̸� Ȧ���Դϴ�.", total);
			//msg="Ȧ��"
		}
		sc.close();

	}

}
