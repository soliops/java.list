import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		//빈배열 변수에 데이터가 있는 배열로 커스텀 방법
		int a[] = new int[2]; //3개의 공간만 제공함.
		int b[] = {1,2,3,4,5,6,7}; //7개의 객체가 있는 상황
		int ea = b.length; //b배열안에 몇개의 데이터 객체
		int a_ea=a.length;
		int w = 0;
		int ct = 0;
		//System.out.println(a.length);
		while(w<ea) {
			//System.out.p0rintln(b[w]);
			if(b[w]%2==0 && ct<a_ea) { 
				//if(b배열의 값 중 짝수만 && 새로운 a 배열에 전체 객체 크기 만큼만)
				a[ct]=b[w];  
				ct++;        //조건에 맞을시 인덱스번호를 +1씩 증가시킴
			}			
			w++;
		}
		System.out.println(Arrays.toString(a));
		//Arrays.toString : 숫자,문자, 소수 []현재 배열 변수값ㅇ을 출력하는 함수입니다.
		
		
		
	}

}
