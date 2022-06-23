package java_test;

import java.util.Arrays;

public class test2_1 {

	public static void main(String[] args) {
		bas b= new bas();
		b.basket_data();
		System.out.printf("최종 결제 금액은 %s 원 입니다.",b.total);
	}

}
class bas extends test2_1a{
	static int total =0;
	public void basket_data() {
		String user[] ={ "사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8" };
		System.out.println(Arrays.toString(this.money));
	}
}