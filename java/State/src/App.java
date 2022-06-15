
public class App {

	public static void main(String[] args) {
	
		/*
		 * 2진수 0,1 짝수 홀수에 주로 사용
		 * 8진수 0~7
		 * 16진수 0~9 abcdef  암호화할 때 사용  hex   #
		 * 
		 * 
		 * int
		 * String
		 * 
		 * if(조건){
		 * 해당 조건이 맞을 경우 실행 되는 코드
		 * }
		 * else if (if 외에 다른 조건){
		 * 해당 조건이 맞을 경우 실행 되는 코드
		 * }
		 * else{ if의 반대 또는 조건이 하나만 남아 있을 경우
		 * }
		 * 
		 * 
		 * *boolean a = true, false; 참 또는 거짓 체크박스나 라디오, 리턴값
		 * 
		 * Scanner a = new Scanner(System.in);
		 * 스캐너 이름이 변수 이름이랑 같으면 안됨.
		 * System.out.println("성적을 입력해 주세요.");
		 * int aa = a.nextInt(); <-스캐너 이름 오고 나서 next 사용
		 * 
		 * 
		 * */
		
        int a = 25+31*4+12;
        System.out.println(a);
        
		int b = 15*3+9+14;
		System.out.println(b);
		
		if (a<b) {
			System.out.println("공식1번 값이 더 작습니다.");
			
		}
		else if (a>b) {
			System.out.println("공식2번 값이 더 작습니다.");	
		}
		
		else {
			System.out.println("두 값이 같습니다.");
			
		}
		
		
		/* 해당값을 2진수로 짝수, 홀수로 확인하기*/
		int c = b % 2; // %기호로 사용시 0 또는 1로 나머지 값이 출력이 됩니다.
		System.out.println(c);
		
		if (c==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		
		
		
	
	}

}
