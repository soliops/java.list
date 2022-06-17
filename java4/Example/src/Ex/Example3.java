package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * 숙제
		 응용문제
		 가입된 회원 정보 중 현재 데이터에서 포인트가 적은 순서대로 
		 사용자 이름을 정렬하여 출력합니다.
		 
		 결과
		 [정재성,한울,서한솔,강은형,김도형,서한결,홍길동,김실,이선영,차은우,정재혁]
		 방법은 프리
		 */
		/*
		 응용문제 가입한 모든 회원의 포인트 총합을 구하시오.
		 단, abstract를 무조건 사용해야 합니다.
		 결과 : "회원 전체의 포인트 합계는 : 34390 입니다."
		 */
		userDBs db = new userDBs();
		db.setter();
		System.out.println(db.getter());
		userpoint up = new userpoint();
		up.setter();
		System.out.println("회원 전체의 포인트 합계는 : "+up.getter()+" 입니다.");
		
	}

}
abstract class point_abs{
//	String[][] userDB;
	String userlist[][]=null;
	public abstract void setter();
	public abstract int getter();
	public abstract void DBs();
}
class userpoint extends point_abs{
	int ea=0;
	int total=0;
	ArrayList<String[]> user = null;
	@Override
	public void setter() {
		this.DBs();
		this.ea = this.userlist.length;
		this.user = new ArrayList<String[]>(Arrays.asList(this.userlist));
		int w= 0;
		do {
			this.total+= Integer.parseInt(this.user.get(w)[6]);
//			System.out.println(this.user.get(w)[6]);
			
			w++;
		}while(w<this.user.size());
		
	}
	@Override
	public int getter() {
		return this.total;
	}
	@Override
	public void DBs() {
		this.userlist = new String[][] {
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

	}
	
}
// 숙제 하던거

class userDBs{
	int uea=0;
	String userlist1[][]=null;
	String msg;
	ArrayList<String[]> user1 = null;
	public void setter() {
	data();
		String udata[][] = new String[uea][uea];
		this.user1 = new ArrayList<String[]>(Arrays.asList(this.userlist1));
		int w= 0;
		int ct=0;
		do {
			//Integer.valueOf
			udata[0][ct]=(this.user1.get(w)[0]);
			udata[1][ct]=(this.user1.get(w)[6]);
			ct++;
			w++;
		}while(w<this.user1.size());
		
		ArrayList<String> ars = new ArrayList<String>(Arrays.asList(udata[0]));
		ArrayList<String> ars1 = new ArrayList<String>(Arrays.asList(udata[1]));
		int w11=0;
		int ea11=ars.size();
		do {
//			if(ars.get(w11))
			w11++;
		}while(w11<ea11);
		Collections.sort(ars1);
//		System.out.println(Arrays.toString(udata));
		
			
	
	msg=""+ars;
	}
	public String getter() {
		return this.msg;		
	}
	public void data() {
		this.userlist1 = new String[][] {
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
		this.uea = this.userlist1.length;
		
	}
}

