import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/* ����
		 * �� 2���� ������ �ϰ� �˴ϴ�.
		 * ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner�� �����Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		int user;
		int number=1;
		int total=0;
		while(number<3) {
			System.out.println(number+"��° ���ϰ��� �ϴ� ���ڸ� �Է����ּ���.");
			user = sc.nextInt();
			total+=user;
			number++;
		}
		System.out.println("�� �հ�: "+total);
		sc.close();
		
	}

}
