//thread는 메인 class에서 사용안함 extends(class), implements (interface)
public class thread1 {

	public static void main(String[] args) {
		//순차적으로 처리함
		class_box cb = new class_box();
		for(int a = 0; a<10; a++) {
//		cb.run("클래스 처리현황"+a);
		}
		
		cpu_box cp = null;
		//Thread을 이용하여 먼저 처리된 결과 순으로 나오도록 합니다.
		for(int b=0; b<10; b++) {
		cp = new cpu_box("쓰레드 처리현황"+b);
//		cp.start();
		}
		
		/* 
		Thread를 이용하여 강제 예외처리 방식이며, 문제가 발생 하더라도
		해당 문제가 발생한 Thread만 예외처리 그 외 사항은 모두 처리하는 예시
		*/
		call_box bb = null;
		int w=0;
		String msg = "";
		String msg2 = "";
		while(w<10) {
			if(w==5) {
				msg2 = "5";
			}
			else {
				 msg2 = "";
			}
			bb = new call_box(msg+msg2); 
			//nullnull = 8로 읽어버림 값을 없애려면 ""
			
			bb.start();
			w++;
		}
	}

}
class call_box extends Thread{
	String callname=null;
	public call_box(String z) {
		this.callname = z;
	}
	@Override
	public void run() {
		try {
			if(this.callname.length()>0) {
				Exception ec = new Exception();
				throw ec;
//				throw new Exception();
			}
			else {
			System.out.println(this.callname.length());
			}
		}
		catch (Exception e) {
			System.out.println("해당 값 중 잘못된 값이 발생 하였습니다.");
		}
		finally {
		
		}
	}
}
class cpu_box extends Thread{
	String name = null;
	public cpu_box(String a) {
		this.name = a;
	}
	@Override
	public void run() {
		System.out.println(this.name);
	}
}
class class_box{
	
	public void run(String name) {
		System.out.println(name);
	}
}