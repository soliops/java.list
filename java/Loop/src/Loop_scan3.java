import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/*
		 * Scanner�� �̿��� do-while�� ������ �ۼ�
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է����ּ���.");
		int gugu = sc.nextInt();
		int a = 1;
		int anw;
		do{
			anw= gugu*a;
			System.out.printf("%d ", anw);
			a++;
			
		}while(a<=9);
		sc.close();
		
}
}
