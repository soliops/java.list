import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		byte a = 10;
		if (a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");
		}
		else if (a >= 10 || a <= 22) { //조건문에 범위를 설정하여 적용함
			System.out.println("당첨입니다.");
			
		}
		else {
			System.out.println("범위 밖의 숫자 입니다.");
		}
		
		/*응용문제
		 * Q. 1~45까지 숫자 하나를 입력하세요?
		 * error 문구
		 * 0을 입력 : 숫자입력이 잘못 되었습니다.
		 * 45보다 큰 숫자를 입력 : 숫자는 1~45까지만 입력 가능합니다.
		 */
		
		Scanner c = new Scanner(System.in);
		System.out.println("Q. 1~45까지 숫자 하나를 입력하세요?");
		int number = c.nextInt();
		if (number==0) {
			System.out.println("숫자입력이 잘못 되었습니다.");
		}
		else if (number > 45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
			
		}
		/*else if (number >=1 && number <=45) {
			if (number == 7 || number == 12 || number ==14) {
				System.out.println("당첨입니다.");
			}
			else {
				System.out.println("다음 기회에 참여하세요.");
			}
		}
		*/
		else {
			if (number == 7 || number == 12 || number ==14) {
				System.out.println("20% 쿠폰 당첨입니다.");
			}
			else if (number ==41) {
				System.out.println("50% 쿠폰 당첨입니다.");
			}
			else {
				System.out.println("다음 기회에 참여하세요.");
				
			}
		
		}
		c.close();
		
	}

}
