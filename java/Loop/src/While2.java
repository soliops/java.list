
public class While2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 8;
		int c;
		while(a<10) {
			
			c=b*a; //산술연산
			//System.out.print(c+" ");
			//System.out.printf("%d ", c);
			
			a++;// 증가 감소값 위치는 무조건 산술연산 아래
		}
		
		/*
		 * 응용문제
		 * 56,49,42,35,28,21,
		 */
		int e = 8;
		int f = 7;
		int g;
		while(e>=3) {
			g=e*f;
		//	System.out.print(g+",");
			e--;
		}
		
		/*응용문제
		 *다음 결과 값을 확인 하신후 해당 결과값에 맞는 코드를 작성하시오.
		 *4,7,10,13,16,19,22,
		 */
		
		int ee= 1;
		int ff =3;
		int gg;
		while(ee<=7) {
			gg=ee*ff+1;
			System.out.print(gg+" ");
			ee++;
		}
		
	}

}
