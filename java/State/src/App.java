
public class App {

	public static void main(String[] args) {
	
		/*
		 * 2���� 0,1 ¦�� Ȧ���� �ַ� ���
		 * 8���� 0~7
		 * 16���� 0~9 abcdef  ��ȣȭ�� �� ���  hex   #
		 * 
		 * 
		 * int
		 * String
		 * 
		 * if(����){
		 * �ش� ������ ���� ��� ���� �Ǵ� �ڵ�
		 * }
		 * else if (if �ܿ� �ٸ� ����){
		 * �ش� ������ ���� ��� ���� �Ǵ� �ڵ�
		 * }
		 * else{ if�� �ݴ� �Ǵ� ������ �ϳ��� ���� ���� ���
		 * }
		 * 
		 * 
		 * *boolean a = true, false; �� �Ǵ� ���� üũ�ڽ��� ����, ���ϰ�
		 * 
		 * Scanner a = new Scanner(System.in);
		 * ��ĳ�� �̸��� ���� �̸��̶� ������ �ȵ�.
		 * System.out.println("������ �Է��� �ּ���.");
		 * int aa = a.nextInt(); <-��ĳ�� �̸� ���� ���� next ���
		 * 
		 * 
		 * */
		
        int a = 25+31*4+12;
        System.out.println(a);
        
		int b = 15*3+9+14;
		System.out.println(b);
		
		if (a<b) {
			System.out.println("����1�� ���� �� �۽��ϴ�.");
			
		}
		else if (a>b) {
			System.out.println("����2�� ���� �� �۽��ϴ�.");	
		}
		
		else {
			System.out.println("�� ���� �����ϴ�.");
			
		}
		
		
		/* �ش簪�� 2������ ¦��, Ȧ���� Ȯ���ϱ�*/
		int c = b % 2; // %��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ����� �˴ϴ�.
		System.out.println(c);
		
		if (c==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		
		
		
	
	}

}
