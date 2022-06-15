import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		//엔진이랑 보조부문을 불러오고 나서 출력하고 입력사항을 변수로 받아들인다.
		Scanner mid = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력하세요:");
		String m = mid.next(); //사용자가 아이디 입력
		
		Scanner mpass = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요:");
		String p = mpass.next(); // 사용자가 패스워드 입력
				
		//System.out.printf("아이디:%s,패스워드:%s",m,p);
		/*응용문제
		 * [로그인 프로그램]
		 * 회원가입 아이디는 jung, su
		 * 패스워드
		 * jung : j1234
		 * su : ssh
		 * 
		 * 해당 아이디 외에 나머지는 가입되지 않은 사용자 입니다.
		 * 라고 출력합니다.
		 * 또한 패스워드가 틀릴 경우 "회원정보를 다시 확인하세요."
		 * 라고 출력합니다.
		 * 아이디 및 패스워드가 모두 맞을 경우 "로그인 되셨습니다."
		 * 라고 출력하십시오.
		 */
		//문자열은 반드시 equals 사용!
		if (m.equals("jung") && m .equals ("su")) {
			if (m.equals("jung")&& p.equals("j1234")) {
			System.out.println("로그인 되셨습니다.");
		}
			else if (m.equals("su")&& p.equals("ssh")) {
				System.out.println("로그인 되셨습니다.");	
			}
		else {
			System.out.println("회원정보를 다시 확인하세요.");
			}	
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
	
		mid.close();
		mpass.close();
	}

}
