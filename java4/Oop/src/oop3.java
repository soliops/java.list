
public class oop3 {
//Multi Thread(��Ƽ ������): start,run,sleep,setStop
//��Ƽ������ : CPU�� �ھ�� ���谡 �ֽ��ϴ�.
	public static void main(String[] args) {
		//������(Thread) : ���μ��� ���ο��� ���������� ����Ǵ� �۾��� ����.
		//Multi Thread(��Ƽ ������) : ���μ��� ���ο��� �ΰ��� �̻��� �۾��� ���� ���
		//������ -> ����
		//��Ƽ ������ -> ����, ��Ʃ��, ����  (��Ƽ �½�ŷ)
		/*
		 �޼ҵ� �����մϴ�. A,B ���ý��� �ϸ� ���������� ���ÿ� �ȳ��´�.
		 why? A,B�� �����ϰ� ������ ������ �����̴�.
		 */
		
		
		Thread my = new mythread();  //�θ� �޼ҵ� = �ڽ� �޼ҵ�
		//����������� : �ڽĸ޼ҵ� = �ڽ� �޼ҵ�
		my.start();
		Thread my2 = new test2();
		//Thread �޼ҵ忡 �⺻ run�� �۵��ϱ� ���� start ��ɾ��Դϴ�.
		
		my2.start();
		
		Thread my3 = new test3();
		my3.start();
		int ct=1;
		while(ct<=10) {
			System.out.println("����Ŭ����: "+ct);
			ct++;
		}
	}

}
class test2 extends Thread{
	@Override
	public void run() {
		int ct=1;
		while(ct<=10) {
			System.out.println("�ܺ�Ŭ����2: "+ct);
			ct++;
		}
	}
}
	class test3 extends Thread{
		@Override
		public void run() {
			int ct=1;
			while(ct<=10) {
				System.out.println("�ܺ�Ŭ����3: "+ct);
				ct++;
		}
	}
}
class mythread extends Thread{ 
	//Thread : JVM �⺻���� ž�� �Ǿ� �ִ� �޼ҵ�(Thread�� �ܵ����� ������� ����)
	@Override
	public void run() {//run�̶� : ��Ƽ�޼ҵ� �⺻ ���� �޼ҵ�
		int w=1;
		while(w<=10) {
			System.out.println("�ܺ�Ŭ����: "+w);
			w++;
		}
	}
}
