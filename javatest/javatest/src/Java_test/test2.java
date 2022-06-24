package Java_test;

import java.util.Scanner;

public class test2 implements test2_interface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int w = 0;
		int total= 0;
		do {
			System.out.printf("이체를 시작합니다. [%s님]에게 이체하실 금액을 입력해 주세요. ",user[w]);
			int mo = sc.nextInt();
			total+=mo;
			w++;
			}while(w<user.length);
		sc.close();
		System.out.printf("총 이체한 금액은 %s 이며, 총 잔고금액은 %s 입니다.",total,start-total);
		
		
		
		
		
	}

}
