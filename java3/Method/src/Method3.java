
public class Method3 {

	public static void main(String[] args) {
		/*���빮��
		 �μ��� 2���� ���ڸ� �����Ͽ� ���Ƿ� �մϴ�.
		 ���� �λ�ɤ� �޾Ƽ� ����� ����Ͻÿ�.
		 157, 45
		 258*45
		 ��������� ���;
		 */
		math ma = new math();
		int result = ma.m(157,45);
		System.out.println(result);
		ma.m2();
		ma.m();
		/*
		 * ���빮��
		 * ���� ���� �ϳ��� �ش� �޼ҵ�� �����ϰ� �˴ϴ�.
		 * �ش� �޼ҵ忡���� ������ ���� ó�� �˴ϴ�.
		 * ���� 3�� �����ϸ� 3*1~3*9������ ��� ������� ���Ͽ�
		 * sysout���� ��µǵ��� �Ͻʽÿ�.
		 */
		
		math2 mb1 = new math2();
		int result1 = mb1.ma1(3);
		System.out.println(result1);
		
		String ck =mb1.mb("hong");
		System.out.println(ck);
	}
	
}
class math{//���� �̸��� ��� ���������� �μ������� �����Ѵ�.
	public int m(int a, int b) {
		int c=a*b;
		return c;
	} 
	public void m() {
		System.out.println("�����Դϴ�.");
	}
	public void m2() {
		int z =m(100,200);
		System.out.println(z);
	}
}
class math2{
	public int ma1(int aa) {
		int bb=1;
		int total=0;
		do {
			total+=aa*bb;
			bb++;}while(bb<10);
		return total;
		//return ���� ���� �ݺ��� �ȿ� �����ϸ� �ȵ˴ϴ�.
		//���� ���ǹ��̶� ����� return��� �ȵ˴ϴ�.
		
	}
	public String mb(String mid) {
		String msg="";
		if(mid.equals("hong")) {
			msg= "ok";
		}
		else{
			msg= "cancel";
		}
		return msg;
		
		/*�ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ�
		 *  �������� ���� return ��Ŵ*/
	}
}