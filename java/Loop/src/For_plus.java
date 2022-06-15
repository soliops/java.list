
public class For_plus {

	public static void main(String[] args) {
		
		/*
		 * 1~10까지 모든 숫자를 합한 결과값을 출력하시오.
		 * 
		 */
		int f;
		int total=0;   //0으로 지정 안하면 연산이 오류남
		for(f=1;f<=10; f++) { //total 변수값에 반복값을 지속적으로 증가시킴
			//total=total+f;
			total+=f;
		}
		//System.out.println("총합계:"+total); //반복문이 다 돌아가고 나서 출력해야 합계가 나옴.
		
		//+=(더하기 할당 기호) -=(빼기 할당 기호) *=(곱하기 할당 기호) /=(나누기 할당 기호)
		// b = b -f; b-=f;
		
		/*
		 * 응용문제
		 * 전체값은 500이 있습니다. 총 8회 동안 반복되면서
		 * 한번 반복할때 마다 12씩 감소하도록 하여 최종 값을 출력하시오.
		 * 최종값 404
		 */
		
		int a;
		//int m=12;
		int total1 =500;
		for(a=1; a<=8; a++) {
			//total1-=m;
			total1-=12;
		}
		//System.out.println("최종값:"+total1);
		
		/*
		 * 응용문제
		 * 구구단 2단 2*1~2*9의 총 합계를 출력하시오.
		 * 정답 합계 90
		 */
		
		int a2;
		int total2=0;
		for(a2=1;a2<10;a2++) {
			total2+=a2*2;
				
		}
		System.out.println("최종값:"+total2);
	}

}
