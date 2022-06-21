import java.util.ArrayList;
import java.util.Arrays;

public class Exception6_a {

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
		Datas db = new Datas();
		String data[] = {"홍길동","55","유관순","강감찬","48","이순신","세종","35","88"};
		try {
			db.setter(data);
			System.out.println(Arrays.toString(db.getter()));
		}catch(Exception e){
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		finally {
			try {
				db.setter(data);
			System.out.println(Arrays.toString(db.getter()));
			}
			catch(Exception x) {
				System.exit(0);
			}
		}
	}

}
class Datas{
	ArrayList<String> list = null;
	ArrayList<String> num = null;	
	String[] name = null;
	int modify;
	String msg[];
	public void setter(String[] data1) throws Exception {
		//배열을 받아서 이름만 재배열로 생성
		//숫자는 자체 예외처리
		this.list  = new ArrayList<>(Arrays.asList(data1));
		 this.num = new ArrayList<>();
		 int w = this.list.size()-1;
		 int ct = 0;
//		System.out.println(list);

		do {
			this.modify= Integer.parseInt(data1[w]);
			if(this.modify%2!=0||this.modify!=1) {
				this.num.add(ct,data1[w]);
			}else {
				this.list.remove(data1[w]);
			}
			ct++;
			w--;
		}while(w>=0);
		 
		int ww= 0;
		this.name = new String[this.list.size()];
//		System.out.println(list);
//		System.out.println(this.list.size());
		
		do {
			this.name[ww]=this.list.get(ww);
			ww++;
		}while(ww<this.list.size());
//		System.out.println(Arrays.toString(this.name)); 
		this.getter();
		throw new Exception();
			 
		 
	}
	public String[] getter() {

		return this.name;
	}
}