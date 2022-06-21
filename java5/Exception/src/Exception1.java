/*
 Exception : try, catch와 함계 사용을 하게 됩니다. (예외처리사항) 
 RuntimeExecption (Error 발생시 예외처리 체크를 안함) - Null, Class, Arraysize
 OtherException - (예외처리 체크사항 모두함)
	Exception [종류]
	NullPointer : Null객체를 참조할때
	ClassCast : 클래스형 변환
	NumberFormat : 숫자형으로 변환
	ArryaIndexOutOfBound : 배열참조시 인덱스 번호 오류
	IOException : 입출력 문제 발생 O
	Exception : 전체 예외처리 현황 O
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		try {
			 a = Integer.valueOf("홍길동1");
		}
		catch(Exception z){
			System.out.println(z);
		}
		finally {
			 a = Integer.valueOf("1");
			System.out.println(a);
		}
	}

}
