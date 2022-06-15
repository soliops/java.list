import App.App1;   //다른 package를 로드시 import하며 사용함
//package에서 APP1.java 파일 로드 및 기본 파일을 로드 하여 사용합니다. 
public class Method11 {

	public static void main(String[] args) {
		App1 b = new App1(); // main 메소드를 로드 하게 됩니다.
//		System.out.println(b);
//		b.main(args);
		b.abox(); //main 메소드 안에서 abox라는 메소드를 로드 하는 부분
	}

}
