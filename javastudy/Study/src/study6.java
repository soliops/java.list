
public class study6 {

	public static void main(String[] args) {
		son1 s1 = new son1();
		s1.print1();
		son2 s2 = new son2();
		s2.print2();
	}

}
abstract class fa{
	public String[] name = {"ȫ�浿","�̼���"};
}
class son1 extends fa{
	
	public void print1() {
		System.out.println(name[0]+"�� ȯ���մϴ�.");
	}
}
class son2 extends fa{
	
	public void print2() {
		System.out.println(name[1]+"�� �ֹ��Ͻ� ������ �����ϴ�.");
	}
	
}