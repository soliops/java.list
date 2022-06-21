package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing10 extends JFrame {
	public String list[] = {"SKT","KT","LGT","알뜰폰"};
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("돋움체", Font.PLAIN, 12));
		cb.setBounds(22, 34, 138, 23);
		contentPane.add(cb);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(22, 77, 406, 16);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//				System.out.println(cb.getSelectedIndex());
				int v = cb.getSelectedIndex(); 
				//배열 index 형태로 로드 단, 필드에 배열이 선언 되어야 함.
//				String data = String.valueOf(cb.getSelectedItem());
//				String data = cb.getSelectedItem().toString();
//				String data = String.valueOf(e.getItem());
//				String data = e.getItem().toString();
			 
				msg.setText(swing10.this.list[v]);
			}
		});
	}
}
