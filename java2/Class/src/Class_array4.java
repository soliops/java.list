import java.util.Scanner;

public class Class_array4 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ���� ���� �迭 ������ ���� �ֽ��ϴ�.
		 * a1: ȫ�浿 �̼��� ������ ������ ������
		 * a2: 100 80 39 60 55
		 * 
		 * "�˻��ϰ��� �ϴ� �̸��� �����ּ���." ����ϰ� �˴ϴ�.
		 * �˻�� �̼����̶�� �˻��� �ϰ� �Ǹ�
		 * �̼��Ŵ��� 80�� �Դϴ�. ��� ����� �Ǿ�� �մϴ�.
		 * 
		 */
	String a1[]={"ȫ�浿","�̼���","������","������","������"};
	String a2[]= {"100","80","39","60","55"};
	Scanner sc = new Scanner(System.in);
	System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
	String usernm=sc.next();
	
	jumsu1 j1=new jumsu1();
	j1.ck(a1,a2,usernm);
	sc.close();
	
	
	
	
	
	}
}

class jumsu1 {
	public void ck(String data1[],String data2[],String user){
		int w=0;
		int ea=data1.length;
		boolean ck=false;
		do {
			if(user.equals(data1[w])) {
				String js2=data2[w];
				System.out.printf("%s���� %s�� �Դϴ�.",user,js2);
						ck=true;
			}
			w++;
		}while(w<ea);
		
		if(ck==false) {
			System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
		}
		
	}
	
	
	
	
}