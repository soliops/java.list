
import java.util.Scanner;
public class Class_array3 {

	public static void main(String... args) {
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
		String a1[]= {"ȫ�浿","�̼���","������","������","������"};
		String a2[]={"100","80","39","60","55"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
		String usernm = sc.next();
		
		
		jumsu j= new jumsu();
		j.ck(a1,a2,usernm);  // ->3�� class�� ������ �Ȱ��� 3�� �޾ƾ��Ѵ�.
		//j.ck(a1,a2,userm) <-()�ȿ� ���� �Ű�����
		//j.ck(1,2,3,4)<- �μ���(���ڰ�)
		sc.close();
		}
	}

class jumsu {
	//�޼ҵ忡 ()�ȿ� ��, �޴� �͵� �Ű�����
	public void ck(String data1[],String data2[], String user) {
		//System.out.println(Arrays.toString(data2));
		
		int w=0;
		int ea = data1.length;
		boolean ck =false;
		do{
			if(user.equals(data1[w])) {//�迭�� ������ ���� ���� ���
				String js = data2[w];
				System.out.printf("%s���� %s�� �Դϴ�.",user,js);
			ck=true;	
			}
			w++;
		}
		while(w<ea);
		if(ck==false) {	//main class���� ����� �˻��� �Ͽ��� ��� �迭���� ���� ��Ȳ
		System.out.println("�˻��ϰ��� �ϴ� ����ڴ� Ȯ���� �ȵ˴ϴ�.");	
		}
		
		
		
		}
	}