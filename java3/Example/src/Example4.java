
public class Example4 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 �ΰ��� ���� �ܺ� Ŭ������ �����ϴ�.
		 �ش� Ŭ�������� �ΰ��� ���� ����ϰ� �˴ϴ�.
		 ������� ������ �����ϴ�.
		 3,10�� ������ �Ǹ� �ΰ��� ���� ���� ���մϴ�.
		 ������ �ܺ� Ŭ�������� ������� ����ϴµ�,
		 �ΰ��� �� ���� ¦��, Ȧ�� ������ ����ϴ� extends�� �����ϼ���.
		 */
		int v1=10;
		int v2=3;
		result rt = new result();
		rt.plus(v1,v2);
		rt.print();
	}

}

class total{
private int num;
private int num2;
protected int total;
public String msg[]= {"¦��","Ȧ��"};
 	public void plus (int a, int b) {
 		this.num = a;
 		this.num2 = b;
 		this.total = this.num+this.num2;
 		
 	}
}
class result extends total {
	public void print() {
		if(this.total%2==0) {
			System.out.println(msg[0]);
		}
		else {
			System.out.println(msg[1]);
		}
	} 
}
