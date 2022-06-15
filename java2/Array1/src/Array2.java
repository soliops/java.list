
public class Array2 {

	public static void main(String[] args) {

		String id[] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(id[4]);
		//int word = id[4].length();
		//System.out.println(word);
		
		/*
		 * 응용문제 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배열값 중 사용자 데이터 3단어 이상만 출력시키시오.
		 * 
		 */
		int member= id.length; //전체 회원수를 파악하기 위함
		int w=0;
		int word; //각각의 배열 데이터의 문자 갯수파악
		do { 
			word = id[w].length(); //문자 갯수 파악
			
			if(word>3) { //세단어 이상(포함)의 데이터만 출력
				System.out.println(id[w]);
			}
			w++;
		}while(w<member);
		
		
		/*
		 * 응용문제
		 * 배열 데이터는 다음과 같음
		 * 15 60 11 14 27
		 * 다음 데이터 값을 모두 더해서 최종 결과값을 출력하시오.
		 */
		int data[] ={15,60,11,14,27}; //배열
		
		int dw=0; //배열 데이터
		int data_ea= data.length;
		int total=0;
		while(dw<data_ea) {
			total=total+data[dw];   //total+배열의 해당 데이터를 계속 더함
			dw++;
		};
		System.out.println(total);
		
		int d[] = {11,233,51,23,56};
		int d2 = 0;
		int d3 = d.length;
		int total2=1;
		do {
			total2*=d[d2];
			d2++;}while(d2<d3);
		System.out.println(total2);
		
		
		
	}

}
