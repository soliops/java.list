
public class Method14 {

	public static void main(String[] args) {
		Mbc m = new Mbc();
		Mbc m2 = new Mbc("�̼���");
		
		

	}

}
class Mbc{
	public Mbc() {   //�Ϲ� construct 
		System.out.println("����1");
		test();
	}
	public Mbc(String user) {//construct �μ����� �ִ�
		System.out.println(user);
		test(user);
		
	}
	public Mbc(int user) {//construct���� �μ����� �ڷ������� ���� �Ǿ����ϴ�.
		System.out.println(user);
		//test(user);
	}
	public void test() { // 
		System.out.println("�޼ҵ�");
		total();
	}
	public void test(String user) { // �μ����� �ִ� method �Դϴ�.
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("�ý��� ����");
	}
}
