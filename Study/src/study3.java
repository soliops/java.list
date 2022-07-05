import java.util.Arrays;

public class study3 {

	public static void main(String[] args) {
		//test 3-1 문자열 문자 배열로 만드는 문제
		String name = "honggildong"; 
		testarray ta = new testarray();
		ta.array(name);
	}

}
class testarray{
	char name[] = null;
	public void array(String name) {
		this.name = new char[name.length()];
		for(int f=0;f<name.length();f++) {
			this.name[f] = name.charAt(f);
		}
		System.out.println(Arrays.toString(this.name));
	}
}