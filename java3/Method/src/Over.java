
public class Over {

	public static void main(String[] args) {
		
//		pt p = new pt();
//		p.display();
		//p.display("���� ���� �� ���");
		cd c = new cd();
		c.display("���� ���� �� ���"); //�����ε�
		c.display(); //�������̵�
		
	}

}
/*
 �����ε�(overloading) : ���ο� �޼ҵ带 �����ϴ� ���� ���մϴ�.
 -->�ڷ����� �ٸ��� �����ϴ�. �� ���� �ڷ��� 2������ 1���� �ȴ�.
 �� �μ����� ���� ���Ŀ� ���� �ٸ���. �θ� �ڽĵ� ����
 �������̵�(override) : �θ� Ŭ�������� ��� ���� ���� �޼ҵ带 ����ϴ� ���� ���մϴ�.
 */
class pt{
	public void display() {
		System.out.println("�θ� �ܺ� ���� ��");
		
	}
	
}
class cd extends pt{
	/* aaaa() �޼ҵ�� �������̼��� ������� ���� �θ� class���� �������� �ʾ��� 
	@Override
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	*/
	
	@Override //�������̼� (ǥ��) ���� �߻��� Ȯ�� (�������̵�)
	public void display() { //�������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����??");
		super.display();  //�θ� �ִ� ���� �Ӽ� �޼ҵ� ���� �����ö� ����մϴ�.
	}
	public void display(String msg) { //�����ε�
		System.out.println(msg);
	}
}