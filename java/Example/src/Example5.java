
public class Example5 {

	public static void main(String[] args) {
		/*
		 응용문제5
		 다음 코드를 보고 while문으로 변환하시오. 
		int sum=0;
		int l;
		for(l=1;l<=12;l++) {if(l%2==0) {sum=1+sum;
	} System.out.println("1부터 12까지의 짝수의 합 = " +sum);
		}
		 */
		
		 int sum=0;
		 int l=1;
		 while (l<=12) {
			if(l%2==0) {
				sum=l+sum;
			}
			 l++;
		}
		 System.out.println("1부터 12까지의 짝수의 합 = " +sum);
	}
}