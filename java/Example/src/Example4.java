
public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮��4 ���� ������� ���缭 �ڵ尡 ��� �ǵ��� �Ͻÿ�. �ش� �ڵ�� for������ �ۼ��Ͻÿ�. 
		 * 45 35 25 15 10
		 */

		int a;
		int b;
		for (a = 9; a >= 1; a--) {
			b= a * 5;
			if ( a%2==1 && a>=2 ||a==2)/*a == 9 || a == 7 || a == 5 || a == 3 || a == 2*/ 
			{
				System.out.print(b + " ");
			}
		}
	}

}
