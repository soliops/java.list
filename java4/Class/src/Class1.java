/*�θ� Ŭ���� �� �ڽ�(����)Ŭ���� ����*/
public class Class1 {

	public static void main(String[] args) {
		/*�θ� �ν��Ͻ��� ������ ���� ������ �ڽ� Class�� ���� ȣ�� ���� ����.*/
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); 
		//�θ� class.�ڽ�class �̸����� = �θ�class��.new �ڽ�class��(�ν��Ͻ��� ����)
		pc.c_box();
	}

}
class parents{ //�θ� class
	String a = "ȫ�浿"; //�θ� �ʵ忡 �ִ� �������� (this )
	String b;
	class child{ //�ڽ� class )
		int a = 20;
		public void c_box () { //�ڽ� method
			double c = 10.5;
			System.out.println(c);	//�ڽ� method ���� ��������
			System.out.println(this.a); //�ڽ� class ���� ��������
			System.out.println(parents.this.a); //�θ� class ���� ��������
			System.out.println(parents.this.b);
		}
	}
	public void p_box() { //�θ� method
		String a = "�̼���"; //p_box�� �ִ� �������� ����
		this.b = a;
		System.out.println(a);
	}
	
}