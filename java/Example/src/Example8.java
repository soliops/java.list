import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * ���빮��8 
		 * ����� �н������ a1234 �Դϴ�. ����ڰ� �н����带 �Է��մϴ�.
		 *  ��, 3ȸ �̻� ���н� ������ ���� ��µǵ��� �մϴ�.
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�." 
		 * ��, �н����尡 ���� ���"�α��� �Ǿ����ϴ�."��� ��µǾ�� �մϴ�.
		 */
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("�н����带 �Է����ּ���.");
		int number = 1;
		do {
			final String user = sc.next();
			if (user.equals("a1234")) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;  //break�� �ݺ����� ���� ���� �Ҷ� ����մϴ�.
			} else if (number == 3) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
			} else {
				System.out.println("�н����带 �ٽ� �Է����ּ���.");
			}
			number++;
		} while (number <4);
		sc.close();
		*/
		final String pw="a1234";
		int c=3;
		Scanner sc =new Scanner(System.in);
		int w =1;
		String msg = "�н����带 �Է��� �ּ���.";
		while(w<4) {
		System.out.println(msg);
		String userpw =sc.next();
		if(pw.equals(userpw)) {
			System.err.println("�α��� �Ǿ����ϴ�.");
			break;
		}
		else {
			msg="�ùٸ� �н����带 �־��ּ���";
			c--;
			if (c==0) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				
			}
		}
		
		}
		sc.close();
		
	}

}
