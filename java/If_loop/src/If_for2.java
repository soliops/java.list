
public class If_for2 {

	public static void main(String[] args) {
		//1~100���� ���� �� 80�̻��� ���ڸ� ���/
		int f;
		for(f=1;f<101;f++) {
			if(f>=80) {
				//System.out.print(f+" ");
			}
			
		}
		
		/*	���빮��
		 * 	200~300���� ���� �� 240������ ���ڸ� ����Ͻÿ�.
		 */
		int s;
		for(s=200;s<=300;s++) {
			if(s<=240) {
			//	System.out.print(s+" ");
			}
		}
		/*
		final int a = 2;
		int w;
		for(w=1;w<=10;w++) {
			if(w%a==0)
				System.out.printf("%d ",w);
		}
		*/
		/* ���빮��
		 * ������ �� 2���� �ݺ��մϴ�. �� 2�� ����� �� 10 �̻� ���ڸ� ����մϴ�.
		 */
		int aa;
		final int bb=2;
		int cc;
		for (aa=1;aa<10;aa++) {
		 cc=aa*bb;
		 if(cc>10){
		// System.out.printf("%d ",cc);
		}
		 }
		
		/*���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 * 18 36 54 72
		 */
		int d;
		int e=9;
		final int g=2;
		int total;
		for (d=1; d<=9; d++) {
			total=d*e;
			if(total%g==0) {
			//	System.out.printf("%d ", total);
				
			}
		}
		
		/* ���빮��
		���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		1~20 ������ ���� �Դϴ�.
		6 14 17 19
		 */
			int v;
			for (v=1;v<=20; v++) {
				if(v==6||v==14||v==17||v==19) {
					System.out.print(v+" ");
				}
				
			}
			
		
		
	}

}
