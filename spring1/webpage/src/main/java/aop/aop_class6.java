package aop;

public class aop_class6 {
	aop_log a1 = new aop_log();
	
	public void memberin() throws Exception{
		Thread.sleep(3000);
		System.out.println("회원가입 메소드");
	}
	public void memberinfo() {
		System.out.println("회원개인 정보 메소드");
	}
	public void memberlogin() {
		System.out.println("회원로그인 메소드");
	}
	public void memberupdate() {
		System.out.println("회원정보 수정 메소드");
	}
	public void memberdel() {
		System.out.println("회원정보 삭제 메소드");
	}
}
