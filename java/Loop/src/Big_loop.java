import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*1~100까지의 전체 합을 출력하는 for문을 제작하시오
		 */
		/*int a;
		int total=0;
		for(a=1;a<=100; a++) {
			total+=a;
		}
		System.out.println(total);
		*/
		/* 1~100까지 곱한 결과값은?	*/
		
		int f;
		//BigInteger : java에서 모든 무한의 값을 저장할 수 있는 유일한 자료형 입니다.
		BigInteger aa = new BigInteger("1"); 
		//합계에 사용할 자료형 변수 1을 최초값으로 설정 단, ""을 무조건 적용해야 합니다.
		for(f=1;f<=100;f++) {
			/* multiply : 사칙연산 곱하기를 담당함.
			 * add 		: 사칙연산 더하기를 담당함.
			 * subtract : 사칙연산 빼기를 담당함.
			 * divide 	: 사칙연산 나누기를 담당함.
			*/
			aa=aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
		
	}

}
