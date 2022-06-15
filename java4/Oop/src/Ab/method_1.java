package Ab;

import java.lang.reflect.Member;

//method_1a.java
public class method_1 extends ide_mth1{
	//package Ab2에서 import할 수 있도록 하며, 외부 클래스도 동일하게 모두 가져오게함

	public void recall() {
		//public이 없으면 호출이 불가능하다.
		System.out.println("test");
	}
	protected static void name (){
		//proteded static을 쓰고 상속을 해야 호출된다.
		System.out.println("홍길동");
	}
	public static void main(String[] args) {
		/*Arrays.sort : 배열 오름차순 정렬 (숫자,한글,영문)
		 단, 영문일 경우 대문자가 제일 먼저 오름차순으로 정렬 됩니다.
		 APPLE.... apple....
		 */
		/*
		int number_data[]= {5,7,1,4,9,2};
		Arrays.sort(number_data); //오름차순
		System.out.println(Arrays.toString(number_data));
		*/
		/*
		String user_data[]= {"홍길동","이순신","장보고","김유신"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data));
		*/
		String a="park";
		int b=2000;
		ide_mth1 ide = new ide_mth1();
		ide.setter(a,b);
		System.out.println(ide.getter());
//		String c = "감소";
		/*
		 변수를 2개 생성해서 하나는 문자, 숫자
		 현재 가입한 사용자에 아이디를 확인 후 해당 포인트가 적립 되도록 합니다.
		 단, 기존 포인트 + 적립급 포인트 에 대한 결과를 출력하셔야 합니다.
		 출력은 메인 클래스에서 합니다.
		 
		 배열 데이터 : 
			String member_ship[][]={
				{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
				{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
			};
		 */
		
	}

}
class ide_mth1 extends mth1{
	private String member_ship[][];
	private String data1;
	private int data2;
	private int ea;
	private int total=0;
	private String msg;
	public ide_mth1(){ 
		this.member_ship= new String[][]{
			{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		};
		this.ea=this.member_ship[0].length;
	}
	@Override
	public void setter(String data1, int data2) {
		this.data1=data1;
		this.data2=data2;
//		if(this.data3.equals("증감")){
//			this.loops();
//		}else{
//			this.loops2();
//		};
		this.loops(this.data1,this.data2,this.ea);
	};
	public void loops (String a, int b,int c) {
		//static이면 this 못씀, 쓸거면 this를 배제한 작업할때
		int w = 0;
		do {
			if(this.member_ship[0][w].equals(a)) {
				this.total= Integer.parseInt(this.member_ship[1][w])+data2;
			}
			w++;
		}while(w<c);
		this.msg="증감";
	}
	@Override
	public void setter(int data3[]) {
	};
	@Override
	public String getter() {
		String print = this.data1 + "님의 포인트가 "+this.total+" "+this.msg+" 되었습니다.";
		return print;
	}
	
}