package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ����ڰ� ���� �ݾ��� �Է��մϴ�.
		 �ش� ���� �ݾ� Ƚ���� �� 8�� �Դϴ�.
		 0~n ���� �Է°����ϸ�
		 �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ��� ��Ű�ÿ�.
		 ����)
		 �Ա��� �ݾ��� ��������?
		 500 600 500 400 200 100 50 50 
		 
		 ���
		 �� �Ա� �ݾ��� : 2400 �� �Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> sum = new LinkedList<>();
		//int total=0;
		do {
			System.out.println("�Ա��� �ݾ��� ��������?");
			String user=sc.next();
			try {
				int money = Integer.parseInt(user);
				sum.add(money);
				int ea = sum.size();
				//total += money;
				int total=0;
				if(ea>=8) {
					int ww=0;
					do{
						total+=sum.get(ww);
						ww++;
					}while(ww<ea);
					System.out.printf("�� �Ա� �ݾ��� : %s �� �Դϴ�.",total);
					break;
				}
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼ̽��ϴ�. \n���ڸ� �Է����ּ���");
			}
		}while(true);
		//System.out.printf("�� �Ա� �ݾ��� : %s �� �Դϴ�.",total);

		sc.close();
	}

}
