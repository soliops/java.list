import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10까지 숫자를 하나 선택하세요: ");
		int no = sc.nextInt();
		
		memorys m = new memorys(); //-> 메모리보단 출력을 우선
		/* memorys m =null;
	 	m = new memorys();
		*/
		m.ms(no);
	    m = null; // 해당 인스턴스를 비움, 초기화해서 메모리 비우는것
	
	    sc.close();
		
		m = new memorys();
		m.rd();
		
		
		
		
	}

}
class memorys{
	public void ms(int user) {
		//Math.random() 랜덤메소드 사용법 기본은 자료형 double입니다.
		/*
		 * random => 보안코드, 인증코드, 추첨, 룰렛
		 */
		//double a = Math.random(); //0.0~1.0까지 랜덤
		//*10을 하면 0~10까지 랜덤 double -> int 변경
		int w = 0;
		while(w<=10) {
			int b = (int)(Math.random()*10);//*10이면 0~9 *10+1이면 1~10
				System.out.printf("%d ",b);
			
			w++;
		}
		
		
		/*
		if (user==b) {
			System.out.println("당첨");
		}
		else {
			System.out.println("다음기회에");
		}
		//System.out.println(b);
		*/
	}
	public void rd() { // random util 사용법
		Random r = new Random(); 
		int w=0;
		while(w<=5) {
			System.out.println(r.nextInt(45)+1); //(10)이면0~9까지 r.nextInt를 사용
			//1~10까지는 (10)+1를 하면 됨
			
			w++;
		}
		r=null;
	}
}