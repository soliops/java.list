
public class Example3 {

	public static void main(String[] args) {
		Inherit2 Ih2 = new Inherit2();
		Ih2.It("ȫ�浿", "123");
		Ih2.print();
	}

}

class Inherit1 { 
	private String nm; 
	//Inhrit1 �ش� �κп����� �۵��ȴ�. �ܺο��� �ν��� �Ұ���
	protected String pw;
	//protected ���� �θ��ڽ� Ŭ���� �ȿ����� ����.
	//Inherit1, Inherit2���� ��� �۵� �ǵ��� �ϸ�, �ܺο��� �ε� ����.
	public String aa; 
	//private���� ���� �κ��� Inherit2������ ����� �� �ֵ��� �ϱ� ����
	
	public void It(String d1, String d2) {
		this.nm=d1;
		this.pw=d2;
		this.aa=this.nm;
	}
}

class Inherit2 extends Inherit1 {
	public void print() {
		System.out.println(this.aa+" "+this.pw);
	}
	
}