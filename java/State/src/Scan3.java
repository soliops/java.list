import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Q : ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?");
		//�ѹ��� �غ���.
		int mid = a.nextInt();
		//next�� ������ String�϶�
		//%�� ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		if (mid%2==0){
			System.out.println("¦�� ���Դϴ�.");		
		}
		else {
			System.out.println("Ȧ�� ���Դϴ�.");
		}

		a.close();
		
		
		Scanner b = new Scanner(System.in);
		System.out.println("����ڰ� ���ϴ� ���ڸ� ������?");
		int mid2 = b.nextInt()%2;
		if (mid2==0) {
			System.out.println("¦�� ���Դϴ�.");
		}
		else if (mid2==1) {
			System.out.println("Ȧ�� ���Դϴ�.");
		}
		b.close();
		
	}

}