import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class awt7 {
	Checkbox ck =null;
	static boolean agree;
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setBounds(200,200,350,180);
		fr.setLayout(null);
		fr.setVisible(true);
		Checkbox ck =new Checkbox("Y");
		Choice se = new Choice();
		ck.setBounds(30,40,150,30);
		se.setBounds(30,80,100,30);
		se.add("��Ż縦 ������ �ּ���.");
		se.add("skt");
		se.add("KT");
		se.add("LGT");
		se.add("�˶���");
		fr.add(ck);
		fr.add(se);
		/*addItemListener : Checkbox, Choice���� �����*/
		ck.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String checks = (String)e.getItem();
//				System.out.println(checks);
//				System.out.println(e.getStateChange());
				//1 : check 2:uncheck
				if(e.getStateChange()==1) {
					agree =true;
//					System.out.println("�����ϼ̽��ϴ�.");
					System.out.println(agree);

				}else {
					agree=false;
//					System.out.println("���Ǹ� �ϼž� �մϴ�.");
					System.out.println(agree);
				}
			}
		});
		se.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String change = (String)e.getItem();
				System.out.println(change);
			}
		});
	}

}
