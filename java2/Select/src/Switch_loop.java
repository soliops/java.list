
public class Switch_loop {

	public static void main(String[] args) {
	
		String sign = "-"; 
		int total;
		/*
		 * case�ȿ� ������ �ݺ����� ����� �� �ֽ��ϴ�.
		 * ���� ������ �������� ����ص� �����ϸ�, case ������
		 * �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ������ �����ϴ�.
		 * ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� �ʽ��ϴ�.
		 */
		
		
		switch(sign) {
		case "+"->{
			int f;
			total=0;
			for(f=1;f<=5;f++) {
				total+=f;
				
			}
			System.out.println("�� 1~5���� ���� ���� "+total);
			//�ݺ��� �ؿ� �ؾ� ����� �ȴ�. �� �׷� ���� �̻�������.
		}
		case "-"->{
			total=0;
			System.out.println("���� ���� ��� ���� �ʽ��ϴ�.");
		}
		case "*"->{
			int f=1;
			total=1;
			do { 
				total*=f;
				f++;} while(f<=5);
			System.out.println("�� 1~5���� ���� ���� "+total);
		}
		case "/"->{
			total=0;
		}
		}
		
		
		
		
		
		
	}

}
