package List1;

import java.util.Arrays;
import java.util.LinkedList;

public class list7 {

	public static void main(String[] args) {
		/*
		 응용문제
		 ArrayList 또는 LinkedList 둘 중에 원하는 메소드를
		 구현하시면 됩니다.
		 2차 배열 형태 입니다.
		 해당 데이터 값을 모두 더하여 짝수 인지 홀수 인지를 확인하시오.
		 Integer data[][] = {
		 			{10,20,30,40,50,60,70},
		 			{3,6,9,12,15,17,19}
		 };
		 결과는 총 합은 361 이고 홀수 입니다.
		 
		 */
		 Integer data[][] = {
		 			{10,20,30,40,50,60,70},
		 			{3,6,9,12,15,17,19}
		 };
		 LinkedList<Integer> list = new LinkedList<>(Arrays.asList(data[0]));
		 LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(data[1]));
		 int w = 0;
		 int ea = list.size();
		 int total=0;
		 String msg;
		 do {
				 total+=list.get(w)+list2.get(w);
				 if (total%2==0) {
					 msg="짝수";
				 }else {
					 msg="홀수";
				 }
			 w++;
		 }while(w<ea);
		 System.out.printf("결과는 총 합은 %s 이고 %s 입니다.",total,msg);
	}

}
