import java.util.ArrayList;
import java.util.Arrays;

public class Exception6_a {

	public static void main(String[] args) {
		/*
		 ���빮�� 
		 ������ ����
		 {"ȫ�浿",55,"������","������",48,"�̼���","����",35,88};
		 �ش� ������ �� �� ���ڰ��� ��� �ǵ��� �� �迭 �Ͻñ� �ٶ��ϴ�.
		 ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter)�� �����մϴ�.
		 �ش� setter������ �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�.
		 getter���� �ش� �迭�� return���� �������� �մϴ�.
		 ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */
		Datas db = new Datas();
		String data[] = {"ȫ�浿","55","������","������","48","�̼���","����","35","88"};
		try {
			db.setter(data);
			System.out.println(Arrays.toString(db.getter()));
		}catch(Exception e){
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		finally {
			try {
				db.setter(data);
			System.out.println(Arrays.toString(db.getter()));
			}
			catch(Exception x) {
				System.exit(0);
			}
		}
	}

}
class Datas{
	ArrayList<String> list = null;
	ArrayList<String> num = null;	
	String[] name = null;
	int modify;
	String msg[];
	public void setter(String[] data1) throws Exception {
		//�迭�� �޾Ƽ� �̸��� ��迭�� ����
		//���ڴ� ��ü ����ó��
		this.list  = new ArrayList<>(Arrays.asList(data1));
		 this.num = new ArrayList<>();
		 int w = this.list.size()-1;
		 int ct = 0;
//		System.out.println(list);

		do {
			this.modify= Integer.parseInt(data1[w]);
			if(this.modify%2!=0||this.modify!=1) {
				this.num.add(ct,data1[w]);
			}else {
				this.list.remove(data1[w]);
			}
			ct++;
			w--;
		}while(w>=0);
		 
		int ww= 0;
		this.name = new String[this.list.size()];
//		System.out.println(list);
//		System.out.println(this.list.size());
		
		do {
			this.name[ww]=this.list.get(ww);
			ww++;
		}while(ww<this.list.size());
//		System.out.println(Arrays.toString(this.name)); 
		this.getter();
		throw new Exception();
			 
		 
	}
	public String[] getter() {

		return this.name;
	}
}