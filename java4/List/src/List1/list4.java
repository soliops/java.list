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
		LinkedList<Integer> list = new LinkedList<>(); //빈배열 생성
		String user;
		//for(;;)//무한루프
		while(true) {
			System.out.println("숫자를 입력하세요");
			user = sc.next();
			try { //사용자가 입력한 값이 오류가 있는지 확인하는 파트
			int number = Integer.parseInt(user);
			list.add(number);
			int ea = list.size();
			if(ea>=55) {break;} //5개까지 배열이 입력되면 무한루프를 빠져나옴
			}catch(Exception e){//오류가 발생하였을 경우 작동되는 파트
				System.out.println("해당 입력사항은 문자 입니다.  \n숫자만 제발 입력하세요");
			}
			
		}
		System.out.println(list);
		sc.close();
	}

}
