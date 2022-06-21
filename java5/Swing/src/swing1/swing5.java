package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		/*Frame�� absolute ���·� layer�� �����մϴ�.*/ 
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextField mid = new JTextField();
		JLabel msg = new JLabel("");
		/*�ڵ鸵 class�� ������Ʈ���� �����ڵ忡 ������ �ش� ������Ʈ�� �ε����� ���մϴ�.*/
		JButton btnNewButton = new JButton("\uC544\uC774\uB514 \uCCB4\uD06C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}
				else {
					int lg = mid.getText().length(); //�Է� ���� ������ Ȯ��
					if(lg<5) {
						msg.setText("���̵�� 5�� �̻� ��� �����մϴ�.");
					}
					else {
						msg.setText("���̵� ���� ���Դϴ�...");
					}
				}
				
			}
		});
		
		btnNewButton.setForeground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.white);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(169, 64, 93, 23);
		contentPane.add(btnNewButton);
		
		
		mid.setBounds(147, 24, 140, 30);
		contentPane.add(mid);
		
		
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(55, 161, 314, 23);
		contentPane.add(msg);
	}
}
