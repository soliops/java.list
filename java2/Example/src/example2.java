import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		/* ���빮��
		 *  �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 *  product : ����, ����, ��� ,��, ����, Ű��, �ٳ���, ���� 
		 *  �� ����, ��, Ű���� ���� �Ͽ����ϴ�.
		 *  �ش� ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ��Ͻÿ�.			
		 *  ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ�
		 *  �ݺ����� Free�Դϴ�.
		 *  ��� : [����,���,����, �ٳ���,����]
		 */
		
		String product[]= {"����","����","���","��","����","Ű��","�ٳ���",	"����"};
		example2 fr = new example2();
		fr.fruits(product);
		

	}
	public void fruits(String A[]){
		int no=5;
		String newproduct[]=new String[no];
		int dx=0;
		for(String a : A) {
			if(!a.equals("����")&&!a.equals("��")&&!a.equals("Ű��")){
				newproduct[dx]=a;
				dx++;
			}
			
		}
		System.out.println(Arrays.toString(newproduct));
	}
}
