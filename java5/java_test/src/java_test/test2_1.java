package java_test;

import java.util.Arrays;

public class test2_1 {

	public static void main(String[] args) {
		bas b= new bas();
		b.basket_data();
		System.out.printf("���� ���� �ݾ��� %s �� �Դϴ�.",b.total);
	}

}
class bas extends test2_1a{
	static int total =0;
	public void basket_data() {
		String user[] ={ "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" };
		System.out.println(Arrays.toString(this.money));
	}
}