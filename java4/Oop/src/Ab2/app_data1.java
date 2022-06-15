package Ab2;

public interface app_data1 {
	String a=null; 
	int b = 0;
	//필드에 자료형을 비어있는 값을 사용할 경우 적용 자체가 안됨.(무조건 값 적용)
	public void user_join(); //선언 형태의 메소드는 this 사용이 불가능함
	default void aaa() {	//default에는 this사용이 가능함.(값이 있을 경우)
		System.out.println(this.a);
	}
}
