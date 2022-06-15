
public class Example3 {

	public static void main(String[] args) {
		Inherit2 Ih2 = new Inherit2();
		Ih2.It("홍길동", "123");
		Ih2.print();
	}

}

class Inherit1 { 
	private String nm; 
	//Inhrit1 해당 부분에서만 작동된다. 외부에선 인식이 불가능
	protected String pw;
	//protected 쓰면 부모자식 클래스 안에서만 돈다.
	//Inherit1, Inherit2에서 모두 작동 되도록 하며, 외부에서 로드 못함.
	public String aa; 
	//private으로 받은 부분을 Inherit2에서도 사용할 수 있도록 하기 위함
	
	public void It(String d1, String d2) {
		this.nm=d1;
		this.pw=d2;
		this.aa=this.nm;
	}
}

class Inherit2 extends Inherit1 {
	public void print() {
		System.out.println(this.aa+" "+this.pw);
	}
	
}