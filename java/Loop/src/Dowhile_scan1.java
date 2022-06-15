import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/* 응용문제
		 * 사용자가 총 3번의 숫자를 입력합니다.
		 * 3개 숫자를 모두 곱하여 총 합계 수를 출력하시오.
		 * 123456789 *123456789 *123456789
		 */
		Scanner sc = new Scanner(System.in);
		int user;
		int number=1;
		long total=1;  //long을 입력시 최종결과에서 -음수 발생함
		do {
			System.out.println(number+"번째 곱하실 숫자를 입력하세요.");
			user = sc.nextInt();
			total*=user;
			number++;
		} while (number<4);
		System.out.println("모두 곱한 총 합계: "+total);
		sc.close();
		
	}
}
