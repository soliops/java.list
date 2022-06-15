
public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제4 다음 결과값에 맞춰서 코드가 출력 되도록 하시오. 해당 코드는 for문으로 작성하시오. 
		 * 45 35 25 15 10
		 */

		int a;
		int b;
		for (a = 9; a >= 1; a--) {
			b= a * 5;
			if ( a%2==1 && a>=2 ||a==2)/*a == 9 || a == 7 || a == 5 || a == 3 || a == 2*/ 
			{
				System.out.print(b + " ");
			}
		}
	}

}
