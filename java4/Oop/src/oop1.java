import java.util.Scanner;

public class oop1 {
/*OOP: ��ü���� ���α׷��� 
[ĸ��ȭ+����ȭ]
public, private, protected, [getter, setter](���������� ����)
[�߻�ȭ] - abstraction
�ڵ带 ����ȭ
�������� �޼ҵ带 ����
Ȯ�强(interface)
�߻� Ŭ���� + interface

[���⼺]-overriding, overloading
overriding - �θ��� �޼ҵ�, ���� ���
overloading - �ڽ� Ŭ�������� �޼ҵ带 ����� ������ Ŀ����

[��Ӽ�,����] - extend(�θ�+�ڽ�), implement(�θ� �ټ� + �ڽ�)
����-����Լ�, interface�� �ٸ� class������ ����

[Thread]

[Multi Thread]

Package ����

Timeloop try, catch

Arrays

����ȭ, �񵿱�ȭ
 */
	public static void main(String[] args) {
		// ��͸޼ҵ� ����
		op_method om = new op_method();
		System.out.println(om);
		
	}

}
/*
	��͸޼ҵ� : �޼ҵ带 ���� �Ǵ� �������� ȣ�� �ϴ� ���μ����� ���մϴ�.
	�ݺ���, �ܺ� class�� ����� �� ������ ������ ���� �ذ� �ϱ� ���ؼ�
	�����ϴ� �޼ҵ� ���¸� ���մϴ�.
 */
class op_method{
	Scanner sc = new Scanner(System.in);
	public op_method(){   //���� ���� �޼ҵ�
		this.m1();
	}
	private String nm;
		public void m1 () { //�޼ҵ� m1 ����
		System.out.println("ã�� �̸��� �Է��ϼ���?");
		this.nm = sc.next();
		this.m2();
	}
	public void m2 () { //m1�� ���� ������� m2�� Ȯ��
		if(this.nm.equals("ȫ�浿")) {
			sc.close();
			System.exit(0);
		}else {
			System.out.println("�ش� �̸��� �����ϴ�.");
			this.m1(); //m1�� �ٽ� �� ȣ�� ��͸޼ҵ� (��͸޼ҵ�)
		}
	}
}