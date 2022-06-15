import java.awt.*;
import java.awt.event.*;


import javax.swing.JOptionPane;
//외부 클래스로 awt 생성
public class awt2 {

	public static void main(String[] args) {
		
		login lg = new login();
		
	}

}
class loginok extends login{ //화면 전환 하는 자식 클래스
	public loginok() {
		this.fr.setTitle("로그인 후 페이지");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}
//abstract를 먼저 로드시켜야 관리가 용이하다.
class login {	//연습용 > 실제 extends 추상 class를 먼저 로드 하여 필드에 적용시킴
	Frame fr = new Frame();
	Font ft = new Font("돋움체",Font.BOLD,20);
	//("글자체",Font.BOLD(굵은체), 글자 크기)
	Button lg_btn = new Button("로그인");
	Button ship_btn = new Button("회원가입");
	Button close_btn = new Button("프로그램 종료");
	Label msg = new Label();
	TextField mid = new TextField();
	TextField mpw = new TextField();
	public login() {
		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		//Button close_btn = new Button("프로그램 종료");
		
		this.mid.setFont(ft);
		//글자 속성을 적용하고자 하는 오브젝트 선택
		this.mpw.setFont(ft);
		this.mpw.setEchoChar('*'); //setEchoChar ''로 구분

		this.mid.setBounds(100,60,200,40);
		this.mpw.setBounds(100,120,200,40);
		this.lg_btn.setBounds(100,180,200,40);
		this.lg_btn.setBackground(Color.pink);
		this.ship_btn.setBounds(100,240,200,40);
		this.ship_btn.setBackground(Color.blue);
		this.close_btn.setBounds(100,300,200,40);
		this.close_btn.setBackground(Color.darkGray);
//		this.msg.setText("로그인 필요");
//		this.msg.setBackground(Color.red);
		this.msg.setBounds(100,100,200,20);
		
		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(lg_btn);
		this.fr.add(ship_btn);
		this.fr.add(close_btn);
		this.clicks();
	}
	public void clicks() {//버튼에 관한 모든 핸들링 메소드 집합소
		this.ship_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); //해당 프레임 종료
				loginok ok = new loginok(); // 다음 프레임을 로드
			}
		});
		this.close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); //swing API 경고옵션 로드
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 버튼 아이디 및 패스워드 검토
				String user_id = mid.getText();
				String user_pw = mpw.getText();
				//Obect명.getText(사용자가 입력한 값을 가져올때 사용됨)
				if (user_id.equals("")) { //null사용금지 => null 또한 값이 있는 상태를 말함.
				//	msg.setText("아이디를 입력하세요");
				//	alert.showMessageDialog(null, "아이디를 입력하세요.","ERROR",JOptionPane.ERROR_MESSAGE);
				alert.showMessageDialog(null, "아이디를 입력하세요.");
				}else {		
					if(user_pw.equals("")) {
					msg.setText("패스워드를 입력하세요.");
					}else {
					msg.setText("로그인을 진행 합니다.");
					}
					//msg.setText("");
				}
			}
		});
	}
}