package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 50, 378, 33);
		contentPane.add(panel);
		
		JRadioButton rd1 = new JRadioButton("신용카드");
		rd1.setName("CARD");
		rd1.setSelected(true);
		rd1.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("계좌이체");
		rd2.setName("BANK");
		rd2.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("무통장입금");
		rd3.setName("NOBANK");
		//setName은 노출은 되지 않으며,
		//Background에서 해당 속성에 값을 적용하는 것을 말합니다.
		rd3.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup();
		//radio 사용시 ButtonGroup을 이용하시길 바랍니다.
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		JButton btn = new JButton("\uACB0\uC81C\uC9C4\uD589");
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(169, 93, 104, 23);
		contentPane.add(btn);
		
		JPanel mu = new JPanel();
		mu.setFont(new Font("돋움체", Font.PLAIN, 12));
		mu.setVisible(false);
		mu.setToolTipText("test");
		mu.setBounds(28, 142, 378, 91);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("무통장입금"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("돋움체", Font.PLAIN, 12));
		textField.setBounds(10, 21, 96, 21);
		mu.add(textField);
		textField.setColumns(10);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String pay = "";
				
				if(rd1.isSelected()==true) {//신용카드
					pay = rd1.getName();
					System.out.println("신용카드 선택");
					mu.setVisible(false);
				}else if(rd2.isSelected()==true) {//계좌이체
					pay = rd2.getName();
					System.out.println("계좌이체 선택");
					mu.setVisible(false);
				} else {//무통장
					pay = rd3.getName();
					mu.setVisible(true);
				}
			
				
			}
		});
	}
}
