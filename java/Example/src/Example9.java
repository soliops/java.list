import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		/*
		 * ���빮�� 9 A�л��� ���� ������ �Է¹ް� ��������� ������ ���α׷��� �����մϴ�. 
		 * "������ �Է��ϼ���?"��� ������ �� 5���� ������ �Ǹ�, ��� ������ �ջ��� �� 5���� ������ ���� ��հ��� ����մϴ�.
		 * "�ش� ������ ������: " ���
		 * ��, ���� ������ 40�� ������ ��� "������Դϴ�." ��� �޼����� ��� �� ���μ����� �����մϴ�.
		 * 40�� �̻��� ��� "�հ�"�̶�� �޼����� ��� �Ͻʽÿ�. 
		 [�߰���ȹ]
		 "�Է��Ͻ� ���� ���� �����ּ���:" ��� ���� ���� ��� �� �ش� ���� ����ŭ �ݺ����� ������ �Ǹ�, 
		 ���� �� ��ŭ ��հ��� ����Ǿ�� �մϴ�.
		 * do-while��
		 */ 

		Scanner sc = new Scanner(System.in);
		String msg = "������ �Է��ϼ���?";
		int number=1;
		int total = 0;
		
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���:");
		    int user2=sc.nextInt();
		do {
			System.out.println(msg);
			int user = sc.nextInt();
			total += user;
			number++;
		} while (number <= user2);
		System.out.printf("�� �հ� : %d��", total);
		
		double ave= (double)(total)/user2; //��հ��
		String msg2;
		
		
		if(ave<=40) {
			msg2 ="������Դϴ�.";
			System.out.println(msg2);
			}else {
				msg2 ="�հ�";
				System.out.println(msg2);
			}
		System.out.println("/�ش� ������ ������:"+ave+"�� "+msg2);
		
		sc.close();
		
	}

}
