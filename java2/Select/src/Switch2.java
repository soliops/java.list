import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ����ڰ� ������ ���� ������ �޽��ϴ�.
		 * 
		 * Q. "1~5������ ���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�."
		 * ��� ���� 
		 * 1 : 5%��������
		 * 2 : 10%��������
		 * 3~4 : �ù�񹫷�
		 * 5 : ������ȸ��
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5������ ���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�.");
		int a = sc.nextInt();
		String msg;
	/*
		switch (a) {
		case 1:
			msg="5%��������";
			//System.out.println("5%��������");
			break;
		case 2:
			msg="10%��������";
			//System.out.println("10%��������");
			break;
		case 3:
		case 4:
			msg="�ù�񹫷�";
			//System.out.println("�ù�񹫷�");
			break;
		case 5:
			msg= "���� ��ȸ��";
			//System.out.println("���� ��ȸ��");
			break;
		default:
			System.out.println("���ڴ� 1~5������ �Դϴ�.");
			break;
		}
		*/
		
		///�ڹ� ������ 14�� �̻󿡼� ����� ��
		switch(a) {
		case 1 -> {
			msg="5%��������";
		}case 2 -> {
			msg="10%��������";
		}case 3,4 -> {
			msg="�ù�񹫷�";
		}default -> {
			msg="������ȸ��";
		}
		}
		System.out.println(msg);
		
		sc.close();
		
		
	}

}
