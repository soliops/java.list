
public class Test5 {

	public static void main(String[] args) {
		int w = 1;
		int total=0;
		do {
			total+=w;
			if(total<4000&&w==88) {
				System.out.println(total);
			}else{
//				break;
				}
			w++;
			}while(w<=100);
	}

}
