
public class Time3 {

	public static void main(String[] args) {
//		try {
//			System.out.println("수업시작");
//			Thread.sleep(5000);
//			System.out.println("수업종료");
//		}catch(InterruptedException a){
//			System.out.println(a);
//		}
		/*
		 * 응용문제 외부 class가 있습니다. 단, 메인 클래스에서 해당 
		 * 외부 class를 로드하면 해당 메소드에서 즉각적으로 8초 동안 로딩이
		 * 발생합니다. 8초동안 "처리중입니다. 잠시만 기다려 주세요." 
		 * 8초 이후에 return으로 "입금이 모두 처리 되었습니다."라는 문자를
		 * 받도록 하십시오.
		 */
//		bank b = new bank();
//		System.out.println(b.msg());
		bank2 b2 = new bank2();
		b2.money();
	}

}

class bank {
	String msg;

	public void bank_msg() {
		try {
			System.out.println("입금을 시도 중입니다.");
			Thread.sleep(4000);
			System.out.println("처리중입니다. 잠시만 기다려주세요.");
			Thread.sleep(4000);
			msg = "입금이 모두 처리 되었습니다.";

		} catch (InterruptedException a) {
			System.out.println(a);

		}
	}

	public String msg() {
		this.bank_msg();
		return msg;
	}
}
class bank2{
	public void money() {
		try {
//			System.out.println("처리중입니다. 잠시만 기다려 주세요.");
			System.out.println("test");
			int c = 5/0;
			Thread.sleep(1000);
			System.out.println("test1");
//			String kkk=this.msg();
//			System.out.println(kkk);
		} catch (Exception c) {
			System.out.println("test2");
		}
	}
	public String msg() {
		return "입금이 모두 처리 되었습니다.";
	}
}
