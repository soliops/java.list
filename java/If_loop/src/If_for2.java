
public class If_for2 {

	public static void main(String[] args) {
		//1~100까지 숫자 중 80이상의 숫자만 출력/
		int f;
		for(f=1;f<101;f++) {
			if(f>=80) {
				//System.out.print(f+" ");
			}
			
		}
		
		/*	응용문제
		 * 	200~300까지 숫자 중 240이하의 숫자만 출력하시오.
		 */
		int s;
		for(s=200;s<=300;s++) {
			if(s<=240) {
			//	System.out.print(s+" ");
			}
		}
		/*
		final int a = 2;
		int w;
		for(w=1;w<=10;w++) {
			if(w%a==0)
				System.out.printf("%d ",w);
		}
		*/
		/* 응용문제
		 * 구구단 중 2단을 반복합니다. 단 2단 결과값 중 10 이상 숫자만 출력합니다.
		 */
		int aa;
		final int bb=2;
		int cc;
		for (aa=1;aa<10;aa++) {
		 cc=aa*bb;
		 if(cc>10){
		// System.out.printf("%d ",cc);
		}
		 }
		
		/*다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		 * 18 36 54 72
		 */
		int d;
		int e=9;
		final int g=2;
		int total;
		for (d=1; d<=9; d++) {
			total=d*e;
			if(total%g==0) {
			//	System.out.printf("%d ", total);
				
			}
		}
		
		/* 응용문제
		다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		1~20 사이의 숫자 입니다.
		6 14 17 19
		 */
			int v;
			for (v=1;v<=20; v++) {
				if(v==6||v==14||v==17||v==19) {
					System.out.print(v+" ");
				}
				
			}
			
		
		
	}

}
