import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/*
		 * Scanner�� �԰� while������ ����ڰ� �Է��ϴ�
		 * ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� �������� ���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		int b=1;
		int c;
		while(b<=9) {
			c=a*b;
			System.out.printf("%d ",c );
			b++;
			
		}
		sc.close();

		
		
	}

}
