import java.util.ArrayList;

public class study7 {
	
	public static void main(String[] args) {

		Thread t = new box1();
		t.start();
		
		int[] array = {1,2,6,7,10,11,15,22,42,43,50,51};
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		for(int w=0;w<array.length;w++) {
			if(array[w]%2==0) {
				ar1.add(array[w]);
			}
		}
		System.out.println("Â¦¼ö : "+ar1);

	}
	
}
class box1 extends Thread{
	@Override
	public void run() {
		int[] array = {1,2,6,7,10,11,15,22,42,43,50,51};

		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		for(int w=0;w<array.length;w++) {
			if(array[w]%2==1) {
				ar2.add(array[w]);
			}
		}
		System.out.println("È¦¼ö : "+ar2);
	}
}