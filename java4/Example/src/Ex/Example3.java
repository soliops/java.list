package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * ����
		 ���빮��
		 ���Ե� ȸ�� ���� �� ���� �����Ϳ��� ����Ʈ�� ���� ������� 
		 ����� �̸��� �����Ͽ� ����մϴ�.
		 
		 ���
		 [���缺,�ѿ�,���Ѽ�,������,�赵��,���Ѱ�,ȫ�浿,���,�̼���,������,������]
		 ����� ����
		 */
		/*
		 ���빮�� ������ ��� ȸ���� ����Ʈ ������ ���Ͻÿ�.
		 ��, abstract�� ������ ����ؾ� �մϴ�.
		 ��� : "ȸ�� ��ü�� ����Ʈ �հ�� : 34390 �Դϴ�."
		 */
		userDBs db = new userDBs();
		db.setter();
		System.out.println(db.getter());
		userpoint up = new userpoint();
		up.setter();
		System.out.println("ȸ�� ��ü�� ����Ʈ �հ�� : "+up.getter()+" �Դϴ�.");
		
	}

}
abstract class point_abs{
//	String[][] userDB;
	String userlist[][]=null;
	public abstract void setter();
	public abstract int getter();
	public abstract void DBs();
}
class userpoint extends point_abs{
	int ea=0;
	int total=0;
	ArrayList<String[]> user = null;
	@Override
	public void setter() {
		this.DBs();
		this.ea = this.userlist.length;
		this.user = new ArrayList<String[]>(Arrays.asList(this.userlist));
		int w= 0;
		do {
			this.total+= Integer.parseInt(this.user.get(w)[6]);
//			System.out.println(this.user.get(w)[6]);
			
			w++;
		}while(w<this.user.size());
		
	}
	@Override
	public int getter() {
		return this.total;
	}
	@Override
	public void DBs() {
		this.userlist = new String[][] {
			 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
			 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
			 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
			 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
			 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
			 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
			 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
			 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
	};

	}
	
}
// ���� �ϴ���

class userDBs{
	int uea=0;
	String userlist1[][]=null;
	String msg;
	ArrayList<String[]> user1 = null;
	public void setter() {
	data();
		String udata[][] = new String[uea][uea];
		this.user1 = new ArrayList<String[]>(Arrays.asList(this.userlist1));
		int w= 0;
		int ct=0;
		do {
			//Integer.valueOf
			udata[0][ct]=(this.user1.get(w)[0]);
			udata[1][ct]=(this.user1.get(w)[6]);
			ct++;
			w++;
		}while(w<this.user1.size());
		
		ArrayList<String> ars = new ArrayList<String>(Arrays.asList(udata[0]));
		ArrayList<String> ars1 = new ArrayList<String>(Arrays.asList(udata[1]));
		int w11=0;
		int ea11=ars.size();
		do {
//			if(ars.get(w11))
			w11++;
		}while(w11<ea11);
		Collections.sort(ars1);
//		System.out.println(Arrays.toString(udata));
		
			
	
	msg=""+ars;
	}
	public String getter() {
		return this.msg;		
	}
	public void data() {
		this.userlist1 = new String[][] {
			 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
			 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
			 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
			 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
			 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
			 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
			 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
			 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
	};
		this.uea = this.userlist1.length;
		
	}
}

