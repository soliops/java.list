import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * {5,10,15,20,25,30,35}
		 */
		int data[] = {5,10,15,20,25,30,35};
		/*
		 * foreach������ ����� ���� index ��ȣ�� �ʿ���� ����� ���
		 * for~do-while�� ����� ���� �ε��� ��ȣ�� �ʿ��� �� ���
		 * 
		 * [0] [1] [2] : �ε��� ��ȣ
		 */
		//�ܼ��� �迭������ �ַ� �����
		for(int f : data) { //inf f�� ���������� data�迭���� �޾Ƽ� ���� ��ŵ�ϴ�.
			if(f%2==0) {
		//		System.out.println(f);
			}
		}
//		/*
//		String pay[] = {"������ �Ա�","�ſ�ī��","�޴���","��ǰ��","����"};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����ϰ��� �ϴ� ���¸� �������ּ���:");
//		String pm = sc.next();
//		for(String z : pay) { /*�迭 �����Ͱ� ���� �̹Ƿ� 
//		�޴� �������� ���� �������� ����ؾ� �մϴ�.*/
//			if(pm.equals(z)) {
//				if(z.equals("�޴���")) {
//					System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
//				}
//				else {System.out.println(pm+"�� ���� ���� �˴ϴ�.");}
//			//	System.out.println(pm+"�� ���� ���� �˴ϴ�.");
//				
//			}
//		}
//		sc.close();
	
		
		/* ���빮��   ->//��ĳ�ʴ� �ѹ� ����.
		 * {"�ܹ���", "����", "ġŲ", "Ŀ��"}
		 * Q. "�ֹ��ϰ��� �ϴ� ������ ������ �ּ���.?"
		 * �ش� ������ �� 4���� ����� �˴ϴ�.
		 * ��, "�ֹ�����"��� ����ڰ� �Է½� �� ��� �ֹ��� ���� �Ǹ�,
		 * �ֹ������� ����Ͻø� �˴ϴ�. 
		 * 
		 * ��ĳ�ʷ� ������ �Է±���, 4�� ����°� �ݺ���, if �ֹ�����, �ֹ����� ���,
		 */
		
		String menus[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		Scanner sc2 = new Scanner(System.in);
		String user;
		String user_menu[]=new String[4];
		int ct=0;
		for(String f : menus) {
			/* Scanner�� �ݺ��� �ȿ� ����� loop�� ������ �ݺ������� ����.
			 * ����ڰ� �Է��� ������ �ݺ��� ������ƴ ����ϴ� ������
			 * 
			 */
			System.out.println("�޴��� ������ �ּ���?:");
			user = sc2.next();
			if(user.equals("�ֹ�����")) {
				break;
			}
			else {
				for(String ff : menus) {
					if(user.equals(ff)) {
						user_menu[ct]=ff;
						ct++;
					}
				}
			}
			//System.out.println(f);
			}
		sc2.close();
		System.out.println("�ֹ��Ͻ� �޴��� ������ �����ϴ�."+Arrays.toString(user_menu));
		
		
		/* ���빮��
		 * �迭
		 * ����ڰ� ��ٱ��Ͽ� ������ ���� �ϰ� �˴ϴ�.
		 * ��, �ش� �ݾ� ����Ʈ�� ������� ����, ���� ��ü ���� �ݾ׸� 
		 * ��� �ǵ��� �մϴ�.
		 * 1500 22000 13000 14500 113800 45000
		 */
		
		
		
		
	}

}
