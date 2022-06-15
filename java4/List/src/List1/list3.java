package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class list3 {

	public static void main(String[] args) {
		/* 입력할게 많다 싶으면  ArrayList
		 * 로드가 많다 싶으면 LinkedList
		 응용문제
		 넘버데이터  : 3,6,9,12,15
		 넘버데이터2 : 2,4
		 
		 결과 3,6,9,12,15,2,4
		*/
		/*Arrays.sort : 배열변수 형태에만 적용합니다.*/
			Integer num_1[] = {3,6,9,12,15};
			Integer num_2[] = {2,4};
			ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(num_1));
			ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(num_2));
			int w= 0;
			int ea= num2.size();
			do { 
					num1.add(num2.get(w));
				w++;
			}while(w<ea);
			System.out.println(num1);
			
			Collections.sort(num1); //ArrayList, LinkedList sort 오름차순 정렬
			System.out.println(num1);
			
			int ea2 = num1.size();
			System.out.println(ea2);
			
	}	

}
