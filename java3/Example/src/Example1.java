import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/* UP&DOWN ����
		 * A��Ʈ : PC ����, Scanner(5��) �̿�
		 * B��Ʈ : PC���� ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ��� ó�� 
		 * 
		 * 
		 ��ȸ�� �� 5��
		 1.PC�� ���ڸ� �ϳ� ����?? random 
		 (���ڴ� 1~10)
		 
		 2.�� ��ȸ�� 5�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?  ��� ǥ��
		 3.���࿡ PC�� ���� 7�� ������ ���ؿ��� ����� ���ڿ� �񱳸� 
		 -PC : 7 ����� : 2 => ��� : UP  (���ǹ�)
		 4.�� ��ȸ�� 4�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?  ��� ǥ��
		 5.PC : 7 ����� : 4 => ��� : UP
		 6.�� ��ȸ�� 3�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?  ��� ǥ��
		 7.PC : 7 ����� : 7 => �����Դϴ�. ��� ���μ����� ����
		 */
		Example2 sc = new Example2();
		Scanner updown = new Scanner(System.in);
		int pc_num = (int)(Math.random()*10+1);
		/*�Ϲ� random���� (random double �ڷ���)*/
		/*util�� �̿��� random����*/
		Random r = new Random();
			int rr= r.nextInt(10)+1;   //random util�� pc�� ���� ���� 
			System.out.println(rr);   
		int w=5;
		do {
			System.out.printf("�� ��ȸ�� %s�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� �Է��ϼ���?",w);
			int user_number = updown.nextInt();
			sc.result(pc_num,user_number);
			String out = sc.result1();
			System.out.println(out);
			
			int check = out.indexOf("����"); //indexof : �ܾ� �˻�( -1: ���� 0: ����)
			if(check==0) {
				System.out.println("PC ���ڴ� "+pc_num+"�����ϴ�.");
				break;
				
			}
			w--;
		}while(w>0);
		updown.close();
		System.exit(0);
		System.gc();
	}
	
	
}
