package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*
		 응용문제
		 사용자가 숫자 금액을 입력합니다.
		 해당 숫자 금액 횟수는 총 8번 입니다.
		 0~n 까지 입력가능하며
		 해당 입력이 모두 끝나면 최종 합계 금액을 출력 시키시오.
		 예시)
		 입금할 금액을 적으세요?
		 500 600 500 400 200 100 50 50 
		 
		 결과
		 총 입금 금액은 : 2400 원 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> sum = new LinkedList<>();
		//int total=0;
		do {
			System.out.println("입금할 금액을 적으세요?");
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
					System.out.printf("총 입금 금액은 : %s 원 입니다.",total);
					break;
				}
			} catch (Exception e) {
				System.out.println("문자를 입력하셨습니다. \n숫자를 입력해주세요");
			}
		}while(true);
		//System.out.printf("총 입금 금액은 : %s 원 입니다.",total);

		sc.close();
	}

}
