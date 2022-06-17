import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		//점점 메인에 쓸 건 줄어드는게 베스트다
		//메인에 많이 올리면 무거워진다.
		/*
		 배열 데이터 : {"홍길동","이순신","유관순"}; 세 개의 데이터가 있습니다.
		 메인 class에서 문자를 하나 전송합니다. 
		 단, 문자가 null로 보낼 수 있으며, 배열 데이터와 관계 없는 "강감찬"이라고
		 보낼 수도 있습니다. 
		 외부 클래스 명은 : data_list 이며
		 추상 클래스 명은 : v_construct 입니다.
		 외부 클래스 안에 내부 클래스 명은 : check 입니다.
		 
		 결과 형태
		 메인 class에서 강감찬을 적용할 경우
		 내부 클래스에서 "해당 사용자는 가입자가 아닙니다."라고 출력
		 메인 class에서 이순신을 적용할 경우
		 내부 클래스에서 "해당 사용자가 있습니다."라고 출력
		 단, ArrayList로 배열을 로드 하십시오.
		 */
		data_list da = new data_list();
		da.adata(null);
//		data_list.check ch = da.new check();
//		ch.check_data();
		
		data_list1 da1 = new data_list1();
		da1.userinput("이순신");
		
	}

}
abstract class v_construct{
	public String array_data[] = {"홍길동","이순신","유관순"};
	public String name;
	public abstract void adata(String name);
}
class data_list extends v_construct{
	@Override
	public void adata (String name) {
		this.name=name;
		check c1 = new check();
		c1.check_data();
		
	}
	class check{
		String ch_user = data_list.this.name;
		String msg;
		
		public void check_data() {
		ArrayList<String> ar = new ArrayList<>(Arrays.asList(data_list.this.array_data));
		int w=0;
		int ea = ar.size();
		do {
			if(ch_user==null){
				msg= "사용자를 입력해주세요";
			}
			else if(ar.get(w).equals(ch_user)) {
				msg="해당 사용자가 있습니다.";
				break;
			}else{
				msg="해당 사용자는 가입자가 아닙니다.";
			}
			w++;
		}while(w<ea);
		System.out.println(msg);
		}
	
	}
}

/*다른 버전*/
abstract class v_construct1{
	String user_name;
//	String data_list1[];
	public abstract void userinput(String nm);
}
class data_list1 extends v_construct1{
	@Override
	public void userinput(String nm) {
		if(nm==null) {
			System.out.println("사용자 이름을 입력해주세요.");
		}
		else {
			this.user_name=nm;
			check1 ck = new check1();
			ck.db();
		}
	}
	class check1{ //부모 클래스에서 받은 값을 자식 클래스로 이관
		String user_name = data_list1.this.user_name;
		String data_list[]; 
	//필드에 배열을 갇는 객체 생성 (new를 안 해서 인스턴스에 올린거 아니다!)
//		ArrayList<String> ar2 = new ArrayList<>(Arrays.asList(this.data_list));
		ArrayList<String> ar2= null;
		//ArrayList util을 필드에 객체 생성
		public void db() {
			//해당 필드에 있는 ArryaList를 인스턴스로 적용
			this.data_list = new String[] {"홍길동","이순신","유관순"};
			this.ar2 = new ArrayList<>(Arrays.asList(this.data_list));
			//this로 처리
			this.compare();
			//최종 DB와 사용자 정보를 비교하는 메소드
		}
		public void compare() {
			int ea =this.ar2.size();
			int w=0;
			boolean b1 =false; //결과 확인 작업
			do {
				if(this.user_name.equals(this.ar2.get(w))) {
						b1=true;
				}
				w++;
			}while(w<ea);
			if(b1==true) {				
				System.out.println("해당 사용자가 있습니다.");
			}else {
			System.out.println("해당 사용자는 가입자가 아닙니다.");
			}
		}
	}
}




