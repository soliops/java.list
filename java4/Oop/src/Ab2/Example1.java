package Ab2;

public class Example1 {

	public static void main(String[] args) {
		home h[] = {new computer(),new monitor(),new phone()};
//		phone ph = new phone();
		home2 h2[] = {new phone()}; //extends�� home�� �ε��Ͽ���.
		h[0].broken(40);
		h[1].broken(00);
		h2[0].broken(0);
		
	}

}
class computer implements home,home2{
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ�");
	}
	@Override
	public void powercheck1() {
		System.out.println("��ǻ�� �ּ� ����");
	}
	@Override
	public void powercheck2() {
		System.out.println("��ǻ�� ���� �۵�");
		
	}

	@Override
	public void broken(int n) {
		if(this.bk<=n) {
			System.out.println("��ǻ�� ����!!");

		}else if(this.bk>n &&n>0) {
			this.poweron();
		}else{
			this.poweroff();
		}
	}
}

class monitor implements home,home2{
	@Override
	public void poweron() {
		System.out.println("����� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ�");
		
	}
	@Override
	public void powercheck1() {
		System.out.println("����� �ּ� ����");
	}
	@Override
	public void powercheck2() {
		System.out.println("����� ���� �۵�");
		
	}
	
	@Override
	public void broken(int n) {
		if(this.bk<=n) {
			System.out.println("����� ����!!");

		}else if(this.bk>n &&n>0) {
			this.poweron();
		}else{
			this.poweroff();
		}
	}
	
}
/*
 �޴����� �߰� ����� �ʿ��մϴ�.
 �޴��� ����� �ּ�����(20) -> ���� �۵��� 40�̻� 79����, 80�̻� �Ǹ� ����
 1. ������ ���޵����� ȭ���� ���峯 ��� (���� ���ε� �۵��� �ȵǴ� ��) - 20 ~ 39����
 2. ������ ���޽�Ű���� ������ �ȵ� ��� (������ �ƿ� �ȵǴ� ���) - 20�̸� ������ ���
 */
class phone implements home,home2{ 
	@Override
	public void poweron() {
		System.out.println("�޴��� ���� ������");
		
	}
	
	@Override
	public void poweroff() {
		System.out.println("�޴��� ���� �ߴ�");
		
	}
	@Override
	public void powercheck1() { //20~39����
		System.out.println("������ ���������� ȭ���� ���峯 ���");
	}
	@Override
	public void powercheck2() {	//20�̸�
		System.out.println("������ ���޽�Ű���� ���͸� ������ �ȵ� ���");
		
	}

	
	@Override
	public void broken(int n) {
		if(n>=this.bk) {
			System.out.println("�޴��� ����!!");
			
		}else if(this.bk>n &&n>0) {
			if(n<20) {
				this.powercheck2();
			}else if(n>=20 && n<39) {
				this.powercheck1();
			}else {
			this.poweron();
			}
			
		}else{
			this.poweroff();
		}
	}

}