import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		/*
		 * 2�� �迭�̸�, 2���迭 �����ʹ� ������ �����ϴ�.
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * 
		 * ���α׷� ���۰� ���ÿ�
		 * "����Ʈ�� �˻��� ������ �Է��ϼ���?"
		 * �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű������� 
		 * �̿��Ͽ� ������ �ش� ������� ����Ͻø� �˴ϴ�.
		 * 	
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���?");
		String user = sc.next();
		
		point pl = new point();
		pl.pointlist(user);
		sc.close();
		pl=null;
	}

}
class point{
	public void pointlist(String userlist) {
		//System.out.println("test");
		String user1[][] = {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"3000","1000","25000","19800","5750","3630","0"}
				
		};
		int ea= user1.length;
		int uea = user1[0].length;
		int w=0;
		do {
			int ww=0;
			do {
				if(user1[w][ww].equals(userlist)) {
					System.out.printf("���� %s ������ ����Ʈ�� %s���Դϴ�.",userlist,user1[1][ww]);
				}
				ww++;
			}while(ww<uea);
			w++;
		}while(w<ea);
	}
	
}