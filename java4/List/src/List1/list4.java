package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		
		Integer num_1[] = {3,6,9,12,15};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(num_1));
		System.out.println(ln);
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>(); //��迭 ����
		String user;
		//for(;;)//���ѷ���
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���");
			user = sc.next();
			try { //����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
			int number = Integer.parseInt(user);
			list.add(number);
			int ea = list.size();
			if(ea>=55) {break;} //5������ �迭�� �ԷµǸ� ���ѷ����� ��������
			}catch(Exception e){//������ �߻��Ͽ��� ��� �۵��Ǵ� ��Ʈ
				System.out.println("�ش� �Է»����� ���� �Դϴ�.  \n���ڸ� ���� �Է��ϼ���");
			}
			
		}
		System.out.println(list);
		sc.close();
	}

}
