import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public abstract class awt6a_abstract {
	static String pc ="";
	//setter
	public abstract void setter(String userno);
	//getter
	public abstract String getter();
	Frame fr = new Frame();
	Button bt = null;
	Button bt2 = null;
	Button close = null;
	TextField mid=null;
//	String fm[]= {"bt","bt2","close","mid"};
	Label msg = new Label();
	
	public void design() {
		this.fr.setBounds(200,200,350,180);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.bt = new Button("인증번호발송");
		this.bt2 = new Button("인증확인");
		this.close = new Button("X");
		this.mid = new TextField();
		this.bt.setBounds(10,30,100,25);
		this.bt2.setBounds(170,80,100,25);
		this.close.setBounds(300,30,30,25);
		this.mid.setBounds(10,80,140,25);
		this.msg.setBounds(10,130,250,25);
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.fr.add(bt);
		this.fr.add(bt2);
		this.fr.add(close);
		this.fr.add(mid);
		this.fr.add(msg);
		this.click();

	}
		public void click() {
			this.close.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			//인증번호 발송
			this.bt.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				Random ra =new Random();
				pc ="";
				for(int f=1; f<=4;f++) {
					pc += String.valueOf(ra.nextInt(10));
				}
				}
			});
			//인증확인
			this.bt2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(awt6a_abstract.this.mid.getText().equals("")) {
						awt6a_abstract.this.msg.setText("인증번호를 입력해 주시길 바랍니다.");
					}
					else {
						setter(awt6a_abstract.this.mid.getText());
					}
					
					awt6a_abstract.this.msg.setText(getter());
				}
			});
		}
}
