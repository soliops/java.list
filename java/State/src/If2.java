
public class If2 {

	public static void main(String[] args) {
		
		String mid1, mid2, mpass;
		 mid1 = "hong";
		 mid2 = "kim";
		 mpass = "a123456";
		// 공백도 하나의 문자로 인식되니 주의
		
		/* 해당 조건문은 문자로 확인되는 조건일때 이며, else로 적용되는 부분 */
		if (mid1 == "hong") {
			System.out.println("환영합니다.");
		} else if (mid1 == "park") { // 추가로 비교대상이 있을 경우
			System.out.println("환영합니다.");
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}

		/* 아이디 및 패스워드를 모두 검토하는 더블 조건문 */
		if(mid2=="kim") {
			if(mpass=="a123456") {
				System.out.println("로그인 하셨습니다.");
			
			}
			else {System.out.println("패스워드가 틀립니다.");	
			}
		}
	
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
		
}}