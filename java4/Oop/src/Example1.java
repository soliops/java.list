
public class Example1 {

	public static void main(String[] args) { //�ܺ� Ŭ���� ȣ�⸸ �մϴ�.
		/*
		abstract ���빮��
		
		1�� �迭���� �ֽ��ϴ�. �ش� �迭���� ��� ���� ���� ����մϴ�.
		��, abstract �⺻ void �̸��� sender ������ �ֽ��ϴ�.
		���� �� ����� sender���� ��� �ǵ��� �մϴ�.
		�迭�� abstract���� ����մϴ�.
		�迭 ������ : 6,13,22,9,12,64,32,47,39 
		 */
		send_a sum = new send_b();    //�θ�Ŭ����=�ڽ�Ŭ����
		sum.sender();
	}

}
abstract class send_a{
	public int array[]= {6,13,22,9,12,64,32,47,39}; //�߻�Ŭ���� �迭 array
	public int total;
	public abstract void sender(); //�߻� �޼ҵ� sender
	
}
class send_b extends send_a{
private int ar[];
private int ea;
private int total1=0;
	@Override
	public void sender() {
		this.ar=array;				//�迭 ��������
		this.ea=this.ar.length;		//�迭 ����
		
		this.total1=total;			
		int w=0;
		do {
			this.total1+=this.ar[w];//�հ�
			w++;
		}while(w<this.ea);
		System.out.println("���� �� : "+this.total1); //���

	}

}