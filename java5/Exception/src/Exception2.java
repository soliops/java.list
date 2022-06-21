
public class Exception2 {

	public static void main(String[] args) {
	
		try {
			//test(); //메소드 호출자체 error Exception과 관계가 없음.
			Exception2 ex = new Exception2();
			String a = "홍길동2";
			ex.test(a);
		} catch (Exception z) {
			System.out.println(z);
		}
		
	}
	public void test (String b)  throws Exception { 
		//throws는 main메소드에서 예외처리 없이 메소드를 호출 할 경우를 막기 위해서 입니다.
		int k = Integer.valueOf("b");
		System.out.println(k);
		Exception c = new Exception();
		throw c;	//코드 맨 밑에 사용을 하며 throw = return과 비슷한 성격을 가지고 있습니다.
		//예외처리 결과에 대한 값을 main메소드로 다시 return시킴
	}
	
	
}
