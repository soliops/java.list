
public class oop3 {
//Multi Thread(멀티 쓰레드): start,run,sleep,setStop
//멀티쓰레드 : CPU에 코어와 관계가 있습니다.
	public static void main(String[] args) {
		//쓰레드(Thread) : 프로세스 내부에서 독립적으로 실행되는 작업을 말함.
		//Multi Thread(멀티 쓰레드) : 프로세서 내부에서 두가지 이상의 작업을 동시 사용
		//쓰레드 -> 음악
		//멀티 쓰레드 -> 음악, 유튜브, 문서  (멀티 태스킹)
		/*
		 메소드 실행합니다. A,B 동시실행 하면 순차적으로 동시에 안나온다.
		 why? A,B가 랜덤하게 섞여서 나오기 때문이다.
		 */
		
		
		Thread my = new mythread();  //부모 메소드 = 자식 메소드
		//기존사용형태 : 자식메소드 = 자식 메소드
		my.start();
		Thread my2 = new test2();
		//Thread 메소드에 기본 run을 작동하기 위한 start 명령어입니다.
		
		my2.start();
		
		Thread my3 = new test3();
		my3.start();
		int ct=1;
		while(ct<=10) {
			System.out.println("내부클래스: "+ct);
			ct++;
		}
	}

}
class test2 extends Thread{
	@Override
	public void run() {
		int ct=1;
		while(ct<=10) {
			System.out.println("외부클래스2: "+ct);
			ct++;
		}
	}
}
	class test3 extends Thread{
		@Override
		public void run() {
			int ct=1;
			while(ct<=10) {
				System.out.println("외부클래스3: "+ct);
				ct++;
		}
	}
}
class mythread extends Thread{ 
	//Thread : JVM 기본으로 탑재 되어 있는 메소드(Thread는 단독으로 사용하지 않음)
	@Override
	public void run() {//run이란 : 멀티메소드 기본 실행 메소드
		int w=1;
		while(w<=10) {
			System.out.println("외부클래스: "+w);
			w++;
		}
	}
}
