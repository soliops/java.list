import java.util.Scanner;
public class course1_2 {

	public static void main(String[] args) {
		square s = new square();
		s.main();
	}

}

class square{
    public void main() {
    	Scanner sc = new Scanner(System.in);
    	String m1 = "";
    	String m2 = "";

    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	for(int t=a;t>0;t--) {
    		m1+="*";
    	}
        for( int f=b;f>0;f--) {
        	m2= m1;
        	System.out.println(m2);
        }
        sc.close();
    }
}