
public class Do1 {

	public static void main(String... args) {
		
		int a = 1;   //초기값
		do{	
		//		System.out.print(a+" ");
				a++;  //증가 또는 감소
		}while(a<11); //범위값, 종료값
		
		/*
		응용문제
		5 ~ 0까지 출력되는 do-while문을 작성하시오.
		 */
		
		int b = 5;
		do {
		//System.out.printf("%d ", b);
		//System.out.print(b+" ");
			b--;
		
		}while(b>=0);
		
		int c = 50; //기초값
		int d = 60; //종료값
		do {
			System.out.print(c+" ");
			c++;
		}while(c<=d);
		
		
		

	}

}
