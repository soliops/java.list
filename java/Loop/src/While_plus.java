
public class While_plus {

	public static void main(String[] args) {
		/* 5~10������ ���� �հ� ���� ���*/
		
		int w = 5; //�ʱⰪ
		int total=0; //�հ�ġ�� ������Ű�� ���� ������
		while (w<11) {  // +=, -=, *=, /=, %=
		total +=w;
			w++;
		}
		System.out.println("�հ�:"+total);
		
		/*���빮��
		 * 3~8���� ���� �� �հ� ���� ����Ͻÿ�.
		 */
		int r = 3;
		int total1=1;//���ϱ� �հ踦 ������ 1�⺻������ ����
		while(r<9) {
			total1*=r;
			r++;
		}
		System.out.println("�հ�:"+total1);
		
		
		
	}

}
