
public class Over {

	public static void main(String[] args) {
		
//		pt p = new pt();
//		p.display();
		//p.display("메인 내용 값 출력");
		cd c = new cd();
		c.display("메인 내용 값 출력"); //오버로딩
		c.display(); //오버라이드
		
	}

}
/*
 오버로딩(overloading) : 새로운 메소드를 정의하는 것을 말합니다.
 -->자료형이 다르면 가능하다. 단 같은 자료형 2개여도 1개만 된다.
 즉 인수값에 뭐가 오냐에 따라 다르다. 부모도 자식도 가능
 오버라이드(override) : 부모 클래스에서 상속 받은 기존 메소드를 사용하는 것을 말합니다.
 */
class pt{
	public void display() {
		System.out.println("부모 외부 내용 값");
		
	}
	
}
class cd extends pt{
	/* aaaa() 메소드는 에노테이션을 사용하지 못함 부모 class에서 선언하지 않았음 
	@Override
	public void aaaa() {
		System.out.println("자식에 만들어진 메소드");
	}
	*/
	
	@Override //에노테이션 (표시) 문제 발생시 확인 (오버라이드)
	public void display() { //오버라이드
		System.out.println("자식 클래스 값으로 변경??");
		super.display();  //부모에 있는 고유 속성 메소드 값을 가져올때 사용합니다.
	}
	public void display(String msg) { //오버로딩
		System.out.println(msg);
	}
}