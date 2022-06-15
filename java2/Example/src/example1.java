
public class example1 {

	public static void main(String[] args) {
		/*
		 * 배열 + 기본(클래스)메소드 문제.
		 * 1차 배열에 다음과 같이 값이 있습니다.
		 * 배열리스트 22 33 44 55 66 77 88 99 이며
		 * 해당 전체 값을 모두 더한 총합계 값을
		 * 별도의 메소드로 처리되도록 합니다.
		 * 단, 반복문은 무조건 do-while문으로 작성합니다.
		 */

		int A[] = {22,33,44,55,66,77,88,99};
		example1 js = new example1();
		js.score(A);
		
		//만일 밑에가 static이면 바로 score(); 하면 된다.
	}
	
	public void score(int b[]) {
		int w=0;
		int ea=b.length;
		int total=0;
		do {
			total+=b[w];
			w++;
		}while(w<ea);
		System.out.printf("총 합계 : %s점",total);
}

}