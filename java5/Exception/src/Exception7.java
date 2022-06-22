import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

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
		
		try {
		redata r = new redata();
		Object data[] = {"ȫ�浿",55,"������","������",48,"�̼���","����",35,88};
		r.setter(data);
		LinkedList result = r.getter();
	//���Ϲ޴� ���� �迭 class�̹Ƿ� �ش� class������ ���� �� �޾ƾ� �˴ϴ�.
		System.out.println(result);
		}
		catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a.getMessage());
			}
		}
		
	}

}
class redata{
	LinkedList<String> redata = new LinkedList<>();
	public void setter(Object call[]) throws Exception {
		int ea = call.length;
		int w=0;
//		int check = Integer.valueOf((int)call[0]);
//		int check = (int)call[0];
//		String check = (String)(call[0]);

		do {
			try {
//�ش� �迭�� �ε�� (�ڷ���) ��ȯ�� �ϴ� ������ Object�迭 �̹Ƿ� �����Ͽ����ϴ�.
			String check = String.valueOf((String)call[w]);
//			System.out.println(check);
			this.redata.add(check);
			}
			catch(Exception ex){		
				/*�ڽ� class���� ���� �߻��� ��µǴ� catch��
				��, thorw ����ϸ� �ٽ� main���� ���޵˴ϴ�.
				�߿��� ������ throw�� ���޽� �ش� �ݺ����� �����ϰ� �˴ϴ�.*/
//				System.out.println(ex);
			}
			w++;
		}while(w<ea);
//		System.out.println(this.redata);
	}

	public LinkedList<String> getter() { 
		//�迭 clsass �̸����� getter�� ���� �� �ֽ��ϴ�.
			
		return this.redata;
	}
}