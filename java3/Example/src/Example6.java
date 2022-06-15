import java.util.Scanner;

public class Example6 {
	
	public static void main(String[] args) {
		/*
		 응용문제
		 상품가격은 42000원 입니다.
		 사용자가 해당 상품 갯수를 입력하게 됩니다.
		 해당 상품 가격에 맞는 갯수 만큼 곱하여 최종 결제 금액을
		 출력시키는 extends를 제작하시오.
		 단, 42000은 절대 숫자가 바뀌면 안됩니다.
		 사용자가 최대 구매 할 수 있는 갯수는 5개 입니다.
		 최종 결과값은 main method에서 출력 합니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 상품 갯수를 입력해주세요?");
		object2 ob = new object2();
		int user = sc.nextInt();
		ob.sum(user);
		System.out.printf("최종 금액은 : %s원 입니다.",ob.results());	
		sc.close();
		System.exit(0);
		System.gc();
	}
	
}
class object{
	private int users;
	private String msg;
	protected int sums;
	public void sum(int user1){
		final int w = 42000;
		this.users = user1;
		if(this.users>5) {
			msg="사용자가 최대 구매할 수 있는 갯수는 5개입니다.";
			System.out.println(msg);
			System.exit(0);
		}else {
		this.sums = this.users *w;
		}
}
}
class object2 extends object {
	public int results(){
		return this.sums;
	}
	
}