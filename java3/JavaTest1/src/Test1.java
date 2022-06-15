import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("on&off 중 하나를 입력해주세요");
		String a = sc.next();
		//boolean aa =false;
		if(a.equals("on")) {
			//aa=true;
			System.out.println(true);
		}else if(a.equals("off")) {
	//sysout aa;
			System.out.println(false);
		}
		sc.close();
	}

}
