import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/* UP&DOWN 게임
		 * A파트 : PC 랜덤, Scanner(5번) 이용
		 * B파트 : PC에서 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과 처리 
		 * 
		 * 
		 기회는 총 5번
		 1.PC가 숫자를 하나 선택?? random 
		 (숫자는 1~10)
		 
		 2.총 기회는 5번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?  라고 표시
		 3.만약에 PC가 숫자 7을 선택한 기준에서 사용자 숫자와 비교를 
		 -PC : 7 사용자 : 2 => 결과 : UP  (조건문)
		 4.총 기회는 4번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?  라고 표시
		 5.PC : 7 사용자 : 4 => 결과 : UP
		 6.총 기회는 3번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?  라고 표시
		 7.PC : 7 사용자 : 7 => 정답입니다. 모든 프로세서는 정지
		 */
		Example2 sc = new Example2();
		Scanner updown = new Scanner(System.in);
		int pc_num = (int)(Math.random()*10+1);
		/*일반 random에서 (random double 자료형)*/
		/*util을 이용한 random형식*/
		Random r = new Random();
			int rr= r.nextInt(10)+1;   //random util로 pc가 뽑은 숫자 
			System.out.println(rr);   
		int w=5;
		do {
			System.out.printf("총 기회는 %s번 남았습니다. 1~10까지 번호 중 하나를 입력하세요?",w);
			int user_number = updown.nextInt();
			sc.result(pc_num,user_number);
			String out = sc.result1();
			System.out.println(out);
			
			int check = out.indexOf("정답"); //indexof : 단어 검색( -1: 없음 0: 있음)
			if(check==0) {
				System.out.println("PC 숫자는 "+pc_num+"였습니다.");
				break;
				
			}
			w--;
		}while(w>0);
		updown.close();
		System.exit(0);
		System.gc();
	}
	
	
}
