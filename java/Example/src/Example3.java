import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/* 
		 응용문제3.
		 사용자가 해당 값을 입력합니다.
		 단, 사용자가 2개의 숫자를 입력하되 첫번째 숫자와 두번째 숫자 범위
		  안에 있는 모든 숫자를 더해서 결과값이 나오도록 제작하시오.]
		  단, 해당 코드는 do-while문으로 작성합니다.
		  
		  예시)
		  첫번째 범위 숫자는? 5
		  두번째 범위 숫자는? 10
		  범위 숫자 모든 합계는 : 45 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String msg = "첫번째 범위 숫자는?";
		System.out.println(msg);
		int user = sc.nextInt();
		String msg2 = "두번째 범위 숫자는?";
		System.out.println(msg2);
		int user2 = sc.nextInt();
		int s=user;
		int total=0; 
		do {
			total+=s;
			s++;
		} while (s<=user2);
		System.out.println("범위 숫자 모든 합계는 : "+ total+" 입니다.");
		sc.close();
	}

}
