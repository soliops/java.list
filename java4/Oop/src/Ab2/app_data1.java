package Ab2;

public interface app_data1 {
	String a=null; 
	int b = 0;
	//�ʵ忡 �ڷ����� ����ִ� ���� ����� ��� ���� ��ü�� �ȵ�.(������ �� ����)
	public void user_join(); //���� ������ �޼ҵ�� this ����� �Ұ�����
	default void aaa() {	//default���� this����� ������.(���� ���� ���)
		System.out.println(this.a);
	}
}
