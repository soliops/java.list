
public class study1 {

	public static void main(String[] args) {
		
		study1 sd = new study1();
		sd.test();
		sd.getter(5);
		System.out.println(sd.getter(5));
	}
	public void test() {
		for(int f=1;f<11;f++) {
			System.out.println(f);
		}
	}
	public int getter(int w) {
		
		int ww = 7;
		return ww*w;
		
	}
}
