import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ� ������ �ѱ۷� ǥ�� �Ͻʽÿ�?");
		String color = sc.next();
		switch (color) {
		case "����": {
			System.out.println("red");
			break;
		}
		case "��Ȳ": {
			System.out.println("orange");
			break;
		}
		case "���": {
			System.out.println("yellow");
			break;
		}
		case "�ʷ�": {
			System.out.println("green");
			break;
		}
		default:
			System.out.println("�ش� �ܾ�� ������ ���� �ʽ��ϴ�.");
			break;
		}
		sc.close();
	}

}
