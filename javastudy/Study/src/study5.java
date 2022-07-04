import java.util.Arrays;

public class study5 {

	public static void main(String[] args) {
		String a[] = {"kiwi키위","apple사과"};
		for(int i =0;i<a.length;i++) {
		a[i] = a[i].replaceAll("[^a-zA-Z]", "");
		}
		System.out.println(Arrays.toString(a));
		
	}

}
