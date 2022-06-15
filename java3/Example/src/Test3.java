
public class Test3 {

	public static void main(String[] args) {
		
		int w =1;
		int total=0;
		do {
			int ww=1;
			do {
				total+=(w+ww);
				ww++;
			}while(ww<=9);
			w++;
		}while(w<=5);
		System.out.println("최종 결과값 : "+total);
		
		
	}

}
