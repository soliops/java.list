package Java_test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class test3 extends JFrame {
	JButton closebtn = new JButton("종료");
	private JPanel contentPane;
	private JTextField adult;
	private JTextField kids;
	private JTextField date;
	JProgressBar progress = null;
	JLabel lb = null;
	JButton btn =null;
	JLabel lbs = null;
	JLabel lbs2 = null;
	JPanel panel4 = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		closebtn.setBounds(463, 432, 93, 23);
		contentPane.add(closebtn);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(Color.BLACK));
		panel1.setBounds(44, 30, 451, 82);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JRadioButton radio1 = new JRadioButton("남양주");
		radio1.setBounds(21, 42, 115, 23);
		panel1.add(radio1);
		
		JRadioButton radio2 = new JRadioButton("충북음성");
		radio2.setBounds(163, 42, 115, 23);
		panel1.add(radio2);
		
		JRadioButton radio3 = new JRadioButton("춘천");
		radio3.setBounds(307, 42, 115, 23);
		panel1.add(radio3);
		closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					System.exit(0);
			}
		});
		ButtonGroup gp = new ButtonGroup();
		gp.add(radio1);
		gp.add(radio2);
		gp.add(radio3);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uCEA0\uD551 \uC7A5\uC18C\uB97C \uC785\uB825\uD558\uC138\uC694");
		lblNewLabel_2_1.setBounds(21, 5, 140, 31);
		panel1.add(lblNewLabel_2_1);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel2.setBounds(39, 122, 456, 69);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		adult = new JTextField();
		adult.setColumns(10);
		adult.setBounds(66, 41, 96, 21);
		panel2.add(adult);
		//성인은 1인당 10000 청소년은 1인당 5000
		kids = new JTextField();
		kids.setColumns(10);
		kids.setBounds(337, 41, 96, 21);
		panel2.add(kids);
		
		JLabel lblNewLabel = new JLabel("\uC131\uC778 :");
		lblNewLabel.setBounds(22, 41, 34, 21);
		panel2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCCAD\uC18C\uB144(\uB9CC 18\uC138 \uC774\uC0C1) : ");
		lblNewLabel_1.setBounds(204, 41, 136, 21);
		panel2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC778\uC6D0 \uC218\uB97C \uC785\uB825\uD558\uC138\uC694");
		lblNewLabel_2.setBounds(22, 0, 140, 31);
		panel2.add(lblNewLabel_2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel3.setBounds(39, 201, 456, 82);
		contentPane.add(panel3);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uCEA0\uD551 \uB0A0\uC9DC \uC785\uB825");
		lblNewLabel_2_2.setBounds(23, 10, 140, 20);
		panel3.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("*\uC608\uC2DC) 2022-06-24");
		lblNewLabel_2_2_1.setBounds(238, 43, 140, 20);
		panel3.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("\uCEA0\uD551\uC77C\uC790 : ");
		lblNewLabel_2_2_1_1.setBounds(33, 43, 66, 20);
		panel3.add(lblNewLabel_2_2_1_1);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(96, 43, 107, 21);
		panel3.add(date);
//  yyyy-mm-dd 총 10자가 나와야함
		String dt = "";
		
		for(int f = 0; f<date.getText().length();f++) {
		
		} 
		dt += "";   

		this.panel4 = new JPanel();
		this.panel4.setVisible(false);
		this.panel4.setLayout(null);
		this.panel4.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panel4.setBounds(44, 335, 456, 87);
		contentPane.add(this.panel4);
		
		this.lbs2 = new JLabel("\uD655\uC778 \uBC0F \uC785\uAE08\uD558\uC2E4 \uAE08\uC561");
		this.lbs2.setVisible(false);
		this.lbs2.setBounds(10, 10, 140, 24);
		panel4.add(this.lbs2);
		
		JLabel lbdate = new JLabel("");
		lbdate.setBounds(20, 33, 376, 24);
		panel4.add(lbdate);
		String finaldate="일자 및 장소 : "+date.getText()+" "+radio3.getText()+"성인: "+adult.getText() + " 청소년: "+kids.getText();
		lbdate.setText(finaldate);
		JLabel lbmoney = new JLabel("");
		lbmoney.setBounds(20, 53, 376, 24);
		panel4.add(lbmoney);
		int amoney = 10000;
		int kmoney = 5000;
		String finalmoney ="총 입금하실 금액 : "+ Integer.parseInt(adult.getText().toString())*amoney+Integer.parseInt(kids.getText().toString())*kmoney+" 원 입니다.";
		lbmoney.setText(finalmoney);
		JLabel lblNewLabel_2_1_1 = new JLabel("\uCEA0\uD551\uC7A5 \uC608\uC57D \uC2DC\uC2A4\uD15C");
		lblNewLabel_2_1_1.setBounds(23, 10, 140, 23);
		contentPane.add(lblNewLabel_2_1_1);
		
		this.btn = new JButton("예약하기");
		this.btn.setBounds(387, 293, 93, 23);
		contentPane.add(this.btn);
		
		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setBounds(49, 293, 247, 23);
		contentPane.add(this.progress);
		
		JLabel lb = new JLabel("");
		lb.setBounds(141, 297, 50, 15);
		contentPane.add(lb);
		
		this.lbs = new JLabel("");
		this.lbs.setBounds(44, 318, 228, 15);
		contentPane.add(this.lbs);
	
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				start();
			}
		});
		adult.setText("0");
		kids.setText("0");
	}
	public void start() {
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			JLabel lbs = test3.this.lbs;
			JLabel lbs2 =test3.this.lbs2;
			JPanel jp = test3.this.panel4;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int w = 0;
				
				try {
					do {
//				System.out.println(w);
						progress.setValue(w);
						Thread.sleep(600);
						lbs.setText("잠시만 기다려주세요");
						
						w++;
					}while(w<=100);
				} catch (Exception f) {
					System.out.println("예약 중단");
				}
				if(progress.getValue()==100) {
					this.lbs2.setVisible(true);
					this.jp.setVisible(true);
				}
			}
		};
		t.schedule(task, 1000);
	}
}
