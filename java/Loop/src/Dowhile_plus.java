
public class Dowhile_plus {

	public static void main(String[] args) {
		/* dowhile:30~35까지 합계치를 출력
		 * 
		 */
		int a =30;
		int b=0;
		do {b+=a;
			a++;
		}while(a<36);
		//System.out.println("합계치"+b);
		/*
		 *189 합계치가 있습니다. 단,1~10까지의 합계치와 현재 189를 뺀 합계치를 출력하시오. 
		 */
		int aa=1;
		int bb=189;
		do {
			bb-=aa;
			aa++;
		}while(aa<11);
		System.out.println("결과값:"+bb);
	}

}
