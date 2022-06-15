import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공 됩니다.
		 * 그 중 레벨데이터 값에 3미만(미포함)의 값만 확인 하여
		 * 배열 데이터를 재가공 합니다.
		 * 
		 * "홍길동","이순신","강감찬","세종대왕","유관순","김유신"
		 * 4,3,1,1,2,2
		 * 
		 * ["강감찬","세종대왕","유관순","김유신"]
		 */

		String member[]= {"홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int lv[] = {4,3,1,1,2,2}; //조건 기준
		String a[] = new String[10];
		int ea=member.length;
		int w=0;
		int ct=0;
		do {
			if(lv[w]<3) {
			 a[ct]=member[w];
						ct++; 
			}
			w++;
		}while(w<ea);

				System.out.println(Arrays.toString(a));
		
	}

}
