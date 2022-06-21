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
			String nums1 = Integer.toString(nums);
			on.nums(nums1);
			System.out.println(nums1);
		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		finally {
			try {
			int nums = 11;
			String nums1 = Integer.toString(nums);
			on.nums(nums1);
			System.out.println(on.nums(nums1));
			}
			catch(Exception f) {
				System.exit(0);
			}
		}
		
		
	}

}
class outnumber {
	public String nums(String nums1) throws Exception {
		if(Integer.parseInt(nums1)%2==0) {
			throw new Exception("짝수값 입니다.");
		}else {
			String msg = "홀수값 입니다.";
			return msg;			
		}
		
	}
}