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
		String b = "aA1";
		try { //try : 해당 값을 int로 변경함(1)
			 a = Integer.valueOf(b); 
			 //error 발생 : a1이라는 문자인데, 
			 //강제로 숫자로 변환시 a라는 문자로 인하여 오류 발생(2)
		}
		catch(NumberFormatException z){
			System.out.println(z); //(3)어떤 부분에서 문제가 발생
		}
		finally {
			 b = b.replaceAll("[a-z][A-Z]", ""); //데이터 재처리 (4)
			 //replaceAll 에서  [a-z]는 영어 소문자 범위, [A-Z]는 대문자 범위
			 a = Integer.valueOf(b); //다시 문법을 재작성해서 사용(5)
			System.out.println(a); //(6)최종 결과값 출력
		}
	}

}
