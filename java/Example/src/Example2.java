import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		/*
		 * 응용문제 사용자가 입력한 숫자에 맞춰 구구단이 작동하며, 구구단 결과를 계산하여 짝수 인지 홀수 인지를 출력하시오.
		 * "구구단에 대한 숫자를 입력하세요?"라고 메세지가 출력되면 해당 숫자에 맞춰서 모든 결과를 더하며, 더한 값에 따라 짝수 인지 홀수 인지를
		 * 출력하시면 됩니다. 단, 해당 반복문은 for~do while문까지 한가지를 선택해서 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);
		String msg = "구구단에 대한 숫자를 입력하세요?";
		System.out.println(msg);
		int user = sc.nextInt();
		int number = 1;
		//string msg;
		int total = 0;
		do {
			total += (user * number);
			number++;
		} while (number <= 9);
		if (total % 2 == 0) {
			System.out.printf("해당 구구단 합계는 %d이며 짝수입니다.", total);
			//msg = "짝수";
		} else if (total % 2 == 1) {
			System.out.printf("해당 구구단 합계는 %d이며 홀수입니다.", total);
			//msg="홀수"
		}
		sc.close();

	}

}
