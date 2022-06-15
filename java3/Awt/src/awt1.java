import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/*
	 GUI 모드 : (JAVA7) AWT(abstract window 도구툴), SWING (AWT + 그래픽 더 좋음)
	 CUI 모드 : Scanner
	 
	 SWING : Jframe -> JPanel -> JObject
	 */
	public static void main(String[] args) {
		//awt 생성방식
		//frame -> Panel -> Object (생성)
		//Object ->Panel -> frame (적용)
		//http://docs.oracle.com/javase/7/docs/api
		
		popclose pc = new popclose();
		
		Frame fr = new Frame(); //프레임 창
		fr.setTitle("사용자 로그인"); //창 이름
		fr.setSize(500,500); //창 크기
		fr.setVisible(true);	//사용 유/무
		fr.addWindowListener(pc); //awt 메소드를 상속받아서 처리
		Panel pa = new Panel(); //패널
		
		
		
		
		CheckboxGroup radio = new CheckboxGroup(); //체크박스 그룹 설정
		
		TextField id = new TextField(10); //TextField 10자까지 입력
		TextField pw = new TextField(10);
		TextField sa = new TextField("사용번호를 입력하세요"); //입력 데이터가 미리 적용됨 = HTML value값이랑 비슷
		Button b1 = new Button("로그인"); //Object 버튼
		Checkbox c1 = new Checkbox("자동 로그인");
		
		Checkbox c2 = new Checkbox("동의함",false,radio);
		Checkbox c3 = new Checkbox("동의안함",true,radio);
		
		
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1); //add 추가 오브젝트-> 패널
		fr.add(pa);	//패널 -> 프레일
			
		
	}

}
class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		System.gc();
	}
	
}