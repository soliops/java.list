import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		byte a = 10;
		if (a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���.");
		}
		else if (a >= 10 || a <= 22) { //���ǹ��� ������ �����Ͽ� ������
			System.out.println("��÷�Դϴ�.");
			
		}
		else {
			System.out.println("���� ���� ���� �Դϴ�.");
		}
		
		/*���빮��
		 * Q. 1~45���� ���� �ϳ��� �Է��ϼ���?
		 * error ����
		 * 0�� �Է� : �����Է��� �߸� �Ǿ����ϴ�.
		 * 45���� ū ���ڸ� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.
		 */
		
		Scanner c = new Scanner(System.in);
		System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���?");
		int number = c.nextInt();
		if (number==0) {
			System.out.println("�����Է��� �߸� �Ǿ����ϴ�.");
		}
		else if (number > 45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
			
		}
		/*else if (number >=1 && number <=45) {
			if (number == 7 || number == 12 || number ==14) {
				System.out.println("��÷�Դϴ�.");
			}
			else {
				System.out.println("���� ��ȸ�� �����ϼ���.");
			}
		}
		*/
		else {
			if (number == 7 || number == 12 || number ==14) {
				System.out.println("20% ���� ��÷�Դϴ�.");
			}
			else if (number ==41) {
				System.out.println("50% ���� ��÷�Դϴ�.");
			}
			else {
				System.out.println("���� ��ȸ�� �����ϼ���.");
				
			}
		
		}
		c.close();
		
	}

}
