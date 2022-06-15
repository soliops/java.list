package Ab;
/*abstract와 interface의 차이점 및 공통점*/
public class method_2 {
	//method_2inter and method_2inter2 interface 연결됨
	public static void main(String[] args) {
			loadinter id = new loadinter();
			id.setbox("홍길동");

	}

}
//중요: abstract와 interface는 모두 static은 사용할 수 있음.
abstract class test{ //abstract에는 default를 사용하지 않음 (public으로 설정)
	//필드에 자료형을 생성할 수 있음.
	public String nn;
	public abstract void box();
	public void box2(String n) {
		this.nn=n;
		System.out.println(this.nn);
	}
}
class loadinter implements method_2re, method_2inter2{ //다중 상속
	
	@Override
	public String names() {
		return null;
	}
}