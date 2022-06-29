//Thread 사용방식
public class Thread1 {

	public static void main(String[] args) {
		//Extend Thread
		int w = 0;
		while(w<6) {
//		box b= new box(w);
//		Thread t = new Thread(b);
//		t.start();
		w++;
		}
		//interface Runnable Thread
		for(int f = 0; f<11; f++) {
		box2 b2 = new box2(f);
		Thread t2 = new Thread(b2); //Thread 메소드를 호출하여 해당 클래스에 CPU 한개를 할당
		t2.start();
		}
	}
	

}
//extends
class box extends Thread {
	int no = 0;
	public box(int b) {
		this.no = b;
		
	}
	@Override
	public void run() { //Thread의 기본 메소드
		try {
			Thread.sleep(1000);
			
		}
		catch (Exception e) {
		}
		System.out.println(this.no);
	}
}
class box2 implements Runnable{
	int no = 0;
	public box2(int b) {
		this.no = b;
		
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			
		}
		catch (Exception e) {
		}
		System.out.println(this.no);
	}
}
