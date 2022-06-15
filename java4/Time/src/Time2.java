import java.util.Timer;
import java.util.TimerTask;

public class Time2{
	
	
	public static void main(String[] args) { 
		//이건 쓰레드가 아니라 시간메소드를 쓴것
		
		Timer timer = new Timer(); // Timer util을 이용하여 시간메소드를 사용합니다.
//		timer.scheduleAtFixedRate(new gogo(), 5000, 5000);
		//(시작할 메소드&클래스, 몇 초 뒤에 시작, 반복시간)
		//scheduleAtFixedRate : 지속적으로 반복 작업을 할 경우
		TimerTask tk = new TimerTask() {
			int a=0;
			String adata[] = {"홍길동","이순신","강감찬","유관순"};
			@Override
			public void run() {
				if(a>=4) {
					System.exit(0);
//					a=0;
				}
				System.out.println(adata[a]);
				a++;
			}
		};
		timer.scheduleAtFixedRate(tk, 0, 5000);
	}
		
}


class gogo extends TimerTask{ //TimerTask : 시간작업
	public void run() { //run : Task에서 실행하는 메소드 입니다.
	System.out.println("시간 함수 잘 작동이 될까요???");
	}
}