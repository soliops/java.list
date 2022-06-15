package Ab;
//interface : 원래 기능 : 메소드만 선언, 추가로 연산을 처리하는 형태의 default가 추가됨
public interface method_2inter {
	//interface는 메소드 이므로 필드에 자료형을 선언 할 수 없음.
	public String names();//String names() return 메소드 선언
	
	default void setbox(String name) { //setter
		System.out.println(name);
	}
	default String box3() { //getter
	//interface에는 default 선언하면 연산 메소드를 사용함
		return null;
	}
}

interface method_2re extends method_2inter{
//interface에 extends로 부모 interface를 로드 할 수 있다.
	
}