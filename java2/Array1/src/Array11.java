
public class Array11 {

	public static void main(String[] args) {
		/* 응용문제
		 * 다음 배열값이 있습니다. 해당 배열 값을 비교하여
		 * 사용자 정보를 출력하시오.
		 * Adata = hong kim park jang lee soun
		 * Bdata = 80 100 46 38 65 88
		 *  
		 *  결과 배열에 따른 조건은 60점 이상(포함) 중 합격자만 출력합니다.
		 * 결과 배열 [hong,kim,lee,soun]
		 */
		String a[]=	{"hong","kim","park","jang","lee","soun"};
		int aa[]={80,100,46,38,65,88};
			
		int b=a.length;
		int c=aa.length;
		int w=0;
		do {
			int ww=0;
			do {
				if(aa[c]>=60) {
					System.out.println(a[w]);
				}
				ww++;
			}while(ww<c);
			w++;
		}while(w<b);
	}

}
