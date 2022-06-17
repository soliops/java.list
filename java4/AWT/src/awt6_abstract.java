//awt6.java �����۾�
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public abstract class awt6_abstract {
	public abstract String numok();
	public abstract void numcheck(int number);
	public abstract void datalist(int numpc);
	
	Frame fr = new Frame();
	Button numbtn = null;
	Button btn = null;
	Button closebtn = null;
	TextField usernum=null;
	Label msg = new Label();
	
	public void design(){
		this.fr.setBounds(200,200,350,180);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.numbtn = new Button("������ȣ�߼�");
		this.btn = new Button("����Ȯ��");
		this.closebtn = new Button("X");
		this.usernum = new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.numbtn.setBounds(20,50,100,25);
		this.btn.setBounds(180,85,100,25);
		this.closebtn.setBounds(250,50,30,25);
		this.usernum.setBounds(20,85,140,25);
		this.msg.setBounds(20,120,250,25);
		this.fr.add(msg);
		this.fr.add(numbtn);
		this.fr.add(btn);
		this.fr.add(closebtn);
		this.fr.add(usernum);
		this.click();
		
	}
	public void click() {
		this.numbtn.addActionListener(new ActionListener() {
			//������ȣ �߼�
			@Override
			public void actionPerformed(ActionEvent e) {
				String pc_num="";
				int w = 1;
				do {
					int random = (int)(Math.random()*10);
					pc_num +=random;
					w++;
				}while(w<=4);
				System.out.println(pc_num);
				datalist(Integer.valueOf(pc_num));
			}
		});
		this.btn.addActionListener(new ActionListener() {
			//����Ȯ�� ��ư
			@Override
			public void actionPerformed(ActionEvent e) {
//				int user_num = Integer.valueOf(awt6_abstract.this.usernum.getText());
					String user_num=awt6_abstract.this.usernum.getText();
						
						if(user_num.equals("")) {
							msg.setText("������ȣ 4�ڸ��� �Է��ϼ���.");
						}else {
							try {
							int user_num2 =Integer.parseInt(usernum.getText());
							//�Է��� �� �������� �ľ�
							numcheck(user_num2);//���ڸ� �ѱ�
							String result =numok();
							if(result==null) {
								msg.setText("������ȣ�� �ٽ� Ȯ�� �Ͻñ� �ٶ��ϴ�.");
							}else {
								msg.setText("������ �Ϸ�Ǿ����ϴ�.");
							}
							} catch (Exception e2) {
								msg.setText("���ڸ� �Է����ּ���.");
							}
						}
				
			}
		});
		this.closebtn.addActionListener(new ActionListener() {
			//���� ��ư
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
}
