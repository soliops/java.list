import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10���� ���ڸ� �ϳ� �����ϼ���: ");
		int no = sc.nextInt();
		
		memorys m = new memorys(); //-> �޸𸮺��� ����� �켱
		/* memorys m =null;
	 	m = new memorys();
		*/
		m.ms(no);
	    m = null; // �ش� �ν��Ͻ��� ���, �ʱ�ȭ�ؼ� �޸� ���°�
	
	    sc.close();
		
		m = new memorys();
		m.rd();
		
		
		
		
	}

}
class memorys{
	public void ms(int user) {
		//Math.random() �����޼ҵ� ���� �⺻�� �ڷ��� double�Դϴ�.
		/*
		 * random => �����ڵ�, �����ڵ�, ��÷, �귿
		 */
		//double a = Math.random(); //0.0~1.0���� ����
		//*10�� �ϸ� 0~10���� ���� double -> int ����
		int w = 0;
		while(w<=10) {
			int b = (int)(Math.random()*10);//*10�̸� 0~9 *10+1�̸� 1~10
				System.out.printf("%d ",b);
			
			w++;
		}
		
		
		/*
		if (user==b) {
			System.out.println("��÷");
		}
		else {
			System.out.println("������ȸ��");
		}
		//System.out.println(b);
		*/
	}
	public void rd() { // random util ����
		Random r = new Random(); 
		int w=0;
		while(w<=5) {
			System.out.println(r.nextInt(45)+1); //(10)�̸�0~9���� r.nextInt�� ���
			//1~10������ (10)+1�� �ϸ� ��
			
			w++;
		}
		r=null;
	}
}