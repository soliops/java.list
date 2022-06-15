import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/*
		 * Scanner를 이용한 do-while문 구구단 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 구구단 숫자를 입력해주세요.");
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
