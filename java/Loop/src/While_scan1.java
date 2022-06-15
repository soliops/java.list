import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/* 문제
		 * 총 2번의 질문을 하게 됩니다.
		 * 사용자가 숫자를 입력하여 두 수의 합을 구하는 scanner를 제작하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int user;
		int number=1;
		int total=0;
		while(number<3) {
			System.out.println(number+"번째 더하고자 하는 숫자를 입력해주세요.");
			user = sc.nextInt();
			total+=user;
			number++;
		}
		System.out.println("총 합계: "+total);
		sc.close();
		
	}

}
