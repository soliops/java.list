
public class Exception5 {
	//역할 : 값 주고, 출력만 함.
	public static void main(String[] args) { //값을 전달
		words wd = new words();
		
		try {
			String result = wd.files("");
			System.out.println(result);
		}
		catch (Exception a) {
//			System.out.println("빈값이 문제가 되어 올바른 값을 전달 받지 못함");
		
			if(a.getMessage()!=null) {				
				System.out.println(a.getMessage());
			}
			
		}finally {
			try {
			String result = wd.files("홍길동");
			System.out.println(result);
			}
			catch(Exception e){
				System.exit(0);
			}
		}
		
	}

}

class words {
	//역할 : 값을 받고, 연산 후 return
	public String files(String aa) throws Exception{
		if(aa==null || aa.equals("")) {
			throw new Exception("값이 비어 있음");
		}
		else {
			String msg = aa+ "님 환영합니다.";
			return msg;
		}

	}
}