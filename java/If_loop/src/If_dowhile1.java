
public class If_dowhile1 {

	public static void main(String[] args) {

		/* ���빮��
		 * ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�.
		 */
		int a=1;
		int b;
		do {
			b=a*6;
			if (b>=35) {
				//System.out.printf("%d ", b);
			}
			a++;
		} while (a<=9);
		
		/* ���빮��
		 * 14~27���� ���� �� ¦������ ��� ���Ͽ� 
		 *  ���� ������� ����Ͻÿ�.
		 */
		
		int aa=14;
		int total=0;
		do {
			if(aa%2==0){
				total+=aa;
			}
			aa++;
		} while (aa<=27);
		System.out.println(total);
		
	}

}
