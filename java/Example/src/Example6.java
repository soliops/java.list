
public class Example6 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 6 1~10���� ���������� �ۿ��ϴ� �ݺ����� �ֽ��ϴ�. ��, 1~5������ ��簪�� ���ϰ�, 6~10������ ��簪�� ���մϴ�. �ش�
		 * �ΰ��� ���� ���Ͽ� ���� ���� ū��, ���Ѱ��� ū���� ����� ����Ͻÿ�.
		 */

		int a = 1;
		int total1 = 1;
		int total2 = 0;
		do {
			if (a <= 5) {
				total1 *= a;
			} else if (a > 5) {
				total2 += a;
			}
			a++;
		} while (a <= 10);
		if (total1 > total2) {
			System.out.println("���� �� : " + total1);
		} else if(total1 <total2) {
			System.out.println("���� �� : " + total2);
		}
		else {System.out.println("���� �����մϴ�.");}
		
	}

}
