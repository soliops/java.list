
public class Double_loop4 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���չݺ��� �ۿ� for��, �ȿ� do-while��
		 */
		int f;
		for(f=2;f<=3;f++) {
			int w=1;
			do {
			//	System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(
				w<=9	);
		}
		
		/* ���빮��
		 * ������ 7�ܺ��� 9�ܱ��� ��, �� ������ �������� 5������ �������� �մϴ�.
		 * 7*1=7..~9*5=45
		 * �ۿ��� do-while �� �ȿ��� while��
		 */
		
		int a=7;
		do {
			int b=1;
			while (b<=5) {
			//	System.out.println(a+"*"+b+"="+(a*b));
				b++;
			}
			a++;
		} while (a<=9);
		
		
		/* ���빮�� ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�.
		 * ��, for������ �����Ͽ� while������ ���۵ǵ��� �մϴ�.
		 * 1*1=1
		 * 2*2=4
		 * ...
		 * 9*9=81
		 */
		
		int w;
		int total2;
		for(w=1;w<=9;w++) {
			int ww=w;
			while (ww<=w) {
				total2=w*ww;
			//	System.out.println(w+"*"+ww+"="+(total2));
				ww++;
			}
		}
		
		/*���빮��
		 * ���� �ش� �����ó�� ����� �ǵ��� ����ݺ�����
		 * �̿��Ͻÿ�.
		 * (while ~ do-while��)
		 * ����� : 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8
		 */
	}

}
