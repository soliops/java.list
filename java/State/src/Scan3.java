import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Q : 사용자가 원하는 숫자를 입력하세요?");
		//한번더 해볼것.
		int mid = a.nextInt();
		//next를 쓸때는 String일때
		//%는 값을 나누면서 나머지값을 확인하는 수식구
		if (mid%2==0){
			System.out.println("짝수 값입니다.");		
		}
		else {
			System.out.println("홀수 값입니다.");
		}

		a.close();
		
		
		Scanner b = new Scanner(System.in);
		System.out.println("사용자가 원하는 숫자를 쓰세요?");
		int mid2 = b.nextInt()%2;
		if (mid2==0) {
			System.out.println("짝수 값입니다.");
		}
		else if (mid2==1) {
			System.out.println("홀수 값입니다.");
		}
		b.close();
		
	}

}