import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/*
	 GUI ��� : (JAVA7) AWT(abstract window ������), SWING (AWT + �׷��� �� ����)
	 CUI ��� : Scanner
	 
	 SWING : Jframe -> JPanel -> JObject
	 */
	public static void main(String[] args) {
		//awt �������
		//frame -> Panel -> Object (����)
		//Object ->Panel -> frame (����)
		//http://docs.oracle.com/javase/7/docs/api
		
		popclose pc = new popclose();
		
		Frame fr = new Frame(); //������ â
		fr.setTitle("����� �α���"); //â �̸�
		fr.setSize(500,500); //â ũ��
		fr.setVisible(true);	//��� ��/��
		fr.addWindowListener(pc); //awt �޼ҵ带 ��ӹ޾Ƽ� ó��
		Panel pa = new Panel(); //�г�
		
		
		
		
		CheckboxGroup radio = new CheckboxGroup(); //üũ�ڽ� �׷� ����
		
		TextField id = new TextField(10); //TextField 10�ڱ��� �Է�
		TextField pw = new TextField(10);
		TextField sa = new TextField("����ȣ�� �Է��ϼ���"); //�Է� �����Ͱ� �̸� ����� = HTML value���̶� ���
		Button b1 = new Button("�α���"); //Object ��ư
		Checkbox c1 = new Checkbox("�ڵ� �α���");
		
		Checkbox c2 = new Checkbox("������",false,radio);
		Checkbox c3 = new Checkbox("���Ǿ���",true,radio);
		
		
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1); //add �߰� ������Ʈ-> �г�
		fr.add(pa);	//�г� -> ������
			
		
	}

}
class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		System.gc();
	}
	
}