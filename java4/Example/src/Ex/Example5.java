package Ex;

public class Example5 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 abstract�� �̿��Ͽ� ������ 8�� ����� ��� ���� ������� 
		 return�� �޾� ���ο��� ��µǵ����մϴ�.
		 */
		gugudan gg = new gugudan();
		gg.setter(8);
		System.out.println("�ش� �������� �� ���� : "+gg.getter()+" �Դϴ�.");
	}

}
abstract class gugu{
	public abstract void setter(int num);
	public abstract int getter();
}
class gugudan extends gugu{
	int un;
	int total = 0;
	@Override
	public void setter(int num) {
		this.un = num;
		int w=1;
		do {
		this.total+=this.un*w;
			w++;
		}while(w<10);
	}
	@Override
	public int getter() {
		return this.total;
	}
}