
public class Double_loop2 {

	public static void main(String[] args) {
		// while 문
		int w = 1;
		while (w <= 3) {
			int ww = 1; //작은 while문의 초기값을 큰 반복문 안에 적용
			while (ww <= 4) {
			//	System.out.println(w + "+" + ww);
				ww++;
			}
			w++;
		}

		//do while
		int dw = 1;
		
		do {
			//do while문 또한 while문 같이 초기값을 큰 반복문 안에 설정
			int ddw=1;
			
			do {
			
				System.out.println(dw +"+"+ddw);
				ddw++;
			}while(ddw<=4); //작은 반복문 범위
				dw++;
		}while(dw<=3);//큰 반복문 범위
		
		
		
		
	}

}
