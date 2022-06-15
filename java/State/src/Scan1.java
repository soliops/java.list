import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		
		Scanner b = new Scanner(System.in);
		System.out.print("Q : 당신의 나이는?");
		
		int c = b.nextInt();
		
		System.out.println("해당 나이는 "+c+"입니다.");
		
		Scanner d = new Scanner(System.in);
		System.out.println("Q : 입력하실 금액을 적어주세요?");
		
		int e = d.nextInt();
		
		if (e<1000) {
			System.out.println("1000원 이상 금액을 입력하셔야 합니다.");
		}
		else {
			System.out.println("입금이 진행 됩니다.");
		}
		
		
		b.close();
		d.close();
		
		
	}

}
