
public class Switch1 {

	public static void main(String[] args) {
		/*
		 * Switch-case(break�� ��Ʈ) : ���ù� �Էµ� �� �������� ���̽��� �ߵ��Ͽ� ��°��� �����ϰ� �˴ϴ�. default��
		 * case�� ���� �� ���� ������ �������� ���� ��� �۵��Ǵ� �����Դϴ�. switch(���ڰ�)
		 */
		int n = 10; // 10�� �̻� ���� �ӵ��� �ް��� ��������.
		switch (n) {
		case 1:
			System.out.println("�ɼ� 1���� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("�ɼ� 2���� �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("�ɼ� 3���� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("������ ���� �����ϴ�.");
			break;

		}

		String user = "�̼���"; // ���ڷ� switch���� ���ڰ� ����
		switch (user) { // ����case���� �Դϴ�.
		case "�� ����":
		case "�̼���":
			System.out.println("A�� �Դϴ�.");
			break;
		case "ȫ�浿":
			System.out.println("B�� �Դϴ�.");
			break;
		case "������":
			System.out.println("C�� �Դϴ�.");
			break;
		default:
			System.out.println("�������� D�� �Դϴ�.");
			break;

		}
	}

}
