package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
//JEditorPane �� �Խ��� ���� ��� �Ǵ� �Է� �� ����� �Ǹ�,
//���̺긮�� ���ۿ����� HTML�� �ε� �Ͽ� ��� �� ���� �ֽ��ϴ�.
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
		setTitle("���̺긮�� ����");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(10, 10, 768, 745);
		contentPane.add(webpage);
		webpage.setContentType("text/html"); 
		//ContentType : ���ڵ� ��� �׸��� HTML �ڵ嵵 ���
		webpage.setText("<h1>APINK 2022!!</h1>"
				+"<a href='https://m.cafe.daum.net.apink/_rec' target='_blink'><img src = 'https://dimg.donga.com/wps/NEWS/IMAGE/2022/01/31/111516832.2.jpg'>"
				+"<br><font color = 'orange'>APINK FOR~~~~"
				+"<br><input type = 'text' id = 'name'>"
				+"<br><input type = 'button' value = '�α���'>"
				+"<br><input type = 'checkbox'>������"
			);		
	}
}
