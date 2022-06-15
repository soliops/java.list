import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/*
		 * Scanner와 함계 while문으로 사용자가 입력하는
		 * 값으로 구구단 결과가 출력되는 프로그램을 제작하시오.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 구구단의 숫자를 입력하세요.");
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
