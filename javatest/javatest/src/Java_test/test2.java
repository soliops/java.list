package Java_test;

import java.util.Scanner;

public class test2 implements test2_interface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int w = 0;
		int total= 0;
		do {
			System.out.printf("��ü�� �����մϴ�. [%s��]���� ��ü�Ͻ� �ݾ��� �Է��� �ּ���. ",user[w]);
			int mo = sc.nextInt();
			total+=mo;
			w++;
			}while(w<user.length);
		sc.close();
		System.out.printf("�� ��ü�� �ݾ��� %s �̸�, �� �ܰ�ݾ��� %s �Դϴ�.",total,start-total);
		
		
		
		
		
	}

}
