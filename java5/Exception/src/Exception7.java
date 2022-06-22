import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*
		 응용문제 
		 데이터 파일
		 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",35,88};
		 해당 데이터 값 중 문자값만 출력 되도록 재 배열 하시길 바랍니다.
		 단, 메인에서는 해당 배열을 외부 클래스 (setter)로 전송합니다.
		 해당 setter에서는 배열값을 확인하여 이름만 재배열로 생성합니다.
		 getter에서 해당 배열을 return으로 보내도록 합니다.
		 단, 외부 클래스에서 숫자만 있는 배열을 모두 예외처리 되도록 합니다.
		 */
		
		try {
		redata r = new redata();
		Object data[] = {"홍길동",55,"유관순","강감찬",48,"이순신","세종",35,88};
		r.setter(data);
		LinkedList result = r.getter();
	//리턴받는 값이 배열 class이므로 해당 class명으로 선언 후 받아야 됩니다.
		System.out.println(result);
		}
		catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());
			}
		}
		
	}

}
class redata{
	LinkedList<String> redata = new LinkedList<>();
	public void setter(Object call[]) throws Exception {
		int ea = call.length;
		int w=0;
//		int check = Integer.valueOf((int)call[0]);
//		int check = (int)call[0];
//		String check = (String)(call[0]);

		do {
			try {
//해당 배열을 로드시 (자료형) 변환을 하는 이유는 Object배열 이므로 선언하였습니다.
			String check = String.valueOf((String)call[w]);
//			System.out.println(check);
			this.redata.add(check);
			}
			catch(Exception ex){		
				/*자신 class에서 문제 발생시 출력되는 catch문
				단, thorw 사용하면 다시 main으로 전달됩니다.
				중요한 사항은 throw로 전달시 해당 반복문은 종료하게 됩니다.*/
//				System.out.println(ex);
			}
			w++;
		}while(w<ea);
//		System.out.println(this.redata);
	}

	public LinkedList<String> getter() { 
		//배열 clsass 이름으로 getter를 만들 수 있습니다.
			
		return this.redata;
	}
}