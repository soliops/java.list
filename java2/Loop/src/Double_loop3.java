
public class Double_loop3 {

	public static void main(String[] args) {
		/*
		 * 응용문제 다음 결과값이 출력 되도록 for문으로 작성하시오.
		 * 5+2=7
		 * 5+3=8
		 * 5+4=9
		 * 5+5=10
		 * 6+2=8
		 * 6+3=9
		 * 6+4=10
		 * 6+5=11
		 * 7+2=9
		 * 7+3=10
		 * 7+4=11
		 * 7+5=12
		 * ....
		 * 9+5=14
		 * 
		 */
		
		int a,b;
		int total;
		for (a=5;a<=9;a++) {
		for(b=2;b<=5;b++) {
			total= a+b;
		//	System.out.println(a+"+"+b+"="+total);
		}
		}
		
		/*
		 * 응용문제  더블while문으로 제작
		 * 9*7=63
		 * 9*6=54
		 * 9*5=45
		 * ..
		 * 7*7=49
		 * 7*6=42
		 * 7*5=35
		 * 
		 */
		
		int aa=9;
		while (aa>=7) {
			int bb =7;
			while (bb>=5) {
			//	System.out.println(aa+"*"+bb+"="+(aa*bb));
				bb--;
			}
			aa--;
		}
		
		/*
		 * 응용문제 다음 결과값을 보고 do-while문으로 제작하시오.
		 * 5+4=9
		 * 5+5=10
		 * 5+6=11
		 * 5+7=12
		 * 4+4=8
		 * ...
		 * 3+4=7
		 * 3+5=8
		 * 3+6=9
		 * 3+7=10
		 */
		int c=5;
		do {
			int d=4;
			do {
				System.out.println(c+"+"+d+"="+(c+d));
				d++;
			} while (d<=7);
			c--;
		} while (c>=3);
	}

}
