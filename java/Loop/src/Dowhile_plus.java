
public class Dowhile_plus {

	public static void main(String[] args) {
		/* dowhile:30~35���� �հ�ġ�� ���
		 * 
		 */
		int a =30;
		int b=0;
		do {b+=a;
			a++;
		}while(a<36);
		//System.out.println("�հ�ġ"+b);
		/*
		 *189 �հ�ġ�� �ֽ��ϴ�. ��,1~10������ �հ�ġ�� ���� 189�� �� �հ�ġ�� ����Ͻÿ�. 
		 */
		int aa=1;
		int bb=189;
		do {
			bb-=aa;
			aa++;
		}while(aa<11);
		System.out.println("�����:"+bb);
	}

}
