package Ex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 ����ڰ� ���� ���ڸ� �Է� �޽��ϴ�. Scanner
		 ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ���� �Ǿ�� �մϴ�.
		 �� ���� �Է��� 7���̸�, ����ڰ� �Է��� �����ڸ� ���������ɷ� �����մϴ�.
		 "���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�." -7��
		 ���
		 6,22,37,44,45,80,100
		 
		 �߰��ɼ� : ¦���� Ȧ�� ���� ������ �迭�� ���� �ϵ��� �մϴ�.
		 6,22,44,80,100
		 37,45
		 */
		numbers nb = new numbers();
		nb.userinput();
		System.out.println(nb.outprint());
	}

}
class numbers{
	String msg;
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		String nlist;
		LinkedList<Integer> list2 = new LinkedList<>();

		//���� �� 7�� �޾ƾ� �Ѵٸ� ������ ������ �Ѵ�.
		// �׷��� 7�� ä��� break �ɰ�
		int w =1 ;
		do {
			System.out.println("���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.");
			try {
				nlist = sc.next();
				int number = Integer.parseInt(nlist);
				if(number%2==0) {
					list.add(number);
				}
				else {
					list2.add(number);
				}
				w++;
				}
				catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
				}
			}while(w<=7);
			Collections.sort(list);
			Collections.sort(list2);
//		System.out.println(list);
			sc.close();
			
			
			this.msg = ""+list+"\n"+list2;
			
			
	}
	public String outprint() {
		return this.msg;
	}
}