package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		/*
		  회원정보 DB가 있는 상황입니다.
		  해당 정보 중에서 naver.com 메일 주소를 사용하는 고객 인원수를
		  출력하시오. 단, DB를 로드시 추상 클래스에서 로드가 되도록 합니다.
		  ["이름","통신사","전화번호","나이","주소","이메일","포인트"]
		 */
	
		datalist db = new datalist();
		db.setter("naver.com");
		int total = db.getter();
		System.out.println("네이버 가입자는 총 "+total+" 명 입니다.");
	}

}
abstract class userdblist{
	String[][] userDB;
	ArrayList<String> userdata= null;
	public abstract void setter(String email);
	public abstract int getter();
	public abstract void DB();
	
}


class datalist extends userdblist{
	int ea=0;
	int total =0;
	String msg;
	@Override
	public void setter(String email) {
		DB();
		int w= 0;
		int count =0;
		do {
			//원시 형태의 배열사항으로 카운팅을 하게됨. indexOf -1(없음) -1외 모든 정수는 카운팅 X
//			if(this.userDB[w][5].indexOf(email) != -1) {
//				this.total+=1;
//			};
			/*ArrayList로 생성시 메모리 할당 오버되는 상황이 발생할 수 있음*/
				this.userdata = new ArrayList<>(Arrays.asList(userDB[w][5]));
				System.out.println(this.userdata); 
				//이메일주소들만
				if(this.userdata.get(0).indexOf(email)!=-1) {
//					정상적인 방법은 아니다.get(0)을 해야 문자로부터 데이터 얻는다.
				this.total+=1;
				}
			w++;
		}while(w<this.ea);
		
}
	@Override
	public int getter() {
		return this.total;
	}
	@Override
	public void DB() {
		this.userDB = new String [][]{
				 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
				 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
				 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
				 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
				 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
				 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
				 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
				 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
				 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
				 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
				 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
		};
		this.ea = this.userDB.length;
	
	}
}