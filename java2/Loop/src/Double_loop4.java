
public class Double_loop4 {

	public static void main(String[] args) {
		/*
		 * 응용문제 복합반복문 밖에 for문, 안에 do-while문
		 */
		int f;
		for(f=2;f<=3;f++) {
			int w=1;
			do {
			//	System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(
				w<=9	);
		}
		
		/* 응용문제
		 * 구구단 7단부터 9단까지 단, 각 구구단 곱셈값은 5까지만 나오도록 합니다.
		 * 7*1=7..~9*5=45
		 * 밖에는 do-while 문 안에는 while문
		 */
		
		int a=7;
		do {
			int b=1;
			while (b<=5) {
			//	System.out.println(a+"*"+b+"="+(a*b));
				b++;
			}
			a++;
		} while (a<=9);
		
		
		/* 응용문제 다음 결과값을 확인하여 코드를 작성합니다.
		 * 단, for문으로 시작하여 while문으로 제작되도록 합니다.
		 * 1*1=1
		 * 2*2=4
		 * ...
		 * 9*9=81
		 */
		
		int w;
		int total2;
		for(w=1;w<=9;w++) {
			int ww=w;
			while (ww<=w) {
				total2=w*ww;
			//	System.out.println(w+"*"+ww+"="+(total2));
				ww++;
			}
		}
		
		/*응용문제
		 * 다음 해당 결과값처럼 출력이 되도록 더블반복문을
		 * 이용하시오.
		 * (while ~ do-while문)
		 * 결과값 : 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8
		 */
	}

}
