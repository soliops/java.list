import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		/* 응용문제
		 *  배열 + 기본(클래스)메소드 문제
		 *  product : 수박, 참외, 사과 ,배, 딸기, 키위, 바나나, 망고 
		 *  중 참외, 배, 키위를 삭제 하였습니다.
		 *  해당 삭제 후 배열을 다시 재 리스트 하는 코드를 작성하시오.			
		 *  단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며
		 *  반복문은 Free입니다.
		 *  결과 : [수박,사과,딸기, 바나나,망고]
		 */
		
		String product[]= {"수박","참외","사과","배","딸기","키위","바나나",	"망고"};
		example2 fr = new example2();
		fr.fruits(product);
		

	}
	public void fruits(String A[]){
		int no=5;
		String newproduct[]=new String[no];
		int dx=0;
		for(String a : A) {
			if(!a.equals("참외")&&!a.equals("배")&&!a.equals("키위")){
				newproduct[dx]=a;
				dx++;
			}
			
		}
		System.out.println(Arrays.toString(newproduct));
	}
}
