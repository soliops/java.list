
public class Time3 {

	public static void main(String[] args) {
//		try {
//			System.out.println("��������");
//			Thread.sleep(5000);
//			System.out.println("��������");
//		}catch(InterruptedException a){
//			System.out.println(a);
//		}
		/*
		 * ���빮�� �ܺ� class�� �ֽ��ϴ�. ��, ���� Ŭ�������� �ش� 
		 * �ܺ� class�� �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�� ���� �ε���
		 * �߻��մϴ�. 8�ʵ��� "ó�����Դϴ�. ��ø� ��ٷ� �ּ���." 
		 * 8�� ���Ŀ� return���� "�Ա��� ��� ó�� �Ǿ����ϴ�."��� ���ڸ�
		 * �޵��� �Ͻʽÿ�.
		 */
//		bank b = new bank();
//		System.out.println(b.msg());
		bank2 b2 = new bank2();
		b2.money();
	}

}

class bank {
	String msg;

	public void bank_msg() {
		try {
			System.out.println("�Ա��� �õ� ���Դϴ�.");
			Thread.sleep(4000);
			System.out.println("ó�����Դϴ�. ��ø� ��ٷ��ּ���.");
			Thread.sleep(4000);
			msg = "�Ա��� ��� ó�� �Ǿ����ϴ�.";

		} catch (InterruptedException a) {
			System.out.println(a);

		}
	}

	public String msg() {
		this.bank_msg();
		return msg;
	}
}
class bank2{
	public void money() {
		try {
//			System.out.println("ó�����Դϴ�. ��ø� ��ٷ� �ּ���.");
			System.out.println("test");
			int c = 5/0;
			Thread.sleep(1000);
			System.out.println("test1");
//			String kkk=this.msg();
//			System.out.println(kkk);
		} catch (Exception c) {
			System.out.println("test2");
		}
	}
	public String msg() {
		return "�Ա��� ��� ó�� �Ǿ����ϴ�.";
	}
}
