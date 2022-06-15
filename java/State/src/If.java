
public class If {

	public static void main(String[] args) {

		int a = 10;
		int b = 100;

		// 조건문 (if ~ else)
		// 하나의 조건문에서는 if와 else는 한번만 사용가능 else if는 여러번 가능
		if (a > b) { // if문
			System.out.println("a값이 더 큽니다.");
		} else if (a < b) { // else if문
			System.out.println("b값이 더 큽니다.");
		} else { // else문
			System.out.println("두 값이 같습니다.");
		}
		/* else문이 없는 경우 */
		if (a > b) {
			System.out.println("a값이 더 큽니다.");

		} else if (a < b) {
			System.out.println("b값이 더 큽니다.");
		} else if (a == b) {
			System.out.println("두 값이 같습니다.");
		}
		
		/* 부등호기호 : < , > , <= , >=, == */
		
		
		
	}

}
