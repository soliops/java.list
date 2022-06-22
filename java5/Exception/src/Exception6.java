public class Exception6 {

	public static void main(String[] args) {
		/*
		 응용문제
		 사용자가 45 * 3 + 16 + 5 + 22 * 8 해당 연산 값의
		 최종값을 외부 클래스로 전송합니다.
		 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며
		 홀수일 경우 "홀수값 입니다."로 다시 회신합니다.
		 */
		
		
		outnumber on = new outnumber();
		try {
			int nums = 45*3+16+5+22*8;
			on.nums(nums);
			String nums1 = on.nums(nums); //return 값
			
			System.out.println(nums1);
		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e.getMessage());
			}
		}
		finally {
			try {
			int nums = 11;
//			String nums1 = Integer.toString(nums);
			on.nums(nums);
			System.out.println(on.nums(nums));
			}
			catch(Exception f) {
				System.exit(0);
			}
		}
		
		
	}

}
class outnumber {
	//자료형 메소드에서 return 값 숫자, 문자, object에 따라서 자료형이 선언되어 생성
	public String nums(int nums1) throws Exception {
		if((nums1)%2==0) {
//			Exception ec= new Exception("예외처리 발생으로 재 확인이 필요합니다.");
//			throw ec;
			throw new Exception("짝수값 입니다.");
		}else {
			String msg = "홀수값 입니다.";
			return msg;			
		}
		
	}
}