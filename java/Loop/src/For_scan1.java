import java.util.Scanner;

public class For_scan1 {

	public static void main(String[] args) {
		/*
		 * int a= 5;
			System.out.println(a++;);
			System.out.println(++a);
			int b=10;
			int c=10;
			int d=b+ (++c);
			System.out.println(d);
			
		 * 
		 */
		Scanner sc = new Scanner(System.in); //입력 엔진
		int score; 			//사용자 입력
		int f; 				//반복문
		int total=0;		//사용자가 입력한 값에 대한 합계
		for(f=1;f<4;f++) {
			System.out.println("점수를 입력해주세요.");		
			score=sc.nextInt(); 		//사용자가 입력한 값
			total+=score;				//사용자가 입력한 값을 합계변수 이관
		}
		System.out.println("총 점수의 합은: "+total); //합계출력
		sc.close();//엔진종료
	
				
		
		
	}

}
