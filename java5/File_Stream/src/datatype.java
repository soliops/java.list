import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		//intern() = equals를 사용하지 않고 ==(부등기호로 사용가능)
		String data[] = {"홍길동"};
		String data2[] = {"홍길동","홍길동"};
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern();
		String d = new String("홍길동");
		String e = data[0];
//		Scanner sc = new Scanner(System.in);
//		String f = sc.next().intern();
		String g = new String(a);
		String h = new String(data2[0]).intern();
		String h2 = new String(data2[1]).intern();
		String h3= new String(data2[1]).intern();
		String h4 = new String(data2[0]);

		System.out.println(h4==h3);
		/* String Pool 영역에 같이 있으면 
		 ==, equals
		 String Pool 영역, HEAP영역
		 equals
		 HEAP 영역 있는 경우 비교
		 equals
		 
		 **intern => String Pool 가상으로 있다고 생각하게 만듦.
		 */
			
		//new String : 소속이 없는 자유분방한 자료형(문자, 배열값)
//		if(c==e) {
//			System.out.println("값이 같습니다.");
//		}
		
	}

}
