
public class For1 {

	public static void main(String[] args) {
		//�ݺ��� : �����͸� �ϰ������� �Է�, ����� �� �� �ֵ��� �ϴ� ����
		//�ݺ������� String�� �����Ƿ� ������ ��!
	
		//int z =1;
		//z++; // +1 ���� : ��� �� +1 ����
		//z--; // -1 ���� : ��� �� -1 ����
		//++z; // +1 ���� : +1 ���� �� ���
		//--z; // -1 ���� : -1 ���� �� ���
		
		/*�ݺ���
		 * for - 100data���� ����������, 100000data �Ѿ�� �ε� �ɸ��� ����
		 * while - 100000data for���� ����
		 * do ~ while - while���� ����
		 * foreach
		 * each
		 * map
		 * for ~ in
		 */
		
		//z--;
		//System.out.println(z);
		
		
		//for (�ʱⰪ; ������; ���� �Ǵ� ����)
		/*for (int a=0; a<10; a++) {
			System.out.println(a);
		}
		*/
		int b;
		for(b=5;b<=10; b++) {
		//	System.out.println(b);
		}
		
		int c;
		for(c=10;c>3;c--) { //���ǻ��� c<3 0~�������� ���� ���������� ��Ȳ�� �߻���
		//	System.out.println(c);
		}
		
		//���빮�� 20~27 ����ϼ���
		
		int d;
		for(d=20; d<28; d++) {
		//	System.out.print(d);
		}
		
		int e;
		for(e=27; e>19; e--) {
		//	System.out.println(e);
		}
		//���빮�� 39~21���� ���
		int f;
		for(f=39; f>20; f--) {
		//	System.out.print(f+",");
		}
		//���빮�� 1~10���� ���� ���
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
		//	System.out.print(aa+",");
		}
		
		/*���빮�� ���� 2�� �̿��Ͽ� ���� �����͸� ����Ͻÿ�.
		 * 55~4���� ���.		
		*/
		int cc;
		int dd=4;
		for(cc=55;cc>=dd;cc--) {
			System.out.print(cc+",");
		}
		
	}

}
