package List1;

import java.util.Arrays;
import java.util.LinkedList;

public class list7 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ArrayList �Ǵ� LinkedList �� �߿� ���ϴ� �޼ҵ带
		 �����Ͻø� �˴ϴ�.
		 2�� �迭 ���� �Դϴ�.
		 �ش� ������ ���� ��� ���Ͽ� ¦�� ���� Ȧ�� ������ Ȯ���Ͻÿ�.
		 Integer data[][] = {
		 			{10,20,30,40,50,60,70},
		 			{3,6,9,12,15,17,19}
		 };
		 ����� �� ���� 361 �̰� Ȧ�� �Դϴ�.
		 
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
					 msg="¦��";
				 }else {
					 msg="Ȧ��";
				 }
			 w++;
		 }while(w<ea);
		 System.out.printf("����� �� ���� %s �̰� %s �Դϴ�.",total,msg);
	}

}
