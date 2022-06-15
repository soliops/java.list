import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		
		apink ap = new apink("홍길동",25,"test@gmail.com",-1000);
		System.out.println(ap.data());
		System.out.println(ap.data2());
		System.out.println(ap.data3());
//		ap.names();
		
	//	apink("홍길동",25,"test@test.com",1000);
		
		
		
		
		
	}

}
class apink{    
	//private 선언은 class 필드에서 생성해야 합니다.
	//String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
		if(this.nm=="홍길동") {
		this.nm = "hong";
		String e[] = this.email.split("@");
		//이메일 중에 이메일 회사 정보만 가져오기 위한 배열로 나누는 작업
//		System.out.println(Arrays.toString(e));
		this.email_cp = e[1];
		}
		
	}
	

	//String nm1, int age2, String email3, int point4
	public apink (String nm1, int age2, String email3, int point4) { 
		//private를 안에서 사용하지 못함.
	//setter 형태
	this.nm =nm1;
	this.email = email3;
	if(point4<0) {
		this.point = 0;
	}
	else {
		this.point=point4;
	}
	}
	public String data() {
		 
		names();
		return this.nm;  /// return은 맨 마지막에 사용하는 코드 입니다.
		//return 밑에 코드는 모두 오류가 발생하게 됩니다.
	}
	public String data2() {
		//getter 형태
		return this.email_cp;
	}
	public int data3() {
		return this.point;
	}
}