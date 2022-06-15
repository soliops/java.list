
public class If3 {

	public static void main(String[] args) {
		
		//boolean : true, false로 구분하게 됩니다.
		
		boolean ck = true;
		if (ck==true) {
			System.out.println("회원가입이 진행 됩니다.");
		}
		else {
			System.out.println("이용약관에 동의하셔야만 진행 됩니다.");
		}
		
		String mid, mpass;
		mid="park";
		mpass="a1234";
		/* && : 한가지 조건이상 모두 맞을 경우
		 * || : 한가지 조건이상에서 한개라도 맞을 경우
		 * 
		 * */
		if (mid=="park" && mpass=="a1234") {
		System.out.println("로그인 하셨습니다.");	
		}
		else {
			System.out.println("아이디 및 패스워드를 확인하세요.");
		}
		
		if (mid=="park" || mid == "kim") {
			//if (mid=="park" || mpass == "a1234") (// 두 조건 중에 한가지라도 맞을 경우 
			System.out.println("회원이 확인 되었습니다.");
		}
		else {
			System.out.println("확인된 아이디가 없습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
