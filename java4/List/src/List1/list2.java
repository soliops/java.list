package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 �ش� ������ �� �� �޸�� �����ʹ� ��� ���� �ؾ� �մϴ�.
		 �� ������
		 {"�����","������","��â��","�ڵ���","�̰���","�����","������"}
		 ���
		 �����, ������
		 */
			
//			String user[] =  {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		
//			ArrayList<String> ulist = new ArrayList<>(Arrays.asList(user));
//			System.out.println(ulist);
//			int w=0;
//			int ea=ulist.size();
//			while(w<ea) {
//				int ea2= ulist.size(); //node�� ������ �ٽ� �ľ���
//				int ww=0;
//				while(ww<ea2) {
//					if(!ulist.get(ww).equals("�����") && !ulist.get(ww).equals("������")) {
//						ulist.remove(0);
//						System.out.println(ulist);
//					}
//				}
//				w++;
//			}
			/*
			do {
				int ea2=ulist.size();
				int ww=0;
				do {
			if(!ulist.get(ww).equals("�����") && !ulist.get(ww).equals("������")) {				
				ulist.remove(0);
				System.out.println(ulist);
			}
			}while(ww<ea2);
			w++;
			}while(w<ea);
			*/
			/*
			 ���빮�� ¦���� ���ڸ� ��� ���� �մϴ�.
			 10,7,6,1,11,37,41,22
			 7,1,11,37,41
			 */
			 
			Integer number[] = {10,7,6,1,11,37,41,22};
			ArrayList<Integer> nb = new ArrayList<>(Arrays.asList(number));
			int w1 = 0;
			int ea_1 = nb.size();
			do {
				int w2= 0;
				int ea_2 =nb.size();
				do {
					if(nb.get(w2)%2==0) {
						nb.remove(w2);
						break;
					}
					w2++;
				}while(w2<ea_2);
				w1++;
			}while(w1<ea_1);
			System.out.println(nb);						
			
	}

}
