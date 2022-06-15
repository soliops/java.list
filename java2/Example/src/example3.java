
public class example3 {

	public static void main(String[] args) {
	/*
	 * 응용문제
	 * 배열 +기본(클래스) 메소드 문제
	 * product: 수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고
	 * moneys : 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 
	 * 장바구니에 해당 상품을 모두 담았습니다.
	 * 단, 그 중 사과와 바나나는 제외하고 총 결제 금액을 출력하시오.
	 * 	
	 */
		
	String product[] = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
	int moneys[] = {35000,8000,4000,5500,3800,4400,11000,18900};
	totals(product,moneys);
		
		
		
	}
	
	public static void totals(String p[],int m[]) {
		
		int ea=p.length;
		int w=0;
		int total=0;
		do {
			if(!p[w].equals("바나나")&&!p[w].equals("사과")) {
			//System.out.println(p[w]);
				total+=m[w];
				
			}
			w++;
		}while(w<ea);
		System.out.printf("총 결제 금액 : %s원",total);
	}
	
	
	
}
