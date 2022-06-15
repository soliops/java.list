
public class Example6 {

	public static void main(String[] args) {
		/*
		 * 응용문제 6 1~10까지 순차적으로 작용하는 반복문이 있습니다. 단, 1~5까지는 모든값을 곱하고, 6~10까지는 모든값을 더합니다. 해당
		 * 두개의 값을 비교하여 더한 값이 큰지, 곱한값이 큰지를 결과로 출력하시오.
		 */

		int a = 1;
		int total1 = 1;
		int total2 = 0;
		do {
			if (a <= 5) {
				total1 *= a;
			} else if (a > 5) {
				total2 += a;
			}
			a++;
		} while (a <= 10);
		if (total1 > total2) {
			System.out.println("곱한 값 : " + total1);
		} else if(total1 <total2) {
			System.out.println("더한 값 : " + total2);
		}
		else {System.out.println("값이 동일합니다.");}
		
	}

}
