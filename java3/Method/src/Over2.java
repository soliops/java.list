
public class Over2 extends main2{
//2개를 로드 못한다.	
	public static void main(String[] args) {
		//상속방식
		Over2 ov = new Over2();
		ov.abc();
		ov.abc2();
	}

}
class main2 extends main3{
	public void abc() {
		System.out.println("외부 메소드 클래스");
	}
}
class main3{
	public void abc2() {
		System.out.println("외부 메소드 클래스");
	}
}