import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� ���� �˴ϴ�.
		 * �� �� ���������� ���� 3�̸�(������)�� ���� Ȯ�� �Ͽ�
		 * �迭 �����͸� �簡�� �մϴ�.
		 * 
		 * "ȫ�浿","�̼���","������","�������","������","������"
		 * 4,3,1,1,2,2
		 * 
		 * ["������","�������","������","������"]
		 */

		String member[]= {"ȫ�浿","�̼���","������","�������","������","������"};
		int lv[] = {4,3,1,1,2,2}; //���� ����
		String a[] = new String[10];
		int ea=member.length;
		int w=0;
		int ct=0;
		do {
			if(lv[w]<3) {
			 a[ct]=member[w];
						ct++; 
			}
			w++;
		}while(w<ea);

				System.out.println(Arrays.toString(a));
		
	}

}
