
public class Class2 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ���� Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�.
		 Ŭ������ 2���� �ֽ��ϴ�.
		 �θ� Ŭ���� ���� : mother 
		 �ڽ� Ŭ���� ���� : child
		 ���� Ŭ�������� mother Ŭ������ ���� ���� 
		 ���� 30 50 ���ڰ��� �����մϴ�.
		 child���� �θ� Ŭ������ �ִ� ���� �޾�
		 �� ���� ���ڸ� ���� ������� ����Ͻÿ�.
		 */
		mother m = new mother();
		int num1 = 30;
		int num2 = 50;
		m.m_method(num1,num2);
		mother.child mc = m.new child(); 
		mc.c_method();
		
	}
}
class mother {
	int m_num1;
	int m_num2;
	public void m_method(int num1,int num2) {
		this.m_num1 =num1;
		this.m_num2 =num2;
			}
	class child{ //��� ���
		int c_num1 =mother.this.m_num1;
		int c_num2 =mother.this.m_num2;
		public void c_method(){
			//int c_sum = mother.this.m_num1*mother.this.m_num2;
			int c_sum = c_num1 *c_num2;
			System.out.println(c_sum);
		}
	}
}