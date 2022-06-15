import java.lang.reflect.Array;
import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * 응용문제 다음중 장바구니에 여러개의 상품이 담겨져 있습니다.
		 * 그 중 택배비가 별도로 측정되는 금액만 추출하시오.
		 * 택배비는 30000원 이상(포함)
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * [48000,67000,118200,49800]<- 추출한 데이터를 배열로 새롭게 만들라는 뜻
		 */
		
		int a[] = new int[4];
		int b[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int eb = b.length;
		int ct=0; //a배열에 순서대로 들어가게 됨
		int w=0;
		while(w<eb) {
			if(b[w]>=30000) {
				a[ct]=b[w];
				ct++;
			}
				
			w++;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
