import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		//datalist da="";
		//String pay="�ſ�ī��";
		String pay="������";
		if (pay.equals("�ſ�ī��")) {
			da.pay1(); //�ش� ���ǿ� �´� �޼ҵ带 ȣ��
		}
		else {
			da.pay2(pay); //�޼ҵ忡 ��ü���� �¿��� ����(��ü���� ���Ѵ�)
		}
		
		/*
		 * ���빮��
		 * 
		 * �ش� �ε��� class���� agrees��� �̸��� ������ �ֽ��ϴ�.
		 * main �޼ҵ忡�� ����ڰ� "������", "���Ǿ���"�� �Է��ϰ� �˴ϴ�.
		 * ���������� �ԷµǾ��� ��� "ȸ�������� ���� �˴ϴ�." ���
		 * �޼����� ����ϰ�, ���Ǿ����� �Է½� "���Ǹ� �ϼž� ���� �˴ϴ�."���
		 * ��� �ǵ��� �Ͻÿ�.
		 * ��, agrees Ŭ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� 2�� ��
		 *  �����Ͽ� �ڵ带 �����Ͻÿ�.
		 */
		
		
		Scanner ag = new Scanner(System.in);
		System.out.println("������ �����Ͻðڽ��ϱ�? �������� �����ðڽ��ϱ�?");
		agrees b =new agrees();
		String agree = ag.next();
		b.agree3(agree);
		/*if (agree.equals("������")) {
			b.agree1();
		}
		else {
			b.agree2();
		}
		*/
		ag.close();
	}
	
}

class datalist{
	/*static �޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带
	 * ���� ����ؾ��ϴ� �κп����� static�� �̿��Ͽ� ����մϴ�.
	 * 
	 * static(���� �޼ҵ�) : �������̵��� ����� �� ����.
	 * void�� ���(���� �޼ҵ�) : �������̵��� ����� �� ����.
	 * �������̵� ����
	 * class a{
	 * void �޼ҵ�
	 * }
	 * class b extend a {
	 * void �޼ҵ�
	 * }
	*/
	public void array_data(int a) { //static ���� �޼ҵ�
		int w=1;
		while(w<=9) {
			System.out.println(a*w);
			w++;
		}
		
	}
	
	public void pay1() {
		System.out.println("�ſ�ī��� ���� ���� �մϴ�.");
	}
	public void pay2(String pm) {
		System.out.println("���������� ���� �����մϴ�.");
	}

}
class agrees{
	public void agree1() {
		System.out.println("ȸ�������� ���� �˴ϴ�.");
	}
	public void agree2() {
		System.out.println("���Ǹ� �ϼž� ���� �˴ϴ�.");
	}
	public void agree3(String agr3) {
		String msg;
		if(agr3.equals("������")) {
			msg="ȸ�������� ���� �˴ϴ�.";
		}
		else {
			msg="���Ǹ� �ϼž� ���� �˴ϴ�.";
		}
		System.out.println(msg);
	}
}