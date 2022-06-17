package Ex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 사용자가 직접 숫자를 입력 받습니다. Scanner
		 단, 사용자가 문자를 입력할 경우 예외처리가 진행 되어야 합니다.
		 총 숫자 입력은 7번이며, 사용자가 입력한 ㅅ숫자를 오름차수능로 정렬합니다.
		 "숫자를 하나 입력해 주시길 바랍니다." -7번
		 결과
		 6,22,37,44,45,80,100
		 
		 추가옵션 : 짝수와 홀수 값을 별도로 배열로 관리 하도록 합니다.
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

		//만일 꼭 7개 받아야 한다면 루프를 돌려야 한다.
		// 그래서 7개 채우면 break 걸것
		int w =1 ;
		do {
			System.out.println("숫자를 하나 입력해 주시길 바랍니다.");
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
				System.out.println("숫자를 입력하셔야 합니다.");
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