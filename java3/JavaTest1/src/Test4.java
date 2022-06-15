import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 구구단 숫자를 입력해주세요?");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("음수값은 구구단을 이용할 수 없습니다.");
		}else {
			int w=1;
			int total;
			do {
				total=num*w;
				System.out.println(num+"*"+w+"="+total);
				w++;
			}while(w<=9);
		}
		sc.close();
	}

}
