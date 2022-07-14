import java.util.Scanner;

public class study8 {

	public static void main(String[] args) {
		/*
		 * 응용문제 abstract로 배열 
		 * 출력순서 "해당 상품을 선택해 주세요?[1.사과, 2.딸기, 3.키위]"
		 * 2
		 * "해당 상품 갯수를 입력해주세요?" 
		 * 5
		 * "구매하신 총 가격은 7500원 입니다." 
		 * //"장바구니를 종료하시겠습니까?" 
		 * //Y/N 
		 * //Y
		 */
		research rs = new research();
		rs.scan();

	}

}

abstract class abclass {
	public abstract void scan();
}

class research extends abclass {
	int number=0;
	@Override
	public void scan() {
		try {
			String[] info = { "사과=2000", "딸기=1500", "키위=2500" };
			Scanner sc = new Scanner(System.in);
			System.out.println("해당 상품을 선택해 주세요?[1.사과, 2.딸기, 3.키위]");
			this.number = sc.nextInt();
			String[] ar = info[this.number-1].split("=");
			System.out.println("해당 상품 갯수를 입력해주세요?");
			this.number = sc.nextInt();
			int price= this.number * Integer.parseInt(ar[1]);
			System.out.printf("구매하신 총 가격은 %s원 입니다.", price);
			sc.close();
		} catch (Exception e) {
			System.out.println("숫자로 입력해주세요.");
			this.scan();
		}
	}
}