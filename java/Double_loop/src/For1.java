
public class For1 {

	public static void main(String... args) {
		/* 응용문제
		 * 구구단 2~3단까지만 출력하시오.
		 */
		
		//더블 반복문
		int f,ff;   //반복문에 사용할 변수 선언을 미리 하였음.
		
		for(f=2;f<=3;f++) {  //큰 반복문 2~3까비만 회전함
			for(ff=1;ff<=9; ff++) { //작은 반복문 1~9까지 회전함

				//해당 작은 반복문이 작동할 때마다 출력을 사용함
				//System.out.println(f+"*"+ff);		
			}
		}
		
		/* 응용문제
		 * 구구단 5~7단까지 출력을 하되 4까지만 연속적으로 나오는 수식구를 출력하시오.
		 * 5*1~ 7*4 
		 * 해당 결과값의 총 합계를 출력하시오.
		 */
		int t,tt;
		int total=0;
		for(t=5;t<=7;t++) {
			for(tt=1;tt<=4;tt++) {
			//System.out.printf("%d*%d",t,tt);	
				total+=(t*tt);
			}
		}
		System.out.println(total);
	}

}
