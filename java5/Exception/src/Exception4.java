import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) throws Exception {
		//FileReader�� IOException
		//�⺻ ���̽��� ��� ������ Exception 
		try {
		ex e = new ex();
		e.loader("data");
		//�ڱ� �ڽ��� �ٷ� ���ܻ�Ȳ���� ����
//			Exception aaa = new Exception();
//			throw aaa;
		//throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� class�� return
				
		}
		catch (Exception e) {
			if(e.getMessage()!=null)
			System.out.println(e);
		}
		
	}

}
class ex{
	Exception ep = null;
	public void loader(String a) throws Exception{
		/*�߸��� �������� (�ڽ��� ������ ���� main class�� ��� �����ϴ� ��Ȳ)*/
		//thorws try -catch�� �ޱ� ���� class�� �ε��ϴ� ��
//		if(a=="ok") {
//			//������������, loader class ��ü���� ������ �߻�
//			int keycode = Integer.valueOf(a);
//		}
//		else {
//			//�ش� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ���
//			this.ep = new Exception();
//			throw this.ep;//->try- catch �־�߸� �ȴ�.
//		}
		try {
			if(a=="ok") {
				int keycode = Integer.valueOf(a);
			}
			else {
				System.out.println("test");
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//�ڽ��� ���� ������ ���Ϲ޾� Ȯ����
			this.ep = new Exception(); 			
			throw this.ep;
		}
	}
	
	
}
	