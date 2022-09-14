package aop;

public class aop_log {
	//aop에서 before, after든 사용시 발동 되는 메소드
	public void logs() {
		System.out.println("로그 기록처리");
		System.out.println("*********************");
		System.out.println("로그 기록처리 완료");
	}
}
