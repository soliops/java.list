import java.lang.reflect.Array;
import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�.
		 * �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�.
		 * �ù��� 30000�� �̻�(����)
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * [48000,67000,118200,49800]<- ������ �����͸� �迭�� ���Ӱ� ������ ��
		 */
		
		int a[] = new int[4];
		int b[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int eb = b.length;
		int ct=0; //a�迭�� ������� ���� ��
		int w=0;
		while(w<eb) {
			if(b[w]>=30000) {
				a[ct]=b[w];
				ct++;
			}
				
			w++;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
