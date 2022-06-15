import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요?");
		int number = sc.nextInt();
		String msg;
		if(number>60) {
			msg="해당 숫자는 60까지만 입력이 되어야 합니다.";
		}else {
			if(number%2==0) {
				msg="해당 숫자는 짝수입니다.";
			}else {
				msg="해당 숫자는 홀수입니다.";
			}
		}
		System.out.println(msg);
		sc.close();
	}

}
