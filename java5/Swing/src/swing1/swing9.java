package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
//JEditorPane 은 게시판 내용 출력 또는 입력 등 사용이 되며,
//하이브리드 웹앱에서는 HTML을 로드 하여 출력 할 수도 있습니다.
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("하이브리드 웹앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(10, 10, 768, 745);
		contentPane.add(webpage);
		webpage.setContentType("text/html"); 
		//ContentType : 문자도 사용 그리고 HTML 코드도 사용
		webpage.setText("<h1>APINK 2022!!</h1>"
				+"<a href='https://m.cafe.daum.net.apink/_rec' target='_blink'><img src = 'https://dimg.donga.com/wps/NEWS/IMAGE/2022/01/31/111516832.2.jpg'>"
				+"<br><font color = 'orange'>APINK FOR~~~~"
				+"<br><input type = 'text' id = 'name'>"
				+"<br><input type = 'button' value = '로그인'>"
				+"<br><input type = 'checkbox'>동의함"
			);		
	}
}
