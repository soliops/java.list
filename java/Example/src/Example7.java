import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		���빮��7
		����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ����� �����մϴ�.
		"ù��° �Է°� ��(1~10����) �Դϴ�.";
		"�ι�° �Է°� ��(1~10����) �Դϴ�.";
		"����° �Է°� ��(1~10����) �Դϴ�.";
		"������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�:"; +, -, *, /

		�ش� �����ȣ�� �°� ������� �����Ͽ� �������� ��½�Ű�ÿ�.
		
		 */
		Scanner sc = new Scanner(System.in);
		String msg1 ="ù��° �Է°� ��(1~10����) �Դϴ�.";
		String msg2 ="�ι�° �Է°� ��(1~10����) �Դϴ�.";
		String msg3 ="����° �Է°� ��(1~10����) �Դϴ�.";
		String msg4 ="������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�:";
		System.out.println(msg1);
		int asw =sc.nextInt();
		System.out.println(msg2);
		int asw2 =sc.nextInt();
		System.out.println(msg3);
		int asw3 =sc.nextInt();
		System.out.println(msg4);
		String asw4 =sc.next();
		
		if(asw4.equals("+")){
			System.out.println(asw+asw2+asw3);
		}else if(asw4.equals("-")) {
			System.out.println(asw-asw2-asw3);
			}else if(asw4.equals("*")) {
				System.out.println(asw*asw2*asw3);}
			else if(asw4.equals("/")) {
				System.out.println(asw/asw2/asw3);}
		
	
		sc.close();
		
	}

}
