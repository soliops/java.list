import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		//���� ���ο� �� �� �پ��°� ����Ʈ��
		//���ο� ���� �ø��� ���ſ�����.
		/*
		 �迭 ������ : {"ȫ�浿","�̼���","������"}; �� ���� �����Ͱ� �ֽ��ϴ�.
		 ���� class���� ���ڸ� �ϳ� �����մϴ�. 
		 ��, ���ڰ� null�� ���� �� ������, �迭 �����Ϳ� ���� ���� "������"�̶��
		 ���� ���� �ֽ��ϴ�. 
		 �ܺ� Ŭ���� ���� : data_list �̸�
		 �߻� Ŭ���� ���� : v_construct �Դϴ�.
		 �ܺ� Ŭ���� �ȿ� ���� Ŭ���� ���� : check �Դϴ�.
		 
		 ��� ����
		 ���� class���� �������� ������ ���
		 ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�."��� ���
		 ���� class���� �̼����� ������ ���
		 ���� Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�."��� ���
		 ��, ArrayList�� �迭�� �ε� �Ͻʽÿ�.
		 */
		data_list da = new data_list();
		da.adata(null);
//		data_list.check ch = da.new check();
//		ch.check_data();
		
		data_list1 da1 = new data_list1();
		da1.userinput("�̼���");
		
	}

}
abstract class v_construct{
	public String array_data[] = {"ȫ�浿","�̼���","������"};
	public String name;
	public abstract void adata(String name);
}
class data_list extends v_construct{
	@Override
	public void adata (String name) {
		this.name=name;
		check c1 = new check();
		c1.check_data();
		
	}
	class check{
		String ch_user = data_list.this.name;
		String msg;
		
		public void check_data() {
		ArrayList<String> ar = new ArrayList<>(Arrays.asList(data_list.this.array_data));
		int w=0;
		int ea = ar.size();
		do {
			if(ch_user==null){
				msg= "����ڸ� �Է����ּ���";
			}
			else if(ar.get(w).equals(ch_user)) {
				msg="�ش� ����ڰ� �ֽ��ϴ�.";
				break;
			}else{
				msg="�ش� ����ڴ� �����ڰ� �ƴմϴ�.";
			}
			w++;
		}while(w<ea);
		System.out.println(msg);
		}
	
	}
}

/*�ٸ� ����*/
abstract class v_construct1{
	String user_name;
//	String data_list1[];
	public abstract void userinput(String nm);
}
class data_list1 extends v_construct1{
	@Override
	public void userinput(String nm) {
		if(nm==null) {
			System.out.println("����� �̸��� �Է����ּ���.");
		}
		else {
			this.user_name=nm;
			check1 ck = new check1();
			ck.db();
		}
	}
	class check1{ //�θ� Ŭ�������� ���� ���� �ڽ� Ŭ������ �̰�
		String user_name = data_list1.this.user_name;
		String data_list[]; 
	//�ʵ忡 �迭�� ���� ��ü ���� (new�� �� �ؼ� �ν��Ͻ��� �ø��� �ƴϴ�!)
//		ArrayList<String> ar2 = new ArrayList<>(Arrays.asList(this.data_list));
		ArrayList<String> ar2= null;
		//ArrayList util�� �ʵ忡 ��ü ����
		public void db() {
			//�ش� �ʵ忡 �ִ� ArryaList�� �ν��Ͻ��� ����
			this.data_list = new String[] {"ȫ�浿","�̼���","������"};
			this.ar2 = new ArrayList<>(Arrays.asList(this.data_list));
			//this�� ó��
			this.compare();
			//���� DB�� ����� ������ ���ϴ� �޼ҵ�
		}
		public void compare() {
			int ea =this.ar2.size();
			int w=0;
			boolean b1 =false; //��� Ȯ�� �۾�
			do {
				if(this.user_name.equals(this.ar2.get(w))) {
						b1=true;
				}
				w++;
			}while(w<ea);
			if(b1==true) {				
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
			}else {
			System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�.");
			}
		}
	}
}




