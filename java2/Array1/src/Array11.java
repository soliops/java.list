
public class Array11 {

	public static void main(String[] args) {
		/* ���빮��
		 * ���� �迭���� �ֽ��ϴ�. �ش� �迭 ���� ���Ͽ�
		 * ����� ������ ����Ͻÿ�.
		 * Adata = hong kim park jang lee soun
		 * Bdata = 80 100 46 38 65 88
		 *  
		 *  ��� �迭�� ���� ������ 60�� �̻�(����) �� �հ��ڸ� ����մϴ�.
		 * ��� �迭 [hong,kim,lee,soun]
		 */
		String a[]=	{"hong","kim","park","jang","lee","soun"};
		int aa[]={80,100,46,38,65,88};
			
		int b=a.length;
		int c=aa.length;
		int w=0;
		do {
			int ww=0;
			do {
				if(aa[c]>=60) {
					System.out.println(a[w]);
				}
				ww++;
			}while(ww<c);
			w++;
		}while(w<b);
	}

}
