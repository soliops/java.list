
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit(���)
		/*
		 ���� �θ� Ŭ������ construct �κп� �μ����� �����ϸ�
		 �ڽ� Ŭ�������� �ε带 ���ϴ� ������ �߻���
		 ��, �ڽ� Ŭ�������� �μ����� �����Ͽ� construct�� ����� ���� ����.
		 */
		mth1 m1 = new mth1();
		mth2 m2 = new mth2(50);
		
		
		
		
	}
	
}
class mth1{
	public int no;
	public mth1() {
		this.no=20;
		System.out.println("mth1");
	}
}
class mth2 extends mth1{
	public mth2(int z) {
		System.out.println("mth2");
		System.out.println(z);
	}
}