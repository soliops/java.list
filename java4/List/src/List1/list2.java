package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 응용문제
		 해당 데이터 값 중 휴면고객 데이터는 모두 삭제 해야 합니다.
		 고객 데이터
		 {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"}
		 결과
		 정재욱, 하윤성
		 */
			
//			String user[] =  {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"};
		
//			ArrayList<String> ulist = new ArrayList<>(Arrays.asList(user));
//			System.out.println(ulist);
//			int w=0;
//			int ea=ulist.size();
//			while(w<ea) {
//				int ea2= ulist.size(); //node의 갯수를 다시 파악함
//				int ww=0;
//				while(ww<ea2) {
//					if(!ulist.get(ww).equals("정재욱") && !ulist.get(ww).equals("하윤성")) {
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
			if(!ulist.get(ww).equals("정재욱") && !ulist.get(ww).equals("하윤성")) {				
				ulist.remove(0);
				System.out.println(ulist);
			}
			}while(ww<ea2);
			w++;
			}while(w<ea);
			*/
			/*
			 응용문제 짝수의 숫자를 모두 삭제 합니다.
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
