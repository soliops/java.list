package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		/*
		  ȸ������ DB�� �ִ� ��Ȳ�Դϴ�.
		  �ش� ���� �߿��� naver.com ���� �ּҸ� ����ϴ� �� �ο�����
		  ����Ͻÿ�. ��, DB�� �ε�� �߻� Ŭ�������� �ε尡 �ǵ��� �մϴ�.
		  ["�̸�","��Ż�","��ȭ��ȣ","����","�ּ�","�̸���","����Ʈ"]
		 */
	
		datalist db = new datalist();
		db.setter("naver.com");
		int total = db.getter();
		System.out.println("���̹� �����ڴ� �� "+total+" �� �Դϴ�.");
	}

}
abstract class userdblist{
	String[][] userDB;
	ArrayList<String> userdata= null;
	public abstract void setter(String email);
	public abstract int getter();
	public abstract void DB();
	
}


class datalist extends userdblist{
	int ea=0;
	int total =0;
	String msg;
	@Override
	public void setter(String email) {
		DB();
		int w= 0;
		int count =0;
		do {
			//���� ������ �迭�������� ī������ �ϰԵ�. indexOf -1(����) -1�� ��� ������ ī���� X
//			if(this.userDB[w][5].indexOf(email) != -1) {
//				this.total+=1;
//			};
			/*ArrayList�� ������ �޸� �Ҵ� �����Ǵ� ��Ȳ�� �߻��� �� ����*/
				this.userdata = new ArrayList<>(Arrays.asList(userDB[w][5]));
				System.out.println(this.userdata); 
				//�̸����ּҵ鸸
				if(this.userdata.get(0).indexOf(email)!=-1) {
//					�������� ����� �ƴϴ�.get(0)�� �ؾ� ���ڷκ��� ������ ��´�.
				this.total+=1;
				}
			w++;
		}while(w<this.ea);
		
}
	@Override
	public int getter() {
		return this.total;
	}
	@Override
	public void DB() {
		this.userDB = new String [][]{
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
		this.ea = this.userDB.length;
	
	}
}