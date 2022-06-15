import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/* 
		 * 배열 생성 + 기본(클래스) 메소드 문제
		 * 사용자가 다음 질문에 값을 입력하게 됩니다.
		 * "학급 학생 이름을 입력해 주세요?"
		 * 총 배열 데이터는 5개가 생성 되어집니다.
		 * 별도의 메소드에서 해당 사용자가 입력한 값을 배열로 구성하여
		 * 출력하시오.
		 * 예시)사용자가 입력한 형태 : hong kim park lee jang
		 * 결과[hong,kim,prak,lee,jang]
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		String lists = "";
		int f;
		for(f=0;f<=4;f++) {
			System.out.println("학급 학생 이름을 입력해 주세요?");
			String nm = sc.next();
			lists += (nm+" ");
		}
		sc.close();
		arrays(lists);
		
		
	}
	public static void arrays(String k) {
		//System.out.println(k);
		//k = k.trim();
		String userin[] = k.split(" "); 
		//split : 문자열 또는 숫자열을 특정문자 기준으로 배열을 만들 수 있는 명령어 입니다.
	System.out.println(Arrays.toString(userin));
	}
}
