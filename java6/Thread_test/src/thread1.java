//thread�� ���� class���� ������ extends(class), implements (interface)
public class thread1 {

	public static void main(String[] args) {
		//���������� ó����
		class_box cb = new class_box();
		for(int a = 0; a<10; a++) {
//		cb.run("Ŭ���� ó����Ȳ"+a);
		}
		
		cpu_box cp = null;
		//Thread�� �̿��Ͽ� ���� ó���� ��� ������ �������� �մϴ�.
		for(int b=0; b<10; b++) {
		cp = new cpu_box("������ ó����Ȳ"+b);
//		cp.start();
		}
		
		/* 
		Thread�� �̿��Ͽ� ���� ����ó�� ����̸�, ������ �߻� �ϴ���
		�ش� ������ �߻��� Thread�� ����ó�� �� �� ������ ��� ó���ϴ� ����
		*/
		call_box bb = null;
		int w=0;
		String msg = "";
		String msg2 = "";
		while(w<10) {
			if(w==5) {
				msg2 = "5";
			}
			else {
				 msg2 = "";
			}
			bb = new call_box(msg+msg2); 
			//nullnull = 8�� �о���� ���� ���ַ��� ""
			
			bb.start();
			w++;
		}
	}

}
class call_box extends Thread{
	String callname=null;
	public call_box(String z) {
		this.callname = z;
	}
	@Override
	public void run() {
		try {
			if(this.callname.length()>0) {
				Exception ec = new Exception();
				throw ec;
//				throw new Exception();
			}
			else {
			System.out.println(this.callname.length());
			}
		}
		catch (Exception e) {
			System.out.println("�ش� �� �� �߸��� ���� �߻� �Ͽ����ϴ�.");
		}
		finally {
		
		}
	}
}
class cpu_box extends Thread{
	String name = null;
	public cpu_box(String a) {
		this.name = a;
	}
	@Override
	public void run() {
		System.out.println(this.name);
	}
}
class class_box{
	
	public void run(String name) {
		System.out.println(name);
	}
}