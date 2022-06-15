
public class Class2 {
		//Package를 사용하지 못함 (default)라서
	public static void main(String[] args) {
		//별도의 클래스 지정 후 함수를 이용하여 값을 전달받기
		//inject a = new inject();
//		inject.oksign();	//가장 기본이 되는 함수 즉, static void를 사용시
//		inject.test();
		members.user("이순신");//괄호 안에 있는 데이터 (인자값)
		members.cal(5,10); //members 클래스 안에 cal라는 일반함수에 5,10 인자값을 던짐
	}

}
class inject{
	//public static void : 가장 기본이 되는 일반 함수를 뜻합니다.
		public static void oksign() {
			String user = "홍길동";
			System.out.println(user);
		}	
		public static void test(){
			int aa=1;
			int bb=3;
			int cc =aa+bb;
			System.out.println(cc);
		}
		
}

class members{
	public static void user(String names) {
		String msg = names +"님 환영합니다.";
		System.out.println(msg);
	}
	public static void cal(int a, int b) { //(자료형 이름, 자료형 이름) : 인자값 2개를 받음
		int c=a*b;
		System.out.println(c);
	}
}