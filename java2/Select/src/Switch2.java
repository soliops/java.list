import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 사용자가 다음과 같은 질문을 받습니다.
		 * 
		 * Q. "1~5번까지 숫자를 하나 입력해주시길 바랍니다."
		 * 결과 내용 
		 * 1 : 5%할인쿠폰
		 * 2 : 10%할인쿠폰
		 * 3~4 : 택배비무료
		 * 5 : 다음기회에
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5번까지 숫자를 하나 입력해주시길 바랍니다.");
		int a = sc.nextInt();
		String msg;
	/*
		switch (a) {
		case 1:
			msg="5%할인쿠폰";
			//System.out.println("5%할인쿠폰");
			break;
		case 2:
			msg="10%할인쿠폰";
			//System.out.println("10%할인쿠폰");
			break;
		case 3:
		case 4:
			msg="택배비무료";
			//System.out.println("택배비무료");
			break;
		case 5:
			msg= "다음 기회에";
			//System.out.println("다음 기회에");
			break;
		default:
			System.out.println("숫자는 1~5번까지 입니다.");
			break;
		}
		*/
		
		///자바 버전이 14번 이상에서 사용할 것
		switch(a) {
		case 1 -> {
			msg="5%할인쿠폰";
		}case 2 -> {
			msg="10%할인쿠폰";
		}case 3,4 -> {
			msg="택배비무료";
		}default -> {
			msg="다음기회에";
		}
		}
		System.out.println(msg);
		
		sc.close();
		
		
	}

}
