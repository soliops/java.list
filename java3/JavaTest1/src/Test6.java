
public class Test6 {

	public static void main(String[] args) {
		int d=2;
		do {
			int g=1;
			do {
				System.out.println(d+" * "+g+" = "+d*g);
				g++;
			}while(g<10);
			d++;
		}while(d<10);		
	}

}
