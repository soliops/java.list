import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		 /*
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자가 주소를 입력합니다.");
		String Address = sc.nextLine();
		System.out.println("사용자가 전화번호를 입력합니다.");
		String phone = sc.next();
		
		System.out.println("해당정보를 확인해주세요.");
		System.out.printf("주소: %s 전화번호: %s", Address,phone);
		sc.close();
	}

}
