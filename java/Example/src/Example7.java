import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		응용문제7
		사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 돌출하는 프로세서를 제작합니다.
		"첫번째 입력값 단(1~10까지) 입니다.";
		"두번째 입력값 단(1~10까지) 입니다.";
		"세번째 입력값 단(1~10까지) 입니다.";
		"마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오:"; +, -, *, /

		해당 산술기호에 맞게 산술식을 적용하여 최종값을 출력시키시오.
		
		 */
		Scanner sc = new Scanner(System.in);
		String msg1 ="첫번째 입력값 단(1~10까지) 입니다.";
		String msg2 ="두번째 입력값 단(1~10까지) 입니다.";
		String msg3 ="세번째 입력값 단(1~10까지) 입니다.";
		String msg4 ="마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오:";
		System.out.println(msg1);
		int asw =sc.nextInt();
		System.out.println(msg2);
		int asw2 =sc.nextInt();
		System.out.println(msg3);
		int asw3 =sc.nextInt();
		System.out.println(msg4);
		String asw4 =sc.next();
		
		if(asw4.equals("+")){
			System.out.println(asw+asw2+asw3);
		}else if(asw4.equals("-")) {
			System.out.println(asw-asw2-asw3);
			}else if(asw4.equals("*")) {
				System.out.println(asw*asw2*asw3);}
			else if(asw4.equals("/")) {
				System.out.println(asw/asw2/asw3);}
		
	
		sc.close();
		
	}

}
