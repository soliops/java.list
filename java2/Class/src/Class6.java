import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		//datalist da="";
		//String pay="신용카드";
		String pay="무통장";
		if (pay.equals("신용카드")) {
			da.pay1(); //해당 조건에 맞는 메소드를 호출
		}
		else {
			da.pay2(pay); //메소드에 객체값을 태워서 전달(객체값은 무한대)
		}
		
		/*
		 * 응용문제
		 * 
		 * 해당 로드할 class명은 agrees라는 이름을 가지고 있습니다.
		 * main 메소드에서 사용자가 "동의함", "동의안함"을 입력하게 됩니다.
		 * 동의함으로 입력되었을 경우 "회원가입이 진행 됩니다." 라는
		 * 메세지를 출력하고, 동의안함을 입력시 "동의를 하셔야 진행 됩니다."라고
		 * 출력 되도록 하시오.
		 * 단, agrees 클래스 안에 void 메소드 한개 또는 2개 를
		 *  선택하여 코드를 제작하시오.
		 */
		
		
		Scanner ag = new Scanner(System.in);
		System.out.println("결제에 동의하시겠습니까? 동의하지 않으시겠습니까?");
		agrees b =new agrees();
		String agree = ag.next();
		b.agree3(agree);
		/*if (agree.equals("동의함")) {
			b.agree1();
		}
		else {
			b.agree2();
		}
		*/
		ag.close();
	}
	
}

class datalist{
	/*static 메소드를 활용하는 형태 : 여러 package에서 해당 메소드를
	 * 자주 사용해야하는 부분에서는 static을 이용하여 사용합니다.
	 * 
	 * static(정적 메소드) : 오버라이딩을 사용할 수 없음.
	 * void만 사용(동적 메소드) : 오버라이딩을 사용할 수 있음.
	 * 오버라이딩 예제
	 * class a{
	 * void 메소드
	 * }
	 * class b extend a {
	 * void 메소드
	 * }
	*/
	public void array_data(int a) { //static 없는 메소드
		int w=1;
		while(w<=9) {
			System.out.println(a*w);
			w++;
		}
		
	}
	
	public void pay1() {
		System.out.println("신용카드로 결제 진행 합니다.");
	}
	public void pay2(String pm) {
		System.out.println("무통장으로 결제 진행합니다.");
	}

}
class agrees{
	public void agree1() {
		System.out.println("회원가입이 진행 됩니다.");
	}
	public void agree2() {
		System.out.println("동의를 하셔야 진행 됩니다.");
	}
	public void agree3(String agr3) {
		String msg;
		if(agr3.equals("동의함")) {
			msg="회원가입이 진행 됩니다.";
		}
		else {
			msg="동의를 하셔야 진행 됩니다.";
		}
		System.out.println(msg);
	}
}