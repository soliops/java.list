package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class list3 {

	public static void main(String[] args) {
		/* �Է��Ұ� ���� ������  ArrayList
		 * �ε尡 ���� ������ LinkedList
		 ���빮��
		 �ѹ�������  : 3,6,9,12,15
		 �ѹ�������2 : 2,4
		 
		 ��� 3,6,9,12,15,2,4
		*/
		/*Arrays.sort : �迭���� ���¿��� �����մϴ�.*/
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
			
			Collections.sort(num1); //ArrayList, LinkedList sort �������� ����
			System.out.println(num1);
			
			int ea2 = num1.size();
			System.out.println(ea2);
			
	}	

}
