import java.awt.*;
import java.awt.event.*;


import javax.swing.JOptionPane;
//�ܺ� Ŭ������ awt ����
public class awt2 {

	public static void main(String[] args) {
		
		login lg = new login();
		
	}

}
class loginok extends login{ //ȭ�� ��ȯ �ϴ� �ڽ� Ŭ����
	public loginok() {
		this.fr.setTitle("�α��� �� ������");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}
//abstract�� ���� �ε���Ѿ� ������ �����ϴ�.
class login {	//������ > ���� extends �߻� class�� ���� �ε� �Ͽ� �ʵ忡 �����Ŵ
	Frame fr = new Frame();
	Font ft = new Font("����ü",Font.BOLD,20);
	//("����ü",Font.BOLD(����ü), ���� ũ��)
	Button lg_btn = new Button("�α���");
	Button ship_btn = new Button("ȸ������");
	Button close_btn = new Button("���α׷� ����");
	Label msg = new Label();
	TextField mid = new TextField();
	TextField mpw = new TextField();
	public login() {
		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		//Button close_btn = new Button("���α׷� ����");
		
		this.mid.setFont(ft);
		//���� �Ӽ��� �����ϰ��� �ϴ� ������Ʈ ����
		this.mpw.setFont(ft);
		this.mpw.setEchoChar('*'); //setEchoChar ''�� ����

		this.mid.setBounds(100,60,200,40);
		this.mpw.setBounds(100,120,200,40);
		this.lg_btn.setBounds(100,180,200,40);
		this.lg_btn.setBackground(Color.pink);
		this.ship_btn.setBounds(100,240,200,40);
		this.ship_btn.setBackground(Color.blue);
		this.close_btn.setBounds(100,300,200,40);
		this.close_btn.setBackground(Color.darkGray);
//		this.msg.setText("�α��� �ʿ�");
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
	public void clicks() {//��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ�
		this.ship_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); //�ش� ������ ����
				loginok ok = new loginok(); // ���� �������� �ε�
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
			JOptionPane alert = new JOptionPane(); //swing API ���ɼ� �ε�
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �α��� ��ư ���̵� �� �н����� ����
				String user_id = mid.getText();
				String user_pw = mpw.getText();
				//Obect��.getText(����ڰ� �Է��� ���� �����ö� ����)
				if (user_id.equals("")) { //null������ => null ���� ���� �ִ� ���¸� ����.
				//	msg.setText("���̵� �Է��ϼ���");
				//	alert.showMessageDialog(null, "���̵� �Է��ϼ���.","ERROR",JOptionPane.ERROR_MESSAGE);
				alert.showMessageDialog(null, "���̵� �Է��ϼ���.");
				}else {		
					if(user_pw.equals("")) {
					msg.setText("�н����带 �Է��ϼ���.");
					}else {
					msg.setText("�α����� ���� �մϴ�.");
					}
					//msg.setText("");
				}
			}
		});
	}
}