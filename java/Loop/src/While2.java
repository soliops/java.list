
public class While2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 8;
		int c;
		while(a<10) {
			
			c=b*a; //�������
			//System.out.print(c+" ");
			//System.out.printf("%d ", c);
			
			a++;// ���� ���Ұ� ��ġ�� ������ ������� �Ʒ�
		}
		
		/*
		 * ���빮��
		 * 56,49,42,35,28,21,
		 */
		int e = 8;
		int f = 7;
		int g;
		while(e>=3) {
			g=e*f;
		//	System.out.print(g+",");
			e--;
		}
		
		/*���빮��
		 *���� ��� ���� Ȯ�� �Ͻ��� �ش� ������� �´� �ڵ带 �ۼ��Ͻÿ�.
		 *4,7,10,13,16,19,22,
		 */
		
		int ee= 1;
		int ff =3;
		int gg;
		while(ee<=7) {
			gg=ee*ff+1;
			System.out.print(gg+" ");
			ee++;
		}
		
	}

}
