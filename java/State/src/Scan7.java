import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/*���빮��
		 * [������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�]
		 * Q.�������� ��ȣ�� �Է��ϼ���?
		 * ��׶��忡�� ����
		 * ���� 220524
		 * ����ڰ� ���� 220524 �ܿ� �Է½� 
		 * "������ȣ�� Ʋ���ϴ�."��� ����Ͻð�
		 * ������ ������ȣ ���ڸ� �Է½� "����Ȯ�� �Ǽ̽��ϴ�."��� ����մϴ�.
		 * ��, 220524�� java����� ���� ���� ����Ǵ� ������ ó���ϼ���.
		 */
		
		int sc = 220524;
		Scanner a = new Scanner(System.in);
		System.out.println("Q.�������� ��ȣ�� �Է��ϼ���?");
		int sc1 = a.nextInt();
		if (sc1 == sc) {
			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
					}
		else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		a.close();
	
	
		
	}

}
