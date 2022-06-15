
public class Method3 {

	public static void main(String[] args) {
		/*응용문제
		 인수값 2개의 숫자를 적용하여 계산되록 합니다.
		 최종 셰사능ㄹ 받아서 결과를 출력하시오.
		 157, 45
		 258*45
		 최종결과값 출력;
		 */
		math ma = new math();
		int result = ma.m(157,45);
		System.out.println(result);
		ma.m2();
		ma.m();
		/*
		 * 응용문제
		 * 다음 숫자 하나를 해당 메소드로 전달하게 됩니다.
		 * 해당 메소드에서는 다음과 같이 처리 됩니다.
		 * 숫자 3을 전달하면 3*1~3*9까지의 모든 결과값을 더하여
		 * sysout으로 출력되도록 하십시오.
		 */
		
		math2 mb1 = new math2();
		int result1 = mb1.ma1(3);
		System.out.println(result1);
		
		String ck =mb1.mb("hong");
		System.out.println(ck);
	}
	
}
class math{//같은 이름을 사용 가능하지만 인수값으로 구분한다.
	public int m(int a, int b) {
		int c=a*b;
		return c;
	} 
	public void m() {
		System.out.println("연습입니다.");
	}
	public void m2() {
		int z =m(100,200);
		System.out.println(z);
	}
}
class math2{
	public int ma1(int aa) {
		int bb=1;
		int total=0;
		do {
			total+=aa*bb;
			bb++;}while(bb<10);
		return total;
		//return 사용시 절대 반복문 안에 적용하면 안됩니다.
		//또한 조건문이라도 더블로 return사용 안됩니다.
		
	}
	public String mb(String mid) {
		String msg="";
		if(mid.equals("hong")) {
			msg= "ok";
		}
		else{
			msg= "cancel";
		}
		return msg;
		
		/*해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여
		 *  최종적인 값을 return 시킴*/
	}
}