import java.util.Scanner;

public class study8 {

	public static void main(String[] args) {
		/*
		 * ���빮�� abstract�� �迭 
		 * ��¼��� "�ش� ��ǰ�� ������ �ּ���?[1.���, 2.����, 3.Ű��]"
		 * 2
		 * "�ش� ��ǰ ������ �Է����ּ���?" 
		 * 5
		 * "�����Ͻ� �� ������ 7500�� �Դϴ�." 
		 * //"��ٱ��ϸ� �����Ͻðڽ��ϱ�?" 
		 * //Y/N 
		 * //Y
		 */
		research rs = new research();
		rs.scan();

	}

}

abstract class abclass {
	public abstract void scan();
}

class research extends abclass {
	int number=0;
	@Override
	public void scan() {
		try {
			String[] info = { "���=2000", "����=1500", "Ű��=2500" };
			Scanner sc = new Scanner(System.in);
			System.out.println("�ش� ��ǰ�� ������ �ּ���?[1.���, 2.����, 3.Ű��]");
			this.number = sc.nextInt();
			String[] ar = info[this.number-1].split("=");
			System.out.println("�ش� ��ǰ ������ �Է����ּ���?");
			this.number = sc.nextInt();
			int price= this.number * Integer.parseInt(ar[1]);
			System.out.printf("�����Ͻ� �� ������ %s�� �Դϴ�.", price);
			sc.close();
		} catch (Exception e) {
			System.out.println("���ڷ� �Է����ּ���.");
			this.scan();
		}
	}
}