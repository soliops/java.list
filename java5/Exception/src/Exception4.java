import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) throws Exception {
		//FileReader면 IOException
		//기본 베이스가 깔려 있으면 Exception 
		try {
		ex e = new ex();
		e.loader("data");
		//자기 자신을 바로 예외상황으로 만듦
//			Exception aaa = new Exception();
//			throw aaa;
		//throw : 자신을 호출하여 예외가 발생하면 자신을 호출한 class로 return
				
		}
		catch (Exception e) {
			if(e.getMessage()!=null)
			System.out.println(e.getMessage());
		}
		
	}

}
class ex{
	Exception ep = null;
	public void loader(String a) throws Exception{
		/*잘못된 문법사항 (자신의 오류를 상위 main class에 모두 전달하는 상황)*/
		//thorws try -catch를 받기 위한 class를 로드하는 것
//		if(a=="ok") {
//			//정상적이지만, loader class 자체적인 오류가 발생
//			int keycode = Integer.valueOf(a);
//		}
//		else {
//			//해당 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우
//			this.ep = new Exception();
//			throw this.ep;//->try- catch 있어야만 된다.
//		}
		try {
			if(a=="ok") {
				int keycode = Integer.valueOf(a);
			}
			else {
				System.out.println("test");
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//자신의 오류 사항을 리턴받아 확인함
			this.ep = new Exception(); 			
			throw this.ep;
		}
	}
	
	
}
	