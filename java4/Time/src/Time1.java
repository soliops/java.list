import java.sql.Time;

public class Time1 {

	public static void main(String[] args) {
		/*
		 try-catch�� : ����ó����� ����
		 */
		int w=1;
		do {
			
			try{ //���ܹ߻��� �ڵ�
				Thread.sleep(1000); //1000 - 1��
				//Thread.sleep : �Ͻ����� ���¸� ���մϴ�.
			}
			catch (InterruptedException e) {
				/*
				InterruptedException : �ش� ���ܹ߻��� �Ǿ��� ��� ó�� �ϱ� ���� ����
				*/
			}
			System.out.println(w);
			w++;
		}while(w<=10);
	}

}
